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

public class BlockRegistry {
	public static Block.Properties CONCRETE_PROPERTIES = BlockBehaviour.Properties.copy(Blocks.WHITE_CONCRETE);
	public static Block.Properties CONCRETE_POWDER_PROPERTIES = BlockBehaviour.Properties.copy(Blocks.WHITE_CONCRETE_POWDER);
	public static Block.Properties DEEPSLATE_PROPERTIES = BlockBehaviour.Properties.copy(Blocks.COBBLED_DEEPSLATE);
	public static Block.Properties STONE_PROPERTIES = BlockBehaviour.Properties.copy(Blocks.STONE);
	public static Block.Properties SLATE_PROPERTIES = BlockBehaviour.Properties.copy(Blocks.STONE).mapColor(DyeColor.BLACK);
	public static Block.Properties BARRICADE_PROPERTIES = BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK);
	public static Block.Properties GLASS_PROPERTIES = BlockBehaviour.Properties.copy(Blocks.BLACK_STAINED_GLASS);
	public static Block.Properties GLASS_PANE_PROPERTIES = BlockBehaviour.Properties.copy(Blocks.BLACK_STAINED_GLASS_PANE);

	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, BlockPalette.MODID);

	//region Rough Concrete
	public static final RegistryObject<Block> ROUGH_CONCRETE_WHITE = registerBlock("rough_concrete_white", CONCRETE_PROPERTIES.mapColor(DyeColor.WHITE));
	public static final RegistryObject<StairBlock> ROUGH_CONCRETE_WHITE_STAIRS = registerStairBlock("rough_concrete_white_stairs", ROUGH_CONCRETE_WHITE, CONCRETE_PROPERTIES.mapColor(DyeColor.WHITE));
	public static final RegistryObject<SlabBlock> ROUGH_CONCRETE_WHITE_SLAB = registerSlabBlock("rough_concrete_white_slab", CONCRETE_PROPERTIES.mapColor(DyeColor.WHITE));
	public static final RegistryObject<WallBlock> ROUGH_CONCRETE_WHITE_WALL = registerWallBlock("rough_concrete_white_wall", CONCRETE_PROPERTIES.mapColor(DyeColor.WHITE));
	public static final RegistryObject<ConcretePowderBlock> ROUGH_CONCRETE_WHITE_POWDER = registerPowderBlock("rough_concrete_white_powder", ROUGH_CONCRETE_WHITE, CONCRETE_POWDER_PROPERTIES.mapColor(DyeColor.WHITE));

	public static final RegistryObject<Block> ROUGH_CONCRETE_BLUE = registerBlock("rough_concrete_blue", CONCRETE_PROPERTIES.mapColor(DyeColor.BLUE));
	public static final RegistryObject<StairBlock> ROUGH_CONCRETE_BLUE_STAIRS = registerStairBlock("rough_concrete_blue_stairs", ROUGH_CONCRETE_BLUE, CONCRETE_PROPERTIES.mapColor(DyeColor.BLUE));
	public static final RegistryObject<SlabBlock> ROUGH_CONCRETE_BLUE_SLAB = registerSlabBlock("rough_concrete_blue_slab", CONCRETE_PROPERTIES.mapColor(DyeColor.BLUE));
	public static final RegistryObject<WallBlock> ROUGH_CONCRETE_BLUE_WALL = registerWallBlock("rough_concrete_blue_wall", CONCRETE_PROPERTIES.mapColor(DyeColor.BLUE));
	public static final RegistryObject<ConcretePowderBlock> ROUGH_CONCRETE_BLUE_POWDER = registerPowderBlock("rough_concrete_blue_powder", ROUGH_CONCRETE_BLUE, CONCRETE_POWDER_PROPERTIES.mapColor(DyeColor.BLUE));

	public static final RegistryObject<Block> ROUGH_CONCRETE_BLACK = registerBlock("rough_concrete_black", CONCRETE_PROPERTIES.mapColor(DyeColor.BLACK));
	public static final RegistryObject<StairBlock> ROUGH_CONCRETE_BLACK_STAIRS = registerStairBlock("rough_concrete_black_stairs", ROUGH_CONCRETE_BLACK, CONCRETE_PROPERTIES.mapColor(DyeColor.BLACK));
	public static final RegistryObject<SlabBlock> ROUGH_CONCRETE_BLACK_SLAB = registerSlabBlock("rough_concrete_black_slab", CONCRETE_PROPERTIES.mapColor(DyeColor.BLACK));
	public static final RegistryObject<WallBlock> ROUGH_CONCRETE_BLACK_WALL = registerWallBlock("rough_concrete_black_wall", CONCRETE_PROPERTIES.mapColor(DyeColor.BLACK));
	public static final RegistryObject<ConcretePowderBlock> ROUGH_CONCRETE_BLACK_POWDER = registerPowderBlock("rough_concrete_black_powder", ROUGH_CONCRETE_BLACK, CONCRETE_POWDER_PROPERTIES.mapColor(DyeColor.BLACK));

	public static final RegistryObject<Block> ROUGH_CONCRETE_BROWN = registerBlock("rough_concrete_brown", CONCRETE_PROPERTIES.mapColor(DyeColor.BROWN));
	public static final RegistryObject<StairBlock> ROUGH_CONCRETE_BROWN_STAIRS = registerStairBlock("rough_concrete_brown_stairs", ROUGH_CONCRETE_BROWN, CONCRETE_PROPERTIES.mapColor(DyeColor.BROWN));
	public static final RegistryObject<SlabBlock> ROUGH_CONCRETE_BROWN_SLAB = registerSlabBlock("rough_concrete_brown_slab", CONCRETE_PROPERTIES.mapColor(DyeColor.BROWN));
	public static final RegistryObject<WallBlock> ROUGH_CONCRETE_BROWN_WALL = registerWallBlock("rough_concrete_brown_wall", CONCRETE_PROPERTIES.mapColor(DyeColor.BROWN));
	public static final RegistryObject<ConcretePowderBlock> ROUGH_CONCRETE_BROWN_POWDER = registerPowderBlock("rough_concrete_brown_powder", ROUGH_CONCRETE_BROWN, CONCRETE_POWDER_PROPERTIES.mapColor(DyeColor.BROWN));

	public static final RegistryObject<Block> ROUGH_CONCRETE_GREEN = registerBlock("rough_concrete_green", CONCRETE_PROPERTIES.mapColor(DyeColor.GREEN));
	public static final RegistryObject<StairBlock> ROUGH_CONCRETE_GREEN_STAIRS = registerStairBlock("rough_concrete_green_stairs", ROUGH_CONCRETE_GREEN, CONCRETE_PROPERTIES.mapColor(DyeColor.GREEN));
	public static final RegistryObject<SlabBlock> ROUGH_CONCRETE_GREEN_SLAB = registerSlabBlock("rough_concrete_green_slab", CONCRETE_PROPERTIES.mapColor(DyeColor.GREEN));
	public static final RegistryObject<WallBlock> ROUGH_CONCRETE_GREEN_WALL = registerWallBlock("rough_concrete_green_wall", CONCRETE_PROPERTIES.mapColor(DyeColor.GREEN));
	public static final RegistryObject<ConcretePowderBlock> ROUGH_CONCRETE_GREEN_POWDER = registerPowderBlock("rough_concrete_green_powder", ROUGH_CONCRETE_GREEN, CONCRETE_POWDER_PROPERTIES.mapColor(DyeColor.GREEN));

	public static final RegistryObject<Block> ROUGH_CONCRETE_GRAY = registerBlock("rough_concrete_gray", CONCRETE_PROPERTIES.mapColor(DyeColor.GRAY));
	public static final RegistryObject<StairBlock> ROUGH_CONCRETE_GRAY_STAIRS = registerStairBlock("rough_concrete_gray_stairs", ROUGH_CONCRETE_GRAY, CONCRETE_PROPERTIES.mapColor(DyeColor.GRAY));
	public static final RegistryObject<SlabBlock> ROUGH_CONCRETE_GRAY_SLAB = registerSlabBlock("rough_concrete_gray_slab", CONCRETE_PROPERTIES.mapColor(DyeColor.GRAY));
	public static final RegistryObject<WallBlock> ROUGH_CONCRETE_GRAY_WALL = registerWallBlock("rough_concrete_gray_wall", CONCRETE_PROPERTIES.mapColor(DyeColor.GRAY));
	public static final RegistryObject<ConcretePowderBlock> ROUGH_CONCRETE_GRAY_POWDER = registerPowderBlock("rough_concrete_gray_powder", ROUGH_CONCRETE_GRAY, CONCRETE_POWDER_PROPERTIES.mapColor(DyeColor.GRAY));

	public static final RegistryObject<Block> ROUGH_CONCRETE_ORANGE = registerBlock("rough_concrete_orange", CONCRETE_PROPERTIES.mapColor(DyeColor.ORANGE));
	public static final RegistryObject<StairBlock> ROUGH_CONCRETE_ORANGE_STAIRS = registerStairBlock("rough_concrete_orange_stairs", ROUGH_CONCRETE_ORANGE, CONCRETE_PROPERTIES.mapColor(DyeColor.ORANGE));
	public static final RegistryObject<SlabBlock> ROUGH_CONCRETE_ORANGE_SLAB = registerSlabBlock("rough_concrete_orange_slab", CONCRETE_PROPERTIES.mapColor(DyeColor.ORANGE));
	public static final RegistryObject<WallBlock> ROUGH_CONCRETE_ORANGE_WALL = registerWallBlock("rough_concrete_orange_wall", CONCRETE_PROPERTIES.mapColor(DyeColor.ORANGE));
	public static final RegistryObject<ConcretePowderBlock> ROUGH_CONCRETE_ORANGE_POWDER = registerPowderBlock("rough_concrete_orange_powder", ROUGH_CONCRETE_ORANGE, CONCRETE_POWDER_PROPERTIES.mapColor(DyeColor.ORANGE));

	public static final RegistryObject<Block> ROUGH_CONCRETE_PURPLE = registerBlock("rough_concrete_purple", CONCRETE_PROPERTIES.mapColor(DyeColor.PURPLE));
	public static final RegistryObject<StairBlock> ROUGH_CONCRETE_PURPLE_STAIRS = registerStairBlock("rough_concrete_purple_stairs", ROUGH_CONCRETE_PURPLE, CONCRETE_PROPERTIES.mapColor(DyeColor.PURPLE));
	public static final RegistryObject<SlabBlock> ROUGH_CONCRETE_PURPLE_SLAB = registerSlabBlock("rough_concrete_purple_slab", CONCRETE_PROPERTIES.mapColor(DyeColor.PURPLE));
	public static final RegistryObject<WallBlock> ROUGH_CONCRETE_PURPLE_WALL = registerWallBlock("rough_concrete_purple_wall", CONCRETE_PROPERTIES.mapColor(DyeColor.PURPLE));
	public static final RegistryObject<ConcretePowderBlock> ROUGH_CONCRETE_PURPLE_POWDER = registerPowderBlock("rough_concrete_purple_powder", ROUGH_CONCRETE_PURPLE, CONCRETE_POWDER_PROPERTIES.mapColor(DyeColor.PURPLE));

	public static final RegistryObject<Block> ROUGH_CONCRETE_RED = registerBlock("rough_concrete_red", CONCRETE_PROPERTIES.mapColor(DyeColor.RED));
	public static final RegistryObject<StairBlock> ROUGH_CONCRETE_RED_STAIRS = registerStairBlock("rough_concrete_red_stairs", ROUGH_CONCRETE_RED, CONCRETE_PROPERTIES.mapColor(DyeColor.RED));
	public static final RegistryObject<SlabBlock> ROUGH_CONCRETE_RED_SLAB = registerSlabBlock("rough_concrete_red_slab", CONCRETE_PROPERTIES.mapColor(DyeColor.RED));
	public static final RegistryObject<WallBlock> ROUGH_CONCRETE_RED_WALL = registerWallBlock("rough_concrete_red_wall", CONCRETE_PROPERTIES.mapColor(DyeColor.RED));
	public static final RegistryObject<ConcretePowderBlock> ROUGH_CONCRETE_RED_POWDER = registerPowderBlock("rough_concrete_red_powder", ROUGH_CONCRETE_RED, CONCRETE_POWDER_PROPERTIES.mapColor(DyeColor.RED));

	public static final RegistryObject<Block> ROUGH_CONCRETE_YELLOW = registerBlock("rough_concrete_yellow", CONCRETE_PROPERTIES.mapColor(DyeColor.YELLOW));
	public static final RegistryObject<StairBlock> ROUGH_CONCRETE_YELLOW_STAIRS = registerStairBlock("rough_concrete_yellow_stairs", ROUGH_CONCRETE_YELLOW, CONCRETE_PROPERTIES.mapColor(DyeColor.YELLOW));
	public static final RegistryObject<SlabBlock> ROUGH_CONCRETE_YELLOW_SLAB = registerSlabBlock("rough_concrete_yellow_slab", CONCRETE_PROPERTIES.mapColor(DyeColor.YELLOW));
	public static final RegistryObject<WallBlock> ROUGH_CONCRETE_YELLOW_WALL = registerWallBlock("rough_concrete_yellow_wall", CONCRETE_PROPERTIES.mapColor(DyeColor.YELLOW));
	public static final RegistryObject<ConcretePowderBlock> ROUGH_CONCRETE_YELLOW_POWDER = registerPowderBlock("rough_concrete_yellow_powder", ROUGH_CONCRETE_YELLOW, CONCRETE_POWDER_PROPERTIES.mapColor(DyeColor.YELLOW));
	//endregion

	//region Borderless Glass
	public static final RegistryObject<StainedGlassBlock> WHITE_BORDERLESS_GLASS = registerGlassBlock("white_borderless_glass", DyeColor.WHITE);
	public static final RegistryObject<Block> WHITE_BORDERLESS_GLASS_PANE = registerGlassPaneBlock("white", DyeColor.WHITE);

	public static final RegistryObject<StainedGlassBlock> BLUE_BORDERLESS_GLASS = registerGlassBlock("blue_borderless_glass", DyeColor.BLUE);
	public static final RegistryObject<Block> BLUE_BORDERLESS_GLASS_PANE = registerGlassPaneBlock("blue", DyeColor.BLUE);

	public static final RegistryObject<StainedGlassBlock> BROWN_BORDERLESS_GLASS = registerGlassBlock("brown_borderless_glass", DyeColor.BROWN);
	public static final RegistryObject<Block> BROWN_BORDERLESS_GLASS_PANE = registerGlassPaneBlock("brown", DyeColor.BROWN);

	public static final RegistryObject<StainedGlassBlock> CYAN_BORDERLESS_GLASS = registerGlassBlock("cyan_borderless_glass", DyeColor.CYAN);
	public static final RegistryObject<Block> CYAN_BORDERLESS_GLASS_PANE = registerGlassPaneBlock("cyan", DyeColor.CYAN);

	public static final RegistryObject<StainedGlassBlock> GREEN_BORDERLESS_GLASS = registerGlassBlock("green_borderless_glass", DyeColor.GREEN);
	public static final RegistryObject<Block> GREEN_BORDERLESS_GLASS_PANE = registerGlassPaneBlock("green", DyeColor.GREEN);

	public static final RegistryObject<StainedGlassBlock> GRAY_BORDERLESS_GLASS = registerGlassBlock("gray_borderless_glass", DyeColor.GRAY);
	public static final RegistryObject<Block> GRAY_BORDERLESS_GLASS_PANE = registerGlassPaneBlock("gray", DyeColor.GRAY);

	public static final RegistryObject<StainedGlassBlock> LIGHT_BLUE_BORDERLESS_GLASS = registerGlassBlock("light_blue_borderless_glass", DyeColor.LIGHT_BLUE);
	public static final RegistryObject<Block> LIGHT_BLUE_BORDERLESS_GLASS_PANE = registerGlassPaneBlock("light_blue", DyeColor.LIGHT_BLUE);

	public static final RegistryObject<StainedGlassBlock> LIGHT_GRAY_BORDERLESS_GLASS = registerGlassBlock("light_gray_borderless_glass", DyeColor.LIGHT_GRAY);
	public static final RegistryObject<Block> LIGHT_GRAY_BORDERLESS_GLASS_PANE = registerGlassPaneBlock("light_gray", DyeColor.LIGHT_GRAY);

	public static final RegistryObject<StainedGlassBlock> LIME_BORDERLESS_GLASS = registerGlassBlock("lime_borderless_glass", DyeColor.LIME);
	public static final RegistryObject<Block> LIME_BORDERLESS_GLASS_PANE = registerGlassPaneBlock("lime", DyeColor.LIME);

	public static final RegistryObject<StainedGlassBlock> MAGENTA_BORDERLESS_GLASS = registerGlassBlock("magenta_borderless_glass", DyeColor.MAGENTA);
	public static final RegistryObject<Block> MAGENTA_BORDERLESS_GLASS_PANE = registerGlassPaneBlock("magenta", DyeColor.MAGENTA);

	public static final RegistryObject<StainedGlassBlock> ORANGE_BORDERLESS_GLASS = registerGlassBlock("orange_borderless_glass", DyeColor.ORANGE);
	public static final RegistryObject<Block> ORANGE_BORDERLESS_GLASS_PANE = registerGlassPaneBlock("orange", DyeColor.ORANGE);

	public static final RegistryObject<StainedGlassBlock> PINK_BORDERLESS_GLASS = registerGlassBlock("pink_borderless_glass", DyeColor.PINK);
	public static final RegistryObject<Block> PINK_BORDERLESS_GLASS_PANE = registerGlassPaneBlock("pink", DyeColor.PINK);

	public static final RegistryObject<StainedGlassBlock> PURPLE_BORDERLESS_GLASS = registerGlassBlock("purple_borderless_glass", DyeColor.PURPLE);
	public static final RegistryObject<Block> PURPLE_BORDERLESS_GLASS_PANE = registerGlassPaneBlock("purple", DyeColor.PURPLE);

	public static final RegistryObject<StainedGlassBlock> RED_BORDERLESS_GLASS = registerGlassBlock("red_borderless_glass", DyeColor.RED);
	public static final RegistryObject<Block> RED_BORDERLESS_GLASS_PANE = registerGlassPaneBlock("red", DyeColor.RED);

	public static final RegistryObject<StainedGlassBlock> YELLOW_BORDERLESS_GLASS = registerGlassBlock("yellow_borderless_glass", DyeColor.YELLOW);
	public static final RegistryObject<Block> YELLOW_BORDERLESS_GLASS_PANE = registerGlassPaneBlock("yellow", DyeColor.YELLOW);

	public static final RegistryObject<StainedGlassBlock> BLACK_BORDERLESS_GLASS = registerGlassBlock("black_borderless_glass", DyeColor.BLACK);
	public static final RegistryObject<Block> BLACK_BORDERLESS_GLASS_PANE = registerGlassPaneBlock("black", DyeColor.BLACK);
	//endregion

	public static final RegistryObject<Block> SMOOTH_DEEPSLATE = registerBlock("smooth_deepslate", DEEPSLATE_PROPERTIES);
	public static final RegistryObject<StairBlock> SMOOTH_DEEPSLATE_STAIRS = registerStairBlock("smooth_deepslate_stairs", SMOOTH_DEEPSLATE, DEEPSLATE_PROPERTIES);
	public static final RegistryObject<SlabBlock> SMOOTH_DEEPSLATE_SLAB = registerSlabBlock("smooth_deepslate_slab", DEEPSLATE_PROPERTIES);
	public static final RegistryObject<WallBlock> SMOOTH_DEEPSLATE_WALL = registerWallBlock("smooth_deepslate_wall", DEEPSLATE_PROPERTIES);

	//region Slate
	public static final RegistryObject<Block> SLATE = registerBlock("slate", STONE_PROPERTIES.mapColor(DyeColor.BLACK));
	public static final RegistryObject<StairBlock> SLATE_STAIRS = registerStairBlock("slate_stairs", SLATE, SLATE_PROPERTIES);
	public static final RegistryObject<SlabBlock> SLATE_SLAB = registerSlabBlock("slate_slab", SLATE_PROPERTIES);
	public static final RegistryObject<WallBlock> SLATE_WALL = registerWallBlock("slate_wall", SLATE_PROPERTIES);
	public static final RegistryObject<Block> SLATE_PILLAR = registerRotatableBlock("slate_pillar", SLATE_PROPERTIES);
	public static final RegistryObject<Block> SLATE_BRICKS = registerBlock("slate_bricks", SLATE_PROPERTIES);
	public static final RegistryObject<StairBlock> SLATE_BRICK_STAIRS = registerStairBlock("slate_brick_stairs", SLATE, SLATE_PROPERTIES);
	public static final RegistryObject<SlabBlock> SLATE_BRICK_SLAB = registerSlabBlock("slate_brick_slab", SLATE_PROPERTIES);
	public static final RegistryObject<WallBlock> SLATE_BRICK_WALL = registerWallBlock("slate_brick_wall", SLATE_PROPERTIES);
	//endregion

	public static RegistryObject<Block> registerRotatableBlock(final String name, Block.Properties properties) {
		return registerBlock(name, () -> new RotatedPillarBlock(properties));
	}

	public static RegistryObject<Block> registerBlock(final String name, Block.Properties properties) {
		return registerBlock(name, () -> new Block(properties));
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
		return registerBlock(name + "_borderless_glass_pane", () -> new StainedGlassPaneBlock(color, GLASS_PANE_PROPERTIES));
	}

	private static <BLOCK extends Block> RegistryObject<BLOCK> registerBlock(final String name, final Supplier<BLOCK> blockFactory) {
		final RegistryObject<BLOCK> block = BLOCKS.register(name, blockFactory);
		ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
		return block;
	}
}
