package andronomos.androbuildingblocks.data;

import andronomos.androbuildingblocks.block.BlockCategories;
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
		//region Concrete
		BlockCategories.REINFORCED_CONCRETE_BLOCKS.types.forEach(type -> {
			String variantName = String.format("%s_%s", type.name, BlockCategories.REINFORCED_CONCRETE_BLOCKS.name);
			Block variantBlock = ForgeRegistries.BLOCKS.getValue(new ResourceLocation(MODID, variantName));
			Item dye = ForgeRegistries.ITEMS.getValue(new ResourceLocation("minecraft", String.format("%s_dye", type.name)));

			if(blockExists(variantBlock)) {
				ShapedRecipeBuilder shaped = ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, variantBlock, 8);
				shaped.define('1', Tags.Items.STONE);
				shaped.define('2', Tags.Items.INGOTS_IRON);
				shaped.define('3', Items.GRAVEL);
				shaped.define('4', dye);
				shaped.pattern("212");
				shaped.pattern("343");
				shaped.pattern("212");
				shaped.group(String.format("%s_%s", type.name, BlockCategories.REINFORCED_CONCRETE_BLOCKS.name));
				shaped.unlockedBy("has_item", has(Tags.Items.STONE));
				shaped.save(recipeConsumer);

				Block stairBlock = ForgeRegistries.BLOCKS.getValue(new ResourceLocation(MODID, String.format("%s_stairs", variantName)));
				Block slabBlock =  ForgeRegistries.BLOCKS.getValue(new ResourceLocation(MODID, String.format("%s_slab", variantName)));
				Block wallBlock =  ForgeRegistries.BLOCKS.getValue(new ResourceLocation(MODID, String.format("%s_wall", variantName)));

				if(type.hasStairVariant && blockExists(stairBlock)) {
					buildStairRecipe(stairBlock, variantBlock, recipeConsumer);
					buildStoneCutterRecipe(stairBlock, variantBlock, 1, recipeConsumer);
				}

				if(type.hasSlabVariant && blockExists(slabBlock)) {
					buildThreeByOneRecipe(slabBlock, variantBlock, recipeConsumer);
					buildStoneCutterRecipe(slabBlock, variantBlock, 2, recipeConsumer);
				}

				if(type.hasWallVariant && blockExists(wallBlock)) {
					buildStoneCutterRecipe(wallBlock, variantBlock, 1, recipeConsumer);
					buildThreeByTwoRecipe(wallBlock, variantBlock, recipeConsumer);
				}
			}
		});
		//endregion

		BlockCategories.STRUCTURAL_GLASS_BLOCKS.types.forEach(type -> {
			Block vanillaGlassBlock = ForgeRegistries.BLOCKS.getValue(new ResourceLocation("minecraft", String.format("%s_stained_glass", type.name)));
			Block structuralGlassBlock = ForgeRegistries.BLOCKS.getValue(new ResourceLocation(MODID, String.format("%s_structural_glass", type.name)));
			Block glassPaneBlock = ForgeRegistries.BLOCKS.getValue(new ResourceLocation(MODID, String.format("%s_structural_glass_pane", type.name)));

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
		});

		//region Steel
		Block steelBlock = ForgeRegistries.BLOCKS.getValue(new ResourceLocation(MODID, BlockCategories.STEEL_BLOCKS.name));

		ShapedRecipeBuilder steelFromCoalRecipe = ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, steelBlock, 4);
		steelFromCoalRecipe.define('C', Items.COAL);
		steelFromCoalRecipe.define('I', Tags.Items.INGOTS_IRON);
		steelFromCoalRecipe.pattern("CIC");
		steelFromCoalRecipe.pattern("ICI");
		steelFromCoalRecipe.pattern("CIC");
		steelFromCoalRecipe.group(BlockCategories.STEEL_BLOCKS.name);
		steelFromCoalRecipe.unlockedBy("has_item", has(Items.COAL));
		steelFromCoalRecipe.save(recipeConsumer);

		ShapedRecipeBuilder steelFromCharcoalRecipe = ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, steelBlock, 4);
		steelFromCharcoalRecipe.define('C', Items.CHARCOAL);
		steelFromCharcoalRecipe.define('I', Tags.Items.INGOTS_IRON);
		steelFromCharcoalRecipe.pattern("CIC");
		steelFromCharcoalRecipe.pattern("ICI");
		steelFromCharcoalRecipe.pattern("CIC");
		steelFromCharcoalRecipe.group(BlockCategories.STEEL_BLOCKS.name);
		steelFromCharcoalRecipe.unlockedBy("has_item", has(Items.CHARCOAL));
		steelFromCharcoalRecipe.save(recipeConsumer, String.format("%s_from_charcoal", BlockCategories.STEEL_BLOCKS.name));

		BlockCategories.STEEL_BLOCKS.types.forEach(type -> {
			String variantName = String.format("%s_%s", BlockCategories.STEEL_BLOCKS.name, type.name);
			Block variantBlock = ForgeRegistries.BLOCKS.getValue(new ResourceLocation(MODID, variantName));

			if(blockExists(variantBlock)) {
				Block stairBlock = ForgeRegistries.BLOCKS.getValue(new ResourceLocation(MODID, String.format("%s_stairs", variantName)));
				Block slabBlock =  ForgeRegistries.BLOCKS.getValue(new ResourceLocation(MODID, String.format("%s_slab", variantName)));
				Block wallBlock =  ForgeRegistries.BLOCKS.getValue(new ResourceLocation(MODID, String.format("%s_wall", variantName)));

				if(type.hasStairVariant && blockExists(stairBlock)) {
					buildStairRecipe(stairBlock, variantBlock, recipeConsumer);
					buildStoneCutterRecipe(stairBlock, variantBlock, 1, recipeConsumer);
				}

				if(type.hasSlabVariant && blockExists(slabBlock)) {
					buildThreeByOneRecipe(slabBlock, variantBlock, recipeConsumer);
					buildStoneCutterRecipe(slabBlock, variantBlock, 2, recipeConsumer);
				}

				if(type.hasWallVariant && blockExists(wallBlock)) {
					buildStoneCutterRecipe(wallBlock, variantBlock, 1, recipeConsumer);
					buildThreeByTwoRecipe(wallBlock, variantBlock, recipeConsumer);
				}
			}
		});
		//endregion

		//region Graphite
		//buildSmeltingRecipe(Blocks.COAL_BLOCK, BlockRegistry.GRAPHITE.get(), recipeConsumer);
		//buildStoneCutterRecipe(BlockRegistry.GRAPHITE_STAIRS.get(), BlockRegistry.GRAPHITE.get(), 1, recipeConsumer);
		//buildThreeByOneRecipe(BlockRegistry.GRAPHITE_SLAB.get(), BlockRegistry.GRAPHITE.get(), recipeConsumer);
		//buildStoneCutterRecipe(BlockRegistry.GRAPHITE_SLAB.get(), BlockRegistry.GRAPHITE.get(), 2, recipeConsumer);
		//buildThreeByTwoRecipe(BlockRegistry.GRAPHITE_WALL.get(), BlockRegistry.GRAPHITE.get(), recipeConsumer);
		//buildStoneCutterRecipe(BlockRegistry.GRAPHITE_WALL.get(), BlockRegistry.GRAPHITE.get(), 1, recipeConsumer);

		//buildStoneCutterRecipe(BlockRegistry.GRAPHITE_MESH.get(), BlockRegistry.GRAPHITE_TILE_STAIRS.get(), 1, recipeConsumer);
		//buildStoneCutterRecipe(BlockRegistry.GRAPHITE_GRATE.get(), BlockRegistry.GRAPHITE_TILE_STAIRS.get(), 1, recipeConsumer);
		//buildTwoByTwoRecipe(BlockRegistry.GRAPHITE_TILE.get(), BlockRegistry.GRAPHITE_TILE_STAIRS.get(), recipeConsumer);
		//buildStairRecipe(BlockRegistry.GRAPHITE_TILE_STAIRS.get(), BlockRegistry.GRAPHITE_TILE.get(), recipeConsumer);
		//buildStoneCutterRecipe(BlockRegistry.GRAPHITE_TILE_STAIRS.get(), BlockRegistry.GRAPHITE_TILE.get(), 1, recipeConsumer);
		//buildThreeByOneRecipe(BlockRegistry.GRAPHITE_TILE_SLAB.get(), BlockRegistry.GRAPHITE_TILE.get(), recipeConsumer);
		//buildStoneCutterRecipe(BlockRegistry.GRAPHITE_TILE_SLAB.get(), BlockRegistry.GRAPHITE_TILE.get(), 2, recipeConsumer);
		//buildThreeByTwoRecipe(BlockRegistry.GRAPHITE_TILE_WALL.get(), BlockRegistry.GRAPHITE_TILE.get(), recipeConsumer);
		//buildStoneCutterRecipe(BlockRegistry.GRAPHITE_TILE_WALL.get(), BlockRegistry.GRAPHITE_TILE.get(), 1, recipeConsumer);

		//BlockVariants.graphiteVariants.forEach(variant -> {
		//	Block variantBlock = ForgeRegistries.BLOCKS.getValue(new ResourceLocation(MODID, String.format("graphite_%s", variant)));
		//
		//	if(blockExists(variantBlock)) {
		//		buildStoneCutterRecipe(variantBlock, BlockRegistry.GRAPHITE.get(), 1, recipeConsumer);
		//
		//		//stairs, slab, wall
		//		BlockVariants.graphiteBlocks.forEach(block -> {
		//
		//		});
		//	}
		//});
		//endregion

		//region Smooth Deepslate
		//buildSmeltingRecipe(Blocks.DEEPSLATE, BlockRegistry.SMOOTH_DEEPSLATE.get(), recipeConsumer);
		//buildStairRecipe(BlockRegistry.SMOOTH_DEEPSLATE_STAIRS.get(), BlockRegistry.SMOOTH_DEEPSLATE.get(), recipeConsumer);
		//buildStoneCutterRecipe(BlockRegistry.SMOOTH_DEEPSLATE_STAIRS.get(), BlockRegistry.SMOOTH_DEEPSLATE.get(), 1, recipeConsumer);
		//buildStoneCutterRecipe(BlockRegistry.SMOOTH_DEEPSLATE_SLAB.get(), BlockRegistry.SMOOTH_DEEPSLATE.get(), 2, recipeConsumer);
		//buildThreeByOneRecipe(BlockRegistry.SMOOTH_DEEPSLATE_SLAB.get(), BlockRegistry.SMOOTH_DEEPSLATE.get(), recipeConsumer);
		//buildThreeByTwoRecipe(BlockRegistry.SMOOTH_DEEPSLATE_WALL.get(), BlockRegistry.SMOOTH_DEEPSLATE.get(), recipeConsumer);
		//buildStoneCutterRecipe(BlockRegistry.SMOOTH_DEEPSLATE_WALL.get(), BlockRegistry.SMOOTH_DEEPSLATE.get(), 1, recipeConsumer);
		//endregion

		//region Caution Stripes
		//buildStripedRecipe(BlockRegistry.YELLOW_CAUTION_STRIPES.get(), Items.YELLOW_DYE, Items.BLACK_DYE, recipeConsumer);
		//buildStripedRecipe(BlockRegistry.RED_CAUTION_STRIPES.get(), Items.RED_DYE, Items.WHITE_DYE, recipeConsumer);
		//endregion
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
		ShapedRecipeBuilder shaped = ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, output, 4);
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

	private void buildStairRecipe(Block output, Block input, Consumer<FinishedRecipe> consumer) {
		ShapedRecipeBuilder shaped = ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, output, 4);
		shaped.define('#', input);
		shaped.pattern("#  ");
		shaped.pattern("## ");
		shaped.pattern("###");
		shaped.unlockedBy("has_item", has(input));
		shaped.save(consumer);
	}
}
