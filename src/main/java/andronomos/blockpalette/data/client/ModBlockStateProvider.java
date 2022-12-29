package andronomos.blockpalette.data.client;

import andronomos.blockpalette.BlockPalette;
import andronomos.blockpalette.block.BPRotatableBlock;
import andronomos.blockpalette.registry.ModBlocks;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.core.Direction;
import net.minecraft.data.DataGenerator;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.*;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ConfiguredModel;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockStateProvider extends BlockStateProvider {
	public ModBlockStateProvider(DataGenerator gen, ExistingFileHelper exFileHelper) {
		super(gen, BlockPalette.MODID, exFileHelper);
	}

	@Override
	protected void registerStatesAndModels() {
		ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get).forEach(b -> {
			String blockName = ForgeRegistries.BLOCKS.getKey(b).getPath();
			String blockType = b.getClass().getSimpleName();
			String textureFolder = blockName;

			if(blockName.contains("_")) {
				textureFolder = blockName.substring(0, blockName.indexOf("_"));
			}

			switch (blockType) {
				case "StairBlock" -> registerStairBlockStateAndModel((StairBlock)b, blockName.substring(0, blockName.indexOf("_stairs")), textureFolder);
				case "SlabBlock" -> registerSlabBlockStateAndModel((SlabBlock)b, blockName, textureFolder);
				case "WallBlock" -> registerWallBlockStateAndModel((WallBlock)b, blockName.substring(0, blockName.indexOf("_wall")), textureFolder);
				case "FenceBlock" -> registerFenceBlockStateAndModel((FenceBlock)b, blockName.substring(0, blockName.indexOf("_fence")), textureFolder);
				case "BPRotatableBlock" -> registerRotatableBlockStateAndModel((RotatedPillarBlock)b, blockName, textureFolder, ((BPRotatableBlock)b).getTopTexture());
				case "GlassBlock" -> registerGlassBlockStateAndModel(b, blockName, textureFolder);
				case "StainedGlassPaneBlock" -> registerPaneBlockStateAndModel((IronBarsBlock)b, blockName, textureFolder);
				default -> registerBlockStateAndModel(b, blockName, textureFolder);
			}
		});
	}

	private void registerBlockStateAndModel(Block block, String name, String textureFolder) {
		ModelFile model = !textureFolder.equals("") ? models().cubeAll(name, modLoc("block/" + textureFolder + "/" + name))
				: models().cubeAll(name, modLoc("block/" + name));

		simpleBlock(block, model);
		registerItemModel(name);
	}

	private void registerGlassBlockStateAndModel(Block block, String name, String textureFolder) {
		ModelFile model = !textureFolder.equals("") ? models().cubeAll(name, modLoc("block/" + textureFolder + "/" + name)).renderType(new ResourceLocation("minecraft", "cutout"))
				: models().cubeAll(name, modLoc("block/" + name)).renderType(new ResourceLocation("minecraft", "cutout"));

		simpleBlock(block, model);
		registerItemModel(name);
	}

	private void registerStairBlockStateAndModel(StairBlock block, String name, String textureFolder) {
		if(!textureFolder.equals("")) {
			stairsBlock(block, modLoc("block/" + textureFolder + "/" + name));
		} else {
			stairsBlock(block, modLoc("block/" + name));
		}
		registerItemModel(name + "_stairs");
	}

	private void registerSlabBlockStateAndModel(SlabBlock block, String name, String textureFolder) {
		String cleanName = name.substring(0, name.indexOf("_slab"));

		if(!textureFolder.equals("")) {
			slabBlock(block, modLoc("block/" + cleanName), modLoc("block/" + textureFolder + "/" + cleanName));
		} else {
			slabBlock(block, modLoc("block/" + cleanName), modLoc("block/" + cleanName));
		}
		registerItemModel(name);
	}

	private void registerWallBlockStateAndModel(WallBlock block, String name, String textureFolder) {
		if(!textureFolder.equals("")) {
			wallBlock(block, modLoc("block/" + textureFolder + "/" + name));
			itemModels().wallInventory(name + "_wall", modLoc("block/" + textureFolder + "/" + name));
		} else {
			wallBlock(block, modLoc("block/" + name));
			itemModels().wallInventory(name + "_wall", modLoc("block/" + name));
		}
	}

	private void registerFenceBlockStateAndModel(FenceBlock block, String name, String textureFolder) {
		if(!textureFolder.equals("")) {
			fenceBlock(block, modLoc("block/" + textureFolder + "/" + name));
			itemModels().fenceInventory(name + "_fence", modLoc("block/" + textureFolder + "/" + name));
		} else {
			fenceBlock(block, modLoc("block/" + name));
			itemModels().fenceInventory(name + "_fence", modLoc("block/" + name));
		}
	}

	private void registerRotatableBlockStateAndModel(RotatedPillarBlock block, String name, String textureFolder, String topTexture) {
		String resource = "block/" + textureFolder + "/" + name;

		if(textureFolder.equals("")) {
			resource = "block/" + name;
		}

		ResourceLocation sides = modLoc(resource);
		ResourceLocation end;

		if(!topTexture.equals("")) {
			if(!textureFolder.equals("")) {
				end = modLoc("block/" + textureFolder + "/" + topTexture);
			} else {
				end = modLoc("block/" + topTexture);
			}
		} else {
			end = sides;
		}

		ModelFile model = models().cubeColumn(name, sides, end);

		getVariantBuilder(block).forAllStatesExcept(state -> {
			Direction.Axis axis = state.getValue(RotatedPillarBlock.AXIS);

			int yRot = 0;
			int xRot = 0;

			switch (axis) {
				case X:
					xRot = 90;
					yRot = 90;
					break;
				case Y:
					break;
				case Z:
					xRot = 90;
					break;
			}

			return ConfiguredModel.builder()
					.modelFile(model)
					.rotationX(xRot)
					.rotationY(yRot)
					.build();
		});

		registerItemModel(name);
	}

	private void registerPaneBlockStateAndModel(IronBarsBlock block, String blockName, String textureFolder) {
		String cleanName = blockName.replace("_pane", "");
		String textureName = String.format("block/%s/%s", textureFolder, cleanName);
		paneBlock(block, cleanName,  modLoc(textureName), modLoc(textureName));
		itemModels().singleTexture(blockName, mcLoc("item/generated"), "layer0", modLoc(textureName));
	}

	private void registerItemModel(String name) {
		itemModels().withExistingParent(name, modLoc("block/" + name));
	}
}
