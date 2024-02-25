package andronomos.androbuildingblocks.data;

import andronomos.androbuildingblocks.registry.BlockRegistry;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
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

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
	public ModRecipeProvider(PackOutput output) {
		super(output);
	}

	@Override
	protected void buildRecipes(@NotNull Consumer<FinishedRecipe> recipeConsumer) {
		//region Rough Concrete
		generateRoughConcretePowder(BlockRegistry.ROUGH_CONCRETE_WHITE_POWDER.get(), Items.WHITE_DYE, recipeConsumer);
		generateStoneCutterRecipe(BlockRegistry.ROUGH_CONCRETE_WHITE_STAIRS.get(), BlockRegistry.ROUGH_CONCRETE_WHITE.get(), 1, recipeConsumer);
		generateStairRecipe(BlockRegistry.ROUGH_CONCRETE_WHITE_STAIRS.get(), BlockRegistry.ROUGH_CONCRETE_WHITE.get().asItem(), recipeConsumer);
		generateStoneCutterRecipe(BlockRegistry.ROUGH_CONCRETE_WHITE_SLAB.get(), BlockRegistry.ROUGH_CONCRETE_WHITE.get(), 2, recipeConsumer);
		generateSlabRecipe(BlockRegistry.ROUGH_CONCRETE_WHITE_SLAB.get(), BlockRegistry.ROUGH_CONCRETE_WHITE.get().asItem(), recipeConsumer);
		generateThreeByTwoRecipe(BlockRegistry.ROUGH_CONCRETE_WHITE_WALL.get(), BlockRegistry.ROUGH_CONCRETE_WHITE.get(), recipeConsumer);
		generateStoneCutterRecipe(BlockRegistry.ROUGH_CONCRETE_WHITE_WALL.get(), BlockRegistry.ROUGH_CONCRETE_WHITE.get(), 1, recipeConsumer);

		generateRoughConcretePowder(BlockRegistry.ROUGH_CONCRETE_BLUE_POWDER.get(), Items.BLUE_DYE, recipeConsumer);
		generateStoneCutterRecipe(BlockRegistry.ROUGH_CONCRETE_BLUE_STAIRS.get(), BlockRegistry.ROUGH_CONCRETE_BLUE.get(), 1, recipeConsumer);
		generateStairRecipe(BlockRegistry.ROUGH_CONCRETE_BLUE_STAIRS.get(), BlockRegistry.ROUGH_CONCRETE_BLUE.get().asItem(), recipeConsumer);
		generateStoneCutterRecipe(BlockRegistry.ROUGH_CONCRETE_BLUE_SLAB.get(), BlockRegistry.ROUGH_CONCRETE_BLUE.get(), 2, recipeConsumer);
		generateSlabRecipe(BlockRegistry.ROUGH_CONCRETE_BLUE_SLAB.get(), BlockRegistry.ROUGH_CONCRETE_BLUE.get().asItem(), recipeConsumer);
		generateThreeByTwoRecipe(BlockRegistry.ROUGH_CONCRETE_BLUE_WALL.get(), BlockRegistry.ROUGH_CONCRETE_BLUE.get(), recipeConsumer);
		generateStoneCutterRecipe(BlockRegistry.ROUGH_CONCRETE_BLUE_WALL.get(), BlockRegistry.ROUGH_CONCRETE_BLUE.get(), 1, recipeConsumer);

		generateRoughConcretePowder(BlockRegistry.ROUGH_CONCRETE_BLACK_POWDER.get(), Items.BLACK_DYE, recipeConsumer);
		generateStoneCutterRecipe(BlockRegistry.ROUGH_CONCRETE_BLACK_STAIRS.get(), BlockRegistry.ROUGH_CONCRETE_BLACK.get(), 1, recipeConsumer);
		generateStairRecipe(BlockRegistry.ROUGH_CONCRETE_BLACK_STAIRS.get(), BlockRegistry.ROUGH_CONCRETE_BLACK.get().asItem(), recipeConsumer);
		generateStoneCutterRecipe(BlockRegistry.ROUGH_CONCRETE_BLACK_SLAB.get(), BlockRegistry.ROUGH_CONCRETE_BLACK.get(), 2, recipeConsumer);
		generateSlabRecipe(BlockRegistry.ROUGH_CONCRETE_BLACK_SLAB.get(), BlockRegistry.ROUGH_CONCRETE_BLACK.get().asItem(), recipeConsumer);
		generateThreeByTwoRecipe(BlockRegistry.ROUGH_CONCRETE_BLACK_WALL.get(), BlockRegistry.ROUGH_CONCRETE_BLACK.get(), recipeConsumer);
		generateStoneCutterRecipe(BlockRegistry.ROUGH_CONCRETE_BLACK_WALL.get(), BlockRegistry.ROUGH_CONCRETE_BLACK.get(), 1, recipeConsumer);

		generateRoughConcretePowder(BlockRegistry.ROUGH_CONCRETE_BROWN_POWDER.get(), Items.BROWN_DYE, recipeConsumer);
		generateStoneCutterRecipe(BlockRegistry.ROUGH_CONCRETE_BROWN_STAIRS.get(), BlockRegistry.ROUGH_CONCRETE_BROWN.get(), 1, recipeConsumer);
		generateStairRecipe(BlockRegistry.ROUGH_CONCRETE_BROWN_STAIRS.get(), BlockRegistry.ROUGH_CONCRETE_BROWN.get().asItem(), recipeConsumer);
		generateStoneCutterRecipe(BlockRegistry.ROUGH_CONCRETE_BROWN_SLAB.get(), BlockRegistry.ROUGH_CONCRETE_BROWN.get(), 2, recipeConsumer);
		generateSlabRecipe(BlockRegistry.ROUGH_CONCRETE_BROWN_SLAB.get(), BlockRegistry.ROUGH_CONCRETE_BROWN.get().asItem(), recipeConsumer);
		generateThreeByTwoRecipe(BlockRegistry.ROUGH_CONCRETE_BROWN_WALL.get(), BlockRegistry.ROUGH_CONCRETE_BROWN.get(), recipeConsumer);
		generateStoneCutterRecipe(BlockRegistry.ROUGH_CONCRETE_BROWN_WALL.get(), BlockRegistry.ROUGH_CONCRETE_BROWN.get(), 1, recipeConsumer);

		generateRoughConcretePowder(BlockRegistry.ROUGH_CONCRETE_GREEN_POWDER.get(), Items.GREEN_DYE, recipeConsumer);
		generateStoneCutterRecipe(BlockRegistry.ROUGH_CONCRETE_GREEN_STAIRS.get(), BlockRegistry.ROUGH_CONCRETE_GREEN.get(), 1, recipeConsumer);
		generateStairRecipe(BlockRegistry.ROUGH_CONCRETE_GREEN_STAIRS.get(), BlockRegistry.ROUGH_CONCRETE_GREEN.get().asItem(), recipeConsumer);
		generateStoneCutterRecipe(BlockRegistry.ROUGH_CONCRETE_GREEN_SLAB.get(), BlockRegistry.ROUGH_CONCRETE_GREEN.get(), 2, recipeConsumer);
		generateSlabRecipe(BlockRegistry.ROUGH_CONCRETE_GREEN_SLAB.get(), BlockRegistry.ROUGH_CONCRETE_GREEN.get().asItem(), recipeConsumer);
		generateThreeByTwoRecipe(BlockRegistry.ROUGH_CONCRETE_GREEN_WALL.get(), BlockRegistry.ROUGH_CONCRETE_GREEN.get(), recipeConsumer);
		generateStoneCutterRecipe(BlockRegistry.ROUGH_CONCRETE_GREEN_WALL.get(), BlockRegistry.ROUGH_CONCRETE_GREEN.get(), 1, recipeConsumer);

		generateRoughConcretePowder(BlockRegistry.ROUGH_CONCRETE_GRAY_POWDER.get(), Items.GRAY_DYE, recipeConsumer);
		generateStoneCutterRecipe(BlockRegistry.ROUGH_CONCRETE_GRAY_STAIRS.get(), BlockRegistry.ROUGH_CONCRETE_GRAY.get(), 1, recipeConsumer);
		generateStairRecipe(BlockRegistry.ROUGH_CONCRETE_GRAY_STAIRS.get(), BlockRegistry.ROUGH_CONCRETE_GRAY.get().asItem(), recipeConsumer);
		generateStoneCutterRecipe(BlockRegistry.ROUGH_CONCRETE_GRAY_SLAB.get(), BlockRegistry.ROUGH_CONCRETE_GRAY.get(), 2, recipeConsumer);
		generateSlabRecipe(BlockRegistry.ROUGH_CONCRETE_GRAY_SLAB.get(), BlockRegistry.ROUGH_CONCRETE_GRAY.get().asItem(), recipeConsumer);
		generateThreeByTwoRecipe(BlockRegistry.ROUGH_CONCRETE_GRAY_WALL.get(), BlockRegistry.ROUGH_CONCRETE_GRAY.get(), recipeConsumer);
		generateStoneCutterRecipe(BlockRegistry.ROUGH_CONCRETE_GRAY_WALL.get(), BlockRegistry.ROUGH_CONCRETE_GRAY.get(), 1, recipeConsumer);

		generateRoughConcretePowder(BlockRegistry.ROUGH_CONCRETE_ORANGE_POWDER.get(), Items.ORANGE_DYE, recipeConsumer);
		generateStoneCutterRecipe(BlockRegistry.ROUGH_CONCRETE_ORANGE_STAIRS.get(), BlockRegistry.ROUGH_CONCRETE_ORANGE.get(), 1, recipeConsumer);
		generateStairRecipe(BlockRegistry.ROUGH_CONCRETE_ORANGE_STAIRS.get(), BlockRegistry.ROUGH_CONCRETE_ORANGE.get().asItem(), recipeConsumer);
		generateStoneCutterRecipe(BlockRegistry.ROUGH_CONCRETE_ORANGE_SLAB.get(), BlockRegistry.ROUGH_CONCRETE_ORANGE.get(), 2, recipeConsumer);
		generateSlabRecipe(BlockRegistry.ROUGH_CONCRETE_ORANGE_SLAB.get(), BlockRegistry.ROUGH_CONCRETE_ORANGE.get().asItem(), recipeConsumer);
		generateThreeByTwoRecipe(BlockRegistry.ROUGH_CONCRETE_ORANGE_WALL.get(), BlockRegistry.ROUGH_CONCRETE_ORANGE.get(), recipeConsumer);
		generateStoneCutterRecipe(BlockRegistry.ROUGH_CONCRETE_ORANGE_WALL.get(), BlockRegistry.ROUGH_CONCRETE_ORANGE.get(), 1, recipeConsumer);

		generateRoughConcretePowder(BlockRegistry.ROUGH_CONCRETE_PURPLE_POWDER.get(), Items.PURPLE_DYE, recipeConsumer);
		generateStoneCutterRecipe(BlockRegistry.ROUGH_CONCRETE_PURPLE_STAIRS.get(), BlockRegistry.ROUGH_CONCRETE_PURPLE.get(), 1, recipeConsumer);
		generateStairRecipe(BlockRegistry.ROUGH_CONCRETE_PURPLE_STAIRS.get(), BlockRegistry.ROUGH_CONCRETE_PURPLE.get().asItem(), recipeConsumer);
		generateStoneCutterRecipe(BlockRegistry.ROUGH_CONCRETE_PURPLE_SLAB.get(), BlockRegistry.ROUGH_CONCRETE_PURPLE.get(), 2, recipeConsumer);
		generateSlabRecipe(BlockRegistry.ROUGH_CONCRETE_PURPLE_SLAB.get(), BlockRegistry.ROUGH_CONCRETE_PURPLE.get().asItem(), recipeConsumer);
		generateThreeByTwoRecipe(BlockRegistry.ROUGH_CONCRETE_PURPLE_WALL.get(), BlockRegistry.ROUGH_CONCRETE_PURPLE.get(), recipeConsumer);
		generateStoneCutterRecipe(BlockRegistry.ROUGH_CONCRETE_PURPLE_WALL.get(), BlockRegistry.ROUGH_CONCRETE_PURPLE.get(), 1, recipeConsumer);

		generateRoughConcretePowder(BlockRegistry.ROUGH_CONCRETE_RED_POWDER.get(), Items.RED_DYE, recipeConsumer);
		generateStoneCutterRecipe(BlockRegistry.ROUGH_CONCRETE_RED_STAIRS.get(), BlockRegistry.ROUGH_CONCRETE_RED.get(), 1, recipeConsumer);
		generateStairRecipe(BlockRegistry.ROUGH_CONCRETE_RED_STAIRS.get(), BlockRegistry.ROUGH_CONCRETE_RED.get().asItem(), recipeConsumer);
		generateStoneCutterRecipe(BlockRegistry.ROUGH_CONCRETE_RED_SLAB.get(), BlockRegistry.ROUGH_CONCRETE_RED.get(), 2, recipeConsumer);
		generateSlabRecipe(BlockRegistry.ROUGH_CONCRETE_RED_SLAB.get(), BlockRegistry.ROUGH_CONCRETE_RED.get().asItem(), recipeConsumer);
		generateThreeByTwoRecipe(BlockRegistry.ROUGH_CONCRETE_RED_WALL.get(), BlockRegistry.ROUGH_CONCRETE_RED.get(), recipeConsumer);
		generateStoneCutterRecipe(BlockRegistry.ROUGH_CONCRETE_RED_WALL.get(), BlockRegistry.ROUGH_CONCRETE_RED.get(), 1, recipeConsumer);

		generateRoughConcretePowder(BlockRegistry.ROUGH_CONCRETE_YELLOW_POWDER.get(), Items.YELLOW_DYE, recipeConsumer);
		generateStoneCutterRecipe(BlockRegistry.ROUGH_CONCRETE_YELLOW_STAIRS.get(), BlockRegistry.ROUGH_CONCRETE_YELLOW.get(), 1, recipeConsumer);
		generateStairRecipe(BlockRegistry.ROUGH_CONCRETE_YELLOW_STAIRS.get(), BlockRegistry.ROUGH_CONCRETE_YELLOW.get().asItem(), recipeConsumer);
		generateStoneCutterRecipe(BlockRegistry.ROUGH_CONCRETE_YELLOW_SLAB.get(), BlockRegistry.ROUGH_CONCRETE_YELLOW.get(), 2, recipeConsumer);
		generateSlabRecipe(BlockRegistry.ROUGH_CONCRETE_YELLOW_SLAB.get(), BlockRegistry.ROUGH_CONCRETE_YELLOW.get().asItem(), recipeConsumer);
		generateThreeByTwoRecipe(BlockRegistry.ROUGH_CONCRETE_YELLOW_WALL.get(), BlockRegistry.ROUGH_CONCRETE_YELLOW.get(), recipeConsumer);
		generateStoneCutterRecipe(BlockRegistry.ROUGH_CONCRETE_YELLOW_WALL.get(), BlockRegistry.ROUGH_CONCRETE_YELLOW.get(), 1, recipeConsumer);
		//endregion

		//region Borderless Glass
		generateSingleItemShapelessRecipe(BlockRegistry.WHITE_BORDERLESS_GLASS.get(), Blocks.WHITE_STAINED_GLASS, recipeConsumer);
		generateThreeByTwoRecipe(BlockRegistry.WHITE_BORDERLESS_GLASS_PANE.get(), BlockRegistry.WHITE_BORDERLESS_GLASS.get(), recipeConsumer);

		generateSingleItemShapelessRecipe(BlockRegistry.BLUE_BORDERLESS_GLASS.get(), Blocks.BLUE_STAINED_GLASS, recipeConsumer);
		generateThreeByTwoRecipe(BlockRegistry.BLUE_BORDERLESS_GLASS_PANE.get(), BlockRegistry.BLUE_BORDERLESS_GLASS.get(), recipeConsumer);

		generateSingleItemShapelessRecipe(BlockRegistry.BROWN_BORDERLESS_GLASS.get(), Blocks.BROWN_STAINED_GLASS, recipeConsumer);
		generateThreeByTwoRecipe(BlockRegistry.BROWN_BORDERLESS_GLASS_PANE.get(), BlockRegistry.BROWN_BORDERLESS_GLASS.get(), recipeConsumer);

		generateSingleItemShapelessRecipe(BlockRegistry.CYAN_BORDERLESS_GLASS.get(), Blocks.CYAN_STAINED_GLASS, recipeConsumer);
		generateThreeByTwoRecipe(BlockRegistry.CYAN_BORDERLESS_GLASS_PANE.get(), BlockRegistry.CYAN_BORDERLESS_GLASS.get(), recipeConsumer);

		generateSingleItemShapelessRecipe(BlockRegistry.GREEN_BORDERLESS_GLASS.get(), Blocks.GREEN_STAINED_GLASS, recipeConsumer);
		generateThreeByTwoRecipe(BlockRegistry.GREEN_BORDERLESS_GLASS_PANE.get(), BlockRegistry.GREEN_BORDERLESS_GLASS.get(), recipeConsumer);

		generateSingleItemShapelessRecipe(BlockRegistry.GRAY_BORDERLESS_GLASS.get(), Blocks.GRAY_STAINED_GLASS, recipeConsumer);
		generateThreeByTwoRecipe(BlockRegistry.GRAY_BORDERLESS_GLASS_PANE.get(), BlockRegistry.GRAY_BORDERLESS_GLASS.get(), recipeConsumer);

		generateSingleItemShapelessRecipe(BlockRegistry.LIGHT_BLUE_BORDERLESS_GLASS.get(), Blocks.LIGHT_BLUE_STAINED_GLASS, recipeConsumer);
		generateThreeByTwoRecipe(BlockRegistry.LIGHT_BLUE_BORDERLESS_GLASS_PANE.get(), BlockRegistry.LIGHT_BLUE_BORDERLESS_GLASS.get(), recipeConsumer);

		generateSingleItemShapelessRecipe(BlockRegistry.LIGHT_GRAY_BORDERLESS_GLASS.get(), Blocks.LIGHT_GRAY_STAINED_GLASS, recipeConsumer);
		generateThreeByTwoRecipe(BlockRegistry.LIGHT_GRAY_BORDERLESS_GLASS_PANE.get(), BlockRegistry.LIGHT_GRAY_BORDERLESS_GLASS.get(), recipeConsumer);

		generateSingleItemShapelessRecipe(BlockRegistry.LIME_BORDERLESS_GLASS.get(), Blocks.LIME_STAINED_GLASS, recipeConsumer);
		generateThreeByTwoRecipe(BlockRegistry.LIME_BORDERLESS_GLASS_PANE.get(), BlockRegistry.LIME_BORDERLESS_GLASS.get(), recipeConsumer);

		generateSingleItemShapelessRecipe(BlockRegistry.MAGENTA_BORDERLESS_GLASS.get(), Blocks.MAGENTA_STAINED_GLASS, recipeConsumer);
		generateThreeByTwoRecipe(BlockRegistry.MAGENTA_BORDERLESS_GLASS_PANE.get(), BlockRegistry.MAGENTA_BORDERLESS_GLASS.get(), recipeConsumer);

		generateSingleItemShapelessRecipe(BlockRegistry.ORANGE_BORDERLESS_GLASS.get(), Blocks.ORANGE_STAINED_GLASS, recipeConsumer);
		generateThreeByTwoRecipe(BlockRegistry.ORANGE_BORDERLESS_GLASS_PANE.get(), BlockRegistry.ORANGE_BORDERLESS_GLASS.get(), recipeConsumer);

		generateSingleItemShapelessRecipe(BlockRegistry.PINK_BORDERLESS_GLASS.get(), Blocks.PINK_STAINED_GLASS, recipeConsumer);
		generateThreeByTwoRecipe(BlockRegistry.PINK_BORDERLESS_GLASS_PANE.get(), BlockRegistry.PINK_BORDERLESS_GLASS.get(), recipeConsumer);

		generateSingleItemShapelessRecipe(BlockRegistry.PURPLE_BORDERLESS_GLASS.get(), Blocks.PURPLE_STAINED_GLASS, recipeConsumer);
		generateThreeByTwoRecipe(BlockRegistry.PURPLE_BORDERLESS_GLASS_PANE.get(), BlockRegistry.PURPLE_BORDERLESS_GLASS.get(), recipeConsumer);

		generateSingleItemShapelessRecipe(BlockRegistry.RED_BORDERLESS_GLASS.get(), Blocks.RED_STAINED_GLASS, recipeConsumer);
		generateThreeByTwoRecipe(BlockRegistry.RED_BORDERLESS_GLASS_PANE.get(), BlockRegistry.RED_BORDERLESS_GLASS.get(), recipeConsumer);

		generateSingleItemShapelessRecipe(BlockRegistry.YELLOW_BORDERLESS_GLASS.get(), Blocks.YELLOW_STAINED_GLASS, recipeConsumer);
		generateThreeByTwoRecipe(BlockRegistry.YELLOW_BORDERLESS_GLASS_PANE.get(), BlockRegistry.YELLOW_BORDERLESS_GLASS.get(), recipeConsumer);

		generateSingleItemShapelessRecipe(BlockRegistry.BLACK_BORDERLESS_GLASS.get(), Blocks.BLACK_STAINED_GLASS, recipeConsumer);
		generateThreeByTwoRecipe(BlockRegistry.BLACK_BORDERLESS_GLASS_PANE.get(), BlockRegistry.BLACK_BORDERLESS_GLASS.get(), recipeConsumer);
		//endregion

		generateSmeltingRecipe(Blocks.DEEPSLATE, BlockRegistry.SMOOTH_DEEPSLATE.get(), recipeConsumer);
		generateStoneCutterRecipe(BlockRegistry.SMOOTH_DEEPSLATE_SLAB.get(), BlockRegistry.SMOOTH_DEEPSLATE.get(), 1, recipeConsumer);
		generateStairRecipe(BlockRegistry.SMOOTH_DEEPSLATE_STAIRS.get(), BlockRegistry.SMOOTH_DEEPSLATE.get().asItem(), recipeConsumer);
		generateStoneCutterRecipe(BlockRegistry.SMOOTH_DEEPSLATE_STAIRS.get(), BlockRegistry.SMOOTH_DEEPSLATE.get(), 1, recipeConsumer);
		generateSlabRecipe(BlockRegistry.SMOOTH_DEEPSLATE_SLAB.get(), BlockRegistry.SMOOTH_DEEPSLATE.get().asItem(), recipeConsumer);
		generateThreeByTwoRecipe(BlockRegistry.SMOOTH_DEEPSLATE_WALL.get(), BlockRegistry.SMOOTH_DEEPSLATE.get(), recipeConsumer);
		generateStoneCutterRecipe(BlockRegistry.SMOOTH_DEEPSLATE_WALL.get(), BlockRegistry.SMOOTH_DEEPSLATE.get(), 1, recipeConsumer);

		//region Bentonite
		ShapedRecipeBuilder bentoniteRecipe = ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, BlockRegistry.BENTONITE.get(), 1);
		bentoniteRecipe.define('C', Items.CLAY_BALL);
		bentoniteRecipe.define('G', Items.GUNPOWDER);
		bentoniteRecipe.pattern("CG");
		bentoniteRecipe.pattern("GC");
		bentoniteRecipe.unlockedBy("has_item", has(Items.CLAY_BALL));
		bentoniteRecipe.save(recipeConsumer);

		generateStoneCutterRecipe(BlockRegistry.BENTONITE_PILLAR.get(), BlockRegistry.BENTONITE.get(), 1, recipeConsumer);
		generateStairRecipe(BlockRegistry.BENTONITE_STAIRS.get(), BlockRegistry.BENTONITE.get().asItem(), recipeConsumer);
		generateStoneCutterRecipe(BlockRegistry.BENTONITE_STAIRS.get(), BlockRegistry.BENTONITE.get(), 1, recipeConsumer);
		generateSlabRecipe(BlockRegistry.BENTONITE_SLAB.get(), BlockRegistry.BENTONITE.get().asItem(), recipeConsumer);
		generateThreeByTwoRecipe(BlockRegistry.BENTONITE_WALL.get(), BlockRegistry.BENTONITE.get(), recipeConsumer);
		generateStoneCutterRecipe(BlockRegistry.BENTONITE_SLAB.get(), BlockRegistry.BENTONITE.get(), 1, recipeConsumer);
		generateStoneCutterRecipe(BlockRegistry.BENTONITE_GRATE.get(), BlockRegistry.BENTONITE.get(), 1, recipeConsumer);

		generateTwoByTwoRecipe(BlockRegistry.BENTONITE_BRICKS.get(), BlockRegistry.BENTONITE.get(), recipeConsumer);
		generateStoneCutterRecipe(BlockRegistry.BENTONITE_BRICKS.get(), BlockRegistry.BENTONITE.get(), 1, recipeConsumer);
		generateStairRecipe(BlockRegistry.BENTONITE_BRICK_STAIRS.get(), BlockRegistry.BENTONITE.get().asItem(), recipeConsumer);
		generateStoneCutterRecipe(BlockRegistry.BENTONITE_BRICK_STAIRS.get(), BlockRegistry.BENTONITE_BRICKS.get(), 1, recipeConsumer);
		generateSlabRecipe(BlockRegistry.BENTONITE_BRICK_SLAB.get(), BlockRegistry.BENTONITE_BRICKS.get().asItem(), recipeConsumer);
		generateStoneCutterRecipe(BlockRegistry.BENTONITE_BRICK_SLAB.get(), BlockRegistry.BENTONITE_BRICKS.get(), 1, recipeConsumer);
		generateThreeByTwoRecipe(BlockRegistry.BENTONITE_BRICK_WALL.get(), BlockRegistry.BENTONITE_BRICKS.get(), recipeConsumer);
		generateStoneCutterRecipe(BlockRegistry.BENTONITE_BRICK_WALL.get(), BlockRegistry.BENTONITE_BRICKS.get(), 1, recipeConsumer);
		//endregion

		//region Decorative Stripes
		generateStripedRecipe(BlockRegistry.DECORATIVE_YELLOW_STRIPES.get(), Items.YELLOW_DYE, recipeConsumer);
		generateStripedRecipe(BlockRegistry.DECORATIVE_RED_STRIPES.get(), Items.RED_DYE, recipeConsumer);
		generateStripedRecipe(BlockRegistry.DECORATIVE_ORANGE_STRIPES.get(), Items.RED_DYE, recipeConsumer);
		generateStripedRecipe(BlockRegistry.DECORATIVE_BLUE_STRIPES.get(), Items.RED_DYE, recipeConsumer);
		generateStripedRecipe(BlockRegistry.DECORATIVE_GREEN_STRIPES.get(), Items.GREEN_DYE, recipeConsumer);
		generateStripedRecipe(BlockRegistry.DECORATIVE_PINK_STRIPES.get(), Items.PINK_DYE, recipeConsumer);
		generateStripedRecipe(BlockRegistry.DECORATIVE_PURPLE_STRIPES.get(), Items.PURPLE_DYE, recipeConsumer);
		generateStripedRecipe(BlockRegistry.DECORATIVE_LIME_STRIPES.get(), Items.LIME_DYE, recipeConsumer);
		generateStripedRecipe(BlockRegistry.DECORATIVE_LIGHT_BLUE_STRIPES.get(), Items.LIGHT_BLUE_DYE, recipeConsumer);
		generateStripedRecipe(BlockRegistry.DECORATIVE_BROWN_STRIPES.get(), Items.BROWN_DYE, recipeConsumer);
		//endregion
	}

	private void generateStripedRecipe(Block output, Item Dye, Consumer<FinishedRecipe> consumer) {
		ShapedRecipeBuilder shaped = ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, output, 4);
		shaped.define('1', Dye);
		shaped.define('2', Items.BLACK_DYE);
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

	private void generateSingleItemShapelessRecipe(Block output, Block sourceBlock, Consumer<FinishedRecipe> consumer) {
		ShapelessRecipeBuilder shapeless = ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS,
				output, 1);
		shapeless.requires(sourceBlock.asItem());
		shapeless.unlockedBy("has_item", has(sourceBlock));
		shapeless.save(consumer);
	}

	private void generateRoughConcretePowder(Block output, Item dye, Consumer<FinishedRecipe> consumer) {
		ShapedRecipeBuilder shaped = ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, output, 8);
		shaped.define('#', dye);
		shaped.define('1', Tags.Items.STONE);
		shaped.define('2', Items.GRAVEL);
		shaped.pattern("#11");
		shaped.pattern("112");
		shaped.pattern("222");
		shaped.unlockedBy("has_item", has(Tags.Items.STONE));
		shaped.save(consumer);
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
