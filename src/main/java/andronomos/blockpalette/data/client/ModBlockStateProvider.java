package andronomos.blockpalette.data.client;

import andronomos.blockpalette.BlockPalette;
import andronomos.blockpalette.registry.ModBlocks;
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
		super(output, BlockPalette.MODID, exFileHelper);
	}

	@Override
	protected void registerStatesAndModels() {
		ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get).forEach(b -> {
			String blockName = ForgeRegistries.BLOCKS.getKey(b).getPath();
			String blockType = b.getClass().getSimpleName();
			//String textureFolder = blockName;

			switch (blockType) {
				case "StairBlock" -> registerStairBlockStateAndModel((StairBlock)b, blockName.substring(0, blockName.indexOf("_stairs")));
				case "SlabBlock" -> registerSlabBlockStateAndModel((SlabBlock)b, blockName);
				case "WallBlock" -> registerWallBlockStateAndModel((WallBlock)b, blockName.substring(0, blockName.indexOf("_wall")));
				case "StainedGlassBlock" -> registerGlassBlockStateAndModel(b, blockName);
				case "StainedGlassPaneBlock" -> registerPaneBlockStateAndModel((IronBarsBlock)b, blockName);
				case "RotatedPillarBlock" -> registerRotatableBlockStateAndModel((RotatedPillarBlock) b, blockName, "");
				default -> registerBlockStateAndModel(b, blockName);
			}
		});
	}

	private void registerBlockStateAndModel(Block block, String name) {
		ModelFile model = models().cubeAll(name, modLoc("block/" + name));
		simpleBlock(block, model);
		registerItemModel(name);
	}

	private void registerStairBlockStateAndModel(StairBlock block, String name) {
		stairsBlock(block, modLoc("block/" + name));
		registerItemModel(name + "_stairs");
	}

	private void registerSlabBlockStateAndModel(SlabBlock block, String name) {
		String cleanName = name.substring(0, name.indexOf("_slab"));
		slabBlock(block, modLoc("block/" + cleanName), modLoc("block/" + cleanName));
		registerItemModel(name);
	}

	private void registerWallBlockStateAndModel(WallBlock block, String name) {
		wallBlock(block, modLoc("block/" + name));
		itemModels().wallInventory(name + "_wall", modLoc("block/" + name));
	}

	private void registerGlassBlockStateAndModel(Block block, String name) {
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

	private void registerRotatableBlockStateAndModel(RotatedPillarBlock block, String name, String topTexture) {
		String resource = "block/" + name;
		ResourceLocation sides = modLoc(resource);
		ResourceLocation end;

		if(!topTexture.equals("")) {
			end = modLoc("block/" + topTexture);
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

	private void registerItemModel(String name) {
		itemModels().withExistingParent(name, modLoc("block/" + name));
	}
}
