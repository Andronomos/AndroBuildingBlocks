package andronomos.androbuildingblocks.registry;

import andronomos.androbuildingblocks.AndroBuildingBlocks;
import andronomos.androbuildingblocks.block.AndroRotatableBlock;
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
	public static Block.Properties GENERIC_PROPERTIES = BlockBehaviour.Properties.copy(Blocks.STONE);
	public static Block.Properties REINFORCED_CONCRETE_PROPERTIES = BlockBehaviour.Properties.copy(Blocks.WHITE_CONCRETE);
	public static Block.Properties METAL_PROPERTIES = BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK);
	public static Block.Properties GLASS_PROPERTIES = BlockBehaviour.Properties.copy(Blocks.GLASS).strength(0.75f);
	public static Block.Properties GLASS_PANE_PROPERTIES = BlockBehaviour.Properties.copy(Blocks.GLASS_PANE);
	public static Block.Properties DARK_PRISMARINE_PROPERTIES = BlockBehaviour.Properties.copy(Blocks.DARK_PRISMARINE);
	public static Block.Properties BASALT_PROPERTIES = BlockBehaviour.Properties.copy(Blocks.BASALT);

	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, AndroBuildingBlocks.MODID);

	public static final RegistryObject<Block> BLACK_REINFORCED_CONCRETE = registerBlock("black_reinforced_concrete", REINFORCED_CONCRETE_PROPERTIES);
	public static final RegistryObject<Block> BLUE_REINFORCED_CONCRETE = registerBlock("blue_reinforced_concrete", REINFORCED_CONCRETE_PROPERTIES);
	public static final RegistryObject<Block> BROWN_REINFORCED_CONCRETE = registerBlock("brown_reinforced_concrete", REINFORCED_CONCRETE_PROPERTIES);
	public static final RegistryObject<Block> GREEN_REINFORCED_CONCRETE = registerBlock("green_reinforced_concrete", REINFORCED_CONCRETE_PROPERTIES);
	public static final RegistryObject<Block> GRAY_REINFORCED_CONCRETE = registerBlock("gray_reinforced_concrete", REINFORCED_CONCRETE_PROPERTIES);
	public static final RegistryObject<Block> PURPLE_REINFORCED_CONCRETE = registerBlock("purple_reinforced_concrete", REINFORCED_CONCRETE_PROPERTIES);
	public static final RegistryObject<Block> RED_REINFORCED_CONCRETE = registerBlock("red_reinforced_concrete", REINFORCED_CONCRETE_PROPERTIES);
	public static final RegistryObject<Block> WHITE_REINFORCED_CONCRETE = registerBlock("white_reinforced_concrete", REINFORCED_CONCRETE_PROPERTIES);

	public static final RegistryObject<Block> STEEL = registerBlock("steel", () -> new Block(METAL_PROPERTIES));
	public static final RegistryObject<Block> STEEL_TILE = registerBlock("steel_tile", METAL_PROPERTIES);

	public static final RegistryObject<Block> YELLOW_CAUTION_STRIPES = registerBlock("yellow_caution_stripes", () -> new Block(GENERIC_PROPERTIES));
	public static final RegistryObject<Block> RED_CAUTION_STRIPES = registerHorizontalBlock("red_caution_stripes", GENERIC_PROPERTIES);

	public static final RegistryObject<Block> GRAPHITE = registerBlock("graphite", () -> new Block(METAL_PROPERTIES));
	public static final RegistryObject<Block> GRAPHITE_MESH = registerBlock("graphite_mesh", METAL_PROPERTIES);
	public static final RegistryObject<Block> GRAPHITE_TILE = registerBlock("graphite_tile", METAL_PROPERTIES);
	public static final RegistryObject<Block> GRAPHITE_PILLAR = registerRotatableBlock("graphite_pillar", "graphite", METAL_PROPERTIES);

	public static final RegistryObject<Block> CHARRED_STONE = registerHorizontalBlock("charred_stone", GENERIC_PROPERTIES);
	public static final RegistryObject<Block> SHALE = registerHorizontalBlock("shale", GENERIC_PROPERTIES);
	public static final RegistryObject<Block> MOSSY_COBBLED_DEEPLSATE = registerBlock("mossy_cobbled_deepslate", GENERIC_PROPERTIES);
	public static final RegistryObject<Block> MOSSY_DEEPLSATE_BRICKS = registerBlock("mossy_deepslate_bricks", GENERIC_PROPERTIES);
	public static final RegistryObject<Block> DARK_PRISMARINE_BRICKS = registerBlock("dark_prismarine_bricks", DARK_PRISMARINE_PROPERTIES);
	public static final RegistryObject<Block> SANDED_DARK_PRISMARINE_BRICKS = registerBlock("sanded_dark_prismarine_bricks", DARK_PRISMARINE_PROPERTIES);
	public static final RegistryObject<Block> BASALT_BRICKS = registerBlock("basalt_bricks", BASALT_PROPERTIES);
	public static final RegistryObject<Block> SANDED_BASALT_BRICKS = registerBlock("sanded_basalt_bricks", BASALT_PROPERTIES);
	public static final RegistryObject<Block> SANDED_BASALT = registerBlock("sanded_basalt", BlockBehaviour.Properties.copy(Blocks.BASALT));
	public static final RegistryObject<Block> SANDED_GRANITE = registerBlock("sanded_granite", BlockBehaviour.Properties.copy(Blocks.GRANITE));
	public static final RegistryObject<Block> SANDED_DEEPSLATE = registerBlock("sanded_deepslate", BlockBehaviour.Properties.copy(Blocks.DEEPSLATE));
	public static final RegistryObject<Block> SANDED_DEEPSLATE_BRICKS = registerBlock("sanded_deepslate_bricks", BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_BRICKS));
	public static final RegistryObject<Block> SANDED_NETHERRACK = registerBlock("sanded_netherrack", BlockBehaviour.Properties.copy(Blocks.NETHERRACK));

	public static void registerBlocks() {
		registerVariants(BLACK_REINFORCED_CONCRETE, "black_reinforced_concrete", REINFORCED_CONCRETE_PROPERTIES, true, true, true);
		registerVariants(BLUE_REINFORCED_CONCRETE, "blue_reinforced_concrete", REINFORCED_CONCRETE_PROPERTIES, true, true, true);
		registerVariants(BROWN_REINFORCED_CONCRETE, "brown_reinforced_concrete", REINFORCED_CONCRETE_PROPERTIES, true, true, true);
		registerVariants(GREEN_REINFORCED_CONCRETE, "green_reinforced_concrete", REINFORCED_CONCRETE_PROPERTIES, true, true, true);
		registerVariants(GRAY_REINFORCED_CONCRETE, "gray_reinforced_concrete", REINFORCED_CONCRETE_PROPERTIES, true, true, true);
		registerVariants(PURPLE_REINFORCED_CONCRETE, "purple_reinforced_concrete", REINFORCED_CONCRETE_PROPERTIES, true, true, true);
		registerVariants(RED_REINFORCED_CONCRETE, "red_reinforced_concrete", REINFORCED_CONCRETE_PROPERTIES, true, true, true);
		registerVariants(WHITE_REINFORCED_CONCRETE, "white_reinforced_concrete", REINFORCED_CONCRETE_PROPERTIES, true, true, true);

		for(DyeColor color : DyeColor.values()) {
			registerGlassBlock(color + "_structural_glass", color);
			registerStainedGlassPaneBlock(color + "_structural_glass_pane", color);
		}

		registerVariants(YELLOW_CAUTION_STRIPES, "yellow_caution_stripes", GENERIC_PROPERTIES, false, true, true);
		registerVariants(RED_CAUTION_STRIPES, "red_caution_stripes", GENERIC_PROPERTIES, false, true, true);

		registerVariants(STEEL, "steel", METAL_PROPERTIES, true, true, true);
		registerVariants(STEEL_TILE, "steel_tile", METAL_PROPERTIES, true, true, true);

		registerVariants(GRAPHITE, "graphite", METAL_PROPERTIES, true, true, true);
		registerVariants(GRAPHITE_MESH, "graphite_mesh", METAL_PROPERTIES, true, true, true);
		registerVariants(GRAPHITE_TILE, "graphite_tile", METAL_PROPERTIES, true, true, true);

		registerVariants(CHARRED_STONE, "charred_stone", GENERIC_PROPERTIES, true, true, true);
		registerVariants(SHALE, "shale", GENERIC_PROPERTIES, true, true, true);
		registerVariants(MOSSY_COBBLED_DEEPLSATE, "mossy_cobbled_deepslate", BlockBehaviour.Properties.copy(Blocks.COBBLED_DEEPSLATE), true, true, true);
		registerVariants(MOSSY_DEEPLSATE_BRICKS, "mossy_deepslate_bricks", BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_BRICKS), true, true, true);
		registerVariants(DARK_PRISMARINE_BRICKS, "dark_prismarine_bricks", DARK_PRISMARINE_PROPERTIES, true, true, true);
		registerVariants(SANDED_DARK_PRISMARINE_BRICKS, "sanded_dark_prismarine_bricks", DARK_PRISMARINE_PROPERTIES, true, true, true);
		registerVariants(SANDED_DEEPSLATE_BRICKS, "sanded_deepslate_bricks", BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_BRICKS), true, true, true);
		registerVariants(SANDED_DEEPSLATE, "sanded_deepslate", BlockBehaviour.Properties.copy(Blocks.DEEPSLATE), true, true, true);
		registerVariants(SANDED_GRANITE, "sanded_granite", BlockBehaviour.Properties.copy(Blocks.GRANITE), true, true, true);
		registerVariants(BASALT_BRICKS, "basalt_bricks", BASALT_PROPERTIES, true, true, true);
		registerVariants(SANDED_BASALT_BRICKS, "sanded_basalt_bricks", BASALT_PROPERTIES, true, true, true);
		registerVariants(SANDED_BASALT, "sanded_basalt", BlockBehaviour.Properties.copy(Blocks.BASALT), true, true, true);
		registerVariants(SANDED_NETHERRACK, "sanded_netherrack", BlockBehaviour.Properties.copy(Blocks.GRANITE), true, true, true);
	}

	private static void registerVariants(RegistryObject<Block> block, String name, Block.Properties properties, boolean stairs, boolean slab, boolean wall) {
		if(stairs) {
			registerStairBlock(String.format("%s_stairs", name), block, properties);
		}

		if(slab) {
			registerSlabBlock(String.format("%s_slab", name), properties);
		}

		if(wall) {
			registerWallBlock(String.format("%s_wall", name), properties);
		}
	}

	private static RegistryObject<Block> registerRotatableBlock(final String blockName, final String topResource, Block.Properties properties) {
		return registerBlock(blockName, () -> new AndroRotatableBlock(properties, topResource));
	}

	private static RegistryObject<Block> registerHorizontalBlock(final String blockName, Block.Properties properties) {
		return registerBlock(blockName, () -> new GlazedTerracottaBlock(properties));
	}

	private static RegistryObject<StairBlock> registerStairBlock(final String name, Supplier<Block> source, Block.Properties properties) {
		return registerBlock(name, () -> new StairBlock(() -> source.get().defaultBlockState(), properties));
	}

	private static RegistryObject<SlabBlock> registerSlabBlock(final String name, Block.Properties properties) {
		return registerBlock(name, () -> new SlabBlock(properties));
	}

	private static RegistryObject<WallBlock> registerWallBlock(final String name, Block.Properties properties) {
		return registerBlock(name, () -> new WallBlock(properties));
	}

	private static RegistryObject<StainedGlassBlock> registerGlassBlock(final String name, DyeColor color) {
		return registerBlock(name, () -> new StainedGlassBlock(color, GLASS_PROPERTIES));
	}

	private static RegistryObject<Block> registerStainedGlassPaneBlock(final String name, DyeColor color) {
		return registerBlock(name, () -> new StainedGlassPaneBlock(color, GLASS_PANE_PROPERTIES));
	}

	private static RegistryObject<Block> registerBlock(final String name, Block.Properties properties) {
		return registerBlock(name, () -> new Block(properties));
	}

	private static <BLOCK extends Block> RegistryObject<BLOCK> registerBlock(final String name, final Supplier<BLOCK> blockFactory) {
		final RegistryObject<BLOCK> block = BLOCKS.register(name, blockFactory);
		ItemRegistry.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
		return block;
	}
}
