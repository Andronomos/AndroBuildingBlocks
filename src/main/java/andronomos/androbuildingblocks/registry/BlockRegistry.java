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

	public static RegistryObject<Block> BLACK_REINFORCED_CONCRETE;
	public static RegistryObject<Block> BLACK_REINFORCED_CONCRETE_TILE;
	public static RegistryObject<Block> BLACK_REINFORCED_CONCRETE_BRICKS;
	public static RegistryObject<Block> BLUE_REINFORCED_CONCRETE;
	public static RegistryObject<Block> BLUE_REINFORCED_CONCRETE_TILE;
	public static RegistryObject<Block> BLUE_REINFORCED_CONCRETE_BRICKS;
	public static RegistryObject<Block> BROWN_REINFORCED_CONCRETE;
	public static RegistryObject<Block> BROWN_REINFORCED_CONCRETE_TILE;
	public static RegistryObject<Block> BROWN_REINFORCED_CONCRETE_BRICKS;
	public static RegistryObject<Block> GREEN_REINFORCED_CONCRETE;
	public static RegistryObject<Block> GREEN_REINFORCED_CONCRETE_TILE;
	public static RegistryObject<Block> GREEN_REINFORCED_CONCRETE_BRICKS;
	public static RegistryObject<Block> GRAY_REINFORCED_CONCRETE;
	public static RegistryObject<Block> GRAY_REINFORCED_CONCRETE_TILE;
	public static RegistryObject<Block> GRAY_REINFORCED_CONCRETE_BRICKS;
	public static RegistryObject<Block> PINK_REINFORCED_CONCRETE;
	public static RegistryObject<Block> PINK_REINFORCED_CONCRETE_TILE;
	public static RegistryObject<Block> PINK_REINFORCED_CONCRETE_BRICKS;
	public static RegistryObject<Block> PURPLE_REINFORCED_CONCRETE;
	public static RegistryObject<Block> PURPLE_REINFORCED_CONCRETE_TILE;
	public static RegistryObject<Block> PURPLE_REINFORCED_CONCRETE_BRICKS;
	public static RegistryObject<Block> RED_REINFORCED_CONCRETE;
	public static RegistryObject<Block> RED_REINFORCED_CONCRETE_TILE;
	public static RegistryObject<Block> RED_REINFORCED_CONCRETE_BRICKS;
	public static RegistryObject<Block> WHITE_REINFORCED_CONCRETE;
	public static RegistryObject<Block> WHITE_REINFORCED_CONCRETE_TILE;
	public static RegistryObject<Block> WHITE_REINFORCED_CONCRETE_BRICKS;
	public static RegistryObject<Block> STEEL;
	public static RegistryObject<Block> STEEL_SIDING;
	public static RegistryObject<Block> END_STEEL;
	public static RegistryObject<Block> END_STEEL_SIDING;
	public static RegistryObject<Block> CHARRED_STONE;
	public static RegistryObject<Block> MOSSY_COBBLED_DEEPLSATE;
	public static RegistryObject<Block> MOSSY_DEEPLSATE_BRICKS;
	public static RegistryObject<Block> DARK_PRISMARINE_BRICKS;
	public static RegistryObject<Block> BASALT_BRICKS;
	public static RegistryObject<Block> SANDED_ANDESITE;
	public static RegistryObject<Block> SANDED_DARK_PRISMARINE;
	public static RegistryObject<Block> SANDED_GRANITE;
	public static RegistryObject<Block> SANDED_DEEPSLATE;
	public static RegistryObject<Block> SANDED_BASALT;
	public static RegistryObject<Block> SANDED_NETHERRACK;
	public static RegistryObject<Block> SANDED_NETHERBRICKS;
	public static RegistryObject<Block> SANDED_PACKED_MUD;
	public static RegistryObject<Block> SANDED_CALCITE;
	public static RegistryObject<Block> SANDED_STONE;
	public static RegistryObject<Block> SANDED_BLACKSTONE;
	public static RegistryObject<Block> SANDED_END_STONE;
	public static RegistryObject<Block> SANDED_DRIPSTONE;
	public static RegistryObject<Block> SANDED_TUFF;
	public static RegistryObject<Block> SILT;

	public static void registerBlocks() {
		BLACK_REINFORCED_CONCRETE = registerBlockAndVariants("black_reinforced_concrete", REINFORCED_CONCRETE_PROPERTIES);
		BLACK_REINFORCED_CONCRETE_TILE = registerBlockAndVariants("black_reinforced_concrete_tile", REINFORCED_CONCRETE_PROPERTIES, true, true, true, false);
		BLACK_REINFORCED_CONCRETE_BRICKS = registerBlockAndVariants("black_reinforced_concrete_bricks", REINFORCED_CONCRETE_PROPERTIES, true, true, true, false);
		BLUE_REINFORCED_CONCRETE = registerBlockAndVariants("blue_reinforced_concrete", REINFORCED_CONCRETE_PROPERTIES);
		BLUE_REINFORCED_CONCRETE_TILE = registerBlockAndVariants("blue_reinforced_concrete_tile", REINFORCED_CONCRETE_PROPERTIES, true, true, true, false);
		BLUE_REINFORCED_CONCRETE_BRICKS = registerBlockAndVariants("blue_reinforced_concrete_bricks", REINFORCED_CONCRETE_PROPERTIES, true, true, true, false);
		BROWN_REINFORCED_CONCRETE = registerBlockAndVariants("brown_reinforced_concrete", REINFORCED_CONCRETE_PROPERTIES);
		BROWN_REINFORCED_CONCRETE_TILE = registerBlockAndVariants("brown_reinforced_concrete_tile", REINFORCED_CONCRETE_PROPERTIES, true, true, true, false);
		BROWN_REINFORCED_CONCRETE_BRICKS = registerBlockAndVariants("brown_reinforced_concrete_bricks", REINFORCED_CONCRETE_PROPERTIES, true, true, true, false);
		GREEN_REINFORCED_CONCRETE = registerBlockAndVariants("green_reinforced_concrete", REINFORCED_CONCRETE_PROPERTIES);
		GREEN_REINFORCED_CONCRETE_TILE = registerBlockAndVariants("green_reinforced_concrete_tile", REINFORCED_CONCRETE_PROPERTIES, true, true, true, false);
		GREEN_REINFORCED_CONCRETE_BRICKS = registerBlockAndVariants("green_reinforced_concrete_bricks", REINFORCED_CONCRETE_PROPERTIES, true, true, true, false);
		GRAY_REINFORCED_CONCRETE = registerBlockAndVariants("gray_reinforced_concrete", REINFORCED_CONCRETE_PROPERTIES);
		GRAY_REINFORCED_CONCRETE_TILE = registerBlockAndVariants("gray_reinforced_concrete_tile", REINFORCED_CONCRETE_PROPERTIES, true, true, true, false);
		GRAY_REINFORCED_CONCRETE_BRICKS = registerBlockAndVariants("gray_reinforced_concrete_bricks", REINFORCED_CONCRETE_PROPERTIES, true, true, true, false);
		PURPLE_REINFORCED_CONCRETE = registerBlockAndVariants("purple_reinforced_concrete", REINFORCED_CONCRETE_PROPERTIES);
		PURPLE_REINFORCED_CONCRETE_TILE = registerBlockAndVariants("purple_reinforced_concrete_tile", REINFORCED_CONCRETE_PROPERTIES, true, true, true, false);
		PURPLE_REINFORCED_CONCRETE_BRICKS = registerBlockAndVariants("purple_reinforced_concrete_bricks", REINFORCED_CONCRETE_PROPERTIES, true, true, true, false);
		PINK_REINFORCED_CONCRETE = registerBlockAndVariants("pink_reinforced_concrete", REINFORCED_CONCRETE_PROPERTIES);
		PINK_REINFORCED_CONCRETE_TILE = registerBlockAndVariants("pink_reinforced_concrete_tile", REINFORCED_CONCRETE_PROPERTIES, true, true, true, false);
		PINK_REINFORCED_CONCRETE_BRICKS = registerBlockAndVariants("pink_reinforced_concrete_bricks", REINFORCED_CONCRETE_PROPERTIES, true, true, true, false);
		RED_REINFORCED_CONCRETE = registerBlockAndVariants("red_reinforced_concrete", REINFORCED_CONCRETE_PROPERTIES);
		RED_REINFORCED_CONCRETE_TILE = registerBlockAndVariants("red_reinforced_concrete_tile", REINFORCED_CONCRETE_PROPERTIES, true, true, true, false);
		RED_REINFORCED_CONCRETE_BRICKS = registerBlockAndVariants("red_reinforced_concrete_bricks", REINFORCED_CONCRETE_PROPERTIES, true, true, true, false);
		WHITE_REINFORCED_CONCRETE = registerBlockAndVariants("white_reinforced_concrete", REINFORCED_CONCRETE_PROPERTIES);
		WHITE_REINFORCED_CONCRETE_TILE = registerBlockAndVariants("white_reinforced_concrete_tile", REINFORCED_CONCRETE_PROPERTIES, true, true, true, false);
		WHITE_REINFORCED_CONCRETE_BRICKS = registerBlockAndVariants("white_reinforced_concrete_bricks", REINFORCED_CONCRETE_PROPERTIES, true, true, true, false);

		STEEL = registerBlockAndVariants("steel", METAL_PROPERTIES, true, true, true, false);
		STEEL_SIDING = registerBlockAndVariants("steel_siding", METAL_PROPERTIES, true, true, true, false);

		END_STEEL = registerBlockAndVariants("end_steel", METAL_PROPERTIES, true, true, true, false);
		END_STEEL_SIDING = registerBlockAndVariants("end_steel_siding", METAL_PROPERTIES, true, true, true, false);

		CHARRED_STONE = registerBlockAndVariants("charred_stone", GENERIC_PROPERTIES);
		MOSSY_COBBLED_DEEPLSATE = registerBlockAndVariants("mossy_cobbled_deepslate", GENERIC_PROPERTIES);
		MOSSY_DEEPLSATE_BRICKS = registerBlockAndVariants("mossy_deepslate_bricks", GENERIC_PROPERTIES, true, true, true, false);
		DARK_PRISMARINE_BRICKS = registerBlockAndVariants("dark_prismarine_bricks", DARK_PRISMARINE_PROPERTIES, true, true, true, false);
		BASALT_BRICKS = registerBlockAndVariants("basalt_bricks", BASALT_PROPERTIES, true, true, true, false);

		SANDED_ANDESITE = registerBlockAndVariants("sanded_andesite", BlockBehaviour.Properties.copy(Blocks.ANDESITE));
		SANDED_DARK_PRISMARINE = registerBlockAndVariants("sanded_dark_prismarine", DARK_PRISMARINE_PROPERTIES);
		SANDED_GRANITE = registerBlockAndVariants("sanded_granite", BlockBehaviour.Properties.copy(Blocks.GRANITE));
		SANDED_DEEPSLATE = registerBlockAndVariants("sanded_deepslate", BlockBehaviour.Properties.copy(Blocks.DEEPSLATE));
		SANDED_BASALT = registerBlockAndVariants("sanded_basalt", BASALT_PROPERTIES);
		SANDED_NETHERRACK = registerBlockAndVariants("sanded_netherrack", BlockBehaviour.Properties.copy(Blocks.NETHERRACK));
		SANDED_NETHERBRICKS = registerBlockAndVariants("sanded_netherbricks", BlockBehaviour.Properties.copy(Blocks.NETHER_BRICKS));
		SANDED_PACKED_MUD = registerBlockAndVariants("sanded_packed_mud", BlockBehaviour.Properties.copy(Blocks.PACKED_MUD));
		SANDED_CALCITE = registerBlockAndVariants("sanded_calcite", BlockBehaviour.Properties.copy(Blocks.PACKED_MUD));
		SANDED_STONE = registerBlockAndVariants("sanded_stone", GENERIC_PROPERTIES);
		SANDED_BLACKSTONE = registerBlockAndVariants("sanded_blackstone", BlockBehaviour.Properties.copy(Blocks.BLACKSTONE));
		SANDED_END_STONE = registerBlockAndVariants("sanded_end_stone", BlockBehaviour.Properties.copy(Blocks.END_STONE));
		SANDED_DRIPSTONE = registerBlockAndVariants("sanded_dripstone", BlockBehaviour.Properties.copy(Blocks.DRIPSTONE_BLOCK));
		SANDED_TUFF = registerBlockAndVariants("sanded_tuff", BlockBehaviour.Properties.copy(Blocks.TUFF));
		SILT = registerBlockAndVariants("silt", BlockBehaviour.Properties.copy(Blocks.SOUL_SAND));

		for(DyeColor color : DyeColor.values()) {
			registerGlassBlock(color + "_structural_glass", color);
			registerStainedGlassPaneBlock(color + "_structural_glass_pane", color);
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

	private static RegistryObject<FenceBlock> registerFenceBlock(final String name, Block.Properties properties) {
		return registerBlock(name, () -> new FenceBlock(properties));
	}

	private static RegistryObject<StainedGlassBlock> registerGlassBlock(final String name, DyeColor color) {
		return registerBlock(name, () -> new StainedGlassBlock(color, GLASS_PROPERTIES));
	}

	private static RegistryObject<Block> registerStainedGlassPaneBlock(final String name, DyeColor color) {
		return registerBlock(name, () -> new StainedGlassPaneBlock(color, GLASS_PANE_PROPERTIES));
	}

	private static RegistryObject<Block> registerBlockAndVariants(final String name, Block.Properties properties) {
		return registerBlockAndVariants(name, properties, true, true, true, true);
	}

	private static RegistryObject<Block> registerBlockAndVariants(final String name, Block.Properties properties, boolean stairs, boolean slab, boolean wall, boolean fence) {
		RegistryObject<Block> block = registerBlock(name, () -> new Block(properties));
		registerVariants(block, name, properties, stairs, slab, wall, fence);
		return block;
	}

	private static void registerVariants(RegistryObject<Block> block, String name, Block.Properties properties, boolean stairs, boolean slab, boolean wall, boolean fence) {
		if (name.contains("bricks")) {
			name = name.replace("bricks", "brick");
		}

		if(stairs) {
			registerStairBlock(String.format("%s_stairs", name), block, properties);
		}

		if(slab) {
			registerSlabBlock(String.format("%s_slab", name), properties);
		}

		if(wall) {
			registerWallBlock(String.format("%s_wall", name), properties);
		}

		if(fence) {
			registerFenceBlock(String.format("%s_fence", name), properties);
		}
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
