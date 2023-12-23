package andronomos.blockpalette.registry;

import andronomos.blockpalette.BlockPalette;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
	//public static Block.Properties PROPERTIES = BlockBehaviour.Properties.of()
	//		.strength(1.8F)
	//		.requiresCorrectToolForDrops()
	//		.sound(SoundType.STONE);

	public static Block.Properties CONCRETE_PROPERTIES = BlockBehaviour.Properties.copy(Blocks.WHITE_CONCRETE);
	public static Block.Properties BARRICADE_PROPERTIES = BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK);
	public static Block.Properties GLASS_PROPERTIES = BlockBehaviour.Properties.copy(Blocks.BLACK_STAINED_GLASS);
	public static Block.Properties GLASS_PANE_PROPERTIES = BlockBehaviour.Properties.copy(Blocks.BLACK_STAINED_GLASS_PANE);

	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, BlockPalette.MODID);

	//region Rough Concrete
	public static final RegistryObject<Block> ROUGH_WHITE_CONCRETE = registerBlock("rough_white_concrete", CONCRETE_PROPERTIES.mapColor(DyeColor.WHITE));
	public static final RegistryObject<StairBlock> ROUGH_WHITE_CONCRETE_STAIRS = registerStairBlock("rough_white_concrete_stairs", ROUGH_WHITE_CONCRETE, CONCRETE_PROPERTIES.mapColor(DyeColor.WHITE));
	public static final RegistryObject<SlabBlock> ROUGH_WHITE_CONCRETE_SLAB = registerSlabBlock("rough_white_concrete_slab", CONCRETE_PROPERTIES.mapColor(DyeColor.WHITE));
	public static final RegistryObject<WallBlock> ROUGH_WHITE_CONCRETE_WALL = registerWallBlock("rough_white_concrete_wall", CONCRETE_PROPERTIES.mapColor(DyeColor.WHITE));
	public static final RegistryObject<Block> ROUGH_WHITE_CONCRETE_TILE = registerBlock("rough_white_concrete_tile", CONCRETE_PROPERTIES.mapColor(DyeColor.WHITE));
	public static final RegistryObject<StairBlock> ROUGH_WHITE_CONCRETE_TILE_STAIRS = registerStairBlock("rough_white_concrete_tile_stairs", ROUGH_WHITE_CONCRETE, CONCRETE_PROPERTIES.mapColor(DyeColor.WHITE));
	public static final RegistryObject<SlabBlock> ROUGH_WHITE_CONCRETE_TILE_SLAB = registerSlabBlock("rough_white_concrete_tile_slab", CONCRETE_PROPERTIES.mapColor(DyeColor.WHITE));
	public static final RegistryObject<WallBlock> ROUGH_WHITE_CONCRETE_TILE_WALL = registerWallBlock("rough_white_concrete_tile_wall", CONCRETE_PROPERTIES.mapColor(DyeColor.WHITE));

	public static final RegistryObject<Block> ROUGH_BLUE_CONCRETE = registerBlock("rough_blue_concrete", CONCRETE_PROPERTIES.mapColor(DyeColor.BLUE));
	public static final RegistryObject<StairBlock> ROUGH_BLUE_CONCRETE_STAIRS = registerStairBlock("rough_blue_concrete_stairs", ROUGH_BLUE_CONCRETE, CONCRETE_PROPERTIES.mapColor(DyeColor.BLUE));
	public static final RegistryObject<SlabBlock> ROUGH_BLUE_CONCRETE_SLAB = registerSlabBlock("rough_blue_concrete_slab", CONCRETE_PROPERTIES.mapColor(DyeColor.BLUE));
	public static final RegistryObject<WallBlock> ROUGH_BLUE_CONCRETE_WALL = registerWallBlock("rough_blue_concrete_wall", CONCRETE_PROPERTIES.mapColor(DyeColor.BLUE));
	public static final RegistryObject<Block> ROUGH_BLUE_CONCRETE_TILE = registerBlock("rough_blue_concrete_tile", CONCRETE_PROPERTIES.mapColor(DyeColor.BLUE));
	public static final RegistryObject<StairBlock> ROUGH_BLUE_CONCRETE_TILE_STAIRS = registerStairBlock("rough_blue_concrete_tile_stairs", ROUGH_BLUE_CONCRETE, CONCRETE_PROPERTIES.mapColor(DyeColor.BLUE));
	public static final RegistryObject<SlabBlock> ROUGH_BLUE_CONCRETE_TILE_SLAB = registerSlabBlock("rough_blue_concrete_tile_slab", CONCRETE_PROPERTIES.mapColor(DyeColor.BLUE));
	public static final RegistryObject<WallBlock> ROUGH_BLUE_CONCRETE_TILE_WALL = registerWallBlock("rough_blue_concrete_tile_wall", CONCRETE_PROPERTIES.mapColor(DyeColor.BLUE));

	public static final RegistryObject<Block> ROUGH_BLACK_CONCRETE = registerBlock("rough_black_concrete", CONCRETE_PROPERTIES.mapColor(DyeColor.BLACK));
	public static final RegistryObject<StairBlock> ROUGH_BLACK_CONCRETE_STAIRS = registerStairBlock("rough_black_concrete_stairs", ROUGH_BLACK_CONCRETE, CONCRETE_PROPERTIES.mapColor(DyeColor.BLACK));
	public static final RegistryObject<SlabBlock> ROUGH_BLACK_CONCRETE_SLAB = registerSlabBlock("rough_black_concrete_slab", CONCRETE_PROPERTIES.mapColor(DyeColor.BLACK));
	public static final RegistryObject<WallBlock> ROUGH_BLACK_CONCRETE_WALL = registerWallBlock("rough_black_concrete_wall", CONCRETE_PROPERTIES.mapColor(DyeColor.BLACK));
	public static final RegistryObject<Block> ROUGH_BLACK_CONCRETE_TILE = registerBlock("rough_black_concrete_tile", CONCRETE_PROPERTIES.mapColor(DyeColor.BLACK));
	public static final RegistryObject<StairBlock> ROUGH_BLACK_CONCRETE_TILE_STAIRS = registerStairBlock("rough_black_concrete_tile_stairs", ROUGH_BLACK_CONCRETE, CONCRETE_PROPERTIES.mapColor(DyeColor.BLACK));
	public static final RegistryObject<SlabBlock> ROUGH_BLACK_CONCRETE_TILE_SLAB = registerSlabBlock("rough_black_concrete_tile_slab", CONCRETE_PROPERTIES.mapColor(DyeColor.BLACK));
	public static final RegistryObject<WallBlock> ROUGH_BLACK_CONCRETE_TILE_WALL = registerWallBlock("rough_black_concrete_tile_wall", CONCRETE_PROPERTIES.mapColor(DyeColor.BLACK));

	public static final RegistryObject<Block> ROUGH_BROWN_CONCRETE = registerBlock("rough_brown_concrete", CONCRETE_PROPERTIES.mapColor(DyeColor.BROWN));
	public static final RegistryObject<StairBlock> ROUGH_BROWN_CONCRETE_STAIRS = registerStairBlock("rough_brown_concrete_stairs", ROUGH_BROWN_CONCRETE, CONCRETE_PROPERTIES.mapColor(DyeColor.BROWN));
	public static final RegistryObject<SlabBlock> ROUGH_BROWN_CONCRETE_SLAB = registerSlabBlock("rough_brown_concrete_slab", CONCRETE_PROPERTIES.mapColor(DyeColor.BROWN));
	public static final RegistryObject<WallBlock> ROUGH_BROWN_CONCRETE_WALL = registerWallBlock("rough_brown_concrete_wall", CONCRETE_PROPERTIES.mapColor(DyeColor.BROWN));
	public static final RegistryObject<Block> ROUGH_BROWN_CONCRETE_TILE = registerBlock("rough_brown_concrete_tile", CONCRETE_PROPERTIES.mapColor(DyeColor.BROWN));
	public static final RegistryObject<StairBlock> ROUGH_BROWN_CONCRETE_TILE_STAIRS = registerStairBlock("rough_brown_concrete_tile_stairs", ROUGH_BROWN_CONCRETE, CONCRETE_PROPERTIES.mapColor(DyeColor.BROWN));
	public static final RegistryObject<SlabBlock> ROUGH_BROWN_CONCRETE_TILE_SLAB = registerSlabBlock("rough_brown_concrete_tile_slab", CONCRETE_PROPERTIES.mapColor(DyeColor.BROWN));
	public static final RegistryObject<WallBlock> ROUGH_BROWN_CONCRETE_TILE_WALL = registerWallBlock("rough_brown_concrete_tile_wall", CONCRETE_PROPERTIES.mapColor(DyeColor.BROWN));

	public static final RegistryObject<Block> ROUGH_GREEN_CONCRETE = registerBlock("rough_green_concrete", CONCRETE_PROPERTIES.mapColor(DyeColor.GREEN));
	public static final RegistryObject<StairBlock> ROUGH_GREEN_CONCRETE_STAIRS = registerStairBlock("rough_green_concrete_stairs", ROUGH_GREEN_CONCRETE, CONCRETE_PROPERTIES.mapColor(DyeColor.GREEN));
	public static final RegistryObject<SlabBlock> ROUGH_GREEN_CONCRETE_SLAB = registerSlabBlock("rough_green_concrete_slab", CONCRETE_PROPERTIES.mapColor(DyeColor.GREEN));
	public static final RegistryObject<WallBlock> ROUGH_GREEN_CONCRETE_WALL = registerWallBlock("rough_green_concrete_wall", CONCRETE_PROPERTIES.mapColor(DyeColor.GREEN));
	public static final RegistryObject<Block> ROUGH_GREEN_CONCRETE_TILE = registerBlock("rough_green_concrete_tile", CONCRETE_PROPERTIES.mapColor(DyeColor.GREEN));
	public static final RegistryObject<StairBlock> ROUGH_GREEN_CONCRETE_TILE_STAIRS = registerStairBlock("rough_green_concrete_tile_stairs", ROUGH_GREEN_CONCRETE, CONCRETE_PROPERTIES.mapColor(DyeColor.GREEN));
	public static final RegistryObject<SlabBlock> ROUGH_GREEN_CONCRETE_TILE_SLAB = registerSlabBlock("rough_green_concrete_tile_slab", CONCRETE_PROPERTIES.mapColor(DyeColor.GREEN));
	public static final RegistryObject<WallBlock> ROUGH_GREEN_CONCRETE_TILE_WALL = registerWallBlock("rough_green_concrete_tile_wall", CONCRETE_PROPERTIES.mapColor(DyeColor.GREEN));

	public static final RegistryObject<Block> ROUGH_GRAY_CONCRETE = registerBlock("rough_gray_concrete", CONCRETE_PROPERTIES.mapColor(DyeColor.GRAY));
	public static final RegistryObject<StairBlock> ROUGH_GRAY_CONCRETE_STAIRS = registerStairBlock("rough_gray_concrete_stairs", ROUGH_GRAY_CONCRETE, CONCRETE_PROPERTIES.mapColor(DyeColor.GRAY));
	public static final RegistryObject<SlabBlock> ROUGH_GRAY_CONCRETE_SLAB = registerSlabBlock("rough_gray_concrete_slab", CONCRETE_PROPERTIES.mapColor(DyeColor.GRAY));
	public static final RegistryObject<WallBlock> ROUGH_GRAY_CONCRETE_WALL = registerWallBlock("rough_gray_concrete_wall", CONCRETE_PROPERTIES.mapColor(DyeColor.GRAY));
	public static final RegistryObject<Block> ROUGH_GRAY_CONCRETE_TILE = registerBlock("rough_gray_concrete_tile", CONCRETE_PROPERTIES.mapColor(DyeColor.GRAY));
	public static final RegistryObject<StairBlock> ROUGH_GRAY_CONCRETE_TILE_STAIRS = registerStairBlock("rough_gray_concrete_tile_stairs", ROUGH_GRAY_CONCRETE, CONCRETE_PROPERTIES.mapColor(DyeColor.GRAY));
	public static final RegistryObject<SlabBlock> ROUGH_GRAY_CONCRETE_TILE_SLAB = registerSlabBlock("rough_gray_concrete_tile_slab", CONCRETE_PROPERTIES.mapColor(DyeColor.GRAY));
	public static final RegistryObject<WallBlock> ROUGH_GRAY_CONCRETE_TILE_WALL = registerWallBlock("rough_gray_concrete_tile_wall", CONCRETE_PROPERTIES.mapColor(DyeColor.GRAY));

	public static final RegistryObject<Block> ROUGH_ORANGE_CONCRETE = registerBlock("rough_orange_concrete", CONCRETE_PROPERTIES.mapColor(DyeColor.ORANGE));
	public static final RegistryObject<StairBlock> ROUGH_ORANGE_CONCRETE_STAIRS = registerStairBlock("rough_orange_concrete_stairs", ROUGH_ORANGE_CONCRETE, CONCRETE_PROPERTIES.mapColor(DyeColor.ORANGE));
	public static final RegistryObject<SlabBlock> ROUGH_ORANGE_CONCRETE_SLAB = registerSlabBlock("rough_orange_concrete_slab", CONCRETE_PROPERTIES.mapColor(DyeColor.ORANGE));
	public static final RegistryObject<WallBlock> ROUGH_ORANGE_CONCRETE_WALL = registerWallBlock("rough_orange_concrete_wall", CONCRETE_PROPERTIES.mapColor(DyeColor.ORANGE));
	public static final RegistryObject<Block> ROUGH_ORANGE_CONCRETE_TILE = registerBlock("rough_orange_concrete_tile", CONCRETE_PROPERTIES.mapColor(DyeColor.ORANGE));
	public static final RegistryObject<StairBlock> ROUGH_ORANGE_CONCRETE_TILE_STAIRS = registerStairBlock("rough_orange_concrete_tile_stairs", ROUGH_ORANGE_CONCRETE, CONCRETE_PROPERTIES.mapColor(DyeColor.ORANGE));
	public static final RegistryObject<SlabBlock> ROUGH_ORANGE_CONCRETE_TILE_SLAB = registerSlabBlock("rough_orange_concrete_tile_slab", CONCRETE_PROPERTIES.mapColor(DyeColor.ORANGE));
	public static final RegistryObject<WallBlock> ROUGH_ORANGE_CONCRETE_TILE_WALL = registerWallBlock("rough_orange_concrete_tile_wall", CONCRETE_PROPERTIES.mapColor(DyeColor.ORANGE));

	public static final RegistryObject<Block> ROUGH_PURPLE_CONCRETE = registerBlock("rough_purple_concrete", CONCRETE_PROPERTIES.mapColor(DyeColor.PURPLE));
	public static final RegistryObject<StairBlock> ROUGH_PURPLE_CONCRETE_STAIRS = registerStairBlock("rough_purple_concrete_stairs", ROUGH_PURPLE_CONCRETE, CONCRETE_PROPERTIES.mapColor(DyeColor.PURPLE));
	public static final RegistryObject<SlabBlock> ROUGH_PURPLE_CONCRETE_SLAB = registerSlabBlock("rough_purple_concrete_slab", CONCRETE_PROPERTIES.mapColor(DyeColor.PURPLE));
	public static final RegistryObject<WallBlock> ROUGH_PURPLE_CONCRETE_WALL = registerWallBlock("rough_purple_concrete_wall", CONCRETE_PROPERTIES.mapColor(DyeColor.PURPLE));
	public static final RegistryObject<Block> ROUGH_PURPLE_CONCRETE_TILE = registerBlock("rough_purple_concrete_tile", CONCRETE_PROPERTIES.mapColor(DyeColor.PURPLE));
	public static final RegistryObject<StairBlock> ROUGH_PURPLE_CONCRETE_TILE_STAIRS = registerStairBlock("rough_purple_concrete_tile_stairs", ROUGH_PURPLE_CONCRETE, CONCRETE_PROPERTIES.mapColor(DyeColor.PURPLE));
	public static final RegistryObject<SlabBlock> ROUGH_PURPLE_CONCRETE_TILE_SLAB = registerSlabBlock("rough_purple_concrete_tile_slab", CONCRETE_PROPERTIES.mapColor(DyeColor.PURPLE));
	public static final RegistryObject<WallBlock> ROUGH_PURPLE_CONCRETE_TILE_WALL = registerWallBlock("rough_purple_concrete_tile_wall", CONCRETE_PROPERTIES.mapColor(DyeColor.PURPLE));

	public static final RegistryObject<Block> ROUGH_RED_CONCRETE = registerBlock("rough_red_concrete", CONCRETE_PROPERTIES.mapColor(DyeColor.RED));
	public static final RegistryObject<StairBlock> ROUGH_RED_CONCRETE_STAIRS = registerStairBlock("rough_red_concrete_stairs", ROUGH_RED_CONCRETE, CONCRETE_PROPERTIES.mapColor(DyeColor.RED));
	public static final RegistryObject<SlabBlock> ROUGH_RED_CONCRETE_SLAB = registerSlabBlock("rough_red_concrete_slab", CONCRETE_PROPERTIES.mapColor(DyeColor.RED));
	public static final RegistryObject<WallBlock> ROUGH_RED_CONCRETE_WALL = registerWallBlock("rough_red_concrete_wall", CONCRETE_PROPERTIES.mapColor(DyeColor.RED));
	public static final RegistryObject<Block> ROUGH_RED_CONCRETE_TILE = registerBlock("rough_red_concrete_tile", CONCRETE_PROPERTIES.mapColor(DyeColor.RED));
	public static final RegistryObject<StairBlock> ROUGH_RED_CONCRETE_TILE_STAIRS = registerStairBlock("rough_red_concrete_tile_stairs", ROUGH_RED_CONCRETE, CONCRETE_PROPERTIES.mapColor(DyeColor.RED));
	public static final RegistryObject<SlabBlock> ROUGH_RED_CONCRETE_TILE_SLAB = registerSlabBlock("rough_red_concrete_tile_slab", CONCRETE_PROPERTIES.mapColor(DyeColor.RED));
	public static final RegistryObject<WallBlock> ROUGH_RED_CONCRETE_TILE_WALL = registerWallBlock("rough_red_concrete_tile_wall", CONCRETE_PROPERTIES.mapColor(DyeColor.RED));

	public static final RegistryObject<Block> ROUGH_YELLOW_CONCRETE = registerBlock("rough_yellow_concrete", CONCRETE_PROPERTIES.mapColor(DyeColor.YELLOW));
	public static final RegistryObject<StairBlock> ROUGH_YELLOW_CONCRETE_STAIRS = registerStairBlock("rough_yellow_concrete_stairs", ROUGH_YELLOW_CONCRETE, CONCRETE_PROPERTIES.mapColor(DyeColor.YELLOW));
	public static final RegistryObject<SlabBlock> ROUGH_YELLOW_CONCRETE_SLAB = registerSlabBlock("rough_yellow_concrete_slab", CONCRETE_PROPERTIES.mapColor(DyeColor.YELLOW));
	public static final RegistryObject<WallBlock> ROUGH_YELLOW_CONCRETE_WALL = registerWallBlock("rough_yellow_concrete_wall", CONCRETE_PROPERTIES.mapColor(DyeColor.YELLOW));
	public static final RegistryObject<Block> ROUGH_YELLOW_CONCRETE_TILE = registerBlock("rough_yellow_concrete_tile", CONCRETE_PROPERTIES.mapColor(DyeColor.YELLOW));
	public static final RegistryObject<StairBlock> ROUGH_YELLOW_CONCRETE_TILE_STAIRS = registerStairBlock("rough_yellow_concrete_tile_stairs", ROUGH_YELLOW_CONCRETE, CONCRETE_PROPERTIES.mapColor(DyeColor.YELLOW));
	public static final RegistryObject<SlabBlock> ROUGH_YELLOW_CONCRETE_TILE_SLAB = registerSlabBlock("rough_yellow_concrete_tile_slab", CONCRETE_PROPERTIES.mapColor(DyeColor.YELLOW));
	public static final RegistryObject<WallBlock> ROUGH_YELLOW_CONCRETE_TILE_WALL = registerWallBlock("rough_yellow_concrete_tile_wall", CONCRETE_PROPERTIES.mapColor(DyeColor.YELLOW));
	//endregion

	//region Barricade
	public static final RegistryObject<Block> BARRICADE_GRAY = registerBlock("barricade_gray", BARRICADE_PROPERTIES);
	public static final RegistryObject<StairBlock> BARRICADE_GRAY_STAIRS = registerStairBlock("barricade_gray_stairs", BARRICADE_GRAY, BARRICADE_PROPERTIES);
	public static final RegistryObject<SlabBlock> BARRICADE_GRAY_SLAB = registerSlabBlock("barricade_gray_slab", BARRICADE_PROPERTIES);
	public static final RegistryObject<WallBlock> BARRICADE_GRAY_WALL = registerWallBlock("barricade_gray_wall", BARRICADE_PROPERTIES);

	public static final RegistryObject<Block> BARRICADE_YELLOW = registerBlock("barricade_yellow", BARRICADE_PROPERTIES);
	public static final RegistryObject<StairBlock> BARRICADE_YELLOW_STAIRS = registerStairBlock("barricade_yellow_stairs", BARRICADE_YELLOW, BARRICADE_PROPERTIES);
	public static final RegistryObject<SlabBlock> BARRICADE_YELLOW_SLAB = registerSlabBlock("barricade_yellow_slab", BARRICADE_PROPERTIES);
	public static final RegistryObject<WallBlock> BARRICADE_YELLOW_WALL = registerWallBlock("barricade_yellow_wall", BARRICADE_PROPERTIES);

	public static final RegistryObject<Block> BARRICADE_GREEN = registerBlock("barricade_green", BARRICADE_PROPERTIES);
	public static final RegistryObject<StairBlock> BARRICADE_GREEN_STAIRS = registerStairBlock("barricade_green_stairs", BARRICADE_GREEN, BARRICADE_PROPERTIES);
	public static final RegistryObject<SlabBlock> BARRICADE_GREEN_SLAB = registerSlabBlock("barricade_green_slab", BARRICADE_PROPERTIES);
	public static final RegistryObject<WallBlock> BARRICADE_GREEN_WALL = registerWallBlock("barricade_green_wall", BARRICADE_PROPERTIES);

	public static final RegistryObject<Block> BARRICADE_BLUE = registerBlock("barricade_blue", BARRICADE_PROPERTIES);
	public static final RegistryObject<StairBlock> BARRICADE_BLUE_STAIRS = registerStairBlock("barricade_blue_stairs", BARRICADE_BLUE, BARRICADE_PROPERTIES);
	public static final RegistryObject<SlabBlock> BARRICADE_BLUE_SLAB = registerSlabBlock("barricade_blue_slab", BARRICADE_PROPERTIES);
	public static final RegistryObject<WallBlock> BARRICADE_BLUE_WALL = registerWallBlock("barricade_blue_wall", BARRICADE_PROPERTIES);

	public static final RegistryObject<Block> BARRICADE_RED = registerBlock("barricade_red", BARRICADE_PROPERTIES);
	public static final RegistryObject<StairBlock> BARRICADE_RED_STAIRS = registerStairBlock("barricade_red_stairs", BARRICADE_RED, BARRICADE_PROPERTIES);
	public static final RegistryObject<SlabBlock> BARRICADE_RED_SLAB = registerSlabBlock("barricade_red_slab", BARRICADE_PROPERTIES);
	public static final RegistryObject<WallBlock> BARRICADE_RED_WALL = registerWallBlock("barricade_red_wall", BARRICADE_PROPERTIES);
	//endregion

	//region Borderless Glass
	public static final RegistryObject<StainedGlassBlock> BORDERLESS_WHITE_GLASS = registerGlassBlock("borderless_white_glass", DyeColor.WHITE);
	public static final RegistryObject<Block> BORDERLESS_WHITE_GLASS_PANE = registerGlassPaneBlock("white", DyeColor.WHITE);
	public static final RegistryObject<StainedGlassBlock> BORDERLESS_BLUE_GLASS = registerGlassBlock("borderless_blue_glass", DyeColor.BLUE);
	public static final RegistryObject<Block> BORDERLESS_BLUE_GLASS_PANE = registerGlassPaneBlock("blue", DyeColor.BLUE);

	public static final RegistryObject<StainedGlassBlock> BORDERLESS_BROWN_GLASS = registerGlassBlock("borderless_brown_glass", DyeColor.BROWN);
	public static final RegistryObject<Block> BORDERLESS_BROWN_GLASS_PANE = registerGlassPaneBlock("brown", DyeColor.BROWN);
	public static final RegistryObject<StainedGlassBlock> BORDERLESS_CYAN_GLASS = registerGlassBlock("borderless_cyan_glass", DyeColor.CYAN);
	public static final RegistryObject<Block> BORDERLESS_CYAN_GLASS_PANE = registerGlassPaneBlock("cyan", DyeColor.CYAN);

	public static final RegistryObject<StainedGlassBlock> BORDERLESS_GREEN_GLASS = registerGlassBlock("borderless_green_glass", DyeColor.GREEN);
	public static final RegistryObject<Block> BORDERLESS_GREEN_GLASS_PANE = registerGlassPaneBlock("green", DyeColor.GREEN);
	public static final RegistryObject<StainedGlassBlock> BORDERLESS_GRAY_GLASS = registerGlassBlock("borderless_gray_glass", DyeColor.GRAY);
	public static final RegistryObject<Block> BORDERLESS_GRAY_GLASS_PANE = registerGlassPaneBlock("gray", DyeColor.GRAY);

	public static final RegistryObject<StainedGlassBlock> BORDERLESS_LIGHT_BLUE_GLASS = registerGlassBlock("borderless_light_blue_glass", DyeColor.LIGHT_BLUE);
	public static final RegistryObject<Block> BORDERLESS_LIGHT_BLUE_GLASS_PANE = registerGlassPaneBlock("light_blue", DyeColor.LIGHT_BLUE);

	public static final RegistryObject<StainedGlassBlock> BORDERLESS_LIGHT_GRAY_GLASS = registerGlassBlock("borderless_light_gray_glass", DyeColor.LIGHT_GRAY);
	public static final RegistryObject<Block> BORDERLESS_LIGHT_GRAY_GLASS_PANE = registerGlassPaneBlock("light_gray", DyeColor.LIGHT_GRAY);

	public static final RegistryObject<StainedGlassBlock> BORDERLESS_LIME_GLASS = registerGlassBlock("borderless_lime_glass", DyeColor.LIME);
	public static final RegistryObject<Block> BORDERLESS_LIME_GLASS_PANE = registerGlassPaneBlock("lime", DyeColor.LIME);

	public static final RegistryObject<StainedGlassBlock> BORDERLESS_MAGENTA_GLASS = registerGlassBlock("borderless_magenta_glass", DyeColor.MAGENTA);
	public static final RegistryObject<Block> BORDERLESS_MAGENTA_GLASS_PANE = registerGlassPaneBlock("magenta", DyeColor.MAGENTA);

	public static final RegistryObject<StainedGlassBlock> BORDERLESS_ORANGE_GLASS = registerGlassBlock("borderless_orange_glass", DyeColor.ORANGE);
	public static final RegistryObject<Block> BORDERLESS_ORANGE_GLASS_PANE = registerGlassPaneBlock("orange", DyeColor.ORANGE);

	public static final RegistryObject<StainedGlassBlock> BORDERLESS_PINK_GLASS = registerGlassBlock("borderless_pink_glass", DyeColor.PINK);
	public static final RegistryObject<Block> BORDERLESS_PINK_GLASS_PANE = registerGlassPaneBlock("pink", DyeColor.PINK);

	public static final RegistryObject<StainedGlassBlock> BORDERLESS_PURPLE_GLASS = registerGlassBlock("borderless_purple_glass", DyeColor.PURPLE);
	public static final RegistryObject<Block> BORDERLESS_PURPLE_GLASS_PANE = registerGlassPaneBlock("purple", DyeColor.PURPLE);

	public static final RegistryObject<StainedGlassBlock> BORDERLESS_RED_GLASS = registerGlassBlock("borderless_red_glass", DyeColor.RED);
	public static final RegistryObject<Block> BORDERLESS_RED_GLASS_PANE = registerGlassPaneBlock("red", DyeColor.RED);

	public static final RegistryObject<StainedGlassBlock> BORDERLESS_YELLOW_GLASS = registerGlassBlock("borderless_yellow_glass", DyeColor.YELLOW);
	public static final RegistryObject<Block> BORDERLESS_YELLOW_GLASS_PANE = registerGlassPaneBlock("yellow", DyeColor.YELLOW);

	public static final RegistryObject<StainedGlassBlock> BORDERLESS_BLACK_GLASS = registerGlassBlock("borderless_black_glass", DyeColor.BLACK);
	public static final RegistryObject<Block> BORDERLESS_BLACK_GLASS_PANE = registerGlassPaneBlock("black", DyeColor.BLACK);
	//endregion

	public static RegistryObject<Block> registerBlock(final String name, Block.Properties properties) {
		return registerBlock(name, () -> new Block(properties));
	}

	public static RegistryObject<StairBlock> registerStairBlock(final String name, Supplier<Block> source, Block.Properties properties) {
		return registerBlock(name, () -> new StairBlock(() -> source.get().defaultBlockState(), properties));
	}

	public static RegistryObject<SlabBlock> registerSlabBlock(final String name, Block.Properties properties) {
		return registerBlock(name, () -> new SlabBlock(properties));
	}

	public static RegistryObject<WallBlock> registerWallBlock(final String name, Block.Properties properties) {
		return registerBlock(name, () -> new WallBlock(properties));
	}

	public static RegistryObject<StainedGlassBlock> registerGlassBlock(final String name, DyeColor color) {
		return registerBlock(name, () -> new StainedGlassBlock(color, GLASS_PROPERTIES));
	}

	private static RegistryObject<Block> registerGlassPaneBlock(final String name, DyeColor color) {
		return registerBlock("borderless_" + name + "_glass_pane", () -> new StainedGlassPaneBlock(color, GLASS_PANE_PROPERTIES));
	}

	private static <BLOCK extends Block> RegistryObject<BLOCK> registerBlock(final String name, final Supplier<BLOCK> blockFactory) {
		final RegistryObject<BLOCK> block = BLOCKS.register(name, blockFactory);
		ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
		return block;
	}
}
