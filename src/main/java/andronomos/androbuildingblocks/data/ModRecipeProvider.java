package andronomos.androbuildingblocks.data;

import andronomos.androbuildingblocks.AndroBuildingBlocks;
import andronomos.androbuildingblocks.block.BlockVariants;
import andronomos.androbuildingblocks.registry.BlockRegistry;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.StairBlock;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;
import net.minecraftforge.registries.ForgeRegistries;
import org.jetbrains.annotations.NotNull;

import java.util.function.Consumer;

import static andronomos.androbuildingblocks.AndroBuildingBlocks.MODID;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
	public ModRecipeProvider(PackOutput output) {
		super(output);
	}

	@Override
	protected void buildRecipes(@NotNull Consumer<FinishedRecipe> recipeConsumer) {
		BlockVariants.concreteColors.forEach(color -> {
			Block concreteBlock = ForgeRegistries.BLOCKS.getValue(new ResourceLocation(MODID, String.format("%s_reinforced_concrete", color)));
			Item dye = ForgeRegistries.ITEMS.getValue(new ResourceLocation("minecraft", String.format("%s_dye", color)));

			if(blockExists(concreteBlock) && dye != null) {
				buildReinforcedConcreteRecipe(concreteBlock, dye, recipeConsumer);
				buildConcreteWallRecipes(concreteBlock, recipeConsumer);
				buildConcreteStairRecipes(concreteBlock, recipeConsumer);
			} else {
				AndroBuildingBlocks.LOGGER.info(String.format("reinforced_concrete: %s", String.format("%s_reinforced_concrete", color)));
			}
		});

		for(DyeColor color : DyeColor.values()) {
			AndroBuildingBlocks.LOGGER.info(String.format("ModRecipeProvider#buildRecipes | color: %s", color));

			Block vanillaGlassBlock = ForgeRegistries.BLOCKS.getValue(new ResourceLocation("minecraft", String.format("%s_stained_glass", color)));
			Block structuralGlassBlock = ForgeRegistries.BLOCKS.getValue(new ResourceLocation(MODID, String.format("%s_structural_glass", color)));
			Block glassPaneBlock = ForgeRegistries.BLOCKS.getValue(new ResourceLocation(MODID, String.format("%s_structural_glass_pane", color)));

			if(blockExists(structuralGlassBlock) && blockExists(glassPaneBlock)) {
				buildStructuralGlassRecipe(structuralGlassBlock, vanillaGlassBlock, recipeConsumer);
				generateThreeByTwoRecipe(glassPaneBlock, structuralGlassBlock, recipeConsumer);
			} else {
				AndroBuildingBlocks.LOGGER.info(String.format("structural_glass: %s", String.format("%s_stained_glass", color)));
				AndroBuildingBlocks.LOGGER.info(String.format("structural_glass_pane: %s", String.format("%s_structural_glass_pane", color)));
			}
		}

		//region Smooth Deepslate
		generateSmeltingRecipe(Blocks.DEEPSLATE, BlockRegistry.SMOOTH_DEEPSLATE.get(), recipeConsumer);
		generateStoneCutterRecipe(BlockRegistry.SMOOTH_DEEPSLATE_SLAB.get(), BlockRegistry.SMOOTH_DEEPSLATE.get(), 1, recipeConsumer);
		generateStairRecipe(BlockRegistry.SMOOTH_DEEPSLATE_STAIRS.get(), BlockRegistry.SMOOTH_DEEPSLATE.get().asItem(), recipeConsumer);
		generateStoneCutterRecipe(BlockRegistry.SMOOTH_DEEPSLATE_STAIRS.get(), BlockRegistry.SMOOTH_DEEPSLATE.get(), 1, recipeConsumer);
		generateSlabRecipe(BlockRegistry.SMOOTH_DEEPSLATE_SLAB.get(), BlockRegistry.SMOOTH_DEEPSLATE.get().asItem(), recipeConsumer);
		generateThreeByTwoRecipe(BlockRegistry.SMOOTH_DEEPSLATE_WALL.get(), BlockRegistry.SMOOTH_DEEPSLATE.get(), recipeConsumer);
		generateStoneCutterRecipe(BlockRegistry.SMOOTH_DEEPSLATE_WALL.get(), BlockRegistry.SMOOTH_DEEPSLATE.get(), 1, recipeConsumer);
		//endregion

		//region Caution Stripes
		generateStripedRecipe(BlockRegistry.YELLOW_CAUTION_STRIPES.get(), Items.YELLOW_DYE, Items.BLACK_DYE, recipeConsumer);
		generateStripedRecipe(BlockRegistry.RED_CAUTION_STRIPES.get(), Items.RED_DYE, Items.WHITE_DYE, recipeConsumer);
		//endregion

		//region Steel
		ShapedRecipeBuilder carbonSteelCoalRecipe = ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, BlockRegistry.STEEL.get(), 4);
		carbonSteelCoalRecipe.define('C', Items.COAL);
		carbonSteelCoalRecipe.define('I', Tags.Items.INGOTS_IRON);
		carbonSteelCoalRecipe.pattern("CIC");
		carbonSteelCoalRecipe.pattern("ICI");
		carbonSteelCoalRecipe.pattern("CIC");
		carbonSteelCoalRecipe.group("carbon_steel");
		carbonSteelCoalRecipe.unlockedBy("has_item", has(Items.COAL));
		carbonSteelCoalRecipe.save(recipeConsumer);

		ShapedRecipeBuilder carbonSteelCharcoalRecipe = ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, BlockRegistry.STEEL.get(), 4);
		carbonSteelCharcoalRecipe.define('C', Items.CHARCOAL);
		carbonSteelCharcoalRecipe.define('I', Tags.Items.INGOTS_IRON);
		carbonSteelCharcoalRecipe.pattern("CIC");
		carbonSteelCharcoalRecipe.pattern("ICI");
		carbonSteelCharcoalRecipe.pattern("CIC");
		carbonSteelCharcoalRecipe.group("carbon_steel");
		carbonSteelCharcoalRecipe.unlockedBy("has_item", has(Items.CHARCOAL));
		carbonSteelCharcoalRecipe.save(recipeConsumer, "carbon_steel_from_charcoal");

		generateStairRecipe(BlockRegistry.STEEL_STAIRS.get(), BlockRegistry.STEEL.get().asItem(), recipeConsumer);
		generateStoneCutterRecipe(BlockRegistry.STEEL_STAIRS.get(), BlockRegistry.STEEL.get(), 1, recipeConsumer);
		generateSlabRecipe(BlockRegistry.STEEL_SLAB.get(), BlockRegistry.STEEL.get().asItem(), recipeConsumer);
		generateStoneCutterRecipe(BlockRegistry.STEEL_SLAB.get(), BlockRegistry.STEEL.get(), 1, recipeConsumer);
		generateStoneCutterRecipe(BlockRegistry.STEEL_WALL.get(), BlockRegistry.STEEL.get(), 1, recipeConsumer);
		generateThreeByTwoRecipe(BlockRegistry.STEEL_WALL.get(), BlockRegistry.STEEL.get(), recipeConsumer);
		generateStoneCutterRecipe(BlockRegistry.STEEL_MESH.get(), BlockRegistry.STEEL.get(), 1, recipeConsumer);
		//endregion

		generateSmeltingRecipe(Blocks.COAL_BLOCK, BlockRegistry.CARBON.get(), recipeConsumer);
		generateStoneCutterRecipe(BlockRegistry.CARBON_MESH.get(), BlockRegistry.CARBON.get(), 1, recipeConsumer);
		generateStoneCutterRecipe(BlockRegistry.CARBON_GRATE.get(), BlockRegistry.CARBON.get(), 1, recipeConsumer);

	}

	private void buildConcreteWallRecipes(Block concrete, Consumer<FinishedRecipe> consumer) {
		String concreteName = ForgeRegistries.BLOCKS.getKey(concrete).getPath();
		Block wallBlock =  ForgeRegistries.BLOCKS.getValue(new ResourceLocation(MODID, String.format("%s_wall", concreteName)));
		Block tileWallBlock = ForgeRegistries.BLOCKS.getValue(new ResourceLocation(MODID, String.format("%s_tile_wall", concreteName)));

		if(blockExists(wallBlock)) {
			generateThreeByTwoRecipe(wallBlock, concrete, consumer);
			generateStoneCutterRecipe(wallBlock, concrete,1, consumer);
		}

		if(blockExists(tileWallBlock)) {
			generateThreeByTwoRecipe(tileWallBlock, concrete, consumer);
			generateStoneCutterRecipe(tileWallBlock, concrete,1, consumer);
		}
	}

	private void buildConcreteStairRecipes(Block concrete, Consumer<FinishedRecipe> consumer) {
		String concreteName = ForgeRegistries.BLOCKS.getKey(concrete).getPath();
		Block stairBlock = ForgeRegistries.BLOCKS.getValue(new ResourceLocation(MODID, String.format("%s_stairs", concreteName)));
		Block tileStairBlock = ForgeRegistries.BLOCKS.getValue(new ResourceLocation(MODID, String.format("%s_tile_stairs", concreteName)));

		if(blockExists(stairBlock)) {
			generateStairRecipe((StairBlock) stairBlock, concrete.asItem(), consumer);
			generateStoneCutterRecipe(stairBlock, concrete,1, consumer);
		}

		if(blockExists(tileStairBlock)) {
			generateThreeByTwoRecipe(tileStairBlock, concrete, consumer);
			generateStoneCutterRecipe(tileStairBlock, concrete,1, consumer);
		}
	}

	private boolean blockExists(Block block) {
		return block != null && block != Blocks.AIR;
	}

	private void buildStructuralGlassRecipe(Block output, Block Input, Consumer<FinishedRecipe> consumer) {
		ShapedRecipeBuilder shaped = ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, output, 4);
		shaped.define('1', Input);
		shaped.define('2', Items.SLIME_BALL);
		shaped.pattern("212");
		shaped.pattern("121");
		shaped.pattern("212");
		shaped.unlockedBy("has_item", has(Items.SLIME_BALL));
		shaped.save(consumer);
	}

	private void buildReinforcedConcreteRecipe(Block output, Item dye, Consumer<FinishedRecipe> consumer) {
		String concreteName = ForgeRegistries.BLOCKS.getKey(output).getPath();

		ShapedRecipeBuilder shapedGravel = ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, output, 8);
		shapedGravel.define('1', Tags.Items.STONE);
		shapedGravel.define('2', Tags.Items.INGOTS_IRON);
		shapedGravel.define('3', Items.GRAVEL);
		shapedGravel.define('4', dye);
		shapedGravel.pattern("212");
		shapedGravel.pattern("343");
		shapedGravel.pattern("212");
		shapedGravel.group(concreteName);
		shapedGravel.unlockedBy("has_item", has(Tags.Items.STONE));
		shapedGravel.save(consumer);

		ShapedRecipeBuilder shapedSand = ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, output, 8);
		shapedSand.define('1', Tags.Items.STONE);
		shapedSand.define('2', Tags.Items.INGOTS_IRON);
		shapedSand.define('3', Items.SAND);
		shapedSand.define('4', dye);
		shapedSand.pattern("212");
		shapedSand.pattern("343");
		shapedSand.pattern("212");
		shapedSand.group(concreteName);
		shapedSand.unlockedBy("has_item", has(Tags.Items.STONE));
		shapedSand.save(consumer, concreteName + "_from_sand");
	}

	private void generateStripedRecipe(Block output, Item Dye, Item Dye2, Consumer<FinishedRecipe> consumer) {
		ShapedRecipeBuilder shaped = ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, output, 4);
		shaped.define('1', Dye);
		shaped.define('2', Dye2);
		shaped.define('3', Tags.Items.STONE);
		shaped.pattern("212");
		shaped.pattern("131");
		shaped.pattern("212");
		shaped.unlockedBy("has_item", has(Tags.Items.DYES));
		shaped.save(consumer);
	}

	private void generateSmeltingRecipe(Block input, Block output, Consumer<FinishedRecipe> consumer) {
		SimpleCookingRecipeBuilder cooking = SimpleCookingRecipeBuilder.smelting(Ingredient.of(input),
				RecipeCategory.BUILDING_BLOCKS,	output, 0.1F, 200);
		cooking.unlockedBy("has_item", has(input));
		cooking.save(consumer);
	}

	private void generateTwoByTwoRecipe(Block output, Block input, Consumer<FinishedRecipe> consumer) {
		ShapedRecipeBuilder shaped = ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, output, 6);
		shaped.define('#', input);
		shaped.pattern("##");
		shaped.pattern("##");
		shaped.unlockedBy("has_item", has(input));
		shaped.save(consumer);
	}

	private void generateThreeByTwoRecipe(Block output, Block input, Consumer<FinishedRecipe> consumer) {
		ShapedRecipeBuilder shaped = ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, output, 6);
		shaped.define('#', input);
		shaped.pattern("###");
		shaped.pattern("###");
		shaped.unlockedBy("has_item", has(input));
		shaped.save(consumer);
	}

	private void generateStoneCutterRecipe(Block output, Block input, int amount, Consumer<FinishedRecipe> consumer) {
		String blockName = ForgeRegistries.BLOCKS.getKey(output).getPath();
		SingleItemRecipeBuilder stonecutting = SingleItemRecipeBuilder.stonecutting(Ingredient.of(input), RecipeCategory.BUILDING_BLOCKS, output, amount);
		stonecutting.unlockedBy("has_item", has(input));
		stonecutting.save(consumer, blockName + "_from_stonecutting");
	}

	private void generateSlabRecipe(SlabBlock output, Item input, Consumer<FinishedRecipe> consumer) {
		ShapedRecipeBuilder shaped = ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, output, 6);
		shaped.define('#', input);
		shaped.pattern("###");
		shaped.unlockedBy("has_item", has(input));
		shaped.save(consumer);
	}

	private void generateStairRecipe(StairBlock output, Item input, Consumer<FinishedRecipe> consumer) {
		ShapedRecipeBuilder shaped = ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, output, 4);
		shaped.define('#', input);
		shaped.pattern("#  ");
		shaped.pattern("## ");
		shaped.pattern("###");
		shaped.unlockedBy("has_item", has(input));
		shaped.save(consumer);
	}
}
