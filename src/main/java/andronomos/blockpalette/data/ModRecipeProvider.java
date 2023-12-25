package andronomos.blockpalette.data;

import andronomos.blockpalette.registry.ModBlocks;
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

import java.util.function.Consumer;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
	public ModRecipeProvider(PackOutput output) {
		super(output);
	}

	@Override
	protected void buildRecipes(Consumer<FinishedRecipe> recipeConsumer) {
		//region Rough Concrete
		generateRoughConcretePowder(ModBlocks.ROUGH_CONCRETE_WHITE_POWDER.get(), Items.WHITE_DYE, recipeConsumer);
		generateStoneCutterRecipe(ModBlocks.ROUGH_CONCRETE_WHITE_STAIRS.get(), ModBlocks.ROUGH_CONCRETE_WHITE.get(), 1, recipeConsumer);
		generateStoneCutterRecipe(ModBlocks.ROUGH_CONCRETE_WHITE_TILE.get(), ModBlocks.ROUGH_CONCRETE_WHITE.get(), 1, recipeConsumer);
		generateStairRecipe(ModBlocks.ROUGH_CONCRETE_WHITE_STAIRS.get(), ModBlocks.ROUGH_CONCRETE_WHITE.get().asItem(), recipeConsumer);
		generateStoneCutterRecipe(ModBlocks.ROUGH_CONCRETE_WHITE_SLAB.get(), ModBlocks.ROUGH_CONCRETE_WHITE.get(), 2, recipeConsumer);
		generateSlabRecipe(ModBlocks.ROUGH_CONCRETE_WHITE_SLAB.get(), ModBlocks.ROUGH_CONCRETE_WHITE.get().asItem(), recipeConsumer);
		generateThreeByTwoRecipe(ModBlocks.ROUGH_CONCRETE_WHITE_WALL.get(), ModBlocks.ROUGH_CONCRETE_WHITE.get(), recipeConsumer);
		generateStoneCutterRecipe(ModBlocks.ROUGH_CONCRETE_WHITE_WALL.get(), ModBlocks.ROUGH_CONCRETE_WHITE.get(), 1, recipeConsumer);

		generateRoughConcretePowder(ModBlocks.ROUGH_CONCRETE_BLUE_POWDER.get(), Items.BLUE_DYE, recipeConsumer);
		generateStoneCutterRecipe(ModBlocks.ROUGH_CONCRETE_BLUE_STAIRS.get(), ModBlocks.ROUGH_CONCRETE_BLUE.get(), 1, recipeConsumer);
		generateStoneCutterRecipe(ModBlocks.ROUGH_CONCRETE_BLUE_TILE.get(), ModBlocks.ROUGH_CONCRETE_BLUE.get(), 1, recipeConsumer);
		generateStairRecipe(ModBlocks.ROUGH_CONCRETE_BLUE_STAIRS.get(), ModBlocks.ROUGH_CONCRETE_BLUE.get().asItem(), recipeConsumer);
		generateStoneCutterRecipe(ModBlocks.ROUGH_CONCRETE_BLUE_SLAB.get(), ModBlocks.ROUGH_CONCRETE_BLUE.get(), 2, recipeConsumer);
		generateSlabRecipe(ModBlocks.ROUGH_CONCRETE_BLUE_SLAB.get(), ModBlocks.ROUGH_CONCRETE_BLUE.get().asItem(), recipeConsumer);
		generateThreeByTwoRecipe(ModBlocks.ROUGH_CONCRETE_BLUE_WALL.get(), ModBlocks.ROUGH_CONCRETE_BLUE.get(), recipeConsumer);
		generateStoneCutterRecipe(ModBlocks.ROUGH_CONCRETE_BLUE_WALL.get(), ModBlocks.ROUGH_CONCRETE_BLUE.get(), 1, recipeConsumer);

		generateRoughConcretePowder(ModBlocks.ROUGH_CONCRETE_BLACK_POWDER.get(), Items.BLACK_DYE, recipeConsumer);
		generateStoneCutterRecipe(ModBlocks.ROUGH_CONCRETE_BLACK_STAIRS.get(), ModBlocks.ROUGH_CONCRETE_BLACK.get(), 1, recipeConsumer);
		generateStoneCutterRecipe(ModBlocks.ROUGH_CONCRETE_BLACK_TILE.get(), ModBlocks.ROUGH_CONCRETE_BLACK.get(), 1, recipeConsumer);
		generateStairRecipe(ModBlocks.ROUGH_CONCRETE_BLACK_STAIRS.get(), ModBlocks.ROUGH_CONCRETE_BLACK.get().asItem(), recipeConsumer);
		generateStoneCutterRecipe(ModBlocks.ROUGH_CONCRETE_BLACK_SLAB.get(), ModBlocks.ROUGH_CONCRETE_BLACK.get(), 2, recipeConsumer);
		generateSlabRecipe(ModBlocks.ROUGH_CONCRETE_BLACK_SLAB.get(), ModBlocks.ROUGH_CONCRETE_BLACK.get().asItem(), recipeConsumer);
		generateThreeByTwoRecipe(ModBlocks.ROUGH_CONCRETE_BLACK_WALL.get(), ModBlocks.ROUGH_CONCRETE_BLACK.get(), recipeConsumer);
		generateStoneCutterRecipe(ModBlocks.ROUGH_CONCRETE_BLACK_WALL.get(), ModBlocks.ROUGH_CONCRETE_BLACK.get(), 1, recipeConsumer);

		generateRoughConcretePowder(ModBlocks.ROUGH_CONCRETE_BROWN_POWDER.get(), Items.BROWN_DYE, recipeConsumer);
		generateStoneCutterRecipe(ModBlocks.ROUGH_CONCRETE_BROWN_STAIRS.get(), ModBlocks.ROUGH_CONCRETE_BROWN.get(), 1, recipeConsumer);
		generateStoneCutterRecipe(ModBlocks.ROUGH_CONCRETE_BROWN_TILE.get(), ModBlocks.ROUGH_CONCRETE_BROWN.get(), 1, recipeConsumer);
		generateStairRecipe(ModBlocks.ROUGH_CONCRETE_BROWN_STAIRS.get(), ModBlocks.ROUGH_CONCRETE_BROWN.get().asItem(), recipeConsumer);
		generateStoneCutterRecipe(ModBlocks.ROUGH_CONCRETE_BROWN_SLAB.get(), ModBlocks.ROUGH_CONCRETE_BROWN.get(), 2, recipeConsumer);
		generateSlabRecipe(ModBlocks.ROUGH_CONCRETE_BROWN_SLAB.get(), ModBlocks.ROUGH_CONCRETE_BROWN.get().asItem(), recipeConsumer);
		generateThreeByTwoRecipe(ModBlocks.ROUGH_CONCRETE_BROWN_WALL.get(), ModBlocks.ROUGH_CONCRETE_BROWN.get(), recipeConsumer);
		generateStoneCutterRecipe(ModBlocks.ROUGH_CONCRETE_BROWN_WALL.get(), ModBlocks.ROUGH_CONCRETE_BROWN.get(), 1, recipeConsumer);

		generateRoughConcretePowder(ModBlocks.ROUGH_CONCRETE_GREEN_POWDER.get(), Items.GREEN_DYE, recipeConsumer);
		generateStoneCutterRecipe(ModBlocks.ROUGH_CONCRETE_GREEN_STAIRS.get(), ModBlocks.ROUGH_CONCRETE_GREEN.get(), 1, recipeConsumer);
		generateStoneCutterRecipe(ModBlocks.ROUGH_CONCRETE_GREEN_TILE.get(), ModBlocks.ROUGH_CONCRETE_GREEN.get(), 1, recipeConsumer);
		generateStairRecipe(ModBlocks.ROUGH_CONCRETE_GREEN_STAIRS.get(), ModBlocks.ROUGH_CONCRETE_GREEN.get().asItem(), recipeConsumer);
		generateStoneCutterRecipe(ModBlocks.ROUGH_CONCRETE_GREEN_SLAB.get(), ModBlocks.ROUGH_CONCRETE_GREEN.get(), 2, recipeConsumer);
		generateSlabRecipe(ModBlocks.ROUGH_CONCRETE_GREEN_SLAB.get(), ModBlocks.ROUGH_CONCRETE_GREEN.get().asItem(), recipeConsumer);
		generateThreeByTwoRecipe(ModBlocks.ROUGH_CONCRETE_GREEN_WALL.get(), ModBlocks.ROUGH_CONCRETE_GREEN.get(), recipeConsumer);
		generateStoneCutterRecipe(ModBlocks.ROUGH_CONCRETE_GREEN_WALL.get(), ModBlocks.ROUGH_CONCRETE_GREEN.get(), 1, recipeConsumer);

		generateRoughConcretePowder(ModBlocks.ROUGH_CONCRETE_GRAY_POWDER.get(), Items.GRAY_DYE, recipeConsumer);
		generateStoneCutterRecipe(ModBlocks.ROUGH_CONCRETE_GRAY_STAIRS.get(), ModBlocks.ROUGH_CONCRETE_GRAY.get(), 1, recipeConsumer);
		generateStoneCutterRecipe(ModBlocks.ROUGH_CONCRETE_GRAY_TILE.get(), ModBlocks.ROUGH_CONCRETE_GRAY.get(), 1, recipeConsumer);
		generateStairRecipe(ModBlocks.ROUGH_CONCRETE_GRAY_STAIRS.get(), ModBlocks.ROUGH_CONCRETE_GRAY.get().asItem(), recipeConsumer);
		generateStoneCutterRecipe(ModBlocks.ROUGH_CONCRETE_GRAY_SLAB.get(), ModBlocks.ROUGH_CONCRETE_GRAY.get(), 2, recipeConsumer);
		generateSlabRecipe(ModBlocks.ROUGH_CONCRETE_GRAY_SLAB.get(), ModBlocks.ROUGH_CONCRETE_GRAY.get().asItem(), recipeConsumer);
		generateThreeByTwoRecipe(ModBlocks.ROUGH_CONCRETE_GRAY_WALL.get(), ModBlocks.ROUGH_CONCRETE_GRAY.get(), recipeConsumer);
		generateStoneCutterRecipe(ModBlocks.ROUGH_CONCRETE_GRAY_WALL.get(), ModBlocks.ROUGH_CONCRETE_GRAY.get(), 1, recipeConsumer);

		generateRoughConcretePowder(ModBlocks.ROUGH_CONCRETE_ORANGE_POWDER.get(), Items.ORANGE_DYE, recipeConsumer);
		generateStoneCutterRecipe(ModBlocks.ROUGH_CONCRETE_ORANGE_STAIRS.get(), ModBlocks.ROUGH_CONCRETE_ORANGE.get(), 1, recipeConsumer);
		generateStoneCutterRecipe(ModBlocks.ROUGH_CONCRETE_ORANGE_TILE.get(), ModBlocks.ROUGH_CONCRETE_ORANGE.get(), 1, recipeConsumer);
		generateStairRecipe(ModBlocks.ROUGH_CONCRETE_ORANGE_STAIRS.get(), ModBlocks.ROUGH_CONCRETE_ORANGE.get().asItem(), recipeConsumer);
		generateStoneCutterRecipe(ModBlocks.ROUGH_CONCRETE_ORANGE_SLAB.get(), ModBlocks.ROUGH_CONCRETE_ORANGE.get(), 2, recipeConsumer);
		generateSlabRecipe(ModBlocks.ROUGH_CONCRETE_ORANGE_SLAB.get(), ModBlocks.ROUGH_CONCRETE_ORANGE.get().asItem(), recipeConsumer);
		generateThreeByTwoRecipe(ModBlocks.ROUGH_CONCRETE_ORANGE_WALL.get(), ModBlocks.ROUGH_CONCRETE_ORANGE.get(), recipeConsumer);
		generateStoneCutterRecipe(ModBlocks.ROUGH_CONCRETE_ORANGE_WALL.get(), ModBlocks.ROUGH_CONCRETE_ORANGE.get(), 1, recipeConsumer);

		generateRoughConcretePowder(ModBlocks.ROUGH_CONCRETE_PURPLE_POWDER.get(), Items.PURPLE_DYE, recipeConsumer);
		generateStoneCutterRecipe(ModBlocks.ROUGH_CONCRETE_PURPLE_STAIRS.get(), ModBlocks.ROUGH_CONCRETE_PURPLE.get(), 1, recipeConsumer);
		generateStoneCutterRecipe(ModBlocks.ROUGH_CONCRETE_PURPLE_TILE.get(), ModBlocks.ROUGH_CONCRETE_PURPLE.get(), 1, recipeConsumer);
		generateStairRecipe(ModBlocks.ROUGH_CONCRETE_PURPLE_STAIRS.get(), ModBlocks.ROUGH_CONCRETE_PURPLE.get().asItem(), recipeConsumer);
		generateStoneCutterRecipe(ModBlocks.ROUGH_CONCRETE_PURPLE_SLAB.get(), ModBlocks.ROUGH_CONCRETE_PURPLE.get(), 2, recipeConsumer);
		generateSlabRecipe(ModBlocks.ROUGH_CONCRETE_PURPLE_SLAB.get(), ModBlocks.ROUGH_CONCRETE_PURPLE.get().asItem(), recipeConsumer);
		generateThreeByTwoRecipe(ModBlocks.ROUGH_CONCRETE_PURPLE_WALL.get(), ModBlocks.ROUGH_CONCRETE_PURPLE.get(), recipeConsumer);
		generateStoneCutterRecipe(ModBlocks.ROUGH_CONCRETE_PURPLE_WALL.get(), ModBlocks.ROUGH_CONCRETE_PURPLE.get(), 1, recipeConsumer);

		generateRoughConcretePowder(ModBlocks.ROUGH_CONCRETE_RED_POWDER.get(), Items.RED_DYE, recipeConsumer);
		generateStoneCutterRecipe(ModBlocks.ROUGH_CONCRETE_RED_STAIRS.get(), ModBlocks.ROUGH_CONCRETE_RED.get(), 1, recipeConsumer);
		generateStoneCutterRecipe(ModBlocks.ROUGH_CONCRETE_RED_TILE.get(), ModBlocks.ROUGH_CONCRETE_RED.get(), 1, recipeConsumer);
		generateStairRecipe(ModBlocks.ROUGH_CONCRETE_RED_STAIRS.get(), ModBlocks.ROUGH_CONCRETE_RED.get().asItem(), recipeConsumer);
		generateStoneCutterRecipe(ModBlocks.ROUGH_CONCRETE_RED_SLAB.get(), ModBlocks.ROUGH_CONCRETE_RED.get(), 2, recipeConsumer);
		generateSlabRecipe(ModBlocks.ROUGH_CONCRETE_RED_SLAB.get(), ModBlocks.ROUGH_CONCRETE_RED.get().asItem(), recipeConsumer);
		generateThreeByTwoRecipe(ModBlocks.ROUGH_CONCRETE_RED_WALL.get(), ModBlocks.ROUGH_CONCRETE_RED.get(), recipeConsumer);
		generateStoneCutterRecipe(ModBlocks.ROUGH_CONCRETE_RED_WALL.get(), ModBlocks.ROUGH_CONCRETE_RED.get(), 1, recipeConsumer);

		generateRoughConcretePowder(ModBlocks.ROUGH_CONCRETE_YELLOW_POWDER.get(), Items.YELLOW_DYE, recipeConsumer);
		generateStoneCutterRecipe(ModBlocks.ROUGH_CONCRETE_YELLOW_STAIRS.get(), ModBlocks.ROUGH_CONCRETE_YELLOW.get(), 1, recipeConsumer);
		generateStoneCutterRecipe(ModBlocks.ROUGH_CONCRETE_YELLOW_TILE.get(), ModBlocks.ROUGH_CONCRETE_YELLOW.get(), 1, recipeConsumer);
		generateStairRecipe(ModBlocks.ROUGH_CONCRETE_YELLOW_STAIRS.get(), ModBlocks.ROUGH_CONCRETE_YELLOW.get().asItem(), recipeConsumer);
		generateStoneCutterRecipe(ModBlocks.ROUGH_CONCRETE_YELLOW_SLAB.get(), ModBlocks.ROUGH_CONCRETE_YELLOW.get(), 2, recipeConsumer);
		generateSlabRecipe(ModBlocks.ROUGH_CONCRETE_YELLOW_SLAB.get(), ModBlocks.ROUGH_CONCRETE_YELLOW.get().asItem(), recipeConsumer);
		generateThreeByTwoRecipe(ModBlocks.ROUGH_CONCRETE_YELLOW_WALL.get(), ModBlocks.ROUGH_CONCRETE_YELLOW.get(), recipeConsumer);
		generateStoneCutterRecipe(ModBlocks.ROUGH_CONCRETE_YELLOW_WALL.get(), ModBlocks.ROUGH_CONCRETE_YELLOW.get(), 1, recipeConsumer);
		//endregion

		//region Borderless Glass
		generateSingleItemShapelessRecipe(ModBlocks.WHITE_BORDERLESS_GLASS.get(), Blocks.WHITE_STAINED_GLASS, recipeConsumer);
		generateThreeByTwoRecipe(ModBlocks.WHITE_BORDERLESS_GLASS_PANE.get(), ModBlocks.WHITE_BORDERLESS_GLASS.get(), recipeConsumer);

		generateSingleItemShapelessRecipe(ModBlocks.BLUE_BORDERLESS_GLASS.get(), Blocks.BLUE_STAINED_GLASS, recipeConsumer);
		generateThreeByTwoRecipe(ModBlocks.BLUE_BORDERLESS_GLASS_PANE.get(), ModBlocks.BLUE_BORDERLESS_GLASS.get(), recipeConsumer);

		generateSingleItemShapelessRecipe(ModBlocks.BROWN_BORDERLESS_GLASS.get(), Blocks.BROWN_STAINED_GLASS, recipeConsumer);
		generateThreeByTwoRecipe(ModBlocks.BROWN_BORDERLESS_GLASS_PANE.get(), ModBlocks.BROWN_BORDERLESS_GLASS.get(), recipeConsumer);

		generateSingleItemShapelessRecipe(ModBlocks.CYAN_BORDERLESS_GLASS.get(), Blocks.CYAN_STAINED_GLASS, recipeConsumer);
		generateThreeByTwoRecipe(ModBlocks.CYAN_BORDERLESS_GLASS_PANE.get(), ModBlocks.CYAN_BORDERLESS_GLASS.get(), recipeConsumer);

		generateSingleItemShapelessRecipe(ModBlocks.GREEN_BORDERLESS_GLASS.get(), Blocks.GREEN_STAINED_GLASS, recipeConsumer);
		generateThreeByTwoRecipe(ModBlocks.GREEN_BORDERLESS_GLASS_PANE.get(), ModBlocks.GREEN_BORDERLESS_GLASS.get(), recipeConsumer);

		generateSingleItemShapelessRecipe(ModBlocks.GRAY_BORDERLESS_GLASS.get(), Blocks.GRAY_STAINED_GLASS, recipeConsumer);
		generateThreeByTwoRecipe(ModBlocks.GRAY_BORDERLESS_GLASS_PANE.get(), ModBlocks.GRAY_BORDERLESS_GLASS.get(), recipeConsumer);

		generateSingleItemShapelessRecipe(ModBlocks.LIGHT_BLUE_BORDERLESS_GLASS.get(), Blocks.LIGHT_BLUE_STAINED_GLASS, recipeConsumer);
		generateThreeByTwoRecipe(ModBlocks.LIGHT_BLUE_BORDERLESS_GLASS_PANE.get(), ModBlocks.LIGHT_BLUE_BORDERLESS_GLASS.get(), recipeConsumer);

		generateSingleItemShapelessRecipe(ModBlocks.LIGHT_GRAY_BORDERLESS_GLASS.get(), Blocks.LIGHT_GRAY_STAINED_GLASS, recipeConsumer);
		generateThreeByTwoRecipe(ModBlocks.LIGHT_GRAY_BORDERLESS_GLASS_PANE.get(), ModBlocks.LIGHT_GRAY_BORDERLESS_GLASS.get(), recipeConsumer);

		generateSingleItemShapelessRecipe(ModBlocks.LIME_BORDERLESS_GLASS.get(), Blocks.LIME_STAINED_GLASS, recipeConsumer);
		generateThreeByTwoRecipe(ModBlocks.LIME_BORDERLESS_GLASS_PANE.get(), ModBlocks.LIME_BORDERLESS_GLASS.get(), recipeConsumer);

		generateSingleItemShapelessRecipe(ModBlocks.MAGENTA_BORDERLESS_GLASS.get(), Blocks.MAGENTA_STAINED_GLASS, recipeConsumer);
		generateThreeByTwoRecipe(ModBlocks.MAGENTA_BORDERLESS_GLASS_PANE.get(), ModBlocks.MAGENTA_BORDERLESS_GLASS.get(), recipeConsumer);

		generateSingleItemShapelessRecipe(ModBlocks.ORANGE_BORDERLESS_GLASS.get(), Blocks.ORANGE_STAINED_GLASS, recipeConsumer);
		generateThreeByTwoRecipe(ModBlocks.ORANGE_BORDERLESS_GLASS_PANE.get(), ModBlocks.ORANGE_BORDERLESS_GLASS.get(), recipeConsumer);

		generateSingleItemShapelessRecipe(ModBlocks.PINK_BORDERLESS_GLASS.get(), Blocks.PINK_STAINED_GLASS, recipeConsumer);
		generateThreeByTwoRecipe(ModBlocks.PINK_BORDERLESS_GLASS_PANE.get(), ModBlocks.PINK_BORDERLESS_GLASS.get(), recipeConsumer);

		generateSingleItemShapelessRecipe(ModBlocks.PURPLE_BORDERLESS_GLASS.get(), Blocks.PURPLE_STAINED_GLASS, recipeConsumer);
		generateThreeByTwoRecipe(ModBlocks.PURPLE_BORDERLESS_GLASS_PANE.get(), ModBlocks.PURPLE_BORDERLESS_GLASS.get(), recipeConsumer);

		generateSingleItemShapelessRecipe(ModBlocks.RED_BORDERLESS_GLASS.get(), Blocks.RED_STAINED_GLASS, recipeConsumer);
		generateThreeByTwoRecipe(ModBlocks.RED_BORDERLESS_GLASS_PANE.get(), ModBlocks.RED_BORDERLESS_GLASS.get(), recipeConsumer);

		generateSingleItemShapelessRecipe(ModBlocks.YELLOW_BORDERLESS_GLASS.get(), Blocks.YELLOW_STAINED_GLASS, recipeConsumer);
		generateThreeByTwoRecipe(ModBlocks.YELLOW_BORDERLESS_GLASS_PANE.get(), ModBlocks.YELLOW_BORDERLESS_GLASS.get(), recipeConsumer);

		generateSingleItemShapelessRecipe(ModBlocks.BLACK_BORDERLESS_GLASS.get(), Blocks.BLACK_STAINED_GLASS, recipeConsumer);
		generateThreeByTwoRecipe(ModBlocks.BLACK_BORDERLESS_GLASS_PANE.get(), ModBlocks.BLACK_BORDERLESS_GLASS.get(), recipeConsumer);
		//endregion

		generateDarkMetalRecipe(Items.COAL, recipeConsumer);
		generateDarkMetalRecipe(Items.CHARCOAL, recipeConsumer);
		generateStoneCutterRecipe(ModBlocks.DARK_METAL_PILLAR.get(), ModBlocks.DARK_METAL.get(), 1, recipeConsumer);
	}

	private void generateSingleItemShapelessRecipe(Block output, Block sourceBlock, Consumer<FinishedRecipe> consumer)
	{
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

	private void generateDarkMetalRecipe(Item item, Consumer<FinishedRecipe> consumer) {
		ShapedRecipeBuilder shaped = ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DARK_METAL.get(), 8);
		shaped.define('1', Tags.Items.INGOTS_IRON);
		shaped.define('2', item);
		shaped.define('3', Items.COBBLED_DEEPSLATE);
		shaped.pattern("323");
		shaped.pattern("212");
		shaped.pattern("323");
		shaped.unlockedBy("has_item", has(Tags.Items.INGOTS_IRON));
		shaped.group("dark_metal");
		shaped.save(consumer, "dark_metal_from_" + ForgeRegistries.ITEMS.getKey(item).getPath());
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
		//stonecutting.group(getVariantName(output));
		stonecutting.unlockedBy("has_item", has(input));
		stonecutting.save(consumer, blockName + "_from_stonecutting");
	}

	private void generateSlabRecipe(SlabBlock output, Item input, Consumer<FinishedRecipe> consumer) {
		ShapedRecipeBuilder shaped = ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, output, 6);
		shaped.define('#', input);
		shaped.pattern("###");
		//shaped.group(getVariantName(output));
		shaped.unlockedBy("has_item", has(input));
		shaped.save(consumer);
	}

	private void generateStairRecipe(StairBlock output, Item input, Consumer<FinishedRecipe> consumer) {
		ShapedRecipeBuilder shaped = ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, output, 4);
		shaped.define('#', input);
		shaped.pattern("#  ");
		shaped.pattern("## ");
		shaped.pattern("###");
		//shaped.group(getVariantName(output));
		shaped.unlockedBy("has_item", has(input));
		shaped.save(consumer);
	}
}
