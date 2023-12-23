package andronomos.blockpalette.data;

import andronomos.blockpalette.registry.ModBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Items;
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
		generateRoughConcreteVariant(ModBlocks.ROUGH_WHITE_CONCRETE.get(), Blocks.WHITE_CONCRETE, recipeConsumer);
		generateRoughConcreteVariant(ModBlocks.ROUGH_BLUE_CONCRETE.get(), Blocks.BLUE_CONCRETE, recipeConsumer);
		generateRoughConcreteVariant(ModBlocks.ROUGH_BROWN_CONCRETE.get(), Blocks.BROWN_CONCRETE, recipeConsumer);
		generateRoughConcreteVariant(ModBlocks.ROUGH_CYAN_CONCRETE.get(), Blocks.CYAN_CONCRETE, recipeConsumer);
		generateRoughConcreteVariant(ModBlocks.ROUGH_GREEN_CONCRETE.get(), Blocks.GREEN_CONCRETE, recipeConsumer);
		generateRoughConcreteVariant(ModBlocks.ROUGH_GRAY_CONCRETE.get(), Blocks.GRAY_CONCRETE, recipeConsumer);
		generateRoughConcreteVariant(ModBlocks.ROUGH_LIGHT_BLUE_CONCRETE.get(), Blocks.LIGHT_BLUE_CONCRETE, recipeConsumer);
		generateRoughConcreteVariant(ModBlocks.ROUGH_LIGHT_GRAY_CONCRETE.get(), Blocks.LIGHT_GRAY_CONCRETE, recipeConsumer);
		generateRoughConcreteVariant(ModBlocks.ROUGH_LIME_CONCRETE.get(), Blocks.LIME_CONCRETE, recipeConsumer);
		generateRoughConcreteVariant(ModBlocks.ROUGH_MAGENTA_CONCRETE.get(), Blocks.MAGENTA_CONCRETE, recipeConsumer);
		generateRoughConcreteVariant(ModBlocks.ROUGH_ORANGE_CONCRETE.get(), Blocks.ORANGE_CONCRETE, recipeConsumer);
		generateRoughConcreteVariant(ModBlocks.ROUGH_PINK_CONCRETE.get(), Blocks.PINK_CONCRETE, recipeConsumer);
		generateRoughConcreteVariant(ModBlocks.ROUGH_PURPLE_CONCRETE.get(), Blocks.PURPLE_CONCRETE, recipeConsumer);
		generateRoughConcreteVariant(ModBlocks.ROUGH_RED_CONCRETE.get(), Blocks.RED_CONCRETE, recipeConsumer);
		generateRoughConcreteVariant(ModBlocks.ROUGH_YELLOW_CONCRETE.get(), Blocks.YELLOW_CONCRETE, recipeConsumer);


		generateThreeByTwoRecipe(ModBlocks.BORDERLESS_WHITE_GLASS_PANE.get(), ModBlocks.BORDERLESS_WHITE_GLASS.get(), recipeConsumer);
		generateThreeByTwoRecipe(ModBlocks.BORDERLESS_BLUE_GLASS_PANE.get(), ModBlocks.BORDERLESS_BLUE_GLASS.get(), recipeConsumer);
		generateThreeByTwoRecipe(ModBlocks.BORDERLESS_BROWN_GLASS_PANE.get(), ModBlocks.BORDERLESS_BROWN_GLASS.get(), recipeConsumer);
		generateThreeByTwoRecipe(ModBlocks.BORDERLESS_CYAN_GLASS_PANE.get(), ModBlocks.BORDERLESS_CYAN_GLASS.get(), recipeConsumer);
		generateThreeByTwoRecipe(ModBlocks.BORDERLESS_GREEN_GLASS_PANE.get(), ModBlocks.BORDERLESS_GREEN_GLASS.get(), recipeConsumer);
		generateThreeByTwoRecipe(ModBlocks.BORDERLESS_GRAY_GLASS_PANE.get(), ModBlocks.BORDERLESS_GRAY_GLASS.get(), recipeConsumer);
		generateThreeByTwoRecipe(ModBlocks.BORDERLESS_LIGHT_BLUE_GLASS_PANE.get(), ModBlocks.BORDERLESS_LIGHT_BLUE_GLASS.get(), recipeConsumer);
		generateThreeByTwoRecipe(ModBlocks.BORDERLESS_LIGHT_GRAY_GLASS_PANE.get(), ModBlocks.BORDERLESS_LIGHT_GRAY_GLASS.get(), recipeConsumer);
		generateThreeByTwoRecipe(ModBlocks.BORDERLESS_LIME_GLASS_PANE.get(), ModBlocks.BORDERLESS_LIME_GLASS.get(), recipeConsumer);
		generateThreeByTwoRecipe(ModBlocks.BORDERLESS_MAGENTA_GLASS_PANE.get(), ModBlocks.BORDERLESS_MAGENTA_GLASS.get(), recipeConsumer);
		generateThreeByTwoRecipe(ModBlocks.BORDERLESS_ORANGE_GLASS_PANE.get(), ModBlocks.BORDERLESS_ORANGE_GLASS.get(), recipeConsumer);
		generateThreeByTwoRecipe(ModBlocks.BORDERLESS_PINK_GLASS_PANE.get(), ModBlocks.BORDERLESS_PINK_GLASS.get(), recipeConsumer);
		generateThreeByTwoRecipe(ModBlocks.BORDERLESS_PURPLE_GLASS_PANE.get(), ModBlocks.BORDERLESS_PURPLE_GLASS.get(), recipeConsumer);
		generateThreeByTwoRecipe(ModBlocks.BORDERLESS_RED_GLASS_PANE.get(), ModBlocks.BORDERLESS_RED_GLASS.get(), recipeConsumer);
		generateThreeByTwoRecipe(ModBlocks.BORDERLESS_YELLOW_GLASS_PANE.get(), ModBlocks.BORDERLESS_YELLOW_GLASS.get(), recipeConsumer);
		generateThreeByTwoRecipe(ModBlocks.BORDERLESS_BLACK_GLASS_PANE.get(), ModBlocks.BORDERLESS_BLACK_GLASS.get(), recipeConsumer);

	}

	private void generateRoughConcreteVariant(Block output, Block sourceBlock, Consumer<FinishedRecipe> consumer)
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
