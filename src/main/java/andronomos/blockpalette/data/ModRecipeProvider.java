package andronomos.blockpalette.data;

import andronomos.blockpalette.BlockPalette;
import andronomos.blockpalette.registry.*;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.StairBlock;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.jetbrains.annotations.NotNull;

import java.util.function.Consumer;

public class ModRecipeProvider extends RecipeProvider {
	public ModRecipeProvider(DataGenerator generator) {
		super(generator);
	}

	@Override
	protected void buildCraftingRecipes(@NotNull Consumer<FinishedRecipe> consumer) {
		super.buildCraftingRecipes(consumer);

		//region bytl
		generateVariant(BytlBlocks.BYTL.get(), Items.STONE, Items.BONE_MEAL, consumer);
		generateColor(BytlBlocks.BYTL_LIGHT_GRAY.get(), BytlBlocks.BYTL.get(), Items.LIGHT_GRAY_DYE, consumer);
		generateColor(BytlBlocks.BYTL_GRAY.get(), BytlBlocks.BYTL.get(), Items.GRAY_DYE, consumer);
		generateColor(BytlBlocks.BYTL_BLACK.get(), BytlBlocks.BYTL.get(), Items.BLACK_DYE, consumer);
		generateColor(BytlBlocks.BYTL_YELLOW.get(), BytlBlocks.BYTL.get(), Items.YELLOW_DYE, consumer);
		generateColor(BytlBlocks.BYTL_BROWN.get(), BytlBlocks.BYTL.get(), Items.BROWN_DYE, consumer);
		generateColor(BytlBlocks.BYTL_BLUE.get(), BytlBlocks.BYTL.get(), Items.BLUE_DYE, consumer);
		generateColor(BytlBlocks.BYTL_RED.get(), BytlBlocks.BYTL.get(), Items.RED_DYE, consumer);
		generateColor(BytlBlocks.BYTL_GREEN.get(), BytlBlocks.BYTL.get(), Items.GREEN_DYE, consumer);
		generateColor(BytlBlocks.BYTL_PURPLE.get(), BytlBlocks.BYTL.get(), Items.PURPLE_DYE, consumer);
		generateColor(BytlBlocks.BYTL_MAGENTA.get(), BytlBlocks.BYTL.get(), Items.MAGENTA_DYE, consumer);
		// endregion

		//region hzrd
		generateVariant(HzrdBlocks.HZRD.get(), Items.WHITE_DYE, Items.IRON_INGOT, consumer);
		generateColor(HzrdBlocks.HZRD_YELLOW.get(), HzrdBlocks.HZRD.get(), Items.YELLOW_DYE, consumer);
		generateColor(HzrdBlocks.HZRD_GRAY.get(), HzrdBlocks.HZRD.get(), Items.GRAY_DYE, consumer);
		//endregion

		//region mytl
		generateVariant(MytlBlocks.MYTL.get(), Blocks.SMOOTH_STONE.asItem(), Items.IRON_INGOT, consumer);
		generateStoneCutterRecipe(MytlBlocks.MYTL_STRIP.get(), MytlBlocks.MYTL.get(), 1, consumer);

		generateColor(MytlBlocks.MYTL_GRAY.get(), MytlBlocks.MYTL.get(), Items.GRAY_DYE, consumer);
		generateStoneCutterRecipe(MytlBlocks.MYTL_GRAY_STRIP.get(), MytlBlocks.MYTL_GRAY.get(), 1, consumer);

		generateColor(MytlBlocks.MYTL_BLACK.get(), MytlBlocks.MYTL.get(), Items.BLACK_DYE, consumer);
		generateStoneCutterRecipe(MytlBlocks.MYTL_BLACK_STRIP.get(), MytlBlocks.MYTL_BLACK.get(), 1, consumer);

		generateColor(MytlBlocks.MYTL_BROWN.get(), MytlBlocks.MYTL.get(), Items.BROWN_DYE, consumer);
		generateStoneCutterRecipe(MytlBlocks.MYTL_BROWN_STRIP.get(), MytlBlocks.MYTL_BROWN.get(), 1, consumer);

		generateColor(MytlBlocks.MYTL_GREEN.get(), MytlBlocks.MYTL.get(), Items.GREEN_DYE, consumer);
		generateStoneCutterRecipe(MytlBlocks.MYTL_GREEN_STRIP.get(), MytlBlocks.MYTL_GREEN.get(), 1, consumer);

		generateColor(MytlBlocks.MYTL_RED.get(), MytlBlocks.MYTL.get(), Items.RED_DYE, consumer);
		generateStoneCutterRecipe(MytlBlocks.MYTL_RED_STRIP.get(), MytlBlocks.MYTL_RED.get(), 1, consumer);

		generateColor(MytlBlocks.MYTL_ORANGE.get(), MytlBlocks.MYTL.get(), Items.ORANGE_DYE, consumer);
		generateStoneCutterRecipe(MytlBlocks.MYTL_ORANGE_STRIP.get(), MytlBlocks.MYTL_ORANGE.get(), 1, consumer);
		//endregion

		//region glax
		generateSmeltingRecipe(GlaxBlocks.GLAX_WHITE.get(), Blocks.WHITE_STAINED_GLASS, consumer);
		generateSmeltingRecipe(GlaxBlocks.GLAX_GRAY.get(), Blocks.GRAY_STAINED_GLASS, consumer);
		generateSmeltingRecipe(GlaxBlocks.GLAX_BLACK.get(), Blocks.BLACK_STAINED_GLASS, consumer);
		generateSmeltingRecipe(GlaxBlocks.GLAX_RED.get(), Blocks.RED_STAINED_GLASS, consumer);
		generateSmeltingRecipe(GlaxBlocks.GLAX_GREEN.get(), Blocks.GREEN_STAINED_GLASS, consumer);
		generateSmeltingRecipe(GlaxBlocks.GLAX_BLUE.get(), Blocks.BLUE_STAINED_GLASS, consumer);
		generateSmeltingRecipe(GlaxBlocks.GLAX_ORANGE.get(), Blocks.ORANGE_STAINED_GLASS, consumer);
		generateSmeltingRecipe(GlaxBlocks.GLAX_LIME.get(), Blocks.LIME_STAINED_GLASS, consumer);
		generateSmeltingRecipe(GlaxBlocks.GLAX_LIGHT_BLUE.get(), Blocks.LIGHT_BLUE_STAINED_GLASS, consumer);
		generateSmeltingRecipe(GlaxBlocks.GLAX_LIGHT_GRAY.get(), Blocks.LIGHT_GRAY_STAINED_GLASS, consumer);
		generateSmeltingRecipe(GlaxBlocks.GLAX_PINK.get(), Blocks.PINK_STAINED_GLASS, consumer);
		generateSmeltingRecipe(GlaxBlocks.GLAX_PURPLE.get(), Blocks.PURPLE_STAINED_GLASS, consumer);
		generateSmeltingRecipe(GlaxBlocks.GLAX_CYAN.get(), Blocks.CYAN_STAINED_GLASS, consumer);
		generateSmeltingRecipe(GlaxBlocks.GLAX_YELLOW.get(), Blocks.YELLOW_STAINED_GLASS, consumer);
		generateSmeltingRecipe(GlaxBlocks.GLAX_BROWN.get(), Blocks.BROWN_STAINED_GLASS, consumer);
		generateSmeltingRecipe(GlaxBlocks.GLAX_MAGENTA.get(), Blocks.MAGENTA_STAINED_GLASS, consumer);

		generateThreeByTwoRecipe(GlaxBlocks.GLAX_WHITE_PANE.get(), GlaxBlocks.GLAX_WHITE.get(), consumer);
		generateThreeByTwoRecipe(GlaxBlocks.GLAX_GRAY_PANE.get(), GlaxBlocks.GLAX_GRAY.get(), consumer);
		generateThreeByTwoRecipe(GlaxBlocks.GLAX_BLACK_PANE.get(), GlaxBlocks.GLAX_BLACK.get(), consumer);
		generateThreeByTwoRecipe(GlaxBlocks.GLAX_RED_PANE.get(), GlaxBlocks.GLAX_RED.get(), consumer);
		generateThreeByTwoRecipe(GlaxBlocks.GLAX_GREEN_PANE.get(), GlaxBlocks.GLAX_GREEN.get(), consumer);
		generateThreeByTwoRecipe(GlaxBlocks.GLAX_BLUE_PANE.get(), GlaxBlocks.GLAX_BLUE.get(), consumer);
		generateThreeByTwoRecipe(GlaxBlocks.GLAX_ORANGE_PANE.get(), GlaxBlocks.GLAX_ORANGE.get(), consumer);
		generateThreeByTwoRecipe(GlaxBlocks.GLAX_LIME_PANE.get(), GlaxBlocks.GLAX_LIME.get(), consumer);
		generateThreeByTwoRecipe(GlaxBlocks.GLAX_LIGHT_BLUE_PANE.get(), GlaxBlocks.GLAX_LIGHT_BLUE.get(), consumer);
		generateThreeByTwoRecipe(GlaxBlocks.GLAX_LIGHT_GRAY_PANE.get(), GlaxBlocks.GLAX_LIGHT_GRAY.get(), consumer);
		generateThreeByTwoRecipe(GlaxBlocks.GLAX_PINK_PANE.get(), GlaxBlocks.GLAX_PINK.get(), consumer);
		generateThreeByTwoRecipe(GlaxBlocks.GLAX_PURPLE_PANE.get(), GlaxBlocks.GLAX_PURPLE.get(), consumer);
		generateThreeByTwoRecipe(GlaxBlocks.GLAX_CYAN_PANE.get(), GlaxBlocks.GLAX_CYAN.get(), consumer);
		generateThreeByTwoRecipe(GlaxBlocks.GLAX_YELLOW_PANE.get(), GlaxBlocks.GLAX_YELLOW.get(), consumer);
		generateThreeByTwoRecipe(GlaxBlocks.GLAX_BROWN_PANE.get(), GlaxBlocks.GLAX_BROWN.get(), consumer);
		generateThreeByTwoRecipe(GlaxBlocks.GLAX_MAGENTA_PANE.get(), GlaxBlocks.GLAX_MAGENTA.get(), consumer);
		//endregion

		//region carbon
		generateSmeltingRecipe(CarbonBlocks.CARBON.get(), Blocks.COAL_BLOCK, consumer);
		generateTwoByTwoRecipe(CarbonBlocks.CARBON_TILE.get(), CarbonBlocks.CARBON.get(), consumer);
		generateStoneCutterRecipe(CarbonBlocks.CARBON_STRIPES.get(), CarbonBlocks.CARBON.get(), 1, consumer);
		//endregion

		ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get).forEach(b -> {
			String blockName = ForgeRegistries.BLOCKS.getKey(b).getPath();
			String blockClass = b.getClass().getSimpleName();
			String sourceBlockName;

			switch(blockClass) {
				case "StairBlock": {
					sourceBlockName = blockName.substring(0, blockName.indexOf("_stairs"));
					Block sourceBlock = ForgeRegistries.BLOCKS.getValue(new ResourceLocation(BlockPalette.MODID, sourceBlockName));

					generateStairRecipe((StairBlock) b, sourceBlock.asItem(), consumer);
					generateStoneCutterRecipe(b, sourceBlock, 1, consumer);
					break;
				}
				case "SlabBlock": {
					sourceBlockName = blockName.substring(0, blockName.indexOf("_slab"));
					Block sourceBlock = ForgeRegistries.BLOCKS.getValue(new ResourceLocation(BlockPalette.MODID, sourceBlockName));

					generateSlabRecipe((SlabBlock) b, sourceBlock.asItem(), consumer);
					generateStoneCutterRecipe(b, sourceBlock, 1, consumer);
					break;
				}
				case "WallBlock": {
					sourceBlockName = blockName.substring(0, blockName.indexOf("_wall"));
					Block sourceBlock = ForgeRegistries.BLOCKS.getValue(new ResourceLocation(BlockPalette.MODID, sourceBlockName));

					generateThreeByTwoRecipe(b, sourceBlock, consumer);
					generateStoneCutterRecipe(b, sourceBlock, 1, consumer);
					break;
				}
				case "FenceBlock": {
					sourceBlockName = blockName.substring(0, blockName.indexOf("_fence"));
					Block sourceBlock = ForgeRegistries.BLOCKS.getValue(new ResourceLocation(BlockPalette.MODID, sourceBlockName));
					generateStoneCutterRecipe(b, sourceBlock, 3, consumer);
					break;
				}
			}
		});
	}




	private void generateVariant(Block output, Item firstInputItem, Item secondInputItem, Consumer<FinishedRecipe> consumer) {
		ShapedRecipeBuilder shaped = ShapedRecipeBuilder.shaped(output, 4);
		shaped.define('1', firstInputItem);
		shaped.define('2', secondInputItem);
		shaped.pattern("121");
		shaped.pattern("212");
		shaped.pattern("121");
		shaped.unlockedBy("has_item", has(secondInputItem));
		//shaped.group(getVariantName(output));
		shaped.save(consumer, new ResourceLocation(BlockPalette.MODID, ForgeRegistries.BLOCKS.getKey(output).getPath() + "_from_" + ForgeRegistries.ITEMS.getKey(secondInputItem).getPath()));
	}

	private void generateColor(Block output, Block sourceBlock, Item inputItem, Consumer<FinishedRecipe> consumer) {
		ShapelessRecipeBuilder shapeless = ShapelessRecipeBuilder.shapeless(output, 1);
		shapeless.requires(sourceBlock.asItem());
		shapeless.requires(inputItem);
		//.group(getVariantName(output))
		shapeless.unlockedBy("has_item", has(sourceBlock));
		shapeless.save(consumer);
	}

	private void generateSlabRecipe(SlabBlock output, Item input, Consumer<FinishedRecipe> consumer) {
		ShapedRecipeBuilder shaped = ShapedRecipeBuilder.shaped(output, 6);
		shaped.define('#', input);
		shaped.pattern("###");
		//shaped.group(getVariantName(output));
		shaped.unlockedBy("has_item", has(input));
		shaped.save(consumer);
	}

	private void generateStairRecipe(StairBlock output, Item input, Consumer<FinishedRecipe> consumer) {
		ShapedRecipeBuilder shaped = ShapedRecipeBuilder.shaped(output, 4);
		shaped.define('#', input);
		shaped.pattern("#  ");
		shaped.pattern("## ");
		shaped.pattern("###");
		//shaped.group(getVariantName(output));
		shaped.unlockedBy("has_item", has(input));
		shaped.save(consumer);
	}

	private void generateTwoByTwoRecipe(Block output, Block input, Consumer<FinishedRecipe> consumer) {
		ShapedRecipeBuilder shaped = ShapedRecipeBuilder.shaped(output, 4);
		shaped.define('#', input);
		shaped.pattern("##");
		shaped.pattern("##");
		//shaped.group(getVariantName(output));
		shaped.unlockedBy("has_item", has(input));
		shaped.save(consumer);
	}

	private void generateThreeByTwoRecipe(Block output, Block input, Consumer<FinishedRecipe> consumer) {
		ShapedRecipeBuilder shaped = ShapedRecipeBuilder.shaped(output, 6);
		shaped.define('#', input);
		shaped.pattern("###");
		shaped.pattern("###");
		//shaped.group(getVariantName(output));
		shaped.unlockedBy("has_item", has(input));
		shaped.save(consumer);
	}

	private void generateStoneCutterRecipe(Block output, Block input, int amount, Consumer<FinishedRecipe> consumer) {
		String blockName = ForgeRegistries.BLOCKS.getKey(output).getPath();

		SingleItemRecipeBuilder stonecutting = SingleItemRecipeBuilder.stonecutting(Ingredient.of(input), output, amount);
		stonecutting.group(getVariantName(output));
		stonecutting.unlockedBy("has_item", has(input));
		stonecutting.save(consumer, blockName + "_from_stonecutting");
	}

	private void generateSmeltingRecipe(Block output, Block input, Consumer<FinishedRecipe> consumer) {
		SimpleCookingRecipeBuilder smelting = SimpleCookingRecipeBuilder.smelting(Ingredient.of(input), output, 0.1F, 200);
		//smelting.group(getVariantName(output));
		smelting.unlockedBy("has_item", has(input));
		smelting.save(consumer);
	}

	private String getVariantName(Block block) {
		String blockName = ForgeRegistries.BLOCKS.getKey(block).getPath();
		String variantName = blockName;

		if(blockName.contains("_")) {
			variantName = blockName.substring(0, blockName.indexOf("_"));
		}

		return variantName;
	}
}
