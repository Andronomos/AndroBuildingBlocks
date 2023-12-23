package andronomos.blockpalette.registry;

import andronomos.blockpalette.BlockPalette;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
	public static Block.Properties PROPERTIES = BlockBehaviour.Properties.of()
			.mapColor(MapColor.STONE)
			.strength(3.0F, 3.0F)
			.sound(SoundType.STONE);

	public static Block.Properties CONCRETE_PROPERTIES = BlockBehaviour.Properties.copy(Blocks.WHITE_CONCRETE);
	public static Block.Properties GLASS_PROPERTIES = BlockBehaviour.Properties.copy(Blocks.BLACK_STAINED_GLASS).noOcclusion();
	public static Block.Properties GLASS_PANE_PROPERTIES = BlockBehaviour.Properties.copy(Blocks.BLACK_STAINED_GLASS_PANE);

	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, BlockPalette.MODID);

	//region Rough Concrete
	public static final RegistryObject<Block> ROUGH_WHITE_CONCRETE = registerBlock("rough_white_concrete", CONCRETE_PROPERTIES.mapColor(DyeColor.WHITE));
	public static final RegistryObject<StairBlock> ROUGH_WHITE_CONCRETE_STAIRS = registerStairBlock("rough_white_concrete_stairs", ROUGH_WHITE_CONCRETE);
	public static final RegistryObject<SlabBlock> ROUGH_WHITE_CONCRETE_SLAB = registerSlabBlock("rough_white_concrete_slab");
	public static final RegistryObject<WallBlock> ROUGH_WHITE_CONCRETE_WALL = registerWallBlock("rough_white_concrete_wall");

	public static final RegistryObject<Block> ROUGH_BLUE_CONCRETE = registerBlock("rough_blue_concrete", CONCRETE_PROPERTIES.mapColor(DyeColor.BLUE));
	public static final RegistryObject<StairBlock> ROUGH_BLUE_CONCRETE_STAIRS = registerStairBlock("rough_blue_concrete_stairs", ROUGH_BLUE_CONCRETE);
	public static final RegistryObject<SlabBlock> ROUGH_BLUE_CONCRETE_SLAB = registerSlabBlock("rough_blue_concrete_slab");
	public static final RegistryObject<WallBlock> ROUGH_BLUE_CONCRETE_WALL = registerWallBlock("rough_blue_concrete_wall");

	public static final RegistryObject<Block> ROUGH_BROWN_CONCRETE = registerBlock("rough_brown_concrete", CONCRETE_PROPERTIES.mapColor(DyeColor.BROWN));
	public static final RegistryObject<StairBlock> ROUGH_BROWN_CONCRETE_STAIRS = registerStairBlock("rough_brown_concrete_stairs", ROUGH_BROWN_CONCRETE);
	public static final RegistryObject<SlabBlock> ROUGH_BROWN_CONCRETE_SLAB = registerSlabBlock("rough_brown_concrete_slab");
	public static final RegistryObject<WallBlock> ROUGH_BROWN_CONCRETE_WALL = registerWallBlock("rough_brown_concrete_wall");

	public static final RegistryObject<Block> ROUGH_CYAN_CONCRETE = registerBlock("rough_cyan_concrete", CONCRETE_PROPERTIES.mapColor(DyeColor.CYAN));
	public static final RegistryObject<StairBlock> ROUGH_CYAN_CONCRETE_STAIRS = registerStairBlock("rough_cyan_concrete_stairs", ROUGH_CYAN_CONCRETE);
	public static final RegistryObject<SlabBlock> ROUGH_CYAN_CONCRETE_SLAB = registerSlabBlock("rough_cyan_concrete_slab");
	public static final RegistryObject<WallBlock> ROUGH_CYAN_CONCRETE_WALL = registerWallBlock("rough_cyan_concrete_wall");

	public static final RegistryObject<Block> ROUGH_GREEN_CONCRETE = registerBlock("rough_green_concrete", CONCRETE_PROPERTIES.mapColor(DyeColor.GREEN));
	public static final RegistryObject<StairBlock> ROUGH_GREEN_CONCRETE_STAIRS = registerStairBlock("rough_green_concrete_stairs", ROUGH_GREEN_CONCRETE);
	public static final RegistryObject<SlabBlock> ROUGH_GREEN_CONCRETE_SLAB = registerSlabBlock("rough_green_concrete_slab");
	public static final RegistryObject<WallBlock> ROUGH_GREEN_CONCRETE_WALL = registerWallBlock("rough_green_concrete_wall");

	public static final RegistryObject<Block> ROUGH_GRAY_CONCRETE = registerBlock("rough_gray_concrete", CONCRETE_PROPERTIES.mapColor(DyeColor.GRAY));
	public static final RegistryObject<StairBlock> ROUGH_GRAY_CONCRETE_STAIRS = registerStairBlock("rough_gray_concrete_stairs", ROUGH_GRAY_CONCRETE);
	public static final RegistryObject<SlabBlock> ROUGH_GRAY_CONCRETE_SLAB = registerSlabBlock("rough_gray_concrete_slab");
	public static final RegistryObject<WallBlock> ROUGH_GRAY_CONCRETE_WALL = registerWallBlock("rough_gray_concrete_wall");

	public static final RegistryObject<Block> ROUGH_LIGHT_BLUE_CONCRETE = registerBlock("rough_light_blue_concrete", CONCRETE_PROPERTIES.mapColor(DyeColor.LIGHT_BLUE));
	public static final RegistryObject<StairBlock> ROUGH_LIGHT_BLUE_CONCRETE_STAIRS = registerStairBlock("rough_light_blue_concrete_stairs", ROUGH_LIGHT_BLUE_CONCRETE);
	public static final RegistryObject<SlabBlock> ROUGH_LIGHT_BLUE_CONCRETE_SLAB = registerSlabBlock("rough_light_blue_concrete_slab");
	public static final RegistryObject<WallBlock> ROUGH_LIGHT_BLUE_CONCRETE_WALL = registerWallBlock("rough_light_blue_concrete_wall");

	public static final RegistryObject<Block> ROUGH_LIGHT_GRAY_CONCRETE = registerBlock("rough_light_gray_concrete", CONCRETE_PROPERTIES.mapColor(DyeColor.LIGHT_GRAY));
	public static final RegistryObject<StairBlock> ROUGH_LIGHT_GRAY_CONCRETE_STAIRS = registerStairBlock("rough_light_gray_concrete_stairs", ROUGH_LIGHT_GRAY_CONCRETE);
	public static final RegistryObject<SlabBlock> ROUGH_LIGHT_GRAY_CONCRETE_SLAB = registerSlabBlock("rough_light_gray_concrete_slab");
	public static final RegistryObject<WallBlock> ROUGH_LIGHT_GRAY_CONCRETE_WALL = registerWallBlock("rough_light_gray_concrete_wall");

	public static final RegistryObject<Block> ROUGH_LIME_CONCRETE = registerBlock("rough_lime_concrete", CONCRETE_PROPERTIES.mapColor(DyeColor.LIME));
	public static final RegistryObject<StairBlock> ROUGH_LIME_CONCRETE_STAIRS = registerStairBlock("rough_lime_concrete_stairs", ROUGH_LIME_CONCRETE);
	public static final RegistryObject<SlabBlock> ROUGH_LIME_CONCRETE_SLAB = registerSlabBlock("rough_lime_concrete_slab");
	public static final RegistryObject<WallBlock> ROUGH_LIME_CONCRETE_WALL = registerWallBlock("rough_lime_concrete_wall");

	public static final RegistryObject<Block> ROUGH_MAGENTA_CONCRETE = registerBlock("rough_magenta_concrete", CONCRETE_PROPERTIES.mapColor(DyeColor.MAGENTA));
	public static final RegistryObject<StairBlock> ROUGH_MAGENTA_CONCRETE_STAIRS = registerStairBlock("rough_magenta_concrete_stairs", ROUGH_MAGENTA_CONCRETE);
	public static final RegistryObject<SlabBlock> ROUGH_MAGENTA_CONCRETE_SLAB = registerSlabBlock("rough_magenta_concrete_slab");
	public static final RegistryObject<WallBlock> ROUGH_MAGENTA_CONCRETE_WALL = registerWallBlock("rough_magenta_concrete_wall");

	public static final RegistryObject<Block> ROUGH_ORANGE_CONCRETE = registerBlock("rough_orange_concrete", CONCRETE_PROPERTIES.mapColor(DyeColor.ORANGE));
	public static final RegistryObject<StairBlock> ROUGH_ORANGE_CONCRETE_STAIRS = registerStairBlock("rough_orange_concrete_stairs", ROUGH_ORANGE_CONCRETE);
	public static final RegistryObject<SlabBlock> ROUGH_ORANGE_CONCRETE_SLAB = registerSlabBlock("rough_orange_concrete_slab");
	public static final RegistryObject<WallBlock> ROUGH_ORANGE_CONCRETE_WALL = registerWallBlock("rough_orange_concrete_wall");

	public static final RegistryObject<Block> ROUGH_PINK_CONCRETE = registerBlock("rough_pink_concrete", CONCRETE_PROPERTIES.mapColor(DyeColor.PINK));
	public static final RegistryObject<StairBlock> ROUGH_PINK_CONCRETE_STAIRS = registerStairBlock("rough_pink_concrete_stairs", ROUGH_PINK_CONCRETE);
	public static final RegistryObject<SlabBlock> ROUGH_PINK_CONCRETE_SLAB = registerSlabBlock("rough_pink_concrete_slab");
	public static final RegistryObject<WallBlock> ROUGH_PINK_CONCRETE_WALL = registerWallBlock("rough_pink_concrete_wall");

	public static final RegistryObject<Block> ROUGH_PURPLE_CONCRETE = registerBlock("rough_purple_concrete", CONCRETE_PROPERTIES.mapColor(DyeColor.PURPLE));
	public static final RegistryObject<StairBlock> ROUGH_PURPLE_CONCRETE_STAIRS = registerStairBlock("rough_purple_concrete_stairs", ROUGH_PURPLE_CONCRETE);
	public static final RegistryObject<SlabBlock> ROUGH_PURPLE_CONCRETE_SLAB = registerSlabBlock("rough_purple_concrete_slab");
	public static final RegistryObject<WallBlock> ROUGH_PURPLE_CONCRETE_WALL = registerWallBlock("rough_purple_concrete_wall");

	public static final RegistryObject<Block> ROUGH_RED_CONCRETE = registerBlock("rough_red_concrete", CONCRETE_PROPERTIES.mapColor(DyeColor.RED));
	public static final RegistryObject<StairBlock> ROUGH_RED_CONCRETE_STAIRS = registerStairBlock("rough_red_concrete_stairs", ROUGH_RED_CONCRETE);
	public static final RegistryObject<SlabBlock> ROUGH_RED_CONCRETE_SLAB = registerSlabBlock("rough_red_concrete_slab");
	public static final RegistryObject<WallBlock> ROUGH_RED_CONCRETE_WALL = registerWallBlock("rough_red_concrete_wall");

	public static final RegistryObject<Block> ROUGH_YELLOW_CONCRETE = registerBlock("rough_yellow_concrete", CONCRETE_PROPERTIES.mapColor(DyeColor.YELLOW));
	public static final RegistryObject<StairBlock> ROUGH_YELLOW_CONCRETE_STAIRS = registerStairBlock("rough_yellow_concrete_stairs", ROUGH_YELLOW_CONCRETE);
	public static final RegistryObject<SlabBlock> ROUGH_YELLOW_CONCRETE_SLAB = registerSlabBlock("rough_yellow_concrete_slab");
	public static final RegistryObject<WallBlock> ROUGH_YELLOW_CONCRETE_WALL = registerWallBlock("rough_yellow_concrete_wall");
	//endregion



	//region Barricade
	public static final RegistryObject<Block> BARRICADE_GRAY = registerBlock("barricade_gray", PROPERTIES);
	public static final RegistryObject<StairBlock> BARRICADE_GRAY_STAIRS = registerStairBlock("barricade_gray_stairs", BARRICADE_GRAY);
	public static final RegistryObject<SlabBlock> BARRICADE_GRAY_SLAB = registerSlabBlock("barricade_gray_slab");

	public static final RegistryObject<Block> BARRICADE_YELLOW = registerBlock("barricade_yellow", PROPERTIES);
	public static final RegistryObject<StairBlock> BARRICADE_YELLOW_STAIRS = registerStairBlock("barricade_yellow_stairs", BARRICADE_YELLOW);
	public static final RegistryObject<SlabBlock> BARRICADE_YELLOW_SLAB = registerSlabBlock("barricade_yellow_slab");

	public static final RegistryObject<Block> BARRICADE_GREEN = registerBlock("barricade_green", PROPERTIES);
	public static final RegistryObject<StairBlock> BARRICADE_GREEN_STAIRS = registerStairBlock("barricade_green_stairs", BARRICADE_GREEN);
	public static final RegistryObject<SlabBlock> BARRICADE_GREEN_SLAB = registerSlabBlock("barricade_green_slab");

	public static final RegistryObject<Block> BARRICADE_BLUE = registerBlock("barricade_blue", PROPERTIES);
	public static final RegistryObject<StairBlock> BARRICADE_BLUE_STAIRS = registerStairBlock("barricade_blue_stairs", BARRICADE_BLUE);
	public static final RegistryObject<SlabBlock> BARRICADE_BLUE_SLAB = registerSlabBlock("barricade_blue_slab");

	public static final RegistryObject<Block> BARRICADE_RED = registerBlock("barricade_red", PROPERTIES);
	public static final RegistryObject<StairBlock> BARRICADE_RED_STAIRS = registerStairBlock("barricade_red_stairs", BARRICADE_RED);
	public static final RegistryObject<SlabBlock> BARRICADE_RED_SLAB = registerSlabBlock("barricade_red_slab");
	//endregion



	//region Borderless Glass
	public static final RegistryObject<StainedGlassBlock> BORDERLESS_WHITE_GLASS = registerGlassBlock("borderless_white_glass", DyeColor.WHITE);
	public static final RegistryObject<Block> BORDERLESS_WHITE_PANE = registerGlassPaneBlock("white", DyeColor.WHITE);

	public static final RegistryObject<StainedGlassBlock> BORDERLESS_BLUE_GLASS = registerGlassBlock("borderless_blue_glass", DyeColor.BLUE);
	public static final RegistryObject<Block> BORDERLESS_BLUE_PANE = registerGlassPaneBlock("blue", DyeColor.BLUE);

	public static final RegistryObject<StainedGlassBlock> BORDERLESS_BROWN_GLASS = registerGlassBlock("borderless_brown_glass", DyeColor.BROWN);
	public static final RegistryObject<Block> BORDERLESS_BROWN_PANE = registerGlassPaneBlock("brown", DyeColor.BROWN);

	public static final RegistryObject<StainedGlassBlock> BORDERLESS_CYAN_GLASS = registerGlassBlock("borderless_cyan_glass", DyeColor.CYAN);
	public static final RegistryObject<Block> BORDERLESS_CYAN_PANE = registerGlassPaneBlock("cyan", DyeColor.CYAN);

	public static final RegistryObject<StainedGlassBlock> BORDERLESS_GREEN_GLASS = registerGlassBlock("borderless_green_glass", DyeColor.GREEN);
	public static final RegistryObject<Block> BORDERLESS_GREEN_PANE = registerGlassPaneBlock("green", DyeColor.GREEN);

	public static final RegistryObject<StainedGlassBlock> BORDERLESS_GRAY_GLASS = registerGlassBlock("borderless_gray_glass", DyeColor.GRAY);
	public static final RegistryObject<Block> BORDERLESS_GRAY_PANE = registerGlassPaneBlock("gray", DyeColor.GRAY);

	public static final RegistryObject<StainedGlassBlock> BORDERLESS_LIGHT_BLUE_GLASS = registerGlassBlock("borderless_light_blue_glass", DyeColor.LIGHT_BLUE);
	public static final RegistryObject<Block> BORDERLESS_LIGHT_BLUE_PANE = registerGlassPaneBlock("light_blue", DyeColor.LIGHT_BLUE);

	public static final RegistryObject<StainedGlassBlock> BORDERLESS_LIGHT_GRAY_GLASS = registerGlassBlock("borderless_light_gray_glass", DyeColor.LIGHT_GRAY);
	public static final RegistryObject<Block> BORDERLESS_LIGHT_GRAY_PANE = registerGlassPaneBlock("light_gray", DyeColor.LIGHT_GRAY);

	public static final RegistryObject<StainedGlassBlock> BORDERLESS_LIME_GLASS = registerGlassBlock("borderless_lime_glass", DyeColor.LIME);
	public static final RegistryObject<Block> BORDERLESS_LIME_PANE = registerGlassPaneBlock("lime", DyeColor.LIME);

	public static final RegistryObject<StainedGlassBlock> BORDERLESS_MAGENTA_GLASS = registerGlassBlock("borderless_magenta_glass", DyeColor.MAGENTA);
	public static final RegistryObject<Block> BORDERLESS_MAGENTA_PANE = registerGlassPaneBlock("magenta", DyeColor.MAGENTA);
	public static final RegistryObject<StainedGlassBlock> BORDERLESS_ORANGE_GLASS = registerGlassBlock("borderless_orange_glass", DyeColor.ORANGE);
	public static final RegistryObject<Block> BORDERLESS_ORANGE_PANE = registerGlassPaneBlock("orange", DyeColor.ORANGE);

	public static final RegistryObject<StainedGlassBlock> BORDERLESS_PINK_GLASS = registerGlassBlock("borderless_pink_glass", DyeColor.PINK);
	public static final RegistryObject<Block> BORDERLESS_PINK_PANE = registerGlassPaneBlock("pink", DyeColor.PINK);

	public static final RegistryObject<StainedGlassBlock> BORDERLESS_PURPLE_GLASS = registerGlassBlock("borderless_purple_glass", DyeColor.PURPLE);
	public static final RegistryObject<Block> BORDERLESS_PURPLE_PANE = registerGlassPaneBlock("purple", DyeColor.PURPLE);

	public static final RegistryObject<StainedGlassBlock> BORDERLESS_RED_GLASS = registerGlassBlock("borderless_red_glass", DyeColor.RED);
	public static final RegistryObject<Block> BORDERLESS_RED_PANE = registerGlassPaneBlock("red", DyeColor.RED);

	public static final RegistryObject<StainedGlassBlock> BORDERLESS_YELLOW_GLASS = registerGlassBlock("borderless_yellow_glass", DyeColor.YELLOW);
	public static final RegistryObject<Block> BORDERLESS_YELLOW_PANE = registerGlassPaneBlock("yellow", DyeColor.YELLOW);

	public static final RegistryObject<StainedGlassBlock> BORDERLESS_BLACK_GLASS = registerGlassBlock("borderless_black_glass", DyeColor.BLACK);
	public static final RegistryObject<Block> BORDERLESS_BLACK_PANE = registerGlassPaneBlock("black", DyeColor.BLACK);

	//endregion


	public static RegistryObject<Block> registerBlock(final String name, Block.Properties properties) {
		return registerBlock(name, () -> new Block(properties));
	}

	public static RegistryObject<StairBlock> registerStairBlock(final String name, Supplier<Block> source) {
		return registerBlock(name, () -> new StairBlock(() -> source.get().defaultBlockState(), Block.Properties.of().mapColor(MapColor.STONE)));
	}

	public static RegistryObject<SlabBlock> registerSlabBlock(final String name) {
		return registerBlock(name, () -> new SlabBlock(Block.Properties.of().mapColor(MapColor.STONE)));
	}

	public static RegistryObject<WallBlock> registerWallBlock(final String name) {
		return registerBlock(name, () -> new WallBlock(Block.Properties.of().mapColor(MapColor.STONE)));
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
