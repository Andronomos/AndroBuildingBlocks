package andronomos.androbuildingblocks.registry;

import andronomos.androbuildingblocks.AndroBuildingBlocks;
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
	public static Block.Properties GLASS_PROPERTIES = BlockBehaviour.Properties.copy(Blocks.GLASS).strength(0.75f);
	public static Block.Properties GLASS_PANE_PROPERTIES = BlockBehaviour.Properties.copy(Blocks.GLASS_PANE);

	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, AndroBuildingBlocks.MODID);

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
	public static final RegistryObject<StainedGlassBlock> STRUCTURAL_GLASS = registerGlassBlock("structural_glass", DyeColor.WHITE);
	public static final RegistryObject<Block> STRUCTURAL_GLASS_PANE = registerGlassPaneBlock("structural_glass_pane");

	public static final RegistryObject<StainedGlassBlock> WHITE_STRUCTURAL_GLASS = registerGlassBlock("white_structural_glass", DyeColor.WHITE);
	public static final RegistryObject<Block> WHITE_STRUCTURAL_GLASS_PANE = registerStainedGlassPaneBlock("white", DyeColor.WHITE);

	public static final RegistryObject<StainedGlassBlock> BLUE_STRUCTURAL_GLASS = registerGlassBlock("blue_structural_glass", DyeColor.BLUE);
	public static final RegistryObject<Block> BLUE_STRUCTURAL_GLASS_PANE = registerStainedGlassPaneBlock("blue", DyeColor.BLUE);

	public static final RegistryObject<StainedGlassBlock> BROWN_STRUCTURAL_GLASS = registerGlassBlock("brown_structural_glass", DyeColor.BROWN);
	public static final RegistryObject<Block> BROWN_STRUCTURAL_GLASS_PANE = registerStainedGlassPaneBlock("brown", DyeColor.BROWN);

	public static final RegistryObject<StainedGlassBlock> CYAN_STRUCTURAL_GLASS = registerGlassBlock("cyan_structural_glass", DyeColor.CYAN);
	public static final RegistryObject<Block> CYAN_STRUCTURAL_GLASS_PANE = registerStainedGlassPaneBlock("cyan", DyeColor.CYAN);

	public static final RegistryObject<StainedGlassBlock> GREEN_STRUCTURAL_GLASS = registerGlassBlock("green_structural_glass", DyeColor.GREEN);
	public static final RegistryObject<Block> GREEN_STRUCTURAL_GLASS_PANE = registerStainedGlassPaneBlock("green", DyeColor.GREEN);

	public static final RegistryObject<StainedGlassBlock> GRAY_STRUCTURAL_GLASS = registerGlassBlock("gray_structural_glass", DyeColor.GRAY);
	public static final RegistryObject<Block> GRAY_STRUCTURAL_GLASS_PANE = registerStainedGlassPaneBlock("gray", DyeColor.GRAY);

	public static final RegistryObject<StainedGlassBlock> LIGHT_BLUE_STRUCTURAL_GLASS = registerGlassBlock("light_blue_structural_glass", DyeColor.LIGHT_BLUE);
	public static final RegistryObject<Block> LIGHT_BLUE_STRUCTURAL_GLASS_PANE = registerStainedGlassPaneBlock("light_blue", DyeColor.LIGHT_BLUE);

	public static final RegistryObject<StainedGlassBlock> LIGHT_GRAY_STRUCTURAL_GLASS = registerGlassBlock("light_gray_structural_glass", DyeColor.LIGHT_GRAY);
	public static final RegistryObject<Block> LIGHT_GRAY_STRUCTURAL_GLASS_PANE = registerStainedGlassPaneBlock("light_gray", DyeColor.LIGHT_GRAY);

	public static final RegistryObject<StainedGlassBlock> LIME_STRUCTURAL_GLASS = registerGlassBlock("lime_structural_glass", DyeColor.LIME);
	public static final RegistryObject<Block> LIME_STRUCTURAL_GLASS_PANE = registerStainedGlassPaneBlock("lime", DyeColor.LIME);

	public static final RegistryObject<StainedGlassBlock> MAGENTA_STRUCTURAL_GLASS = registerGlassBlock("magenta_structural_glass", DyeColor.MAGENTA);
	public static final RegistryObject<Block> MAGENTA_STRUCTURAL_GLASS_PANE = registerStainedGlassPaneBlock("magenta", DyeColor.MAGENTA);

	public static final RegistryObject<StainedGlassBlock> ORANGE_STRUCTURAL_GLASS = registerGlassBlock("orange_structural_glass", DyeColor.ORANGE);
	public static final RegistryObject<Block> ORANGE_STRUCTURAL_GLASS_PANE = registerStainedGlassPaneBlock("orange", DyeColor.ORANGE);

	public static final RegistryObject<StainedGlassBlock> PINK_STRUCTURAL_GLASS = registerGlassBlock("pink_structural_glass", DyeColor.PINK);
	public static final RegistryObject<Block> PINK_STRUCTURAL_GLASS_PANE = registerStainedGlassPaneBlock("pink", DyeColor.PINK);

	public static final RegistryObject<StainedGlassBlock> PURPLE_STRUCTURAL_GLASS = registerGlassBlock("purple_structural_glass", DyeColor.PURPLE);
	public static final RegistryObject<Block> PURPLE_STRUCTURAL_GLASS_PANE = registerStainedGlassPaneBlock("purple", DyeColor.PURPLE);

	public static final RegistryObject<StainedGlassBlock> RED_STRUCTURAL_GLASS = registerGlassBlock("red_structural_glass", DyeColor.RED);
	public static final RegistryObject<Block> RED_STRUCTURAL_GLASS_PANE = registerStainedGlassPaneBlock("red", DyeColor.RED);

	public static final RegistryObject<StainedGlassBlock> YELLOW_STRUCTURAL_GLASS = registerGlassBlock("yellow_structural_glass", DyeColor.YELLOW);
	public static final RegistryObject<Block> YELLOW_STRUCTURAL_GLASS_PANE = registerStainedGlassPaneBlock("yellow", DyeColor.YELLOW);

	public static final RegistryObject<StainedGlassBlock> BLACK_STRUCTURAL_GLASS = registerGlassBlock("black_structural_glass", DyeColor.BLACK);
	public static final RegistryObject<Block> BLACK_STRUCTURAL_GLASS_PANE = registerStainedGlassPaneBlock("black", DyeColor.BLACK);
	//endregion

	//region Smooth Deepslate
	public static final RegistryObject<Block> SMOOTH_DEEPSLATE = registerBlock("smooth_deepslate", DEEPSLATE_PROPERTIES);
	public static final RegistryObject<StairBlock> SMOOTH_DEEPSLATE_STAIRS = registerStairBlock("smooth_deepslate_stairs", SMOOTH_DEEPSLATE, DEEPSLATE_PROPERTIES);
	public static final RegistryObject<SlabBlock> SMOOTH_DEEPSLATE_SLAB = registerSlabBlock("smooth_deepslate_slab", DEEPSLATE_PROPERTIES);
	public static final RegistryObject<WallBlock> SMOOTH_DEEPSLATE_WALL = registerWallBlock("smooth_deepslate_wall", DEEPSLATE_PROPERTIES);
	//endregion

	//region Bentonite
	public static final RegistryObject<Block> BENTONITE = registerBlock("bentonite", STONE_PROPERTIES.mapColor(DyeColor.BLACK));
	public static final RegistryObject<StairBlock> BENTONITE_STAIRS = registerStairBlock("bentonite_stairs", BENTONITE, SLATE_PROPERTIES);
	public static final RegistryObject<SlabBlock> BENTONITE_SLAB = registerSlabBlock("bentonite_slab", SLATE_PROPERTIES);
	public static final RegistryObject<WallBlock> BENTONITE_WALL = registerWallBlock("bentonite_wall", SLATE_PROPERTIES);
	public static final RegistryObject<Block> BENTONITE_PILLAR = registerRotatableBlock("bentonite_pillar", SLATE_PROPERTIES);

	public static final RegistryObject<Block> BENTONITE_BRICKS = registerBlock("bentonite_bricks", SLATE_PROPERTIES);
	public static final RegistryObject<StairBlock> BENTONITE_BRICK_STAIRS = registerStairBlock("bentonite_brick_stairs", BENTONITE, SLATE_PROPERTIES);
	public static final RegistryObject<SlabBlock> BENTONITE_BRICK_SLAB = registerSlabBlock("bentonite_brick_slab", SLATE_PROPERTIES);
	public static final RegistryObject<WallBlock> BENTONITE_BRICK_WALL = registerWallBlock("bentonite_brick_wall", SLATE_PROPERTIES);
	public static final RegistryObject<Block> BENTONITE_GRATE = registerBlock("bentonite_grate", SLATE_PROPERTIES);
	//endregion

	//region Caution
	public static final RegistryObject<Block> HAZARD_STRIPES = registerBlock("hazard_stripes", STONE_PROPERTIES.mapColor(DyeColor.YELLOW));
	//endregion
	

	public static RegistryObject<Block> registerRotatableBlock(final String name, Block.Properties properties) {
		return registerBlock(name, () -> new RotatedPillarBlock(properties));
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

	private static RegistryObject<Block> registerGlassPaneBlock(final String name) {
		return registerBlock(name, () -> new IronBarsBlock(GLASS_PANE_PROPERTIES));
	}

	private static RegistryObject<Block> registerStainedGlassPaneBlock(final String name, DyeColor color) {
		return registerBlock(name + "_structural_glass_pane", () -> new StainedGlassPaneBlock(color, GLASS_PANE_PROPERTIES));
	}

	public static RegistryObject<Block> registerBlock(final String name, Block.Properties properties) {
		return registerBlock(name, () -> new Block(properties));
	}

	private static <BLOCK extends Block> RegistryObject<BLOCK> registerBlock(final String name, final Supplier<BLOCK> blockFactory) {
		final RegistryObject<BLOCK> block = BLOCKS.register(name, blockFactory);
		ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
		return block;
	}
}
