package andronomos.blockpalette.registry;

import andronomos.blockpalette.BlockPalette;
import andronomos.blockpalette.block.BPBlock;
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
	public static Block.Properties CONCRETE_POWDER_PROPERTIES = BlockBehaviour.Properties.copy(Blocks.WHITE_CONCRETE_POWDER);
	public static Block.Properties BARRICADE_PROPERTIES = BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK);
	public static Block.Properties GLASS_PROPERTIES = BlockBehaviour.Properties.copy(Blocks.BLACK_STAINED_GLASS);
	public static Block.Properties GLASS_PANE_PROPERTIES = BlockBehaviour.Properties.copy(Blocks.BLACK_STAINED_GLASS_PANE);

	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, BlockPalette.MODID);

	public static final RegistryObject<Block> TEST = registerRotatableBlock("test", BARRICADE_PROPERTIES);

	//region Rough Concrete
	public static final RegistryObject<Block> ROUGH_CONCRETE_WHITE = registerBlock("rough_concrete_white", "rough_concrete", CONCRETE_PROPERTIES.mapColor(DyeColor.WHITE));
	public static final RegistryObject<StairBlock> ROUGH_CONCRETE_WHITE_STAIRS = registerStairBlock("rough_concrete_white_stairs", ROUGH_CONCRETE_WHITE, CONCRETE_PROPERTIES.mapColor(DyeColor.WHITE));
	public static final RegistryObject<SlabBlock> ROUGH_CONCRETE_WHITE_SLAB = registerSlabBlock("rough_concrete_white_slab", CONCRETE_PROPERTIES.mapColor(DyeColor.WHITE));
	public static final RegistryObject<WallBlock> ROUGH_CONCRETE_WHITE_WALL = registerWallBlock("rough_concrete_white_wall", CONCRETE_PROPERTIES.mapColor(DyeColor.WHITE));
	public static final RegistryObject<Block> ROUGH_CONCRETE_WHITE_TILE = registerBlock("rough_concrete_white_tile", "rough_concrete", CONCRETE_PROPERTIES.mapColor(DyeColor.WHITE));
	public static final RegistryObject<StairBlock> ROUGH_CONCRETE_WHITE_TILE_STAIRS = registerStairBlock("rough_concrete_white_tile_stairs", ROUGH_CONCRETE_WHITE, CONCRETE_PROPERTIES.mapColor(DyeColor.WHITE));
	public static final RegistryObject<SlabBlock> ROUGH_CONCRETE_WHITE_TILE_SLAB = registerSlabBlock("rough_concrete_white_tile_slab", CONCRETE_PROPERTIES.mapColor(DyeColor.WHITE));
	public static final RegistryObject<WallBlock> ROUGH_CONCRETE_WHITE_TILE_WALL = registerWallBlock("rough_concrete_white_tile_wall", CONCRETE_PROPERTIES.mapColor(DyeColor.WHITE));
	public static final RegistryObject<ConcretePowderBlock> ROUGH_CONCRETE_WHITE_POWDER = registerPowderBlock("rough_concrete_white_powder", ROUGH_CONCRETE_WHITE, CONCRETE_POWDER_PROPERTIES.mapColor(DyeColor.WHITE));

	public static final RegistryObject<Block> ROUGH_CONCRETE_BLUE = registerBlock("rough_concrete_blue", "rough_concrete", CONCRETE_PROPERTIES.mapColor(DyeColor.BLUE));
	public static final RegistryObject<StairBlock> ROUGH_CONCRETE_BLUE_STAIRS = registerStairBlock("rough_concrete_blue_stairs", ROUGH_CONCRETE_BLUE, CONCRETE_PROPERTIES.mapColor(DyeColor.BLUE));
	public static final RegistryObject<SlabBlock> ROUGH_CONCRETE_BLUE_SLAB = registerSlabBlock("rough_concrete_blue_slab", CONCRETE_PROPERTIES.mapColor(DyeColor.BLUE));
	public static final RegistryObject<WallBlock> ROUGH_CONCRETE_BLUE_WALL = registerWallBlock("rough_concrete_blue_wall", CONCRETE_PROPERTIES.mapColor(DyeColor.BLUE));
	public static final RegistryObject<Block> ROUGH_CONCRETE_BLUE_TILE = registerBlock("rough_concrete_blue_tile", "rough_concrete", CONCRETE_PROPERTIES.mapColor(DyeColor.BLUE));
	public static final RegistryObject<StairBlock> ROUGH_CONCRETE_BLUE_TILE_STAIRS = registerStairBlock("rough_concrete_blue_tile_stairs", ROUGH_CONCRETE_BLUE, CONCRETE_PROPERTIES.mapColor(DyeColor.BLUE));
	public static final RegistryObject<SlabBlock> ROUGH_CONCRETE_BLUE_TILE_SLAB = registerSlabBlock("rough_concrete_blue_tile_slab", CONCRETE_PROPERTIES.mapColor(DyeColor.BLUE));
	public static final RegistryObject<WallBlock> ROUGH_CONCRETE_BLUE_TILE_WALL = registerWallBlock("rough_concrete_blue_tile_wall", CONCRETE_PROPERTIES.mapColor(DyeColor.BLUE));
	public static final RegistryObject<ConcretePowderBlock> ROUGH_CONCRETE_BLUE_POWDER = registerPowderBlock("rough_concrete_blue_powder", ROUGH_CONCRETE_BLUE, CONCRETE_POWDER_PROPERTIES.mapColor(DyeColor.BLUE));

	public static final RegistryObject<Block> ROUGH_CONCRETE_BLACK = registerBlock("rough_concrete_black", "rough_concrete", CONCRETE_PROPERTIES.mapColor(DyeColor.BLACK));
	public static final RegistryObject<StairBlock> ROUGH_CONCRETE_BLACK_STAIRS = registerStairBlock("rough_concrete_black_stairs", ROUGH_CONCRETE_BLACK, CONCRETE_PROPERTIES.mapColor(DyeColor.BLACK));
	public static final RegistryObject<SlabBlock> ROUGH_CONCRETE_BLACK_SLAB = registerSlabBlock("rough_concrete_black_slab", CONCRETE_PROPERTIES.mapColor(DyeColor.BLACK));
	public static final RegistryObject<WallBlock> ROUGH_CONCRETE_BLACK_WALL = registerWallBlock("rough_concrete_black_wall", CONCRETE_PROPERTIES.mapColor(DyeColor.BLACK));
	public static final RegistryObject<Block> ROUGH_CONCRETE_BLACK_TILE = registerBlock("rough_concrete_black_tile", "rough_concrete", CONCRETE_PROPERTIES.mapColor(DyeColor.BLACK));
	public static final RegistryObject<StairBlock> ROUGH_CONCRETE_BLACK_TILE_STAIRS = registerStairBlock("rough_concrete_black_tile_stairs", ROUGH_CONCRETE_BLACK, CONCRETE_PROPERTIES.mapColor(DyeColor.BLACK));
	public static final RegistryObject<SlabBlock> ROUGH_CONCRETE_BLACK_TILE_SLAB = registerSlabBlock("rough_concrete_black_tile_slab", CONCRETE_PROPERTIES.mapColor(DyeColor.BLACK));
	public static final RegistryObject<WallBlock> ROUGH_CONCRETE_BLACK_TILE_WALL = registerWallBlock("rough_concrete_black_tile_wall", CONCRETE_PROPERTIES.mapColor(DyeColor.BLACK));
	public static final RegistryObject<ConcretePowderBlock> ROUGH_CONCRETE_BLACK_POWDER = registerPowderBlock("rough_concrete_black_powder", ROUGH_CONCRETE_BLACK, CONCRETE_POWDER_PROPERTIES.mapColor(DyeColor.BLACK));

	public static final RegistryObject<Block> ROUGH_CONCRETE_BROWN = registerBlock("rough_concrete_brown", "rough_concrete", CONCRETE_PROPERTIES.mapColor(DyeColor.BROWN));
	public static final RegistryObject<StairBlock> ROUGH_CONCRETE_BROWN_STAIRS = registerStairBlock("rough_concrete_brown_stairs", ROUGH_CONCRETE_BROWN, CONCRETE_PROPERTIES.mapColor(DyeColor.BROWN));
	public static final RegistryObject<SlabBlock> ROUGH_CONCRETE_BROWN_SLAB = registerSlabBlock("rough_concrete_brown_slab", CONCRETE_PROPERTIES.mapColor(DyeColor.BROWN));
	public static final RegistryObject<WallBlock> ROUGH_CONCRETE_BROWN_WALL = registerWallBlock("rough_concrete_brown_wall", CONCRETE_PROPERTIES.mapColor(DyeColor.BROWN));
	public static final RegistryObject<Block> ROUGH_CONCRETE_BROWN_TILE = registerBlock("rough_concrete_brown_tile", "rough_concrete", CONCRETE_PROPERTIES.mapColor(DyeColor.BROWN));
	public static final RegistryObject<StairBlock> ROUGH_CONCRETE_BROWN_TILE_STAIRS = registerStairBlock("rough_concrete_brown_tile_stairs", ROUGH_CONCRETE_BROWN, CONCRETE_PROPERTIES.mapColor(DyeColor.BROWN));
	public static final RegistryObject<SlabBlock> ROUGH_CONCRETE_BROWN_TILE_SLAB = registerSlabBlock("rough_concrete_brown_tile_slab", CONCRETE_PROPERTIES.mapColor(DyeColor.BROWN));
	public static final RegistryObject<WallBlock> ROUGH_CONCRETE_BROWN_TILE_WALL = registerWallBlock("rough_concrete_brown_tile_wall", CONCRETE_PROPERTIES.mapColor(DyeColor.BROWN));
	public static final RegistryObject<ConcretePowderBlock> ROUGH_CONCRETE_BROWN_POWDER = registerPowderBlock("rough_concrete_brown_powder", ROUGH_CONCRETE_BROWN, CONCRETE_POWDER_PROPERTIES.mapColor(DyeColor.BROWN));

	public static final RegistryObject<Block> ROUGH_CONCRETE_GREEN = registerBlock("rough_concrete_green", "rough_concrete", CONCRETE_PROPERTIES.mapColor(DyeColor.GREEN));
	public static final RegistryObject<StairBlock> ROUGH_CONCRETE_GREEN_STAIRS = registerStairBlock("rough_concrete_green_stairs", ROUGH_CONCRETE_GREEN, CONCRETE_PROPERTIES.mapColor(DyeColor.GREEN));
	public static final RegistryObject<SlabBlock> ROUGH_CONCRETE_GREEN_SLAB = registerSlabBlock("rough_concrete_green_slab", CONCRETE_PROPERTIES.mapColor(DyeColor.GREEN));
	public static final RegistryObject<WallBlock> ROUGH_CONCRETE_GREEN_WALL = registerWallBlock("rough_concrete_green_wall", CONCRETE_PROPERTIES.mapColor(DyeColor.GREEN));
	public static final RegistryObject<Block> ROUGH_CONCRETE_GREEN_TILE = registerBlock("rough_concrete_green_tile", "rough_concrete", CONCRETE_PROPERTIES.mapColor(DyeColor.GREEN));
	public static final RegistryObject<StairBlock> ROUGH_CONCRETE_GREEN_TILE_STAIRS = registerStairBlock("rough_concrete_green_tile_stairs", ROUGH_CONCRETE_GREEN, CONCRETE_PROPERTIES.mapColor(DyeColor.GREEN));
	public static final RegistryObject<SlabBlock> ROUGH_CONCRETE_GREEN_TILE_SLAB = registerSlabBlock("rough_concrete_green_tile_slab", CONCRETE_PROPERTIES.mapColor(DyeColor.GREEN));
	public static final RegistryObject<WallBlock> ROUGH_CONCRETE_GREEN_TILE_WALL = registerWallBlock("rough_concrete_green_tile_wall", CONCRETE_PROPERTIES.mapColor(DyeColor.GREEN));
	public static final RegistryObject<ConcretePowderBlock> ROUGH_CONCRETE_GREEN_POWDER = registerPowderBlock("rough_concrete_green_powder", ROUGH_CONCRETE_GREEN, CONCRETE_POWDER_PROPERTIES.mapColor(DyeColor.GREEN));

	public static final RegistryObject<Block> ROUGH_CONCRETE_GRAY = registerBlock("rough_concrete_gray", "rough_concrete", CONCRETE_PROPERTIES.mapColor(DyeColor.GRAY));
	public static final RegistryObject<StairBlock> ROUGH_CONCRETE_GRAY_STAIRS = registerStairBlock("rough_concrete_gray_stairs", ROUGH_CONCRETE_GRAY, CONCRETE_PROPERTIES.mapColor(DyeColor.GRAY));
	public static final RegistryObject<SlabBlock> ROUGH_CONCRETE_GRAY_SLAB = registerSlabBlock("rough_concrete_gray_slab", CONCRETE_PROPERTIES.mapColor(DyeColor.GRAY));
	public static final RegistryObject<WallBlock> ROUGH_CONCRETE_GRAY_WALL = registerWallBlock("rough_concrete_gray_wall", CONCRETE_PROPERTIES.mapColor(DyeColor.GRAY));
	public static final RegistryObject<Block> ROUGH_CONCRETE_GRAY_TILE = registerBlock("rough_concrete_gray_tile", "rough_concrete", CONCRETE_PROPERTIES.mapColor(DyeColor.GRAY));
	public static final RegistryObject<StairBlock> ROUGH_CONCRETE_GRAY_TILE_STAIRS = registerStairBlock("rough_concrete_gray_tile_stairs", ROUGH_CONCRETE_GRAY, CONCRETE_PROPERTIES.mapColor(DyeColor.GRAY));
	public static final RegistryObject<SlabBlock> ROUGH_CONCRETE_GRAY_TILE_SLAB = registerSlabBlock("rough_concrete_gray_tile_slab", CONCRETE_PROPERTIES.mapColor(DyeColor.GRAY));
	public static final RegistryObject<WallBlock> ROUGH_CONCRETE_GRAY_TILE_WALL = registerWallBlock("rough_concrete_gray_tile_wall", CONCRETE_PROPERTIES.mapColor(DyeColor.GRAY));
	public static final RegistryObject<ConcretePowderBlock> ROUGH_CONCRETE_GRAY_POWDER = registerPowderBlock("rough_concrete_gray_powder", ROUGH_CONCRETE_GRAY, CONCRETE_POWDER_PROPERTIES.mapColor(DyeColor.GRAY));

	public static final RegistryObject<Block> ROUGH_CONCRETE_ORANGE = registerBlock("rough_concrete_orange", "rough_concrete", CONCRETE_PROPERTIES.mapColor(DyeColor.ORANGE));
	public static final RegistryObject<StairBlock> ROUGH_CONCRETE_ORANGE_STAIRS = registerStairBlock("rough_concrete_orange_stairs", ROUGH_CONCRETE_ORANGE, CONCRETE_PROPERTIES.mapColor(DyeColor.ORANGE));
	public static final RegistryObject<SlabBlock> ROUGH_CONCRETE_ORANGE_SLAB = registerSlabBlock("rough_concrete_orange_slab", CONCRETE_PROPERTIES.mapColor(DyeColor.ORANGE));
	public static final RegistryObject<WallBlock> ROUGH_CONCRETE_ORANGE_WALL = registerWallBlock("rough_concrete_orange_wall", CONCRETE_PROPERTIES.mapColor(DyeColor.ORANGE));
	public static final RegistryObject<Block> ROUGH_CONCRETE_ORANGE_TILE = registerBlock("rough_concrete_orange_tile", "rough_concrete", CONCRETE_PROPERTIES.mapColor(DyeColor.ORANGE));
	public static final RegistryObject<StairBlock> ROUGH_CONCRETE_ORANGE_TILE_STAIRS = registerStairBlock("rough_concrete_orange_tile_stairs", ROUGH_CONCRETE_ORANGE, CONCRETE_PROPERTIES.mapColor(DyeColor.ORANGE));
	public static final RegistryObject<SlabBlock> ROUGH_CONCRETE_ORANGE_TILE_SLAB = registerSlabBlock("rough_concrete_orange_tile_slab", CONCRETE_PROPERTIES.mapColor(DyeColor.ORANGE));
	public static final RegistryObject<WallBlock> ROUGH_CONCRETE_ORANGE_TILE_WALL = registerWallBlock("rough_concrete_orange_tile_wall", CONCRETE_PROPERTIES.mapColor(DyeColor.ORANGE));
	public static final RegistryObject<ConcretePowderBlock> ROUGH_CONCRETE_ORANGE_POWDER = registerPowderBlock("rough_concrete_orange_powder", ROUGH_CONCRETE_ORANGE, CONCRETE_POWDER_PROPERTIES.mapColor(DyeColor.ORANGE));

	public static final RegistryObject<Block> ROUGH_CONCRETE_PURPLE = registerBlock("rough_concrete_purple", "rough_concrete", CONCRETE_PROPERTIES.mapColor(DyeColor.PURPLE));
	public static final RegistryObject<StairBlock> ROUGH_CONCRETE_PURPLE_STAIRS = registerStairBlock("rough_concrete_purple_stairs", ROUGH_CONCRETE_PURPLE, CONCRETE_PROPERTIES.mapColor(DyeColor.PURPLE));
	public static final RegistryObject<SlabBlock> ROUGH_CONCRETE_PURPLE_SLAB = registerSlabBlock("rough_concrete_purple_slab", CONCRETE_PROPERTIES.mapColor(DyeColor.PURPLE));
	public static final RegistryObject<WallBlock> ROUGH_CONCRETE_PURPLE_WALL = registerWallBlock("rough_concrete_purple_wall", CONCRETE_PROPERTIES.mapColor(DyeColor.PURPLE));
	public static final RegistryObject<Block> ROUGH_CONCRETE_PURPLE_TILE = registerBlock("rough_concrete_purple_tile", "rough_concrete", CONCRETE_PROPERTIES.mapColor(DyeColor.PURPLE));
	public static final RegistryObject<StairBlock> ROUGH_CONCRETE_PURPLE_TILE_STAIRS = registerStairBlock("rough_concrete_purple_tile_stairs", ROUGH_CONCRETE_PURPLE, CONCRETE_PROPERTIES.mapColor(DyeColor.PURPLE));
	public static final RegistryObject<SlabBlock> ROUGH_CONCRETE_PURPLE_TILE_SLAB = registerSlabBlock("rough_concrete_purple_tile_slab", CONCRETE_PROPERTIES.mapColor(DyeColor.PURPLE));
	public static final RegistryObject<WallBlock> ROUGH_CONCRETE_PURPLE_TILE_WALL = registerWallBlock("rough_concrete_purple_tile_wall", CONCRETE_PROPERTIES.mapColor(DyeColor.PURPLE));
	public static final RegistryObject<ConcretePowderBlock> ROUGH_CONCRETE_PURPLE_POWDER = registerPowderBlock("rough_concrete_purple_powder", ROUGH_CONCRETE_PURPLE, CONCRETE_POWDER_PROPERTIES.mapColor(DyeColor.PURPLE));

	public static final RegistryObject<Block> ROUGH_CONCRETE_RED = registerBlock("rough_concrete_red", "rough_concrete", CONCRETE_PROPERTIES.mapColor(DyeColor.RED));
	public static final RegistryObject<StairBlock> ROUGH_CONCRETE_RED_STAIRS = registerStairBlock("rough_concrete_red_stairs", ROUGH_CONCRETE_RED, CONCRETE_PROPERTIES.mapColor(DyeColor.RED));
	public static final RegistryObject<SlabBlock> ROUGH_CONCRETE_RED_SLAB = registerSlabBlock("rough_concrete_red_slab", CONCRETE_PROPERTIES.mapColor(DyeColor.RED));
	public static final RegistryObject<WallBlock> ROUGH_CONCRETE_RED_WALL = registerWallBlock("rough_concrete_red_wall", CONCRETE_PROPERTIES.mapColor(DyeColor.RED));
	public static final RegistryObject<Block> ROUGH_CONCRETE_RED_TILE = registerBlock("rough_concrete_red_tile", "rough_concrete", CONCRETE_PROPERTIES.mapColor(DyeColor.RED));
	public static final RegistryObject<StairBlock> ROUGH_CONCRETE_RED_TILE_STAIRS = registerStairBlock("rough_concrete_red_tile_stairs", ROUGH_CONCRETE_RED, CONCRETE_PROPERTIES.mapColor(DyeColor.RED));
	public static final RegistryObject<SlabBlock> ROUGH_CONCRETE_RED_TILE_SLAB = registerSlabBlock("rough_concrete_red_tile_slab", CONCRETE_PROPERTIES.mapColor(DyeColor.RED));
	public static final RegistryObject<WallBlock> ROUGH_CONCRETE_RED_TILE_WALL = registerWallBlock("rough_concrete_red_tile_wall", CONCRETE_PROPERTIES.mapColor(DyeColor.RED));
	public static final RegistryObject<ConcretePowderBlock> ROUGH_CONCRETE_RED_POWDER = registerPowderBlock("rough_concrete_red_powder", ROUGH_CONCRETE_RED, CONCRETE_POWDER_PROPERTIES.mapColor(DyeColor.RED));

	public static final RegistryObject<Block> ROUGH_CONCRETE_YELLOW = registerBlock("rough_concrete_yellow", "rough_concrete", CONCRETE_PROPERTIES.mapColor(DyeColor.YELLOW));
	public static final RegistryObject<StairBlock> ROUGH_CONCRETE_YELLOW_STAIRS = registerStairBlock("rough_concrete_yellow_stairs", ROUGH_CONCRETE_YELLOW, CONCRETE_PROPERTIES.mapColor(DyeColor.YELLOW));
	public static final RegistryObject<SlabBlock> ROUGH_CONCRETE_YELLOW_SLAB = registerSlabBlock("rough_concrete_yellow_slab", CONCRETE_PROPERTIES.mapColor(DyeColor.YELLOW));
	public static final RegistryObject<WallBlock> ROUGH_CONCRETE_YELLOW_WALL = registerWallBlock("rough_concrete_yellow_wall", CONCRETE_PROPERTIES.mapColor(DyeColor.YELLOW));
	public static final RegistryObject<Block> ROUGH_CONCRETE_YELLOW_TILE = registerBlock("rough_concrete_yellow_tile", "rough_concrete", CONCRETE_PROPERTIES.mapColor(DyeColor.YELLOW));
	public static final RegistryObject<StairBlock> ROUGH_CONCRETE_YELLOW_TILE_STAIRS = registerStairBlock("rough_concrete_yellow_tile_stairs", ROUGH_CONCRETE_YELLOW, CONCRETE_PROPERTIES.mapColor(DyeColor.YELLOW));
	public static final RegistryObject<SlabBlock> ROUGH_CONCRETE_YELLOW_TILE_SLAB = registerSlabBlock("rough_concrete_yellow_tile_slab", CONCRETE_PROPERTIES.mapColor(DyeColor.YELLOW));
	public static final RegistryObject<WallBlock> ROUGH_CONCRETE_YELLOW_TILE_WALL = registerWallBlock("rough_concrete_yellow_tile_wall", CONCRETE_PROPERTIES.mapColor(DyeColor.YELLOW));
	public static final RegistryObject<ConcretePowderBlock> ROUGH_CONCRETE_YELLOW_POWDER = registerPowderBlock("rough_concrete_yellow_powder", ROUGH_CONCRETE_YELLOW, CONCRETE_POWDER_PROPERTIES.mapColor(DyeColor.YELLOW));
	//endregion

	//region Barricade
	public static final RegistryObject<Block> BARRICADE_YELLOW = registerBlock("barricade_yellow", "barricade", BARRICADE_PROPERTIES);
	public static final RegistryObject<StairBlock> BARRICADE_YELLOW_STAIRS = registerStairBlock("barricade_yellow_stairs", BARRICADE_YELLOW, BARRICADE_PROPERTIES);
	public static final RegistryObject<SlabBlock> BARRICADE_YELLOW_SLAB = registerSlabBlock("barricade_yellow_slab", BARRICADE_PROPERTIES);
	public static final RegistryObject<WallBlock> BARRICADE_YELLOW_WALL = registerWallBlock("barricade_yellow_wall", BARRICADE_PROPERTIES);
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

	public static RegistryObject<Block> registerRotatableBlock(final String name, Block.Properties properties) {
		return registerBlock(name, () -> new RotatedPillarBlock(properties));
	}

	public static RegistryObject<Block> registerBlock(final String name, final String textureFolder, Block.Properties properties) {
		return registerBlock(name, () -> new BPBlock(properties, textureFolder));
	}

	public static RegistryObject<ConcretePowderBlock> registerPowderBlock(final String name, Supplier<Block> solidBlock, BlockBehaviour.Properties properties) {
		return registerBlock(name, () -> new ConcretePowderBlock(solidBlock.get(), properties));
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
