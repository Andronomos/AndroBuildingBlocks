package andronomos.androbuildingblocks.registry;

import andronomos.androbuildingblocks.AndroBuildingBlocks;
import andronomos.androbuildingblocks.block.BuildingBlock;
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
	public static Block.Properties DEEPSLATE_PROPERTIES = BlockBehaviour.Properties.copy(Blocks.COBBLED_DEEPSLATE);
	public static Block.Properties STONE_PROPERTIES = BlockBehaviour.Properties.copy(Blocks.STONE);
	public static Block.Properties SLATE_PROPERTIES = BlockBehaviour.Properties.copy(Blocks.STONE).mapColor(DyeColor.BLACK);
	public static Block.Properties GLASS_PROPERTIES = BlockBehaviour.Properties.copy(Blocks.GLASS).strength(0.75f);
	public static Block.Properties GLASS_PANE_PROPERTIES = BlockBehaviour.Properties.copy(Blocks.GLASS_PANE);
	public static Block.Properties METAL_PROPERTIES = BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK);

	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, AndroBuildingBlocks.MODID);

	//region Reinforced Concrete
	public static final RegistryObject<Block> WHITE_REINFORCED_CONCRETE = registerBlock("white_reinforced_concrete", CONCRETE_PROPERTIES.mapColor(DyeColor.WHITE));
	public static final RegistryObject<StairBlock> WHITE_REINFORCED_CONCRETE_STAIRS = registerStairBlock("white_reinforced_concrete_stairs", WHITE_REINFORCED_CONCRETE, CONCRETE_PROPERTIES.mapColor(DyeColor.WHITE));
	public static final RegistryObject<SlabBlock> WHITE_REINFORCED_CONCRETE_SLAB = registerSlabBlock("white_reinforced_concrete_slab", CONCRETE_PROPERTIES.mapColor(DyeColor.WHITE));
	public static final RegistryObject<WallBlock> WHITE_REINFORCED_CONCRETE_WALL = registerWallBlock("white_reinforced_concrete_wall", CONCRETE_PROPERTIES.mapColor(DyeColor.WHITE));
	public static final RegistryObject<Block> WHITE_REINFORCED_CONCRETE_GRATE = registerRotatableBlock("white_reinforced_concrete_grate", CONCRETE_PROPERTIES.mapColor(DyeColor.WHITE));
	public static final RegistryObject<Block> WHITE_REINFORCED_CONCRETE_TILE = registerBlock("white_reinforced_concrete_tile", CONCRETE_PROPERTIES.mapColor(DyeColor.WHITE));
	public static final RegistryObject<Block> WHITE_REINFORCED_CONCRETE_PILLAR = registerRotatableBlock("white_reinforced_concrete_pillar", CONCRETE_PROPERTIES.mapColor(DyeColor.WHITE));

	public static final RegistryObject<Block> BLUE_REINFORCED_CONCRETE = registerBlock("blue_reinforced_concrete", CONCRETE_PROPERTIES.mapColor(DyeColor.BLUE));
	public static final RegistryObject<StairBlock> BLUE_REINFORCED_CONCRETE_STAIRS = registerStairBlock("blue_reinforced_concrete_stairs", BLUE_REINFORCED_CONCRETE, CONCRETE_PROPERTIES.mapColor(DyeColor.BLUE));
	public static final RegistryObject<SlabBlock> BLUE_REINFORCED_CONCRETE_SLAB = registerSlabBlock("blue_reinforced_concrete_slab", CONCRETE_PROPERTIES.mapColor(DyeColor.BLUE));
	public static final RegistryObject<WallBlock> BLUE_REINFORCED_CONCRETE_WALL = registerWallBlock("blue_reinforced_concrete_wall", CONCRETE_PROPERTIES.mapColor(DyeColor.BLUE));
	public static final RegistryObject<Block> BLUE_REINFORCED_CONCRETE_GRATE = registerRotatableBlock("blue_reinforced_concrete_grate", CONCRETE_PROPERTIES.mapColor(DyeColor.BLUE));
	public static final RegistryObject<Block> BLUE_REINFORCED_CONCRETE_TILE = registerBlock("blue_reinforced_concrete_tile", CONCRETE_PROPERTIES.mapColor(DyeColor.BLUE));
	public static final RegistryObject<Block> BLUE_REINFORCED_CONCRETE_PILLAR = registerRotatableBlock("blue_reinforced_concrete_pillar", CONCRETE_PROPERTIES.mapColor(DyeColor.BLUE));

	public static final RegistryObject<Block> BLACK_REINFORCED_CONCRETE = registerBlock("black_reinforced_concrete", CONCRETE_PROPERTIES.mapColor(DyeColor.BLACK));
	public static final RegistryObject<StairBlock> BLACK_REINFORCED_CONCRETE_STAIRS = registerStairBlock("black_reinforced_concrete_stairs", BLACK_REINFORCED_CONCRETE, CONCRETE_PROPERTIES.mapColor(DyeColor.BLACK));
	public static final RegistryObject<SlabBlock> BLACK_REINFORCED_CONCRETE_SLAB = registerSlabBlock("black_reinforced_concrete_slab", CONCRETE_PROPERTIES.mapColor(DyeColor.BLACK));
	public static final RegistryObject<WallBlock> BLACK_REINFORCED_CONCRETE_WALL = registerWallBlock("black_reinforced_concrete_wall", CONCRETE_PROPERTIES.mapColor(DyeColor.BLACK));
	public static final RegistryObject<Block> BLACK_REINFORCED_CONCRETE_GRATE = registerRotatableBlock("black_reinforced_concrete_grate", CONCRETE_PROPERTIES.mapColor(DyeColor.BLACK));
	public static final RegistryObject<Block> BLACK_REINFORCED_CONCRETE_TILE = registerBlock("black_reinforced_concrete_tile", CONCRETE_PROPERTIES.mapColor(DyeColor.BLACK));
	public static final RegistryObject<Block> BLACK_REINFORCED_CONCRETE_PILLAR = registerRotatableBlock("black_reinforced_concrete_pillar", CONCRETE_PROPERTIES.mapColor(DyeColor.BLACK));

	public static final RegistryObject<Block> BROWN_REINFORCED_CONCRETE = registerBlock("brown_reinforced_concrete", CONCRETE_PROPERTIES.mapColor(DyeColor.BROWN));
	public static final RegistryObject<StairBlock> BROWN_REINFORCED_CONCRETE_STAIRS = registerStairBlock("brown_reinforced_concrete_stairs", BROWN_REINFORCED_CONCRETE, CONCRETE_PROPERTIES.mapColor(DyeColor.BROWN));
	public static final RegistryObject<SlabBlock> BROWN_REINFORCED_CONCRETE_SLAB = registerSlabBlock("brown_reinforced_concrete_slab", CONCRETE_PROPERTIES.mapColor(DyeColor.BROWN));
	public static final RegistryObject<WallBlock> BROWN_REINFORCED_CONCRETE_WALL = registerWallBlock("brown_reinforced_concrete_wall", CONCRETE_PROPERTIES.mapColor(DyeColor.BROWN));
	public static final RegistryObject<Block> BROWN_REINFORCED_CONCRETE_GRATE = registerRotatableBlock("brown_reinforced_concrete_grate", CONCRETE_PROPERTIES.mapColor(DyeColor.BROWN));
	public static final RegistryObject<Block> BROWN_REINFORCED_CONCRETE_TILE = registerBlock("brown_reinforced_concrete_tile", CONCRETE_PROPERTIES.mapColor(DyeColor.BROWN));
	public static final RegistryObject<Block> BROWN_REINFORCED_CONCRETE_PILLAR = registerRotatableBlock("brown_reinforced_concrete_pillar", CONCRETE_PROPERTIES.mapColor(DyeColor.BROWN));

	public static final RegistryObject<Block> GREEN_REINFORCED_CONCRETE = registerBlock("green_reinforced_concrete", CONCRETE_PROPERTIES.mapColor(DyeColor.GREEN));
	public static final RegistryObject<StairBlock> GREEN_REINFORCED_CONCRETE_STAIRS = registerStairBlock("green_reinforced_concrete_stairs", GREEN_REINFORCED_CONCRETE, CONCRETE_PROPERTIES.mapColor(DyeColor.GREEN));
	public static final RegistryObject<SlabBlock> GREEN_REINFORCED_CONCRETE_SLAB = registerSlabBlock("green_reinforced_concrete_slab", CONCRETE_PROPERTIES.mapColor(DyeColor.GREEN));
	public static final RegistryObject<WallBlock> GREEN_REINFORCED_CONCRETE_WALL = registerWallBlock("green_reinforced_concrete_wall", CONCRETE_PROPERTIES.mapColor(DyeColor.GREEN));
	public static final RegistryObject<Block> GREEN_REINFORCED_CONCRETE_GRATE = registerRotatableBlock("green_reinforced_concrete_grate", CONCRETE_PROPERTIES.mapColor(DyeColor.GREEN));
	public static final RegistryObject<Block> GREEN_REINFORCED_CONCRETE_TILE = registerBlock("green_reinforced_concrete_tile", CONCRETE_PROPERTIES.mapColor(DyeColor.GREEN));
	public static final RegistryObject<Block> GREEN_REINFORCED_CONCRETE_PILLAR = registerRotatableBlock("green_reinforced_concrete_pillar", CONCRETE_PROPERTIES.mapColor(DyeColor.GREEN));

	public static final RegistryObject<Block> GRAY_REINFORCED_CONCRETE = registerBlock("gray_reinforced_concrete", CONCRETE_PROPERTIES.mapColor(DyeColor.GRAY));
	public static final RegistryObject<StairBlock> GRAY_REINFORCED_CONCRETE_STAIRS = registerStairBlock("gray_reinforced_concrete_stairs", GRAY_REINFORCED_CONCRETE, CONCRETE_PROPERTIES.mapColor(DyeColor.GRAY));
	public static final RegistryObject<SlabBlock> GRAY_REINFORCED_CONCRETE_SLAB = registerSlabBlock("gray_reinforced_concrete_slab", CONCRETE_PROPERTIES.mapColor(DyeColor.GRAY));
	public static final RegistryObject<WallBlock> GRAY_REINFORCED_CONCRETE_WALL = registerWallBlock("gray_reinforced_concrete_wall", CONCRETE_PROPERTIES.mapColor(DyeColor.GRAY));
	public static final RegistryObject<Block> GRAY_REINFORCED_CONCRETE_GRATE = registerRotatableBlock("gray_reinforced_concrete_grate", CONCRETE_PROPERTIES.mapColor(DyeColor.GRAY));
	public static final RegistryObject<Block> GRAY_REINFORCED_CONCRETE_TILE = registerBlock("gray_reinforced_concrete_tile", CONCRETE_PROPERTIES.mapColor(DyeColor.GRAY));
	public static final RegistryObject<Block> GRAY_REINFORCED_CONCRETE_PILLAR = registerRotatableBlock("gray_reinforced_concrete_pillar", CONCRETE_PROPERTIES.mapColor(DyeColor.GRAY));

	public static final RegistryObject<Block> ORANGE_REINFORCED_CONCRETE = registerBlock("orange_reinforced_concrete", CONCRETE_PROPERTIES.mapColor(DyeColor.ORANGE));
	public static final RegistryObject<StairBlock> ORANGE_REINFORCED_CONCRETE_STAIRS = registerStairBlock("orange_reinforced_concrete_stairs", ORANGE_REINFORCED_CONCRETE, CONCRETE_PROPERTIES.mapColor(DyeColor.ORANGE));
	public static final RegistryObject<SlabBlock> ORANGE_REINFORCED_CONCRETE_SLAB = registerSlabBlock("orange_reinforced_concrete_slab", CONCRETE_PROPERTIES.mapColor(DyeColor.ORANGE));
	public static final RegistryObject<WallBlock> ORANGE_REINFORCED_CONCRETE_WALL = registerWallBlock("orange_reinforced_concrete_wall", CONCRETE_PROPERTIES.mapColor(DyeColor.ORANGE));
	public static final RegistryObject<Block> ORANGE_REINFORCED_CONCRETE_GRATE = registerRotatableBlock("orange_reinforced_concrete_grate", CONCRETE_PROPERTIES.mapColor(DyeColor.ORANGE));
	public static final RegistryObject<Block> ORANGE_REINFORCED_CONCRETE_TILE = registerBlock("orange_reinforced_concrete_tile", CONCRETE_PROPERTIES.mapColor(DyeColor.ORANGE));
	public static final RegistryObject<Block> ORANGE_REINFORCED_CONCRETE_PILLAR = registerRotatableBlock("orange_reinforced_concrete_pillar", CONCRETE_PROPERTIES.mapColor(DyeColor.ORANGE));

	public static final RegistryObject<Block> PURPLE_REINFORCED_CONCRETE = registerBlock("purple_reinforced_concrete", CONCRETE_PROPERTIES.mapColor(DyeColor.PURPLE));
	public static final RegistryObject<StairBlock> PURPLE_REINFORCED_CONCRETE_STAIRS = registerStairBlock("purple_reinforced_concrete_stairs", PURPLE_REINFORCED_CONCRETE, CONCRETE_PROPERTIES.mapColor(DyeColor.PURPLE));
	public static final RegistryObject<SlabBlock> PURPLE_REINFORCED_CONCRETE_SLAB = registerSlabBlock("purple_reinforced_concrete_slab", CONCRETE_PROPERTIES.mapColor(DyeColor.PURPLE));
	public static final RegistryObject<WallBlock> PURPLE_REINFORCED_CONCRETE_WALL = registerWallBlock("purple_reinforced_concrete_wall", CONCRETE_PROPERTIES.mapColor(DyeColor.PURPLE));
	public static final RegistryObject<Block> PURPLE_REINFORCED_CONCRETE_GRATE = registerRotatableBlock("purple_reinforced_concrete_grate", CONCRETE_PROPERTIES.mapColor(DyeColor.PURPLE));
	public static final RegistryObject<Block> PURPLE_REINFORCED_CONCRETE_TILE = registerBlock("purple_reinforced_concrete_tile", CONCRETE_PROPERTIES.mapColor(DyeColor.PURPLE));
	public static final RegistryObject<Block> PURPLE_REINFORCED_CONCRETE_PILLAR = registerRotatableBlock("purple_reinforced_concrete_pillar", CONCRETE_PROPERTIES.mapColor(DyeColor.PURPLE));

	public static final RegistryObject<Block> RED_REINFORCED_CONCRETE = registerBlock("red_reinforced_concrete", CONCRETE_PROPERTIES.mapColor(DyeColor.RED));
	public static final RegistryObject<StairBlock> RED_REINFORCED_CONCRETE_STAIRS = registerStairBlock("red_reinforced_concrete_stairs", RED_REINFORCED_CONCRETE, CONCRETE_PROPERTIES.mapColor(DyeColor.RED));
	public static final RegistryObject<SlabBlock> RED_REINFORCED_CONCRETE_SLAB = registerSlabBlock("red_reinforced_concrete_slab", CONCRETE_PROPERTIES.mapColor(DyeColor.RED));
	public static final RegistryObject<WallBlock> RED_REINFORCED_CONCRETE_WALL = registerWallBlock("red_reinforced_concrete_wall", CONCRETE_PROPERTIES.mapColor(DyeColor.RED));
	public static final RegistryObject<Block> RED_REINFORCED_CONCRETE_GRATE = registerRotatableBlock("red_reinforced_concrete_grate", CONCRETE_PROPERTIES.mapColor(DyeColor.RED));
	public static final RegistryObject<Block> RED_REINFORCED_CONCRETE_TILE = registerBlock("red_reinforced_concrete_tile", CONCRETE_PROPERTIES.mapColor(DyeColor.RED));
	public static final RegistryObject<Block> RED_REINFORCED_CONCRETE_PILLAR = registerRotatableBlock("red_reinforced_concrete_pillar", CONCRETE_PROPERTIES.mapColor(DyeColor.RED));

	public static final RegistryObject<Block> YELLOW_REINFORCED_CONCRETE = registerBlock("yellow_reinforced_concrete", CONCRETE_PROPERTIES.mapColor(DyeColor.YELLOW));
	public static final RegistryObject<StairBlock> YELLOW_REINFORCED_CONCRETE_STAIRS = registerStairBlock("yellow_reinforced_concrete_stairs", YELLOW_REINFORCED_CONCRETE, CONCRETE_PROPERTIES.mapColor(DyeColor.YELLOW));
	public static final RegistryObject<SlabBlock> YELLOW_REINFORCED_CONCRETE_SLAB = registerSlabBlock("yellow_reinforced_concrete_slab", CONCRETE_PROPERTIES.mapColor(DyeColor.YELLOW));
	public static final RegistryObject<WallBlock> YELLOW_REINFORCED_CONCRETE_WALL = registerWallBlock("yellow_reinforced_concrete_wall", CONCRETE_PROPERTIES.mapColor(DyeColor.YELLOW));
	public static final RegistryObject<Block> YELLOW_REINFORCED_CONCRETE_GRATE = registerRotatableBlock("yellow_reinforced_concrete_grate", CONCRETE_PROPERTIES.mapColor(DyeColor.YELLOW));
	public static final RegistryObject<Block> YELLOW_REINFORCED_CONCRETE_TILE = registerBlock("yellow_reinforced_concrete_tile", CONCRETE_PROPERTIES.mapColor(DyeColor.YELLOW));
	public static final RegistryObject<Block> YELLOW_REINFORCED_CONCRETE_PILLAR = registerRotatableBlock("yellow_reinforced_concrete_pillar", CONCRETE_PROPERTIES.mapColor(DyeColor.YELLOW));

	public static final RegistryObject<Block> PINK_REINFORCED_CONCRETE = registerBlock("pink_reinforced_concrete", CONCRETE_PROPERTIES.mapColor(DyeColor.PINK));
	public static final RegistryObject<StairBlock> PINK_REINFORCED_CONCRETE_STAIRS = registerStairBlock("pink_reinforced_concrete_stairs", PINK_REINFORCED_CONCRETE, CONCRETE_PROPERTIES.mapColor(DyeColor.PINK));
	public static final RegistryObject<SlabBlock> PINK_REINFORCED_CONCRETE_SLAB = registerSlabBlock("pink_reinforced_concrete_slab", CONCRETE_PROPERTIES.mapColor(DyeColor.PINK));
	public static final RegistryObject<WallBlock> PINK_REINFORCED_CONCRETE_WALL = registerWallBlock("pink_reinforced_concrete_wall", CONCRETE_PROPERTIES.mapColor(DyeColor.PINK));
	public static final RegistryObject<Block> PINK_REINFORCED_CONCRETE_GRATE = registerRotatableBlock("pink_reinforced_concrete_grate", CONCRETE_PROPERTIES.mapColor(DyeColor.PINK));
	public static final RegistryObject<Block> PINK_REINFORCED_CONCRETE_TILE = registerBlock("pink_reinforced_concrete_tile", CONCRETE_PROPERTIES.mapColor(DyeColor.PINK));
	public static final RegistryObject<Block> PINK_REINFORCED_CONCRETE_PILLAR = registerRotatableBlock("pink_reinforced_concrete_pillar", CONCRETE_PROPERTIES.mapColor(DyeColor.PINK));

	//endregion

	//region Structural Glass
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

	//region Caution
	public static final RegistryObject<Block> YELLOW_CAUTION_STRIPES = registerBlock("yellow_caution_stripes", STONE_PROPERTIES.mapColor(DyeColor.YELLOW));
	public static final RegistryObject<Block> RED_CAUTION_STRIPES = registerBlock("red_caution_stripes", STONE_PROPERTIES.mapColor(DyeColor.YELLOW));
	//endregion

	//region Steel
	public static final RegistryObject<Block> STEEL = registerBlock("steel", METAL_PROPERTIES);
	public static final RegistryObject<StairBlock> STEEL_STAIRS = registerStairBlock("steel_stairs", STEEL, METAL_PROPERTIES);
	public static final RegistryObject<SlabBlock> STEEL_SLAB = registerSlabBlock("steel_slab", METAL_PROPERTIES);
	public static final RegistryObject<WallBlock> STEEL_WALL = registerWallBlock("steel_wall", METAL_PROPERTIES);
	public static final RegistryObject<Block> STEEL_MESH = registerBlock("steel_mesh", METAL_PROPERTIES);
	//endregion


	public static final RegistryObject<Block> CARBON = registerBlock("carbon", METAL_PROPERTIES);
	public static final RegistryObject<Block> CARBON_GRATE = registerRotatableBlock("carbon_grate", METAL_PROPERTIES);
	public static final RegistryObject<Block> CARBON_MESH = registerBlock("carbon_mesh", METAL_PROPERTIES);








	public static RegistryObject<Block> registerRotatableBlock(final String name, Block.Properties properties) {
		return registerBlock(name, () -> new RotatedPillarBlock(properties));
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

	private static RegistryObject<Block> registerStainedGlassPaneBlock(final String name, DyeColor color) {
		return registerBlock(name + "_structural_glass_pane", () -> new StainedGlassPaneBlock(color, GLASS_PANE_PROPERTIES));
	}

	public static RegistryObject<Block> registerBlock(final String name, Block.Properties properties) {
		return registerBlock(name, () -> new BuildingBlock(properties, false));
	}

	public static RegistryObject<Block> registerBlock(final String name, Block.Properties properties, boolean isTranslucent) {
		return registerBlock(name, () -> new BuildingBlock(properties, isTranslucent));
	}

	private static <BLOCK extends Block> RegistryObject<BLOCK> registerBlock(final String name, final Supplier<BLOCK> blockFactory) {
		final RegistryObject<BLOCK> block = BLOCKS.register(name, blockFactory);
		ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
		return block;
	}
}
