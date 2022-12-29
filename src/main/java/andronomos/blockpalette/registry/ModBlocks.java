package andronomos.blockpalette.registry;

import andronomos.blockpalette.BlockPalette;
import andronomos.blockpalette.block.BPRotatableBlock;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.Arrays;
import java.util.function.Supplier;

public class ModBlocks {
	//region properties
	private static Block.Properties PROPERTIES = Block.Properties.of(Material.STONE)
			.strength(3.0F, 3.0F)
			.sound(SoundType.STONE);

	private static Block.Properties METAL_PROPERTIES = Block.Properties.of(Material.METAL, MaterialColor.METAL)
			.strength(5.0F, 6.0F)
			.sound(SoundType.METAL);

	private static Block.Properties GLAX_PROPERTIES = Block.Properties.of(Material.GLASS)
			.strength(0.3F).sound(SoundType.GLASS).noOcclusion();
	//endregion

	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, BlockPalette.MODID);

	//public static final RegistryObject<Block> BP_TILE = registerBlock("bp_tile", () -> new Block(PROPERTIES));

	//region glax
	public static final RegistryObject<GlassBlock> GLAX_CYAN =  registerBlock("glax_cyan", () -> new GlassBlock(GLAX_PROPERTIES), ModItems.GetBaseProperties());
	//public static final RegistryObject<GlassBlock> GLAX_WHITE = registerBlock("glax_white", () -> new GlassBlock(GLAX_PROPERTIES), ModItems.GetBaseProperties());
	//public static final RegistryObject<GlassBlock> GLAX_BLACK = registerBlock("glax_black", () -> new GlassBlock(GLAX_PROPERTIES), ModItems.GetBaseProperties());
	//public static final RegistryObject<GlassBlock> GLAX_BROWN = registerBlock("glax_brown", () -> new GlassBlock(GLAX_PROPERTIES), ModItems.GetBaseProperties());
	//public static final RegistryObject<GlassBlock> GLAX_RED = registerBlock("glax_red", () -> new GlassBlock(GLAX_PROPERTIES), ModItems.GetBaseProperties());
	//public static final RegistryObject<GlassBlock> GLAX_PINK = registerBlock("glax_pink", () -> new GlassBlock(GLAX_PROPERTIES), ModItems.GetBaseProperties());
	//public static final RegistryObject<GlassBlock> GLAX_BLUE = registerBlock("glax_blue", () -> new GlassBlock(GLAX_PROPERTIES), ModItems.GetBaseProperties());
	//public static final RegistryObject<GlassBlock> GLAX_GREEN = registerBlock("glax_green", () -> new GlassBlock(GLAX_PROPERTIES), ModItems.GetBaseProperties());
	//public static final RegistryObject<GlassBlock> GLAX_GRAY = registerBlock("glax_gray", () -> new GlassBlock(GLAX_PROPERTIES), ModItems.GetBaseProperties());
	//public static final RegistryObject<GlassBlock> GLAX_ORANGE = registerBlock("glax_orange", () -> new GlassBlock(GLAX_PROPERTIES), ModItems.GetBaseProperties());
	//public static final RegistryObject<GlassBlock> GLAX_PURPLE = registerBlock("glax_purple", () -> new GlassBlock(GLAX_PROPERTIES), ModItems.GetBaseProperties());
	//public static final RegistryObject<GlassBlock> GLAX_MAGENTA = registerBlock("glax_magenta", () -> new GlassBlock(GLAX_PROPERTIES), ModItems.GetBaseProperties());
	//public static final RegistryObject<GlassBlock> GLAX_LIME = registerBlock("glax_lime", () -> new GlassBlock(GLAX_PROPERTIES), ModItems.GetBaseProperties());
	//public static final RegistryObject<GlassBlock> GLAX_LIGHT_BLUE = registerBlock("glax_light_blue", () -> new GlassBlock(GLAX_PROPERTIES), ModItems.GetBaseProperties());
	//public static final RegistryObject<GlassBlock> GLAX_LIGHT_GRAY = registerBlock("glax_light_gray", () -> new GlassBlock(GLAX_PROPERTIES), ModItems.GetBaseProperties());
	//public static final RegistryObject<GlassBlock> GLAX_YELLOW = registerBlock("glax_yellow", () -> new GlassBlock(GLAX_PROPERTIES), ModItems.GetBaseProperties());
	//
	//public static final RegistryObject<Block> GLAX_BLACK_PANE = registerGlaxPaneBlock("black", DyeColor.BLACK);
	//public static final RegistryObject<Block> GLAX_BLUE_PANE = registerGlaxPaneBlock("blue", DyeColor.BLUE);
	//public static final RegistryObject<Block> GLAX_BROWN_PANE = registerGlaxPaneBlock("brown", DyeColor.BROWN);
	//public static final RegistryObject<Block> GLAX_CYAN_PANE = registerGlaxPaneBlock("cyan", DyeColor.CYAN);
	//public static final RegistryObject<Block> GLAX_GRAY_PANE = registerGlaxPaneBlock("gray", DyeColor.GRAY);
	//public static final RegistryObject<Block> GLAX_GREEN_PANE = registerGlaxPaneBlock("green", DyeColor.GREEN);
	//public static final RegistryObject<Block> GLAX_LIGHT_BLUE_PANE = registerGlaxPaneBlock("light_blue", DyeColor.LIGHT_BLUE);
	//public static final RegistryObject<Block> GLAX_LIGHT_GRAY_PANE = registerGlaxPaneBlock("light_gray", DyeColor.LIGHT_GRAY);
	//public static final RegistryObject<Block> GLAX_LIME_PANE = registerGlaxPaneBlock("lime", DyeColor.LIME);
	//public static final RegistryObject<Block> GLAX_MAGENTA_PANE = registerGlaxPaneBlock("magenta", DyeColor.MAGENTA);
	//public static final RegistryObject<Block> GLAX_ORANGE_PANE = registerGlaxPaneBlock("orange", DyeColor.ORANGE);
	//public static final RegistryObject<Block> GLAX_PINK_PANE = registerGlaxPaneBlock("pink", DyeColor.PINK);
	//public static final RegistryObject<Block> GLAX_PURPLE_PANE = registerGlaxPaneBlock("purple", DyeColor.PURPLE);
	//public static final RegistryObject<Block> GLAX_RED_PANE = registerGlaxPaneBlock("red", DyeColor.RED);
	//public static final RegistryObject<Block> GLAX_WHITE_PANE = registerGlaxPaneBlock("white", DyeColor.WHITE);
	//public static final RegistryObject<Block> GLAX_YELLOW_PANE = registerGlaxPaneBlock("yellow", DyeColor.YELLOW);
	//endregion

	//region bytl
	public static final RegistryObject<Block> BYTL = registerBlock("bytl", () -> new Block(PROPERTIES));
	public static final RegistryObject<BPRotatableBlock> BYTL_COLUMN = registerRotatableBlock("bytl_column", PROPERTIES, "bytl");
	public static final RegistryObject<BPRotatableBlock> BYTL_STRIP = registerRotatableBlock("bytl_strip", PROPERTIES, "bytl");
	public static final RegistryObject<Block> BYTL_TILE = registerBlock("bytl_tile", () -> new Block(PROPERTIES));
	public static final RegistryObject<StairBlock> BYTL_STAIRS = registerStairBlock("bytl_stairs", BYTL);
	public static final RegistryObject<SlabBlock> BYTL_SLAB = registerSlabBlock("bytl_slab");
	public static final RegistryObject<WallBlock> BYTL_WALL = registerWallBlock("bytl_wall");
	public static final RegistryObject<FenceBlock> BYTL_FENCE = registerFenceBlock("bytl_fence");

	public static final RegistryObject<Block> BYTL_LIGHT_GRAY = registerBlock("bytl_light_gray", () -> new Block(PROPERTIES));
	public static final RegistryObject<BPRotatableBlock> BYTL_LIGHT_GRAY_COLUMN = registerRotatableBlock("bytl_light_gray_column", PROPERTIES, "bytl_light_gray");
	public static final RegistryObject<BPRotatableBlock> BYTL_LIGHT_GRAY_STRIP = registerRotatableBlock("bytl_light_gray_strip", PROPERTIES, "bytl_light_gray");
	public static final RegistryObject<Block> BYTL_LIGHT_GRAY_TILE = registerBlock("bytl_light_gray_tile", () -> new Block(PROPERTIES));
	public static final RegistryObject<StairBlock> BYTL_LIGHT_GRAY_STAIRS = registerStairBlock("bytl_light_gray_stairs", BYTL_LIGHT_GRAY);
	public static final RegistryObject<SlabBlock> BYTL_LIGHT_GRAY_SLAB = registerSlabBlock("bytl_light_gray_slab");
	public static final RegistryObject<WallBlock> BYTL_LIGHT_GRAY_WALL = registerWallBlock("bytl_light_gray_wall");
	public static final RegistryObject<FenceBlock> BYTL_LIGHT_GRAY_FENCE = registerFenceBlock("bytl_light_gray_fence");

	public static final RegistryObject<Block> BYTL_GRAY = registerBlock("bytl_gray", () -> new Block(PROPERTIES));
	public static final RegistryObject<BPRotatableBlock> BYTL_GRAY_COLUMN = registerRotatableBlock("bytl_gray_column", PROPERTIES, "bytl_gray");
	public static final RegistryObject<BPRotatableBlock> BYTL_GRAY_STRIP = registerRotatableBlock("bytl_gray_strip", PROPERTIES, "bytl_gray");
	public static final RegistryObject<Block> BYTL_GRAY_TILE = registerBlock("bytl_gray_tile", () -> new Block(PROPERTIES));
	public static final RegistryObject<StairBlock> BYTL_GRAY_STAIRS = registerStairBlock("bytl_gray_stairs", BYTL_GRAY);
	public static final RegistryObject<SlabBlock> BYTL_GRAY_SLAB = registerSlabBlock("bytl_gray_slab");
	public static final RegistryObject<WallBlock> BYTL_GRAY_WALL = registerWallBlock("bytl_gray_wall");
	public static final RegistryObject<FenceBlock> BYTL_GRAY_FENCE = registerFenceBlock("bytl_gray_fence");

	public static final RegistryObject<Block> BYTL_BLACK = registerBlock("bytl_black", () -> new Block(PROPERTIES));
	public static final RegistryObject<BPRotatableBlock> BYTL_BLACK_COLUMN = registerRotatableBlock("bytl_black_column", PROPERTIES, "bytl_black");
	public static final RegistryObject<BPRotatableBlock> BYTL_BLACK_STRIP = registerRotatableBlock("bytl_black_strip", PROPERTIES, "bytl_black");
	public static final RegistryObject<Block> BYTL_BLACK_TILE = registerBlock("bytl_black_tile", () -> new Block(PROPERTIES));
	public static final RegistryObject<StairBlock> BYTL_BLACK_STAIRS = registerStairBlock("bytl_black_stairs", BYTL_BLACK);
	public static final RegistryObject<SlabBlock> BYTL_BLACK_SLAB = registerSlabBlock("bytl_black_slab");
	public static final RegistryObject<WallBlock> BYTL_BLACK_WALL = registerWallBlock("bytl_black_wall");
	public static final RegistryObject<FenceBlock> BYTL_BLACK_FENCE = registerFenceBlock("bytl_black_fence");

	public static final RegistryObject<Block> BYTL_YELLOW = registerBlock("bytl_yellow", () -> new Block(PROPERTIES));
	public static final RegistryObject<BPRotatableBlock> BYTL_YELLOW_COLUMN = registerRotatableBlock("bytl_yellow_column", PROPERTIES, "bytl_yellow");
	public static final RegistryObject<BPRotatableBlock> BYTL_YELLOW_STRIP = registerRotatableBlock("bytl_yellow_strip", PROPERTIES, "bytl_yellow");
	public static final RegistryObject<Block> BYTL_YELLOW_TILE = registerBlock("bytl_yellow_tile", () -> new Block(PROPERTIES));
	public static final RegistryObject<StairBlock> BYTL_YELLOW_STAIRS = registerStairBlock("bytl_yellow_stairs", BYTL_YELLOW);
	public static final RegistryObject<SlabBlock> BYTL_YELLOW_SLAB = registerSlabBlock("bytl_yellow_slab");
	public static final RegistryObject<WallBlock> BYTL_YELLOW_WALL = registerWallBlock("bytl_yellow_wall");
	public static final RegistryObject<FenceBlock> BYTL_YELLOW_FENCE = registerFenceBlock("bytl_yellow_fence");

	public static final RegistryObject<Block> BYTL_BROWN = registerBlock("bytl_brown", () -> new Block(PROPERTIES));
	public static final RegistryObject<BPRotatableBlock> BYTL_BROWN_COLUMN = registerRotatableBlock("bytl_brown_column", PROPERTIES, "bytl_brown");
	public static final RegistryObject<BPRotatableBlock> BYTL_BROWN_STRIP = registerRotatableBlock("bytl_brown_strip", PROPERTIES, "bytl_brown");
	public static final RegistryObject<Block> BYTL_BROWN_TILE = registerBlock("bytl_brown_tile", () -> new Block(PROPERTIES));
	public static final RegistryObject<StairBlock> BYTL_BROWN_STAIRS = registerStairBlock("bytl_brown_stairs", BYTL_BROWN);
	public static final RegistryObject<SlabBlock> BYTL_BROWN_SLAB = registerSlabBlock("bytl_brown_slab");
	public static final RegistryObject<WallBlock> BYTL_BROWN_WALL = registerWallBlock("bytl_brown_wall");
	public static final RegistryObject<FenceBlock> BYTL_BROWN_FENCE = registerFenceBlock("bytl_brown_fence");

	public static final RegistryObject<Block> BYTL_BLUE = registerBlock("bytl_blue", () -> new Block(PROPERTIES));
	public static final RegistryObject<BPRotatableBlock> BYTL_BLUE_COLUMN = registerRotatableBlock("bytl_blue_column", PROPERTIES, "bytl_blue");
	public static final RegistryObject<BPRotatableBlock> BYTL_BLUE_STRIP = registerRotatableBlock("bytl_blue_strip", PROPERTIES, "bytl_blue");
	public static final RegistryObject<Block> BYTL_BLUE_TILE = registerBlock("bytl_blue_tile", () -> new Block(PROPERTIES));
	public static final RegistryObject<StairBlock> BYTL_BLUE_STAIRS = registerStairBlock("bytl_blue_stairs", BYTL_BLUE);
	public static final RegistryObject<SlabBlock> BYTL_BLUE_SLAB = registerSlabBlock("bytl_blue_slab");
	public static final RegistryObject<WallBlock> BYTL_BLUE_WALL = registerWallBlock("bytl_blue_wall");
	public static final RegistryObject<FenceBlock> BYTL_BLUE_FENCE = registerFenceBlock("bytl_blue_fence");

	public static final RegistryObject<Block> BYTL_RED = registerBlock("bytl_red", () -> new Block(PROPERTIES));
	public static final RegistryObject<BPRotatableBlock> BYTL_RED_COLUMN = registerRotatableBlock("bytl_red_column", PROPERTIES, "bytl_red");
	public static final RegistryObject<BPRotatableBlock> BYTL_RED_STRIP = registerRotatableBlock("bytl_red_strip", PROPERTIES, "bytl_red");
	public static final RegistryObject<Block> BYTL_RED_TILE = registerBlock("bytl_red_tile", () -> new Block(PROPERTIES));
	public static final RegistryObject<StairBlock> BYTL_RED_STAIRS = registerStairBlock("bytl_red_stairs", BYTL_RED);
	public static final RegistryObject<SlabBlock> BYTL_RED_SLAB = registerSlabBlock("bytl_red_slab");
	public static final RegistryObject<WallBlock> BYTL_RED_WALL = registerWallBlock("bytl_red_wall");
	public static final RegistryObject<FenceBlock> BYTL_RED_FENCE = registerFenceBlock("bytl_red_fence");

	public static final RegistryObject<Block> BYTL_GREEN = registerBlock("bytl_green", () -> new Block(PROPERTIES));
	public static final RegistryObject<BPRotatableBlock> BYTL_GREEN_COLUMN = registerRotatableBlock("bytl_green_column", PROPERTIES, "bytl_green");
	public static final RegistryObject<BPRotatableBlock> BYTL_GREEN_STRIP = registerRotatableBlock("bytl_green_strip", PROPERTIES, "bytl_green");
	public static final RegistryObject<Block> BYTL_GREEN_TILE = registerBlock("bytl_green_tile", () -> new Block(PROPERTIES));
	public static final RegistryObject<StairBlock> BYTL_GREEN_STAIRS = registerStairBlock("bytl_green_stairs", BYTL_GREEN);
	public static final RegistryObject<SlabBlock> BYTL_GREEN_SLAB = registerSlabBlock("bytl_green_slab");
	public static final RegistryObject<WallBlock> BYTL_GREEN_WALL = registerWallBlock("bytl_green_wall");
	public static final RegistryObject<FenceBlock> BYTL_GREEN_FENCE = registerFenceBlock("bytl_green_fence");

	public static final RegistryObject<Block> BYTL_PURPLE = registerBlock("bytl_purple", () -> new Block(PROPERTIES));
	public static final RegistryObject<BPRotatableBlock> BYTL_PURPLE_COLUMN = registerRotatableBlock("bytl_purple_column", PROPERTIES, "bytl_purple");
	public static final RegistryObject<BPRotatableBlock> BYTL_PURPLE_STRIP = registerRotatableBlock("bytl_purple_strip", PROPERTIES, "bytl_purple");
	public static final RegistryObject<Block> BYTL_PURPLE_TILE = registerBlock("bytl_purple_tile", () -> new Block(PROPERTIES));
	public static final RegistryObject<StairBlock> BYTL_PURPLE_STAIRS = registerStairBlock("bytl_purple_stairs", BYTL_PURPLE);
	public static final RegistryObject<SlabBlock> BYTL_PURPLE_SLAB = registerSlabBlock("bytl_purple_slab");
	public static final RegistryObject<WallBlock> BYTL_PURPLE_WALL = registerWallBlock("bytl_purple_wall");
	public static final RegistryObject<FenceBlock> BYTL_PURPLE_FENCE = registerFenceBlock("bytl_purple_fence");

	public static final RegistryObject<Block> BYTL_MAGENTA = registerBlock("bytl_magenta", () -> new Block(PROPERTIES));
	public static final RegistryObject<BPRotatableBlock> BYTL_MAGENTA_COLUMN = registerRotatableBlock("bytl_magenta_column", PROPERTIES, "bytl_magenta");
	public static final RegistryObject<BPRotatableBlock> BYTL_MAGENTA_STRIP = registerRotatableBlock("bytl_magenta_strip", PROPERTIES, "bytl_magenta");
	public static final RegistryObject<Block> BYTL_MAGENTA_TILE = registerBlock("bytl_magenta_tile", () -> new Block(PROPERTIES));
	public static final RegistryObject<StairBlock> BYTL_MAGENTA_STAIRS = registerStairBlock("bytl_magenta_stairs", BYTL_MAGENTA);
	public static final RegistryObject<SlabBlock> BYTL_MAGENTA_SLAB = registerSlabBlock("bytl_magenta_slab");
	public static final RegistryObject<WallBlock> BYTL_MAGENTA_WALL = registerWallBlock("bytl_magenta_wall");
	public static final RegistryObject<FenceBlock> BYTL_MAGENTA_FENCE = registerFenceBlock("bytl_magenta_fence");
	//endregion

	//region hzrd
	public static final RegistryObject<Block> HZRD_YELLOW = registerBlock("hzrd_yellow", () -> new Block(PROPERTIES));
	public static final RegistryObject<SlabBlock> HZRD_YELLOW_SLAB = registerSlabBlock("hzrd_yellow_slab");
	public static final RegistryObject<Block> HZRD_GRAY = registerBlock("hzrd_gray", () -> new Block(PROPERTIES));
	public static final RegistryObject<SlabBlock> HZRD_GRAY_SLAB = registerSlabBlock("hzrd_gray_slab");
	//endregion

	//region mytl
	public static final RegistryObject<Block> MYTL = registerBlock("mytl", () -> new Block(PROPERTIES));
	public static final RegistryObject<StairBlock> MYTL_STAIRS = registerStairBlock("mytl_stairs", MYTL);
	public static final RegistryObject<SlabBlock> MYTL_SLAB = registerSlabBlock("mytl_slab");
	public static final RegistryObject<WallBlock> MYTL_WALL = registerWallBlock("mytl_wall");
	public static final RegistryObject<BPRotatableBlock> MYTL_STRIP = registerRotatableBlock("mytl_strip", METAL_PROPERTIES, "mytl");

	public static final RegistryObject<Block> MYTL_GRAY = registerBlock("mytl_gray", () -> new Block(PROPERTIES));
	public static final RegistryObject<StairBlock> MYTL_GRAY_STAIRS = registerStairBlock("mytl_gray_stairs", MYTL_GRAY);
	public static final RegistryObject<SlabBlock> MYTL_GRAY_SLAB = registerSlabBlock("mytl_gray_slab");
	public static final RegistryObject<WallBlock> MYTL_GRAY_WALL = registerWallBlock("mytl_gray_wall");
	public static final RegistryObject<BPRotatableBlock> MYTL_GRAY_STRIP = registerRotatableBlock("mytl_gray_strip", METAL_PROPERTIES, "mytl_gray");

	public static final RegistryObject<Block> MYTL_BLACK = registerBlock("mytl_black", () -> new Block(PROPERTIES));
	public static final RegistryObject<StairBlock> MYTL_BLACK_STAIRS = registerStairBlock("mytl_black_stairs", MYTL_BLACK);
	public static final RegistryObject<SlabBlock> MYTL_BLACK_SLAB = registerSlabBlock("mytl_black_slab");
	public static final RegistryObject<WallBlock> MYTL_BLACK_WALL = registerWallBlock("mytl_black_wall");
	public static final RegistryObject<BPRotatableBlock> MYTL_BLACK_STRIP = registerRotatableBlock("mytl_black_strip", METAL_PROPERTIES, "mytl_black");
	
	public static final RegistryObject<Block> MYTL_BROWN = registerBlock("mytl_brown", () -> new Block(PROPERTIES));
	public static final RegistryObject<StairBlock> MYTL_BROWN_STAIRS = registerStairBlock("mytl_brown_stairs", MYTL_BROWN);
	public static final RegistryObject<SlabBlock> MYTL_BROWN_SLAB = registerSlabBlock("mytl_brown_slab");
	public static final RegistryObject<WallBlock> MYTL_BROWN_WALL = registerWallBlock("mytl_brown_wall");
	public static final RegistryObject<BPRotatableBlock> MYTL_BROWN_STRIP = registerRotatableBlock("mytl_brown_strip", METAL_PROPERTIES, "mytl_brown");
	
	public static final RegistryObject<Block> MYTL_GREEN = registerBlock("mytl_green", () -> new Block(PROPERTIES));
	public static final RegistryObject<StairBlock> MYTL_GREEN_STAIRS = registerStairBlock("mytl_green_stairs", MYTL_GREEN);
	public static final RegistryObject<SlabBlock> MYTL_GREEN_SLAB = registerSlabBlock("mytl_green_slab");
	public static final RegistryObject<WallBlock> MYTL_GREEN_WALL = registerWallBlock("mytl_green_wall");
	public static final RegistryObject<BPRotatableBlock> MYTL_GREEN_STRIP = registerRotatableBlock("mytl_green_strip", METAL_PROPERTIES, "mytl_green");
		
	public static final RegistryObject<Block> MYTL_RED = registerBlock("mytl_red", () -> new Block(PROPERTIES));
	public static final RegistryObject<StairBlock> MYTL_RED_STAIRS = registerStairBlock("mytl_red_stairs", MYTL_RED);
	public static final RegistryObject<SlabBlock> MYTL_RED_SLAB = registerSlabBlock("mytl_red_slab");
	public static final RegistryObject<WallBlock> MYTL_RED_WALL = registerWallBlock("mytl_red_wall");
	public static final RegistryObject<BPRotatableBlock> MYTL_RED_STRIP = registerRotatableBlock("mytl_red_strip", METAL_PROPERTIES, "mytl_red");
	
	public static final RegistryObject<Block> MYTL_ORANGE = registerBlock("mytl_orange", () -> new Block(PROPERTIES));
	public static final RegistryObject<StairBlock> MYTL_ORANGE_STAIRS = registerStairBlock("mytl_orange_stairs", MYTL_ORANGE);
	public static final RegistryObject<SlabBlock> MYTL_ORANGE_SLAB = registerSlabBlock("mytl_orange_slab");
	public static final RegistryObject<WallBlock> MYTL_ORANGE_WALL = registerWallBlock("mytl_orange_wall");
	public static final RegistryObject<BPRotatableBlock> MYTL_ORANGE_STRIP = registerRotatableBlock("mytl_orange_strip", METAL_PROPERTIES, "mytl_orange");
	//endregion


	private static RegistryObject<Block> registerGlaxPaneBlock(final String name, DyeColor color) {
		return registerBlock("glax_" + name + "_pane", () -> new StainedGlassPaneBlock(color, GLAX_PROPERTIES), ModItems.GetBaseProperties());
	}

	private static RegistryObject<StairBlock> registerStairBlock(final String name, Supplier<Block> source) {
		return registerBlock(name, () -> new StairBlock(() -> source.get().defaultBlockState(), PROPERTIES), ModItems.GetBaseProperties());
	}

	private static RegistryObject<SlabBlock> registerSlabBlock(final String name) {
		return registerBlock(name, () -> new SlabBlock(PROPERTIES), ModItems.GetBaseProperties());
	}

	private static RegistryObject<WallBlock> registerWallBlock(final String name) {
		return registerBlock(name, () -> new WallBlock(PROPERTIES), ModItems.GetBaseProperties());
	}

	private static RegistryObject<FenceBlock> registerFenceBlock(final String name) {
		return registerBlock(name, () -> new FenceBlock(PROPERTIES), ModItems.GetBaseProperties());
	}

	private static RegistryObject<BPRotatableBlock> registerRotatableBlock(final String name, Block.Properties properties, String topTexture) {
		return registerBlock(name, () -> new BPRotatableBlock(properties, topTexture), ModItems.GetBaseProperties());
	}

	private static <BLOCK extends Block> RegistryObject<BLOCK> registerBlock(final String name, final Supplier<BLOCK> blockFactory) {
		return registerBlock(name, blockFactory, block -> new BlockItem(block, ModItems.GetBaseProperties()));
	}

	private static <BLOCK extends Block> RegistryObject<BLOCK> registerBlock(final String name, final Supplier<BLOCK> blockFactory, Item.Properties properties) {
		return registerBlock(name, blockFactory, block -> new BlockItem(block, properties));
	}

	private static <BLOCK extends Block> RegistryObject<BLOCK> registerBlock(final String name, final Supplier<BLOCK> blockFactory, final IBlockItemFactory<BLOCK> itemFactory) {
		final RegistryObject<BLOCK> block = BLOCKS.register(name, blockFactory);
		ModItems.ITEMS.register(name, () -> itemFactory.create(block.get()));
		return block;
	}

	/**
	 * A factory function used to create block items.
	 *
	 * @param <BLOCK> The block type
	 */
	@FunctionalInterface
	public interface IBlockItemFactory<BLOCK> {
		Item create(BLOCK block);
	}
}
