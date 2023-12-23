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
	}

	private void generateRoughConcreteVariant(Block output, Block sourceBlock, Consumer<FinishedRecipe> consumer)
	{
		ShapelessRecipeBuilder shapeless = ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS,
				output, 1);

		shapeless.requires(sourceBlock.asItem());
		shapeless.requires(Items.BRUSH);
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
}
