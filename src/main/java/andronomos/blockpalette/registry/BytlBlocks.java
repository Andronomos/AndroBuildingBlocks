package andronomos.blockpalette.registry;

import andronomos.blockpalette.BlockPalette;
import net.minecraft.world.level.block.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import static andronomos.blockpalette.registry.ModBlocks.*;

public class BytlBlocks {
	private static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, BlockPalette.MODID);

	public static final RegistryObject<Block> BYTL = registerBlock("bytl", () -> new Block(PROPERTIES));
	public static final RegistryObject<StairBlock> BYTL_STAIRS = registerStairBlock("bytl_stairs", BYTL);
	public static final RegistryObject<SlabBlock> BYTL_SLAB = registerSlabBlock("bytl_slab");
	public static final RegistryObject<WallBlock> BYTL_WALL = registerWallBlock("bytl_wall");
	public static final RegistryObject<FenceBlock> BYTL_FENCE = registerFenceBlock("bytl_fence");

	public static final RegistryObject<Block> BYTL_LIGHT_GRAY = registerBlock("bytl_light_gray", () -> new Block(PROPERTIES));
	public static final RegistryObject<StairBlock> BYTL_LIGHT_GRAY_STAIRS = registerStairBlock("bytl_light_gray_stairs", BYTL_LIGHT_GRAY);
	public static final RegistryObject<SlabBlock> BYTL_LIGHT_GRAY_SLAB = registerSlabBlock("bytl_light_gray_slab");
	public static final RegistryObject<WallBlock> BYTL_LIGHT_GRAY_WALL = registerWallBlock("bytl_light_gray_wall");
	public static final RegistryObject<FenceBlock> BYTL_LIGHT_GRAY_FENCE = registerFenceBlock("bytl_light_gray_fence");

	public static final RegistryObject<Block> BYTL_GRAY = registerBlock("bytl_gray", () -> new Block(PROPERTIES));
	public static final RegistryObject<StairBlock> BYTL_GRAY_STAIRS = registerStairBlock("bytl_gray_stairs", BYTL_GRAY);
	public static final RegistryObject<SlabBlock> BYTL_GRAY_SLAB = registerSlabBlock("bytl_gray_slab");
	public static final RegistryObject<WallBlock> BYTL_GRAY_WALL = registerWallBlock("bytl_gray_wall");
	public static final RegistryObject<FenceBlock> BYTL_GRAY_FENCE = registerFenceBlock("bytl_gray_fence");

	public static final RegistryObject<Block> BYTL_BLACK = registerBlock("bytl_black", () -> new Block(PROPERTIES));
	public static final RegistryObject<StairBlock> BYTL_BLACK_STAIRS = registerStairBlock("bytl_black_stairs", BYTL_BLACK);
	public static final RegistryObject<SlabBlock> BYTL_BLACK_SLAB = registerSlabBlock("bytl_black_slab");
	public static final RegistryObject<WallBlock> BYTL_BLACK_WALL = registerWallBlock("bytl_black_wall");
	public static final RegistryObject<FenceBlock> BYTL_BLACK_FENCE = registerFenceBlock("bytl_black_fence");

	public static final RegistryObject<Block> BYTL_YELLOW = registerBlock("bytl_yellow", () -> new Block(PROPERTIES));
	public static final RegistryObject<StairBlock> BYTL_YELLOW_STAIRS = registerStairBlock("bytl_yellow_stairs", BYTL_YELLOW);
	public static final RegistryObject<SlabBlock> BYTL_YELLOW_SLAB = registerSlabBlock("bytl_yellow_slab");
	public static final RegistryObject<WallBlock> BYTL_YELLOW_WALL = registerWallBlock("bytl_yellow_wall");
	public static final RegistryObject<FenceBlock> BYTL_YELLOW_FENCE = registerFenceBlock("bytl_yellow_fence");

	public static final RegistryObject<Block> BYTL_BROWN = registerBlock("bytl_brown", () -> new Block(PROPERTIES));
	public static final RegistryObject<StairBlock> BYTL_BROWN_STAIRS = registerStairBlock("bytl_brown_stairs", BYTL_BROWN);
	public static final RegistryObject<SlabBlock> BYTL_BROWN_SLAB = registerSlabBlock("bytl_brown_slab");
	public static final RegistryObject<WallBlock> BYTL_BROWN_WALL = registerWallBlock("bytl_brown_wall");
	public static final RegistryObject<FenceBlock> BYTL_BROWN_FENCE = registerFenceBlock("bytl_brown_fence");

	public static final RegistryObject<Block> BYTL_BLUE = registerBlock("bytl_blue", () -> new Block(PROPERTIES));
	public static final RegistryObject<StairBlock> BYTL_BLUE_STAIRS = registerStairBlock("bytl_blue_stairs", BYTL_BLUE);
	public static final RegistryObject<SlabBlock> BYTL_BLUE_SLAB = registerSlabBlock("bytl_blue_slab");
	public static final RegistryObject<WallBlock> BYTL_BLUE_WALL = registerWallBlock("bytl_blue_wall");
	public static final RegistryObject<FenceBlock> BYTL_BLUE_FENCE = registerFenceBlock("bytl_blue_fence");

	public static final RegistryObject<Block> BYTL_RED = registerBlock("bytl_red", () -> new Block(PROPERTIES));
	public static final RegistryObject<StairBlock> BYTL_RED_STAIRS = registerStairBlock("bytl_red_stairs", BYTL_RED);
	public static final RegistryObject<SlabBlock> BYTL_RED_SLAB = registerSlabBlock("bytl_red_slab");
	public static final RegistryObject<WallBlock> BYTL_RED_WALL = registerWallBlock("bytl_red_wall");
	public static final RegistryObject<FenceBlock> BYTL_RED_FENCE = registerFenceBlock("bytl_red_fence");

	public static final RegistryObject<Block> BYTL_GREEN = registerBlock("bytl_green", () -> new Block(PROPERTIES));
	public static final RegistryObject<StairBlock> BYTL_GREEN_STAIRS = registerStairBlock("bytl_green_stairs", BYTL_GREEN);
	public static final RegistryObject<SlabBlock> BYTL_GREEN_SLAB = registerSlabBlock("bytl_green_slab");
	public static final RegistryObject<WallBlock> BYTL_GREEN_WALL = registerWallBlock("bytl_green_wall");
	public static final RegistryObject<FenceBlock> BYTL_GREEN_FENCE = registerFenceBlock("bytl_green_fence");

	public static final RegistryObject<Block> BYTL_PURPLE = registerBlock("bytl_purple", () -> new Block(PROPERTIES));
	public static final RegistryObject<StairBlock> BYTL_PURPLE_STAIRS = registerStairBlock("bytl_purple_stairs", BYTL_PURPLE);
	public static final RegistryObject<SlabBlock> BYTL_PURPLE_SLAB = registerSlabBlock("bytl_purple_slab");
	public static final RegistryObject<WallBlock> BYTL_PURPLE_WALL = registerWallBlock("bytl_purple_wall");
	public static final RegistryObject<FenceBlock> BYTL_PURPLE_FENCE = registerFenceBlock("bytl_purple_fence");

	public static final RegistryObject<Block> BYTL_MAGENTA = registerBlock("bytl_magenta", () -> new Block(PROPERTIES));
	public static final RegistryObject<StairBlock> BYTL_MAGENTA_STAIRS = registerStairBlock("bytl_magenta_stairs", BYTL_MAGENTA);
	public static final RegistryObject<SlabBlock> BYTL_MAGENTA_SLAB = registerSlabBlock("bytl_magenta_slab");
	public static final RegistryObject<WallBlock> BYTL_MAGENTA_WALL = registerWallBlock("bytl_magenta_wall");
	public static final RegistryObject<FenceBlock> BYTL_MAGENTA_FENCE = registerFenceBlock("bytl_magenta_fence");

	public static void register(IEventBus eventBus) {
		BLOCKS.register(eventBus);
	}
}
