package andronomos.androbuildingblocks.registry;

import andronomos.androbuildingblocks.AndroBuildingBlocks;
import andronomos.androbuildingblocks.block.BlockList;
import andronomos.androbuildingblocks.block.BuildingBlock;
import net.minecraft.resources.ResourceLocation;
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
	public static Block.Properties GLASS_PROPERTIES = BlockBehaviour.Properties.copy(Blocks.GLASS).strength(0.75f);
	public static Block.Properties GLASS_PANE_PROPERTIES = BlockBehaviour.Properties.copy(Blocks.GLASS_PANE);
	public static Block.Properties METAL_PROPERTIES = BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK);

	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, AndroBuildingBlocks.MODID);

	public static void registerReinforcedConcrete() {
		BlockList.CONCRETE_BLOCKS.types.forEach(type -> {
			Item dye = ForgeRegistries.ITEMS.getValue(new ResourceLocation("minecraft", String.format("%s_dye", type)));
			DyeColor dyeColor = DyeColor.valueOf(type.name.toUpperCase());

			if(dye != null) {
				RegistryObject<Block> concreteBlock = registerBlock(String.format("%s_reinforced_concrete", type), CONCRETE_PROPERTIES.mapColor(dyeColor));

				if(type.hasStairVariant) {
					registerStairBlock(String.format("%s_reinforced_concrete_stairs", type), concreteBlock, CONCRETE_PROPERTIES.mapColor(dyeColor));
				}

				if(type.hasSlabVariant) {
					registerSlabBlock(String.format("%s_reinforced_concrete_slab", type), CONCRETE_PROPERTIES.mapColor(dyeColor));
				}

				if(type.hasWallVariant) {
					registerWallBlock(String.format("%s_reinforced_concrete_wall", type), CONCRETE_PROPERTIES.mapColor(dyeColor));
				}
			}
		});

		for(DyeColor color : DyeColor.values()) {
			registerGlassBlock(String.format("%s_structural_glass", color), color);
			registerStainedGlassPaneBlock(color.getName(), color);
		}
	}


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
	public static final RegistryObject<Block> STEEL_PLATE = registerBlock("steel_plate", METAL_PROPERTIES);
	//endregion

	public static final RegistryObject<Block> GRAPHITE = registerBlock("graphite", METAL_PROPERTIES);
	public static final RegistryObject<StairBlock> GRAPHITE_STAIRS = registerStairBlock("graphite_stairs", GRAPHITE, METAL_PROPERTIES);
	public static final RegistryObject<SlabBlock> GRAPHITE_SLAB = registerSlabBlock("graphite_slab", METAL_PROPERTIES);
	public static final RegistryObject<WallBlock> GRAPHITE_WALL = registerWallBlock("graphite_wall", METAL_PROPERTIES);
	public static final RegistryObject<Block> GRAPHITE_GRATE = registerRotatableBlock("graphite_grate", METAL_PROPERTIES);
	public static final RegistryObject<Block> GRAPHITE_MESH = registerBlock("graphite_mesh", METAL_PROPERTIES);
	public static final RegistryObject<Block> GRAPHITE_TILE = registerBlock("graphite_tile", METAL_PROPERTIES);
	public static final RegistryObject<StairBlock> GRAPHITE_TILE_STAIRS = registerStairBlock("graphite_tile_stairs", GRAPHITE_TILE, METAL_PROPERTIES);
	public static final RegistryObject<SlabBlock> GRAPHITE_TILE_SLAB = registerSlabBlock("graphite_tile_slab", METAL_PROPERTIES);
	public static final RegistryObject<WallBlock> GRAPHITE_TILE_WALL = registerWallBlock("graphite_tile_wall", METAL_PROPERTIES);







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
