package andronomos.androbuildingblocks.data;

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
import net.minecraft.world.level.block.StairBlock;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;
import net.minecraftforge.registries.ForgeRegistries;
import org.jetbrains.annotations.NotNull;

import java.util.Objects;
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
				buildReinforcedConcreteRecipes(concreteBlock, dye, recipeConsumer);
			}
		});

		for(DyeColor color : DyeColor.values()) {
			Block vanillaGlassBlock = ForgeRegistries.BLOCKS.getValue(new ResourceLocation("minecraft", String.format("%s_stained_glass", color)));
			Block structuralGlassBlock = ForgeRegistries.BLOCKS.getValue(new ResourceLocation(MODID, String.format("%s_structural_glass", color)));
			Block glassPaneBlock = ForgeRegistries.BLOCKS.getValue(new ResourceLocation(MODID, String.format("%s_structural_glass_pane", color)));

			if(blockExists(vanillaGlassBlock) && blockExists(structuralGlassBlock) && blockExists(glassPaneBlock)) {
				ShapedRecipeBuilder shaped = ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, structuralGlassBlock, 4);
				shaped.define('1', vanillaGlassBlock);
				shaped.define('2', Items.SLIME_BALL);
				shaped.pattern("212");
				shaped.pattern("121");
				shaped.pattern("212");
				shaped.unlockedBy("has_item", has(Items.SLIME_BALL));
				shaped.save(recipeConsumer);

				buildThreeByTwoRecipe(glassPaneBlock, structuralGlassBlock, recipeConsumer);
			}
		}

		//region Smooth Deepslate
		buildSmeltingRecipe(Blocks.DEEPSLATE, BlockRegistry.SMOOTH_DEEPSLATE.get(), recipeConsumer);
		buildStairRecipe(BlockRegistry.SMOOTH_DEEPSLATE_STAIRS.get(), BlockRegistry.SMOOTH_DEEPSLATE.get(), recipeConsumer);
		buildStoneCutterRecipe(BlockRegistry.SMOOTH_DEEPSLATE_STAIRS.get(), BlockRegistry.SMOOTH_DEEPSLATE.get(), 1, recipeConsumer);
		buildStoneCutterRecipe(BlockRegistry.SMOOTH_DEEPSLATE_SLAB.get(), BlockRegistry.SMOOTH_DEEPSLATE.get(), 2, recipeConsumer);
		buildThreeByOneRecipe(BlockRegistry.SMOOTH_DEEPSLATE_SLAB.get(), BlockRegistry.SMOOTH_DEEPSLATE.get(), recipeConsumer);
		buildThreeByTwoRecipe(BlockRegistry.SMOOTH_DEEPSLATE_WALL.get(), BlockRegistry.SMOOTH_DEEPSLATE.get(), recipeConsumer);
		buildStoneCutterRecipe(BlockRegistry.SMOOTH_DEEPSLATE_WALL.get(), BlockRegistry.SMOOTH_DEEPSLATE.get(), 1, recipeConsumer);
		//endregion

		//region Caution Stripes
		buildStripedRecipe(BlockRegistry.YELLOW_CAUTION_STRIPES.get(), Items.YELLOW_DYE, Items.BLACK_DYE, recipeConsumer);
		buildStripedRecipe(BlockRegistry.RED_CAUTION_STRIPES.get(), Items.RED_DYE, Items.WHITE_DYE, recipeConsumer);
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

		buildStairRecipe(BlockRegistry.STEEL_STAIRS.get(), BlockRegistry.STEEL.get(), recipeConsumer);
		buildStoneCutterRecipe(BlockRegistry.STEEL_STAIRS.get(), BlockRegistry.STEEL.get(), 1, recipeConsumer);
		buildThreeByOneRecipe(BlockRegistry.STEEL_SLAB.get(), BlockRegistry.STEEL.get(), recipeConsumer);
		buildStoneCutterRecipe(BlockRegistry.STEEL_SLAB.get(), BlockRegistry.STEEL.get(), 2, recipeConsumer);
		buildStoneCutterRecipe(BlockRegistry.STEEL_WALL.get(), BlockRegistry.STEEL.get(), 1, recipeConsumer);
		buildThreeByTwoRecipe(BlockRegistry.STEEL_WALL.get(), BlockRegistry.STEEL.get(), recipeConsumer);
		buildStoneCutterRecipe(BlockRegistry.STEEL_MESH.get(), BlockRegistry.STEEL.get(), 1, recipeConsumer);
		//endregion

		buildSmeltingRecipe(Blocks.COAL_BLOCK, BlockRegistry.CARBON.get(), recipeConsumer);
		buildStoneCutterRecipe(BlockRegistry.CARBON_MESH.get(), BlockRegistry.CARBON.get(), 1, recipeConsumer);
		buildStoneCutterRecipe(BlockRegistry.CARBON_GRATE.get(), BlockRegistry.CARBON.get(), 1, recipeConsumer);
	}

	private void buildReinforcedConcreteRecipes(Block concrete, Item dye, Consumer<FinishedRecipe> consumer) {
		String concreteName = Objects.requireNonNull(ForgeRegistries.BLOCKS.getKey(concrete)).getPath();
		Block stairBlock = ForgeRegistries.BLOCKS.getValue(new ResourceLocation(MODID, String.format("%s_stairs", concreteName)));
		Block slabBlock =  ForgeRegistries.BLOCKS.getValue(new ResourceLocation(MODID, String.format("%s_slab", concreteName)));
		Block wallBlock =  ForgeRegistries.BLOCKS.getValue(new ResourceLocation(MODID, String.format("%s_wall", concreteName)));
		Block tileBlock = ForgeRegistries.BLOCKS.getValue(new ResourceLocation(MODID, String.format("%s_tile", concreteName)));
		Block tileStairBlock = ForgeRegistries.BLOCKS.getValue(new ResourceLocation(MODID, String.format("%s_tile_stairs", concreteName)));
		Block tileSlabBlock = ForgeRegistries.BLOCKS.getValue(new ResourceLocation(MODID, String.format("%s_tile_slab", concreteName)));
		Block tileWallBlock = ForgeRegistries.BLOCKS.getValue(new ResourceLocation(MODID, String.format("%s_tile_wall", concreteName)));

		ShapedRecipeBuilder shapedGravel = ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, concrete, 8);
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

		if(blockExists(stairBlock)) {
			buildStairRecipe((StairBlock) stairBlock, concrete, consumer);
			buildStoneCutterRecipe(stairBlock, concrete,1, consumer);
		}

		if(blockExists(slabBlock)) {
			buildThreeByOneRecipe(slabBlock, concrete, consumer);
			buildStoneCutterRecipe(slabBlock, concrete,2, consumer);
		}

		if(blockExists(wallBlock)) {
			buildThreeByTwoRecipe(wallBlock, concrete, consumer);
			buildStoneCutterRecipe(wallBlock, concrete,1, consumer);
		}

		if(blockExists(tileBlock)) {
			buildThreeByTwoRecipe(wallBlock, concrete, consumer);
			buildTwoByTwoRecipe(tileBlock, concrete, consumer);
			buildStoneCutterRecipe(tileBlock, concrete,1, consumer);
		}

		if(blockExists(tileStairBlock)) {
			buildThreeByTwoRecipe(tileStairBlock, tileBlock, consumer);
			buildStoneCutterRecipe(tileStairBlock, tileBlock,1, consumer);
		}

		if(blockExists(tileSlabBlock)) {
			buildThreeByOneRecipe(tileSlabBlock, tileBlock, consumer);
			buildStoneCutterRecipe(tileSlabBlock, tileBlock,2, consumer);
		}

		if(blockExists(tileWallBlock)) {
			buildThreeByTwoRecipe(tileWallBlock, tileBlock, consumer);
			buildStoneCutterRecipe(tileWallBlock, tileBlock,1, consumer);
		}
	}

	private boolean blockExists(Block block) {
		return block != null && block != Blocks.AIR;
	}

	private void buildStripedRecipe(Block output, Item Dye, Item Dye2, Consumer<FinishedRecipe> consumer) {
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

	private void buildTwoByTwoRecipe(Block output, Block input, Consumer<FinishedRecipe> consumer) {
		ShapedRecipeBuilder shaped = ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, output, 6);
		shaped.define('#', input);
		shaped.pattern("##");
		shaped.pattern("##");
		shaped.unlockedBy("has_item", has(input));
		shaped.save(consumer);
	}

	private void buildThreeByOneRecipe(Block output, Block input, Consumer<FinishedRecipe> consumer) {
		ShapedRecipeBuilder shaped = ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, output, 6);
		shaped.define('#', input);
		shaped.pattern("###");
		shaped.unlockedBy("has_item", has(input));
		shaped.save(consumer);
	}

	private void buildThreeByTwoRecipe(Block output, Block input, Consumer<FinishedRecipe> consumer) {
		ShapedRecipeBuilder shaped = ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, output, 6);
		shaped.define('#', input);
		shaped.pattern("###");
		shaped.pattern("###");
		shaped.unlockedBy("has_item", has(input));
		shaped.save(consumer);
	}

	private void buildStoneCutterRecipe(Block output, Block input, int amount, Consumer<FinishedRecipe> consumer) {
		String blockName = Objects.requireNonNull(ForgeRegistries.BLOCKS.getKey(output)).getPath();
		SingleItemRecipeBuilder stonecutting = SingleItemRecipeBuilder.stonecutting(Ingredient.of(input), RecipeCategory.BUILDING_BLOCKS, output, amount);
		stonecutting.unlockedBy("has_item", has(input));
		stonecutting.save(consumer, blockName + "_from_stonecutting");
	}

	private void buildSmeltingRecipe(Block input, Block output, Consumer<FinishedRecipe> consumer) {
		SimpleCookingRecipeBuilder cooking = SimpleCookingRecipeBuilder.smelting(Ingredient.of(input),
				RecipeCategory.BUILDING_BLOCKS,	output, 0.1F, 200);
		cooking.unlockedBy("has_item", has(input));
		cooking.save(consumer);
	}

	private void buildStairRecipe(StairBlock output, Block input, Consumer<FinishedRecipe> consumer) {
		ShapedRecipeBuilder shaped = ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, output, 4);
		shaped.define('#', input);
		shaped.pattern("#  ");
		shaped.pattern("## ");
		shaped.pattern("###");
		shaped.unlockedBy("has_item", has(input));
		shaped.save(consumer);
	}
}
