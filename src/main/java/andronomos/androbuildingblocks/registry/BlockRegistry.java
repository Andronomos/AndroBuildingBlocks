package andronomos.androbuildingblocks.registry;

import andronomos.androbuildingblocks.AndroBuildingBlocks;
import andronomos.androbuildingblocks.block.BlockCategories;
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
	public static Block.Properties GLASS_PROPERTIES = BlockBehaviour.Properties.copy(Blocks.GLASS).strength(0.75f);
	public static Block.Properties GLASS_PANE_PROPERTIES = BlockBehaviour.Properties.copy(Blocks.GLASS_PANE);
	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, AndroBuildingBlocks.MODID);

	public static void registerReinforcedConcrete() {
		BlockCategories.REINFORCED_CONCRETE_BLOCKS.types.forEach(type -> {
			Item dye = ForgeRegistries.ITEMS.getValue(new ResourceLocation("minecraft", String.format("%s_dye", type.name)));
			BlockBehaviour.Properties properties = BlockCategories.REINFORCED_CONCRETE_BLOCKS.properties.mapColor(type.getDyeColor());

			if(dye != null) {
				RegistryObject<Block> concreteBlock;

				if(type.isRotatable) {
					concreteBlock = registerRotatableBlock(String.format("%s_reinforced_concrete", type.name), properties);
				} else {
					concreteBlock = registerBlock(String.format("%s_reinforced_concrete", type.name), properties);
				}

				if(type.hasStairVariant) {
					registerStairBlock(String.format("%s_reinforced_concrete_stairs", type.name), concreteBlock, properties);
				}

				if(type.hasSlabVariant) {
					registerSlabBlock(String.format("%s_reinforced_concrete_slab", type.name), properties);
				}

				if(type.hasWallVariant) {
					registerWallBlock(String.format("%s_reinforced_concrete_wall", type.name), properties);
				}
			}
		});
	}

	public static void registerGlassBlocks() {
		BlockCategories.STRUCTURAL_GLASS_BLOCKS.types.forEach(type -> {
			registerGlassBlock(String.format("%s_structural_glass", type.dyeColor), type.dyeColor);
			registerStainedGlassPaneBlock(type.dyeColor.getName() + "_structural_glass_pane", type.dyeColor);
		});
	}

	public static void registerSteelBlocks() {
		BlockBehaviour.Properties properties = BlockCategories.STEEL_BLOCKS.properties;
		RegistryObject<Block> steelBlock = registerBlock(BlockCategories.STEEL_BLOCKS.name, properties);
		registerStairBlock(String.format("%s_stairs", BlockCategories.STEEL_BLOCKS.name), steelBlock, properties);
		registerSlabBlock(String.format("%s_slab", BlockCategories.STEEL_BLOCKS.name), properties);
		registerWallBlock(String.format("%s_wall", BlockCategories.STEEL_BLOCKS.name), properties);

		BlockCategories.STEEL_BLOCKS.types.forEach(type -> {
			if(type.isRotatable) {
				registerRotatableBlock(String.format("steel_%s", type.name), properties);
			} else {
				registerBlock(String.format("steel_%s", type.name), properties);
			}

			if(type.hasStairVariant) {
				registerStairBlock(String.format("%s_%s_stairs", BlockCategories.STEEL_BLOCKS.name, type.name), steelBlock, properties);
			}

			if(type.hasSlabVariant) {
				registerSlabBlock(String.format("%s_%s_slab", BlockCategories.STEEL_BLOCKS.name, type.name), properties);
			}

			if(type.hasWallVariant) {
				registerWallBlock(String.format("%s_%s_wall", BlockCategories.STEEL_BLOCKS.name, type.name), properties);
			}
		});
	}

	public static void registerGraphiteBlocks()
	{
		BlockBehaviour.Properties properties = BlockCategories.GRAPHITE_BLOCKS.properties;
		RegistryObject<Block> graphiteBlock = registerBlock(BlockCategories.GRAPHITE_BLOCKS.name, properties);
		registerStairBlock(String.format("%s_stairs", BlockCategories.GRAPHITE_BLOCKS.name), graphiteBlock, properties);
		registerSlabBlock(String.format("%s_slab", BlockCategories.GRAPHITE_BLOCKS.name), properties);
		registerWallBlock(String.format("%s_wall", BlockCategories.GRAPHITE_BLOCKS.name), properties);

		BlockCategories.GRAPHITE_BLOCKS.types.forEach(type -> {
			if(type.isRotatable) {
				registerRotatableBlock(String.format("%s_%s", BlockCategories.GRAPHITE_BLOCKS.name, type.name), properties);
			} else {
				registerBlock(String.format("%s_%s", BlockCategories.GRAPHITE_BLOCKS.name, type.name), properties);
			}

			if(type.hasStairVariant) {
				registerStairBlock(String.format("%s_%s_stairs", BlockCategories.GRAPHITE_BLOCKS.name, type.name), graphiteBlock, properties);
			}

			if(type.hasSlabVariant) {
				registerSlabBlock(String.format("%s_%s_slab", BlockCategories.GRAPHITE_BLOCKS.name, type.name), properties);
			}

			if(type.hasWallVariant) {
				registerWallBlock(String.format("%s_%s_wall", BlockCategories.GRAPHITE_BLOCKS.name, type.name), properties);
			}
		});
	}

	//region Caution
	//public static final RegistryObject<Block> YELLOW_CAUTION_STRIPES = registerBlock("yellow_caution_stripes", STONE_PROPERTIES.mapColor(DyeColor.YELLOW));
	//public static final RegistryObject<Block> RED_CAUTION_STRIPES = registerBlock("red_caution_stripes", STONE_PROPERTIES.mapColor(DyeColor.YELLOW));
	//endregion

	private static RegistryObject<Block> registerRotatableBlock(final String name, Block.Properties properties) {
		return registerBlock(name, () -> new RotatedPillarBlock(properties));
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
		return registerBlock(name, () -> new BuildingBlock(properties, false));
	}

	private static RegistryObject<Block> registerBlock(final String name, Block.Properties properties, boolean isTranslucent) {
		return registerBlock(name, () -> new BuildingBlock(properties, isTranslucent));
	}

	private static <BLOCK extends Block> RegistryObject<BLOCK> registerBlock(final String name, final Supplier<BLOCK> blockFactory) {
		final RegistryObject<BLOCK> block = BLOCKS.register(name, blockFactory);
		ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
		return block;
	}
}
