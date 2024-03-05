package andronomos.androbuildingblocks.registry;

import andronomos.androbuildingblocks.AndroBuildingBlocks;
import andronomos.androbuildingblocks.block.AndroSlabBlock;
import andronomos.androbuildingblocks.block.BlockCategories;
import andronomos.androbuildingblocks.block.AndroBlock;
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


	public static void registerBlocks() {
		BlockCategories.AndroBlockCategories.forEach(blockCategory -> {
			BlockBehaviour.Properties properties = blockCategory.properties;

			if(blockCategory.sourceBlock != null) {
				RegistryObject<Block> sourceBlock = registerBlock(blockCategory.sourceBlock.name, properties);

				//String sourceBlockName;

				//if(blockCategory.sourceBlock.baseNamePrefixed) {
				//	sourceBlockName = String.format("%s_%s", blockCategory.baseName, blockCategory.sourceBlock.name);
				//} else {
				//	sourceBlockName = String.format("%s_%s", blockCategory.sourceBlock.name, blockCategory.baseName);
				//}

				if(blockCategory.sourceBlock.hasStairVariant) {
					registerStairBlock(String.format("%s_stairs", blockCategory.sourceBlock.name), sourceBlock, properties);
				}

				if(blockCategory.sourceBlock.hasSlabVariant) {
					registerSlabBlock(String.format("%s_slab", blockCategory.sourceBlock.name), properties, blockCategory.sourceBlock.hasTransparency);
				}

				if(blockCategory.sourceBlock.hasWallVariant) {
					registerWallBlock(String.format("%s_wall", blockCategory.sourceBlock.name), properties);
				}
			}

			blockCategory.blockTypes.forEach(blockType -> {
				if(blockType.hasTransparency) {
					properties.noOcclusion();
				}

				if(blockType.isGlass) {
					registerGlassBlock(blockType.name, blockType.dyeColor);
					registerStainedGlassPaneBlock(String.format("%s_pane", blockType.name), blockType.dyeColor);
				} else {
					RegistryObject<Block> subBlock;

					if(blockType.isRotatable) {
						subBlock = registerRotatableBlock(blockType.name, properties);
					} else {
						subBlock = registerBlock(blockType.name, properties, blockType.hasTransparency);
					}

					if(blockType.hasStairVariant) {
						registerStairBlock(String.format("%s_stairs", blockType.name), subBlock, properties);
					}

					if(blockType.hasSlabVariant) {
						registerSlabBlock(String.format("%s_slab", blockType.name), properties, blockType.hasTransparency);
					}

					if(blockType.hasWallVariant) {
						registerWallBlock(String.format("%s_wall", blockType.name), properties);
					}
				}
			});
		});
	}

	public static void registerReinforcedConcrete() {
		BlockCategories.REINFORCED_CONCRETE_BLOCKS.blockTypes.forEach(blockType -> {
			Item dye = ForgeRegistries.ITEMS.getValue(new ResourceLocation("minecraft", String.format("%s_dye", blockType.name)));
			BlockBehaviour.Properties properties = BlockCategories.REINFORCED_CONCRETE_BLOCKS.properties.mapColor(blockType.dyeColor);

			if(dye != null) {
				if(blockType.hasTransparency) {
					properties.noOcclusion();
				}

				RegistryObject<Block> subBlock;

				if(blockType.isRotatable) {
					subBlock = registerRotatableBlock(String.format("%s_reinforced_concrete", blockType.name), properties);
				} else {
					subBlock = registerBlock(String.format("%s_reinforced_concrete", blockType.name), properties, blockType.hasTransparency);
				}

				if(blockType.hasStairVariant) {
					registerStairBlock(String.format("%s_reinforced_concrete_stairs", blockType.name), subBlock, properties);
				}

				if(blockType.hasSlabVariant) {
					registerSlabBlock(String.format("%s_reinforced_concrete_slab", blockType.name), properties, false);
				}

				if(blockType.hasWallVariant) {
					registerWallBlock(String.format("%s_reinforced_concrete_wall", blockType.name), properties);
				}
			}
		});
	}

	public static void registerSteelBlocks() {
		BlockBehaviour.Properties properties = BlockCategories.STEEL_BLOCKS.properties;
		RegistryObject<Block> sourceBlock = registerBlock(BlockCategories.STEEL_BLOCKS.sourceBlock.name, properties);

		if(BlockCategories.STEEL_BLOCKS.sourceBlock.hasStairVariant) {
			registerStairBlock(String.format("%s_stairs", BlockCategories.STEEL_BLOCKS.baseName), sourceBlock, properties);
		}

		if(BlockCategories.STEEL_BLOCKS.sourceBlock.hasSlabVariant) {
			registerSlabBlock(String.format("%s_slab", BlockCategories.STEEL_BLOCKS.baseName), properties, BlockCategories.STEEL_BLOCKS.sourceBlock.hasTransparency);
		}

		if(BlockCategories.STEEL_BLOCKS.sourceBlock.hasWallVariant) {
			registerWallBlock(String.format("%s_wall", BlockCategories.STEEL_BLOCKS.baseName), properties);
		}

		BlockCategories.STEEL_BLOCKS.blockTypes.forEach(blockType -> {
			if(blockType.hasTransparency) {
				properties.noOcclusion();
			}

			RegistryObject<Block> subBlock;

			if(blockType.isRotatable) {
				subBlock = registerRotatableBlock(String.format("steel_%s", blockType.name), properties);
			} else {
				subBlock = registerBlock(String.format("steel_%s", blockType.name), properties, blockType.hasTransparency);
			}

			if(blockType.hasStairVariant) {
				registerStairBlock(String.format("%s_%s_stairs", BlockCategories.STEEL_BLOCKS.baseName, blockType.name), subBlock, properties);
			}

			if(blockType.hasSlabVariant) {
				registerSlabBlock(String.format("%s_%s_slab", BlockCategories.STEEL_BLOCKS.baseName, blockType.name), properties, blockType.hasTransparency);
			}

			if(blockType.hasWallVariant) {
				registerWallBlock(String.format("%s_%s_wall", BlockCategories.STEEL_BLOCKS.baseName, blockType.name), properties);
			}
		});
	}

	public static void registerGlassBlocks() {
		BlockCategories.STRUCTURAL_GLASS_BLOCKS.blockTypes.forEach(type -> {
			registerGlassBlock(String.format("%s_structural_glass", type.dyeColor), type.dyeColor);
			registerStainedGlassPaneBlock(type.dyeColor.getName() + "_structural_glass_pane", type.dyeColor);
		});
	}

	public static void registerGraphiteBlocks() {
		BlockBehaviour.Properties properties = BlockCategories.GRAPHITE_BLOCKS.properties;
		RegistryObject<Block> graphiteBlock = registerBlock(BlockCategories.GRAPHITE_BLOCKS.baseName, properties);
		registerStairBlock(String.format("%s_stairs", BlockCategories.GRAPHITE_BLOCKS.baseName), graphiteBlock, properties);
		registerSlabBlock(String.format("%s_slab", BlockCategories.GRAPHITE_BLOCKS.baseName), properties, false);
		registerWallBlock(String.format("%s_wall", BlockCategories.GRAPHITE_BLOCKS.baseName), properties);

		BlockCategories.GRAPHITE_BLOCKS.blockTypes.forEach(type -> {
			if(type.isRotatable) {
				registerRotatableBlock(String.format("%s_%s", BlockCategories.GRAPHITE_BLOCKS.baseName, type.name), properties);
			} else {
				if(type.hasTransparency) {
					properties.noOcclusion();
				}
				registerBlock(String.format("%s_%s", BlockCategories.GRAPHITE_BLOCKS.baseName, type.name), properties, type.hasTransparency);
			}

			if(type.hasStairVariant) {
				registerStairBlock(String.format("%s_%s_stairs", BlockCategories.GRAPHITE_BLOCKS.baseName, type.name), graphiteBlock, properties);
			}

			if(type.hasSlabVariant) {
				registerSlabBlock(String.format("%s_%s_slab", BlockCategories.GRAPHITE_BLOCKS.baseName, type.name), properties, type.hasTransparency);
			}

			if(type.hasWallVariant) {
				registerWallBlock(String.format("%s_%s_wall", BlockCategories.GRAPHITE_BLOCKS.baseName, type.name), properties);
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

	private static RegistryObject<SlabBlock> registerSlabBlock(final String name, Block.Properties properties, boolean isTranslucent) {
		return registerBlock(name, () -> new AndroSlabBlock(properties, isTranslucent));
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
		return registerBlock(name, () -> new AndroBlock(properties, false));
	}

	private static RegistryObject<Block> registerBlock(final String name, Block.Properties properties, boolean isTranslucent) {
		return registerBlock(name, () -> new AndroBlock(properties, isTranslucent));
	}

	private static <BLOCK extends Block> RegistryObject<BLOCK> registerBlock(final String name, final Supplier<BLOCK> blockFactory) {
		final RegistryObject<BLOCK> block = BLOCKS.register(name, blockFactory);
		ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
		return block;
	}
}
