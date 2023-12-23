package andronomos.blockpalette.data;

import andronomos.blockpalette.registry.ModBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

import java.util.function.Consumer;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
	public ModRecipeProvider(PackOutput output) {
		super(output);
	}

	@Override
	protected void buildRecipes(Consumer<FinishedRecipe> recipeConsumer) {
		//region Rough Concrete

		//endregion

		//region Borderless Glass
		generateSingleItemShapelessRecipe(ModBlocks.BORDERLESS_WHITE_GLASS.get(), Blocks.WHITE_STAINED_GLASS, recipeConsumer);
		generateThreeByTwoRecipe(ModBlocks.BORDERLESS_WHITE_GLASS_PANE.get(), ModBlocks.BORDERLESS_WHITE_GLASS.get(), recipeConsumer);

		generateSingleItemShapelessRecipe(ModBlocks.BORDERLESS_BLUE_GLASS.get(), Blocks.BLUE_STAINED_GLASS, recipeConsumer);
		generateThreeByTwoRecipe(ModBlocks.BORDERLESS_BLUE_GLASS_PANE.get(), ModBlocks.BORDERLESS_BLUE_GLASS.get(), recipeConsumer);

		generateSingleItemShapelessRecipe(ModBlocks.BORDERLESS_BROWN_GLASS.get(), Blocks.BROWN_STAINED_GLASS, recipeConsumer);
		generateThreeByTwoRecipe(ModBlocks.BORDERLESS_BROWN_GLASS_PANE.get(), ModBlocks.BORDERLESS_BROWN_GLASS.get(), recipeConsumer);

		generateSingleItemShapelessRecipe(ModBlocks.BORDERLESS_CYAN_GLASS.get(), Blocks.CYAN_STAINED_GLASS, recipeConsumer);
		generateThreeByTwoRecipe(ModBlocks.BORDERLESS_CYAN_GLASS_PANE.get(), ModBlocks.BORDERLESS_CYAN_GLASS.get(), recipeConsumer);

		generateSingleItemShapelessRecipe(ModBlocks.BORDERLESS_GREEN_GLASS.get(), Blocks.GREEN_STAINED_GLASS, recipeConsumer);
		generateThreeByTwoRecipe(ModBlocks.BORDERLESS_GREEN_GLASS_PANE.get(), ModBlocks.BORDERLESS_GREEN_GLASS.get(), recipeConsumer);

		generateSingleItemShapelessRecipe(ModBlocks.BORDERLESS_GRAY_GLASS.get(), Blocks.GRAY_STAINED_GLASS, recipeConsumer);
		generateThreeByTwoRecipe(ModBlocks.BORDERLESS_GRAY_GLASS_PANE.get(), ModBlocks.BORDERLESS_GRAY_GLASS.get(), recipeConsumer);

		generateSingleItemShapelessRecipe(ModBlocks.BORDERLESS_LIGHT_BLUE_GLASS.get(), Blocks.LIGHT_BLUE_STAINED_GLASS, recipeConsumer);
		generateThreeByTwoRecipe(ModBlocks.BORDERLESS_LIGHT_BLUE_GLASS_PANE.get(), ModBlocks.BORDERLESS_LIGHT_BLUE_GLASS.get(), recipeConsumer);

		generateSingleItemShapelessRecipe(ModBlocks.BORDERLESS_LIGHT_GRAY_GLASS.get(), Blocks.LIGHT_GRAY_STAINED_GLASS, recipeConsumer);
		generateThreeByTwoRecipe(ModBlocks.BORDERLESS_LIGHT_GRAY_GLASS_PANE.get(), ModBlocks.BORDERLESS_LIGHT_GRAY_GLASS.get(), recipeConsumer);

		generateSingleItemShapelessRecipe(ModBlocks.BORDERLESS_LIME_GLASS.get(), Blocks.LIME_STAINED_GLASS, recipeConsumer);
		generateThreeByTwoRecipe(ModBlocks.BORDERLESS_LIME_GLASS_PANE.get(), ModBlocks.BORDERLESS_LIME_GLASS.get(), recipeConsumer);

		generateSingleItemShapelessRecipe(ModBlocks.BORDERLESS_MAGENTA_GLASS.get(), Blocks.MAGENTA_STAINED_GLASS, recipeConsumer);
		generateThreeByTwoRecipe(ModBlocks.BORDERLESS_MAGENTA_GLASS_PANE.get(), ModBlocks.BORDERLESS_MAGENTA_GLASS.get(), recipeConsumer);

		generateSingleItemShapelessRecipe(ModBlocks.BORDERLESS_ORANGE_GLASS.get(), Blocks.ORANGE_STAINED_GLASS, recipeConsumer);
		generateThreeByTwoRecipe(ModBlocks.BORDERLESS_ORANGE_GLASS_PANE.get(), ModBlocks.BORDERLESS_ORANGE_GLASS.get(), recipeConsumer);

		generateSingleItemShapelessRecipe(ModBlocks.BORDERLESS_PINK_GLASS.get(), Blocks.PINK_STAINED_GLASS, recipeConsumer);
		generateThreeByTwoRecipe(ModBlocks.BORDERLESS_PINK_GLASS_PANE.get(), ModBlocks.BORDERLESS_PINK_GLASS.get(), recipeConsumer);

		generateSingleItemShapelessRecipe(ModBlocks.BORDERLESS_PURPLE_GLASS.get(), Blocks.PURPLE_STAINED_GLASS, recipeConsumer);
		generateThreeByTwoRecipe(ModBlocks.BORDERLESS_PURPLE_GLASS_PANE.get(), ModBlocks.BORDERLESS_PURPLE_GLASS.get(), recipeConsumer);

		generateSingleItemShapelessRecipe(ModBlocks.BORDERLESS_RED_GLASS.get(), Blocks.RED_STAINED_GLASS, recipeConsumer);
		generateThreeByTwoRecipe(ModBlocks.BORDERLESS_RED_GLASS_PANE.get(), ModBlocks.BORDERLESS_RED_GLASS.get(), recipeConsumer);

		generateSingleItemShapelessRecipe(ModBlocks.BORDERLESS_YELLOW_GLASS.get(), Blocks.YELLOW_STAINED_GLASS, recipeConsumer);
		generateThreeByTwoRecipe(ModBlocks.BORDERLESS_YELLOW_GLASS_PANE.get(), ModBlocks.BORDERLESS_YELLOW_GLASS.get(), recipeConsumer);

		generateSingleItemShapelessRecipe(ModBlocks.BORDERLESS_BLACK_GLASS.get(), Blocks.BLACK_STAINED_GLASS, recipeConsumer);
		generateThreeByTwoRecipe(ModBlocks.BORDERLESS_BLACK_GLASS_PANE.get(), ModBlocks.BORDERLESS_BLACK_GLASS.get(), recipeConsumer);
		//endregion
	}

	private void generateSingleItemShapelessRecipe(Block output, Block sourceBlock, Consumer<FinishedRecipe> consumer)
	{
		ShapelessRecipeBuilder shapeless = ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS,
				output, 1);
		shapeless.requires(sourceBlock.asItem());
		shapeless.unlockedBy("has_item", has(sourceBlock));
		shapeless.save(consumer);
	}

	//private void generateVariant(Block output, Item firstInputItem, Item secondInputItem, Consumer<FinishedRecipe> consumer) {
	//	ShapedRecipeBuilder shaped = ShapedRecipeBuilder.shaped(output, 4);
	//	shaped.define('1', firstInputItem);
	//	shaped.define('2', secondInputItem);
	//	shaped.pattern("121");
	//	shaped.pattern("212");
	//	shaped.pattern("121");
	//	shaped.unlockedBy("has_item", has(secondInputItem));
	//	//shaped.group(getVariantName(output));
	//	shaped.save(consumer, new ResourceLocation(BlockPalette.MODID, ForgeRegistries.BLOCKS.getKey(output).getPath() + "_from_" + ForgeRegistries.ITEMS.getKey(secondInputItem).getPath()));
	//}

	private void generateThreeByTwoRecipe(Block output, Block input, Consumer<FinishedRecipe> consumer) {
		ShapedRecipeBuilder shaped = ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, output, 6);
		shaped.define('#', input);
		shaped.pattern("###");
		shaped.pattern("###");
		shaped.unlockedBy("has_item", has(input));
		shaped.save(consumer);
	}
}
