package andronomos.androbuildingblocks.data.client;

import andronomos.androbuildingblocks.AndroBuildingBlocks;
import andronomos.androbuildingblocks.block.BuildingBlock;
import andronomos.androbuildingblocks.registry.BlockRegistry;
import net.minecraft.core.Direction;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.*;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ConfiguredModel;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockStateProvider extends BlockStateProvider {
	public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
		super(output, AndroBuildingBlocks.MODID, exFileHelper);
	}

	@Override
	protected void registerStatesAndModels() {
		BlockRegistry.BLOCKS.getEntries().stream().map(RegistryObject::get).forEach(b -> {
			String blockName = ForgeRegistries.BLOCKS.getKey(b).getPath();
			String blockType = b.getClass().getSimpleName();

			switch (blockType) {
				case "StairBlock" -> registerStairBlockStateAndModel((StairBlock)b, blockName);
				case "SlabBlock" -> registerSlabBlockStateAndModel((SlabBlock)b, blockName);
				case "WallBlock" -> registerWallBlockStateAndModel((WallBlock)b, blockName);
				case "FenceBlock" -> registerFenceBlockStateAndModel((FenceBlock) b, blockName);
				case "StainedGlassBlock" -> registerTranslucentBlockStateAndModel(b, blockName);
				case "BuildingBlock" -> {
					if(((BuildingBlock)b).isTranslucent) {
						registerTranslucentBlockStateAndModel(b, blockName);
					} else {
						registerBlockStateAndModel(b, blockName);
					}
				}
				case "StainedGlassPaneBlock", "IronBarsBlock" -> registerPaneBlockStateAndModel((IronBarsBlock)b, blockName);
				case "RotatedPillarBlock" -> registerRotatableBlockStateAndModel((RotatedPillarBlock) b, blockName);
				default -> registerBlockStateAndModel(b, blockName);
			}
		});
	}

	private void registerBlockStateAndModel(Block block, String name) {
		ModelFile model = models().cubeAll(name, modLoc("block/" + name));
		simpleBlock(block, model);
		registerItemModel(name);
	}

	private void registerFenceBlockStateAndModel(FenceBlock block, String name) {
		String cleanName = name.substring(0, name.indexOf("_fence"));
		fenceBlock(block, modLoc("block/" + cleanName));
		itemModels().fenceInventory(name, modLoc("block/" + cleanName));
	}

	private void registerStairBlockStateAndModel(StairBlock block, String name) {
		String cleanName = name.substring(0, name.indexOf("_stairs"));
		String resourceName = cleanName;
		if(resourceName.contains("_brick")) {
			resourceName = resourceName + "s";
		}
		stairsBlock(block, modLoc("block/" + resourceName));
		registerItemModel(name);
	}

	private void registerSlabBlockStateAndModel(SlabBlock block, String name) {
		String cleanName = name.substring(0, name.indexOf("_slab"));
		String resourceName = cleanName;
		if(resourceName.contains("_brick")) {
			resourceName = resourceName + "s";
		}
		slabBlock(block, modLoc("block/" + resourceName), modLoc("block/" + resourceName));
		registerItemModel(name);
	}

	private void registerWallBlockStateAndModel(WallBlock block, String name) {
		String cleanName = name.substring(0, name.indexOf("_wall"));
		String resourceName = cleanName;
		if(resourceName.contains("_brick")) {
			resourceName = resourceName + "s";
		}
		wallBlock(block, modLoc("block/" + resourceName));
		itemModels().wallInventory(name, modLoc("block/" + resourceName));
	}

	private void registerTranslucentBlockStateAndModel(Block block, String name) {
		ModelFile model;
		model = models().cubeAll(name, modLoc("block/" + name)).renderType("translucent");
		simpleBlock(block, model);
		registerItemModel(name);
	}

	private void registerPaneBlockStateAndModel(IronBarsBlock block, String blockName) {
		String cleanName = blockName.replace("_pane", "");
		String textureName = String.format("block/%s", cleanName);
		paneBlockWithRenderType(block, modLoc(textureName), modLoc(textureName),"translucent");
		itemModels().singleTexture(blockName, mcLoc("item/generated"), "layer0", modLoc(textureName)).renderType("translucent");
	}

	private void registerRotatableBlockStateAndModel(RotatedPillarBlock block, String name) {
		String topResource = name.substring(0, name.indexOf("_pillar"));
		String resource = "block/" + name;
		ResourceLocation side = modLoc(resource);
		ResourceLocation end;

		//if(!topResource.equals("")) {
		//	end = modLoc("block/" + topResource);
		//} else {
		//	end = side;
		//}

		end = modLoc("block/" + topResource);

		ModelFile model = models().cubeColumn(name, side, end);

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

	private void registerItemModel(String name) {
		itemModels().withExistingParent(name, modLoc("block/" + name));
	}
}
