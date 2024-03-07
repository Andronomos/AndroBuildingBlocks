package andronomos.androbuildingblocks.data;

import andronomos.androbuildingblocks.block.BlockCategories;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.resources.ResourceLocation;
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
		BlockCategories.REINFORCED_CONCRETE_BLOCKS.blockTypes.forEach(blockType -> {
			Block variantBlock = ForgeRegistries.BLOCKS.getValue(new ResourceLocation(MODID, blockType.name));
			Item dye = ForgeRegistries.ITEMS.getValue(new ResourceLocation("minecraft", String.format("%s_dye", blockType.dyeColor.getName())));

			if(blockExists(variantBlock) && dye != null) {
				ShapedRecipeBuilder shaped = ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, variantBlock, 8);
				shaped.define('1', Tags.Items.STONE);
				shaped.define('2', Tags.Items.INGOTS_IRON);
				shaped.define('3', Items.GRAVEL);
				shaped.define('4', dye);
				shaped.pattern("212");
				shaped.pattern("343");
				shaped.pattern("212");
				shaped.group(blockType.name);
				shaped.unlockedBy("has_item", has(Tags.Items.STONE));
				shaped.save(recipeConsumer);

				Block stairBlock = ForgeRegistries.BLOCKS.getValue(new ResourceLocation(MODID, String.format("%s_stairs", blockType.name)));
				Block slabBlock = ForgeRegistries.BLOCKS.getValue(new ResourceLocation(MODID, String.format("%s_slab", blockType.name)));
				Block wallBlock = ForgeRegistries.BLOCKS.getValue(new ResourceLocation(MODID, String.format("%s_wall", blockType.name)));

				if(blockType.hasStairVariant && blockExists(stairBlock)) {
					buildStairRecipe(stairBlock, variantBlock, recipeConsumer);
					buildStoneCutterRecipe(stairBlock, variantBlock, 1, recipeConsumer);
				}

				if(blockType.hasSlabVariant && blockExists(slabBlock)) {
					buildThreeByOneRecipe(slabBlock, variantBlock, recipeConsumer);
					buildStoneCutterRecipe(slabBlock, variantBlock, 2, recipeConsumer);
				}

				if(blockType.hasWallVariant && blockExists(wallBlock)) {
					buildStoneCutterRecipe(wallBlock, variantBlock, 1, recipeConsumer);
					buildThreeByTwoRecipe(wallBlock, variantBlock, recipeConsumer);
				}
			}
		});
		//endregion

		//region Structural Glass
		BlockCategories.STRUCTURAL_GLASS_BLOCKS.blockTypes.forEach(type -> {
			Block vanillaGlassBlock = ForgeRegistries.BLOCKS.getValue(new ResourceLocation("minecraft", String.format("%s_stained_glass", type.dyeColor.getName())));
			Block structuralGlassBlock = ForgeRegistries.BLOCKS.getValue(new ResourceLocation(MODID, type.name));
			Block glassPaneBlock = ForgeRegistries.BLOCKS.getValue(new ResourceLocation(MODID, String.format("%s_pane", type.name)));

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
		//endregion

		//region Steel
		Block steelBlock = ForgeRegistries.BLOCKS.getValue(new ResourceLocation(MODID, BlockCategories.STEEL_BLOCKS.sourceBlock.name));

		if(steelBlock != null) {
			ShapedRecipeBuilder steelFromCoalRecipe = ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, steelBlock, 4);
			steelFromCoalRecipe.define('C', Items.COAL);
			steelFromCoalRecipe.define('I', Tags.Items.INGOTS_IRON);
			steelFromCoalRecipe.pattern("CIC");
			steelFromCoalRecipe.pattern("ICI");
			steelFromCoalRecipe.pattern("CIC");
			steelFromCoalRecipe.group(BlockCategories.STEEL_BLOCKS.sourceBlock.name);
			steelFromCoalRecipe.unlockedBy("has_item", has(Items.COAL));
			steelFromCoalRecipe.save(recipeConsumer);

			ShapedRecipeBuilder steelFromCharcoalRecipe = ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, steelBlock, 4);
			steelFromCharcoalRecipe.define('C', Items.CHARCOAL);
			steelFromCharcoalRecipe.define('I', Tags.Items.INGOTS_IRON);
			steelFromCharcoalRecipe.pattern("CIC");
			steelFromCharcoalRecipe.pattern("ICI");
			steelFromCharcoalRecipe.pattern("CIC");
			steelFromCharcoalRecipe.group(BlockCategories.STEEL_BLOCKS.sourceBlock.name);
			steelFromCharcoalRecipe.unlockedBy("has_item", has(Items.CHARCOAL));
			steelFromCharcoalRecipe.save(recipeConsumer, String.format("%s_from_charcoal", BlockCategories.STEEL_BLOCKS.sourceBlock.name));

			Block stairBlock = ForgeRegistries.BLOCKS.getValue(new ResourceLocation(MODID, String.format("%s_stairs", BlockCategories.STEEL_BLOCKS.sourceBlock.name)));
			Block slabBlock =  ForgeRegistries.BLOCKS.getValue(new ResourceLocation(MODID, String.format("%s_slab", BlockCategories.STEEL_BLOCKS.sourceBlock.name)));
			Block wallBlock =  ForgeRegistries.BLOCKS.getValue(new ResourceLocation(MODID, String.format("%s_wall", BlockCategories.STEEL_BLOCKS.sourceBlock.name)));

			if(BlockCategories.STEEL_BLOCKS.sourceBlock.hasStairVariant && blockExists(stairBlock)) {
				buildStairRecipe(stairBlock, steelBlock, recipeConsumer);
				buildStoneCutterRecipe(stairBlock, steelBlock, 1, recipeConsumer);
			}

			if(BlockCategories.STEEL_BLOCKS.sourceBlock.hasSlabVariant && blockExists(slabBlock)) {
				buildThreeByOneRecipe(slabBlock, steelBlock, recipeConsumer);
				buildStoneCutterRecipe(slabBlock, steelBlock, 2, recipeConsumer);
			}

			if(BlockCategories.STEEL_BLOCKS.sourceBlock.hasWallVariant && blockExists(wallBlock)) {
				buildStoneCutterRecipe(wallBlock, steelBlock, 1, recipeConsumer);
				buildThreeByTwoRecipe(wallBlock, steelBlock, recipeConsumer);
			}
		}

		BlockCategories.STEEL_BLOCKS.blockTypes.forEach(blockType -> {
			Block variantBlock = ForgeRegistries.BLOCKS.getValue(new ResourceLocation(MODID, blockType.name));

			if(blockExists(variantBlock)) {
				Block stairBlock = ForgeRegistries.BLOCKS.getValue(new ResourceLocation(MODID, String.format("%s_stairs", blockType.name)));
				Block slabBlock =  ForgeRegistries.BLOCKS.getValue(new ResourceLocation(MODID, String.format("%s_slab", blockType.name)));
				Block wallBlock =  ForgeRegistries.BLOCKS.getValue(new ResourceLocation(MODID, String.format("%s_wall", blockType.name)));

				if(blockType.hasStairVariant && blockExists(stairBlock)) {
					buildStairRecipe(stairBlock, variantBlock, recipeConsumer);
					buildStoneCutterRecipe(stairBlock, variantBlock, 1, recipeConsumer);
				}

				if(blockType.hasSlabVariant && blockExists(slabBlock)) {
					buildThreeByOneRecipe(slabBlock, variantBlock, recipeConsumer);
					buildStoneCutterRecipe(slabBlock, variantBlock, 2, recipeConsumer);
				}

				if(blockType.hasWallVariant && blockExists(wallBlock)) {
					buildStoneCutterRecipe(wallBlock, variantBlock, 1, recipeConsumer);
					buildThreeByTwoRecipe(wallBlock, variantBlock, recipeConsumer);
				}
			}
		});
		//endregion

		//region Graphite
		if(BlockCategories.GRAPHITE_BLOCKS.sourceBlock != null) {
			Block graphiteBlock = ForgeRegistries.BLOCKS.getValue(new ResourceLocation(MODID, BlockCategories.GRAPHITE_BLOCKS.sourceBlock.name));
			if(graphiteBlock != null) {
				buildSmeltingRecipe(Blocks.COAL_BLOCK, graphiteBlock, recipeConsumer);

				Block stairBlock = ForgeRegistries.BLOCKS.getValue(new ResourceLocation(MODID, String.format("%s_stairs", BlockCategories.GRAPHITE_BLOCKS.sourceBlock.name)));
				Block slabBlock =  ForgeRegistries.BLOCKS.getValue(new ResourceLocation(MODID, String.format("%s_slab", BlockCategories.GRAPHITE_BLOCKS.sourceBlock.name)));
				Block wallBlock =  ForgeRegistries.BLOCKS.getValue(new ResourceLocation(MODID, String.format("%s_wall", BlockCategories.GRAPHITE_BLOCKS.sourceBlock.name)));

				if(BlockCategories.GRAPHITE_BLOCKS.sourceBlock.hasStairVariant && blockExists(stairBlock)) {
					buildStairRecipe(stairBlock, steelBlock, recipeConsumer);
					buildStoneCutterRecipe(stairBlock, steelBlock, 1, recipeConsumer);
				}

				if(BlockCategories.GRAPHITE_BLOCKS.sourceBlock.hasSlabVariant && blockExists(slabBlock)) {
					buildThreeByOneRecipe(slabBlock, steelBlock, recipeConsumer);
					buildStoneCutterRecipe(slabBlock, steelBlock, 2, recipeConsumer);
				}

				if(BlockCategories.GRAPHITE_BLOCKS.sourceBlock.hasWallVariant && blockExists(wallBlock)) {
					buildStoneCutterRecipe(wallBlock, steelBlock, 1, recipeConsumer);
					buildThreeByTwoRecipe(wallBlock, steelBlock, recipeConsumer);
				}
			}
		}

		BlockCategories.GRAPHITE_BLOCKS.blockTypes.forEach(blockType -> {
			Block variantBlock = ForgeRegistries.BLOCKS.getValue(new ResourceLocation(MODID, blockType.name));

			if(blockExists(variantBlock)) {
				Block stairBlock = ForgeRegistries.BLOCKS.getValue(new ResourceLocation(MODID, String.format("%s_stairs", blockType.name)));
				Block slabBlock =  ForgeRegistries.BLOCKS.getValue(new ResourceLocation(MODID, String.format("%s_slab", blockType.name)));
				Block wallBlock =  ForgeRegistries.BLOCKS.getValue(new ResourceLocation(MODID, String.format("%s_wall", blockType.name)));

				if(blockType.hasStairVariant && blockExists(stairBlock)) {
					buildStairRecipe(stairBlock, variantBlock, recipeConsumer);
					buildStoneCutterRecipe(stairBlock, variantBlock, 1, recipeConsumer);
				}

				if(blockType.hasSlabVariant && blockExists(slabBlock)) {
					buildThreeByOneRecipe(slabBlock, variantBlock, recipeConsumer);
					buildStoneCutterRecipe(slabBlock, variantBlock, 2, recipeConsumer);
				}

				if(blockType.hasWallVariant && blockExists(wallBlock)) {
					buildStoneCutterRecipe(wallBlock, variantBlock, 1, recipeConsumer);
					buildThreeByTwoRecipe(wallBlock, variantBlock, recipeConsumer);
				}
			}
		});
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
