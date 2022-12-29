package andronomos.blockpalette.data;

import andronomos.blockpalette.BlockPalette;
import andronomos.blockpalette.registry.ModBlocks;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.StairBlock;
import net.minecraftforge.registries.ForgeRegistries;
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
		generateVariant(ModBlocks.BYTL.get(), Items.STONE, Items.BONE_MEAL, consumer);
		generateStoneCutterRecipe(ModBlocks.BYTL_STRIP.get(), ModBlocks.BYTL.get(), 1, consumer);
		generateStoneCutterRecipe(ModBlocks.BYTL_COLUMN.get(), ModBlocks.BYTL.get(), 1,  consumer);
		generateStairRecipe(ModBlocks.BYTL_STAIRS.get(), ModBlocks.BYTL.get().asItem(), consumer);
		generateSlabRecipe(ModBlocks.BYTL_SLAB.get(), ModBlocks.BYTL.get().asItem(), consumer);
		generateStoneCutterRecipe(ModBlocks.BYTL_STAIRS.get(), ModBlocks.BYTL.get(), 1,  consumer);
		generateStoneCutterRecipe(ModBlocks.BYTL_SLAB.get(), ModBlocks.BYTL.get(), 2,  consumer);
		generateThreeByTwoRecipe(ModBlocks.BYTL_WALL.get(), ModBlocks.BYTL.get(), consumer);
		generateStoneCutterRecipe(ModBlocks.BYTL_FENCE.get(), ModBlocks.BYTL.get(), 3, consumer);

		generateColorVariant(ModBlocks.BYTL_LIGHT_GRAY.get(), ModBlocks.BYTL.get(), Items.LIGHT_GRAY_DYE, consumer);
		generateStoneCutterRecipe(ModBlocks.BYTL_LIGHT_GRAY_STRIP.get(), ModBlocks.BYTL_LIGHT_GRAY.get(), 1, consumer);
		generateStoneCutterRecipe(ModBlocks.BYTL_LIGHT_GRAY_COLUMN.get(), ModBlocks.BYTL_LIGHT_GRAY.get(), 1,  consumer);
		generateStairRecipe(ModBlocks.BYTL_LIGHT_GRAY_STAIRS.get(), ModBlocks.BYTL_LIGHT_GRAY.get().asItem(), consumer);
		generateSlabRecipe(ModBlocks.BYTL_LIGHT_GRAY_SLAB.get(), ModBlocks.BYTL_LIGHT_GRAY.get().asItem(), consumer);
		generateStoneCutterRecipe(ModBlocks.BYTL_LIGHT_GRAY_STAIRS.get(), ModBlocks.BYTL_LIGHT_GRAY.get(), 1,  consumer);
		generateStoneCutterRecipe(ModBlocks.BYTL_LIGHT_GRAY_SLAB.get(), ModBlocks.BYTL_LIGHT_GRAY.get(), 2,  consumer);
		generateThreeByTwoRecipe(ModBlocks.BYTL_LIGHT_GRAY_WALL.get(), ModBlocks.BYTL_LIGHT_GRAY.get(), consumer);
		generateStoneCutterRecipe(ModBlocks.BYTL_LIGHT_GRAY_FENCE.get(), ModBlocks.BYTL_LIGHT_GRAY.get(), 3, consumer);

		generateColorVariant(ModBlocks.BYTL_GRAY.get(), ModBlocks.BYTL.get(), Items.GRAY_DYE, consumer);
		generateStoneCutterRecipe(ModBlocks.BYTL_GRAY_STRIP.get(), ModBlocks.BYTL_GRAY.get(), 1, consumer);
		generateStoneCutterRecipe(ModBlocks.BYTL_GRAY_COLUMN.get(), ModBlocks.BYTL_GRAY.get(), 1,  consumer);
		generateStairRecipe(ModBlocks.BYTL_GRAY_STAIRS.get(), ModBlocks.BYTL_GRAY.get().asItem(), consumer);
		generateSlabRecipe(ModBlocks.BYTL_GRAY_SLAB.get(), ModBlocks.BYTL_GRAY.get().asItem(), consumer);
		generateStoneCutterRecipe(ModBlocks.BYTL_GRAY_STAIRS.get(), ModBlocks.BYTL_GRAY.get(), 1,  consumer);
		generateStoneCutterRecipe(ModBlocks.BYTL_GRAY_SLAB.get(), ModBlocks.BYTL_GRAY.get(), 2,  consumer);
		generateThreeByTwoRecipe(ModBlocks.BYTL_GRAY_WALL.get(), ModBlocks.BYTL_GRAY.get(), consumer);
		generateStoneCutterRecipe(ModBlocks.BYTL_GRAY_FENCE.get(), ModBlocks.BYTL_GRAY.get(), 3, consumer);

		generateColorVariant(ModBlocks.BYTL_BLACK.get(), ModBlocks.BYTL.get(), Items.BLACK_DYE, consumer);
		generateStoneCutterRecipe(ModBlocks.BYTL_BLACK_STRIP.get(), ModBlocks.BYTL_BLACK.get(), 1, consumer);
		generateStoneCutterRecipe(ModBlocks.BYTL_BLACK_COLUMN.get(), ModBlocks.BYTL_BLACK.get(), 1,  consumer);
		generateStairRecipe(ModBlocks.BYTL_BLACK_STAIRS.get(), ModBlocks.BYTL_BLACK.get().asItem(), consumer);
		generateSlabRecipe(ModBlocks.BYTL_BLACK_SLAB.get(), ModBlocks.BYTL_BLACK.get().asItem(), consumer);
		generateStoneCutterRecipe(ModBlocks.BYTL_BLACK_STAIRS.get(), ModBlocks.BYTL_BLACK.get(), 1,  consumer);
		generateStoneCutterRecipe(ModBlocks.BYTL_BLACK_SLAB.get(), ModBlocks.BYTL_BLACK.get(), 2,  consumer);
		generateThreeByTwoRecipe(ModBlocks.BYTL_BLACK_WALL.get(), ModBlocks.BYTL_BLACK.get(), consumer);
		generateStoneCutterRecipe(ModBlocks.BYTL_BLACK_FENCE.get(), ModBlocks.BYTL_BLACK.get(), 3, consumer);

		generateColorVariant(ModBlocks.BYTL_YELLOW.get(), ModBlocks.BYTL.get(), Items.YELLOW_DYE, consumer);
		generateStoneCutterRecipe(ModBlocks.BYTL_YELLOW_STRIP.get(), ModBlocks.BYTL_YELLOW.get(), 1, consumer);
		generateStoneCutterRecipe(ModBlocks.BYTL_YELLOW_COLUMN.get(), ModBlocks.BYTL_YELLOW.get(), 1,  consumer);
		generateStairRecipe(ModBlocks.BYTL_YELLOW_STAIRS.get(), ModBlocks.BYTL_YELLOW.get().asItem(), consumer);
		generateSlabRecipe(ModBlocks.BYTL_YELLOW_SLAB.get(), ModBlocks.BYTL_YELLOW.get().asItem(), consumer);
		generateStoneCutterRecipe(ModBlocks.BYTL_YELLOW_STAIRS.get(), ModBlocks.BYTL_YELLOW.get(), 1,  consumer);
		generateStoneCutterRecipe(ModBlocks.BYTL_YELLOW_SLAB.get(), ModBlocks.BYTL_YELLOW.get(), 2,  consumer);
		generateThreeByTwoRecipe(ModBlocks.BYTL_YELLOW_WALL.get(), ModBlocks.BYTL_YELLOW.get(), consumer);
		generateStoneCutterRecipe(ModBlocks.BYTL_YELLOW_FENCE.get(), ModBlocks.BYTL_YELLOW.get(), 3, consumer);

		generateColorVariant(ModBlocks.BYTL_BROWN.get(), ModBlocks.BYTL.get(), Items.BROWN_DYE, consumer);
		generateStoneCutterRecipe(ModBlocks.BYTL_BROWN_STRIP.get(), ModBlocks.BYTL_BROWN.get(), 1, consumer);
		generateStoneCutterRecipe(ModBlocks.BYTL_BROWN_COLUMN.get(), ModBlocks.BYTL_BROWN.get(), 1,  consumer);
		generateStairRecipe(ModBlocks.BYTL_BROWN_STAIRS.get(), ModBlocks.BYTL_BROWN.get().asItem(), consumer);
		generateSlabRecipe(ModBlocks.BYTL_BROWN_SLAB.get(), ModBlocks.BYTL_BROWN.get().asItem(), consumer);
		generateStoneCutterRecipe(ModBlocks.BYTL_BROWN_STAIRS.get(), ModBlocks.BYTL_BROWN.get(), 1,  consumer);
		generateStoneCutterRecipe(ModBlocks.BYTL_BROWN_SLAB.get(), ModBlocks.BYTL_BROWN.get(), 2,  consumer);
		generateThreeByTwoRecipe(ModBlocks.BYTL_BROWN_WALL.get(), ModBlocks.BYTL_BROWN.get(), consumer);
		generateStoneCutterRecipe(ModBlocks.BYTL_BROWN_FENCE.get(), ModBlocks.BYTL_BROWN.get(), 3, consumer);

		generateColorVariant(ModBlocks.BYTL_BLUE.get(), ModBlocks.BYTL.get(), Items.BLUE_DYE, consumer);
		generateStoneCutterRecipe(ModBlocks.BYTL_BLUE_STRIP.get(), ModBlocks.BYTL_BLUE.get(), 1, consumer);
		generateStoneCutterRecipe(ModBlocks.BYTL_BLUE_COLUMN.get(), ModBlocks.BYTL_BLUE.get(), 1,  consumer);
		generateStairRecipe(ModBlocks.BYTL_BLUE_STAIRS.get(), ModBlocks.BYTL_BLUE.get().asItem(), consumer);
		generateSlabRecipe(ModBlocks.BYTL_BLUE_SLAB.get(), ModBlocks.BYTL_BLUE.get().asItem(), consumer);
		generateStoneCutterRecipe(ModBlocks.BYTL_BLUE_STAIRS.get(), ModBlocks.BYTL_BLUE.get(), 1,  consumer);
		generateStoneCutterRecipe(ModBlocks.BYTL_BLUE_SLAB.get(), ModBlocks.BYTL_BLUE.get(), 2,  consumer);
		generateThreeByTwoRecipe(ModBlocks.BYTL_BLUE_WALL.get(), ModBlocks.BYTL_BLUE.get(), consumer);
		generateStoneCutterRecipe(ModBlocks.BYTL_BLUE_FENCE.get(), ModBlocks.BYTL_BLUE.get(), 3, consumer);

		generateColorVariant(ModBlocks.BYTL_RED.get(), ModBlocks.BYTL.get(), Items.RED_DYE, consumer);
		generateStoneCutterRecipe(ModBlocks.BYTL_RED_STRIP.get(), ModBlocks.BYTL_RED.get(), 1, consumer);
		generateStoneCutterRecipe(ModBlocks.BYTL_RED_COLUMN.get(), ModBlocks.BYTL_RED.get(), 1,  consumer);
		generateStairRecipe(ModBlocks.BYTL_RED_STAIRS.get(), ModBlocks.BYTL_RED.get().asItem(), consumer);
		generateSlabRecipe(ModBlocks.BYTL_RED_SLAB.get(), ModBlocks.BYTL_RED.get().asItem(), consumer);
		generateStoneCutterRecipe(ModBlocks.BYTL_RED_STAIRS.get(), ModBlocks.BYTL_RED.get(), 1,  consumer);
		generateStoneCutterRecipe(ModBlocks.BYTL_RED_SLAB.get(), ModBlocks.BYTL_RED.get(), 2,  consumer);
		generateThreeByTwoRecipe(ModBlocks.BYTL_RED_WALL.get(), ModBlocks.BYTL_RED.get(), consumer);
		generateStoneCutterRecipe(ModBlocks.BYTL_RED_FENCE.get(), ModBlocks.BYTL_RED.get(), 3, consumer);

		generateColorVariant(ModBlocks.BYTL_GREEN.get(), ModBlocks.BYTL.get(), Items.GREEN_DYE, consumer);
		generateStoneCutterRecipe(ModBlocks.BYTL_GREEN_STRIP.get(), ModBlocks.BYTL_GREEN.get(), 1, consumer);
		generateStoneCutterRecipe(ModBlocks.BYTL_GREEN_COLUMN.get(), ModBlocks.BYTL_GREEN.get(), 1,  consumer);
		generateStairRecipe(ModBlocks.BYTL_GREEN_STAIRS.get(), ModBlocks.BYTL_GREEN.get().asItem(), consumer);
		generateSlabRecipe(ModBlocks.BYTL_GREEN_SLAB.get(), ModBlocks.BYTL_GREEN.get().asItem(), consumer);
		generateStoneCutterRecipe(ModBlocks.BYTL_GREEN_STAIRS.get(), ModBlocks.BYTL_GREEN.get(), 1,  consumer);
		generateStoneCutterRecipe(ModBlocks.BYTL_GREEN_SLAB.get(), ModBlocks.BYTL_GREEN.get(), 2,  consumer);
		generateThreeByTwoRecipe(ModBlocks.BYTL_GREEN_WALL.get(), ModBlocks.BYTL_GREEN.get(), consumer);
		generateStoneCutterRecipe(ModBlocks.BYTL_GREEN_FENCE.get(), ModBlocks.BYTL_GREEN.get(), 3, consumer);

		generateColorVariant(ModBlocks.BYTL_PURPLE.get(), ModBlocks.BYTL.get(), Items.PURPLE_DYE, consumer);
		generateStoneCutterRecipe(ModBlocks.BYTL_PURPLE_STRIP.get(), ModBlocks.BYTL_PURPLE.get(), 1, consumer);
		generateStoneCutterRecipe(ModBlocks.BYTL_PURPLE_COLUMN.get(), ModBlocks.BYTL_PURPLE.get(), 1,  consumer);
		generateStairRecipe(ModBlocks.BYTL_PURPLE_STAIRS.get(), ModBlocks.BYTL_PURPLE.get().asItem(), consumer);
		generateSlabRecipe(ModBlocks.BYTL_PURPLE_SLAB.get(), ModBlocks.BYTL_PURPLE.get().asItem(), consumer);
		generateStoneCutterRecipe(ModBlocks.BYTL_PURPLE_STAIRS.get(), ModBlocks.BYTL_PURPLE.get(), 1,  consumer);
		generateStoneCutterRecipe(ModBlocks.BYTL_PURPLE_SLAB.get(), ModBlocks.BYTL_PURPLE.get(), 2,  consumer);
		generateThreeByTwoRecipe(ModBlocks.BYTL_PURPLE_WALL.get(), ModBlocks.BYTL_PURPLE.get(), consumer);
		generateStoneCutterRecipe(ModBlocks.BYTL_PURPLE_FENCE.get(), ModBlocks.BYTL_PURPLE.get(), 3, consumer);

		generateColorVariant(ModBlocks.BYTL_MAGENTA.get(), ModBlocks.BYTL.get(), Items.MAGENTA_DYE, consumer);
		generateStoneCutterRecipe(ModBlocks.BYTL_MAGENTA_STRIP.get(), ModBlocks.BYTL_MAGENTA.get(), 1,  consumer);
		generateStoneCutterRecipe(ModBlocks.BYTL_MAGENTA_COLUMN.get(), ModBlocks.BYTL_MAGENTA.get(), 1,  consumer);
		generateStairRecipe(ModBlocks.BYTL_MAGENTA_STAIRS.get(), ModBlocks.BYTL_MAGENTA.get().asItem(), consumer);
		generateSlabRecipe(ModBlocks.BYTL_MAGENTA_SLAB.get(), ModBlocks.BYTL_MAGENTA.get().asItem(), consumer);
		generateStoneCutterRecipe(ModBlocks.BYTL_MAGENTA_STAIRS.get(), ModBlocks.BYTL_MAGENTA.get(), 1,  consumer);
		generateStoneCutterRecipe(ModBlocks.BYTL_MAGENTA_SLAB.get(), ModBlocks.BYTL_MAGENTA.get(), 2,  consumer);
		generateThreeByTwoRecipe(ModBlocks.BYTL_MAGENTA_WALL.get(), ModBlocks.BYTL_MAGENTA.get(), consumer);
		generateStoneCutterRecipe(ModBlocks.BYTL_MAGENTA_FENCE.get(), ModBlocks.BYTL_MAGENTA.get(), 3, consumer);
		// endregion

		//region hzrd
		generateVariant(ModBlocks.HZRD_YELLOW.get(), Items.YELLOW_DYE, Items.IRON_INGOT, consumer);
		generateSlabRecipe(ModBlocks.HZRD_YELLOW_SLAB.get(), ModBlocks.HZRD_YELLOW.get().asItem(), consumer);
		generateVariant(ModBlocks.HZRD_GRAY.get(), Items.GRAY_DYE, Items.IRON_INGOT, consumer);
		generateSlabRecipe(ModBlocks.HZRD_GRAY_SLAB.get(), ModBlocks.HZRD_GRAY.get().asItem(), consumer);
		//endregion

		//region mytl
		generateVariant(ModBlocks.MYTL.get(), Items.WHITE_DYE, Items.IRON_INGOT, consumer);
		generateStairRecipe(ModBlocks.MYTL_STAIRS.get(), ModBlocks.MYTL.get().asItem(), consumer);
		generateStoneCutterRecipe(ModBlocks.MYTL_STAIRS.get(), ModBlocks.MYTL.get(), 1,  consumer);
		generateThreeByTwoRecipe(ModBlocks.MYTL_WALL.get(), ModBlocks.MYTL.get(), consumer);
		generateSlabRecipe(ModBlocks.MYTL_SLAB.get(), ModBlocks.MYTL.get().asItem(), consumer);
		generateStoneCutterRecipe(ModBlocks.MYTL_SLAB.get(), ModBlocks.MYTL.get(), 2,  consumer);
		generateStoneCutterRecipe(ModBlocks.MYTL_STRIP.get(), ModBlocks.MYTL.get(), 1, consumer);

		generateVariant(ModBlocks.MYTL_GRAY.get(), Items.GRAY_DYE, Items.IRON_INGOT, consumer);
		generateStairRecipe(ModBlocks.MYTL_GRAY_STAIRS.get(), ModBlocks.MYTL_GRAY.get().asItem(), consumer);
		generateStoneCutterRecipe(ModBlocks.MYTL_GRAY_STAIRS.get(), ModBlocks.MYTL_GRAY.get(), 1,  consumer);
		generateThreeByTwoRecipe(ModBlocks.MYTL_GRAY_WALL.get(), ModBlocks.MYTL_GRAY.get(), consumer);
		generateSlabRecipe(ModBlocks.MYTL_GRAY_SLAB.get(), ModBlocks.MYTL_GRAY.get().asItem(), consumer);
		generateStoneCutterRecipe(ModBlocks.MYTL_GRAY_SLAB.get(), ModBlocks.MYTL_GRAY.get(), 2,  consumer);
		generateStoneCutterRecipe(ModBlocks.MYTL_GRAY_STRIP.get(), ModBlocks.MYTL_GRAY.get(), 1, consumer);

		generateVariant(ModBlocks.MYTL_BLACK.get(), Items.BLACK_DYE, Items.IRON_INGOT, consumer);
		generateStairRecipe(ModBlocks.MYTL_BLACK_STAIRS.get(), ModBlocks.MYTL_BLACK.get().asItem(), consumer);
		generateStoneCutterRecipe(ModBlocks.MYTL_BLACK_STAIRS.get(), ModBlocks.MYTL_BLACK.get(), 1,  consumer);
		generateThreeByTwoRecipe(ModBlocks.MYTL_BLACK_WALL.get(), ModBlocks.MYTL_BLACK.get(), consumer);
		generateSlabRecipe(ModBlocks.MYTL_BLACK_SLAB.get(), ModBlocks.MYTL_BLACK.get().asItem(), consumer);
		generateStoneCutterRecipe(ModBlocks.MYTL_BLACK_SLAB.get(), ModBlocks.MYTL_BLACK.get(), 2,  consumer);
		generateStoneCutterRecipe(ModBlocks.MYTL_BLACK_STRIP.get(), ModBlocks.MYTL_BLACK.get(), 1, consumer);
		
		generateVariant(ModBlocks.MYTL_BROWN.get(), Items.BROWN_DYE, Items.IRON_INGOT, consumer);
		generateStairRecipe(ModBlocks.MYTL_BROWN_STAIRS.get(), ModBlocks.MYTL_BROWN.get().asItem(), consumer);
		generateStoneCutterRecipe(ModBlocks.MYTL_BROWN_STAIRS.get(), ModBlocks.MYTL_BROWN.get(), 1,  consumer);
		generateThreeByTwoRecipe(ModBlocks.MYTL_BROWN_WALL.get(), ModBlocks.MYTL_BROWN.get(), consumer);		
		generateSlabRecipe(ModBlocks.MYTL_BROWN_SLAB.get(), ModBlocks.MYTL_BROWN.get().asItem(), consumer);
		generateStoneCutterRecipe(ModBlocks.MYTL_BROWN_SLAB.get(), ModBlocks.MYTL_BROWN.get(), 2,  consumer);
		generateStoneCutterRecipe(ModBlocks.MYTL_BROWN_STRIP.get(), ModBlocks.MYTL_BROWN.get(), 1, consumer);

		generateVariant(ModBlocks.MYTL_GREEN.get(), Items.GREEN_DYE, Items.IRON_INGOT, consumer);
		generateStairRecipe(ModBlocks.MYTL_GREEN_STAIRS.get(), ModBlocks.MYTL_GREEN.get().asItem(), consumer);
		generateStoneCutterRecipe(ModBlocks.MYTL_GREEN_STAIRS.get(), ModBlocks.MYTL_GREEN.get(), 1,  consumer);
		generateThreeByTwoRecipe(ModBlocks.MYTL_GREEN_WALL.get(), ModBlocks.MYTL_GREEN.get(), consumer);
		generateSlabRecipe(ModBlocks.MYTL_GREEN_SLAB.get(), ModBlocks.MYTL_GREEN.get().asItem(), consumer);
		generateStoneCutterRecipe(ModBlocks.MYTL_GREEN_SLAB.get(), ModBlocks.MYTL_GREEN.get(), 2,  consumer);
		generateStoneCutterRecipe(ModBlocks.MYTL_GREEN_STRIP.get(), ModBlocks.MYTL_GREEN.get(), 1, consumer);

		generateVariant(ModBlocks.MYTL_RED.get(), Items.RED_DYE, Items.IRON_INGOT, consumer);
		generateStairRecipe(ModBlocks.MYTL_RED_STAIRS.get(), ModBlocks.MYTL_RED.get().asItem(), consumer);
		generateStoneCutterRecipe(ModBlocks.MYTL_RED_STAIRS.get(), ModBlocks.MYTL_RED.get(), 1,  consumer);
		generateThreeByTwoRecipe(ModBlocks.MYTL_RED_WALL.get(), ModBlocks.MYTL_RED.get(), consumer);
		generateSlabRecipe(ModBlocks.MYTL_RED_SLAB.get(), ModBlocks.MYTL_RED.get().asItem(), consumer);
		generateStoneCutterRecipe(ModBlocks.MYTL_RED_SLAB.get(), ModBlocks.MYTL_RED.get(), 2,  consumer);
		generateStoneCutterRecipe(ModBlocks.MYTL_RED_STRIP.get(), ModBlocks.MYTL_RED.get(), 1, consumer);

		generateVariant(ModBlocks.MYTL_ORANGE.get(), Items.ORANGE_DYE, Items.IRON_INGOT, consumer);
		generateStairRecipe(ModBlocks.MYTL_ORANGE_STAIRS.get(), ModBlocks.MYTL_ORANGE.get().asItem(), consumer);
		generateStoneCutterRecipe(ModBlocks.MYTL_ORANGE_STAIRS.get(), ModBlocks.MYTL_ORANGE.get(), 1,  consumer);
		generateThreeByTwoRecipe(ModBlocks.MYTL_ORANGE_WALL.get(), ModBlocks.MYTL_ORANGE.get(), consumer);
		generateSlabRecipe(ModBlocks.MYTL_ORANGE_SLAB.get(), ModBlocks.MYTL_ORANGE.get().asItem(), consumer);
		generateStoneCutterRecipe(ModBlocks.MYTL_ORANGE_SLAB.get(), ModBlocks.MYTL_ORANGE.get(), 2,  consumer);
		generateStoneCutterRecipe(ModBlocks.MYTL_ORANGE_STRIP.get(), ModBlocks.MYTL_ORANGE.get(), 1, consumer);
		//endregion

		//region glax
		//generateSmeltingRecipe(ModBlocks.GLAX_WHITE.get(), Blocks.WHITE_STAINED_GLASS, consumer);
		//generateSmeltingRecipe(ModBlocks.GLAX_GRAY.get(), Blocks.GRAY_STAINED_GLASS, consumer);
		//generateSmeltingRecipe(ModBlocks.GLAX_BLACK.get(), Blocks.BLACK_STAINED_GLASS, consumer);
		//generateSmeltingRecipe(ModBlocks.GLAX_RED.get(), Blocks.RED_STAINED_GLASS, consumer);
		//generateSmeltingRecipe(ModBlocks.GLAX_GREEN.get(), Blocks.GREEN_STAINED_GLASS, consumer);
		//generateSmeltingRecipe(ModBlocks.GLAX_BLUE.get(), Blocks.BLUE_STAINED_GLASS, consumer);
		//generateSmeltingRecipe(ModBlocks.GLAX_ORANGE.get(), Blocks.ORANGE_STAINED_GLASS, consumer);
		//generateSmeltingRecipe(ModBlocks.GLAX_LIME.get(), Blocks.LIME_STAINED_GLASS, consumer);
		//generateSmeltingRecipe(ModBlocks.GLAX_LIGHT_BLUE.get(), Blocks.LIGHT_BLUE_STAINED_GLASS, consumer);
		//generateSmeltingRecipe(ModBlocks.GLAX_LIGHT_GRAY.get(), Blocks.LIGHT_GRAY_STAINED_GLASS, consumer);
		//generateSmeltingRecipe(ModBlocks.GLAX_PINK.get(), Blocks.PINK_STAINED_GLASS, consumer);
		//generateSmeltingRecipe(ModBlocks.GLAX_PURPLE.get(), Blocks.PURPLE_STAINED_GLASS, consumer);
		//generateSmeltingRecipe(ModBlocks.GLAX_CYAN.get(), Blocks.CYAN_STAINED_GLASS, consumer);
		//generateSmeltingRecipe(ModBlocks.GLAX_YELLOW.get(), Blocks.YELLOW_STAINED_GLASS, consumer);
		//generateSmeltingRecipe(ModBlocks.GLAX_BROWN.get(), Blocks.BROWN_STAINED_GLASS, consumer);
		//generateSmeltingRecipe(ModBlocks.GLAX_MAGENTA.get(), Blocks.MAGENTA_STAINED_GLASS, consumer);
		//
		//generateThreeByTwoRecipe(ModBlocks.GLAX_WHITE_PANE.get(), ModBlocks.GLAX_WHITE.get(), consumer);
		//generateThreeByTwoRecipe(ModBlocks.GLAX_GRAY_PANE.get(), ModBlocks.GLAX_GRAY.get(), consumer);
		//generateThreeByTwoRecipe(ModBlocks.GLAX_BLACK_PANE.get(), ModBlocks.GLAX_BLACK.get(), consumer);
		//generateThreeByTwoRecipe(ModBlocks.GLAX_RED_PANE.get(), ModBlocks.GLAX_RED.get(), consumer);
		//generateThreeByTwoRecipe(ModBlocks.GLAX_GREEN_PANE.get(), ModBlocks.GLAX_GREEN.get(), consumer);
		//generateThreeByTwoRecipe(ModBlocks.GLAX_BLUE_PANE.get(), ModBlocks.GLAX_BLUE.get(), consumer);
		//generateThreeByTwoRecipe(ModBlocks.GLAX_ORANGE_PANE.get(), ModBlocks.GLAX_ORANGE.get(), consumer);
		//generateThreeByTwoRecipe(ModBlocks.GLAX_LIME_PANE.get(), ModBlocks.GLAX_LIME.get(), consumer);
		//generateThreeByTwoRecipe(ModBlocks.GLAX_LIGHT_BLUE_PANE.get(), ModBlocks.GLAX_LIGHT_BLUE.get(), consumer);
		//generateThreeByTwoRecipe(ModBlocks.GLAX_LIGHT_GRAY_PANE.get(), ModBlocks.GLAX_LIGHT_GRAY.get(), consumer);
		//generateThreeByTwoRecipe(ModBlocks.GLAX_PINK_PANE.get(), ModBlocks.GLAX_PINK.get(), consumer);
		//generateThreeByTwoRecipe(ModBlocks.GLAX_PURPLE_PANE.get(), ModBlocks.GLAX_PURPLE.get(), consumer);
		//generateThreeByTwoRecipe(ModBlocks.GLAX_CYAN_PANE.get(), ModBlocks.GLAX_CYAN.get(), consumer);
		//generateThreeByTwoRecipe(ModBlocks.GLAX_YELLOW_PANE.get(), ModBlocks.GLAX_YELLOW.get(), consumer);
		//generateThreeByTwoRecipe(ModBlocks.GLAX_BROWN_PANE.get(), ModBlocks.GLAX_BROWN.get(), consumer);
		//generateThreeByTwoRecipe(ModBlocks.GLAX_MAGENTA_PANE.get(), ModBlocks.GLAX_MAGENTA.get(), consumer);
		//endregion
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

	private void generateColorVariant(Block output, Block sourceBlock, Item inputItem, Consumer<FinishedRecipe> consumer) {
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
			variantName = blockName.substring(0, blockName.indexOf("_", 0));
		}

		return variantName;
	}
}
