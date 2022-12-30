package andronomos.blockpalette.registry;

import andronomos.blockpalette.BlockPalette;
import andronomos.blockpalette.block.BPRotatableBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.WallBlock;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import static andronomos.blockpalette.registry.ModBlocks.*;

public class MytlBlocks {
	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, BlockPalette.MODID);

	public static final RegistryObject<Block> MYTL = registerBlock("mytl", () -> new Block(METAL_PROPERTIES));
	public static final RegistryObject<StairBlock> MYTL_STAIRS = registerStairBlock("mytl_stairs", MYTL);
	public static final RegistryObject<SlabBlock> MYTL_SLAB = registerSlabBlock("mytl_slab");
	public static final RegistryObject<WallBlock> MYTL_WALL = registerWallBlock("mytl_wall");
	public static final RegistryObject<BPRotatableBlock> MYTL_STRIP = registerRotatableBlock("mytl_strip", METAL_PROPERTIES, "mytl");

	public static final RegistryObject<Block> MYTL_GRAY = registerBlock("mytl_gray", () -> new Block(METAL_PROPERTIES));
	public static final RegistryObject<StairBlock> MYTL_GRAY_STAIRS = registerStairBlock("mytl_gray_stairs", MYTL_GRAY);
	public static final RegistryObject<SlabBlock> MYTL_GRAY_SLAB = registerSlabBlock("mytl_gray_slab");
	public static final RegistryObject<WallBlock> MYTL_GRAY_WALL = registerWallBlock("mytl_gray_wall");
	public static final RegistryObject<BPRotatableBlock> MYTL_GRAY_STRIP = registerRotatableBlock("mytl_gray_strip", METAL_PROPERTIES, "mytl_gray");

	public static final RegistryObject<Block> MYTL_BLACK = registerBlock("mytl_black", () -> new Block(METAL_PROPERTIES));
	public static final RegistryObject<StairBlock> MYTL_BLACK_STAIRS = registerStairBlock("mytl_black_stairs", MYTL_BLACK);
	public static final RegistryObject<SlabBlock> MYTL_BLACK_SLAB = registerSlabBlock("mytl_black_slab");
	public static final RegistryObject<WallBlock> MYTL_BLACK_WALL = registerWallBlock("mytl_black_wall");
	public static final RegistryObject<BPRotatableBlock> MYTL_BLACK_STRIP = registerRotatableBlock("mytl_black_strip", METAL_PROPERTIES, "mytl_black");

	public static final RegistryObject<Block> MYTL_BROWN = registerBlock("mytl_brown", () -> new Block(METAL_PROPERTIES));
	public static final RegistryObject<StairBlock> MYTL_BROWN_STAIRS = registerStairBlock("mytl_brown_stairs", MYTL_BROWN);
	public static final RegistryObject<SlabBlock> MYTL_BROWN_SLAB = registerSlabBlock("mytl_brown_slab");
	public static final RegistryObject<WallBlock> MYTL_BROWN_WALL = registerWallBlock("mytl_brown_wall");
	public static final RegistryObject<BPRotatableBlock> MYTL_BROWN_STRIP = registerRotatableBlock("mytl_brown_strip", METAL_PROPERTIES, "mytl_brown");

	public static final RegistryObject<Block> MYTL_GREEN = registerBlock("mytl_green", () -> new Block(METAL_PROPERTIES));
	public static final RegistryObject<StairBlock> MYTL_GREEN_STAIRS = registerStairBlock("mytl_green_stairs", MYTL_GREEN);
	public static final RegistryObject<SlabBlock> MYTL_GREEN_SLAB = registerSlabBlock("mytl_green_slab");
	public static final RegistryObject<WallBlock> MYTL_GREEN_WALL = registerWallBlock("mytl_green_wall");
	public static final RegistryObject<BPRotatableBlock> MYTL_GREEN_STRIP = registerRotatableBlock("mytl_green_strip", METAL_PROPERTIES, "mytl_green");

	public static final RegistryObject<Block> MYTL_RED = registerBlock("mytl_red", () -> new Block(METAL_PROPERTIES));
	public static final RegistryObject<StairBlock> MYTL_RED_STAIRS = registerStairBlock("mytl_red_stairs", MYTL_RED);
	public static final RegistryObject<SlabBlock> MYTL_RED_SLAB = registerSlabBlock("mytl_red_slab");
	public static final RegistryObject<WallBlock> MYTL_RED_WALL = registerWallBlock("mytl_red_wall");
	public static final RegistryObject<BPRotatableBlock> MYTL_RED_STRIP = registerRotatableBlock("mytl_red_strip", METAL_PROPERTIES, "mytl_red");

	public static final RegistryObject<Block> MYTL_ORANGE = registerBlock("mytl_orange", () -> new Block(METAL_PROPERTIES));
	public static final RegistryObject<StairBlock> MYTL_ORANGE_STAIRS = registerStairBlock("mytl_orange_stairs", MYTL_ORANGE);
	public static final RegistryObject<SlabBlock> MYTL_ORANGE_SLAB = registerSlabBlock("mytl_orange_slab");
	public static final RegistryObject<WallBlock> MYTL_ORANGE_WALL = registerWallBlock("mytl_orange_wall");
	public static final RegistryObject<BPRotatableBlock> MYTL_ORANGE_STRIP = registerRotatableBlock("mytl_orange_strip", METAL_PROPERTIES, "mytl_orange");

	public static void register(IEventBus eventBus) {
		BLOCKS.register(eventBus);
	}

	public static String[] getColors() {
		return new String[] {"gray", "black", "brown", "green", "red", "orange"};
	}
}
