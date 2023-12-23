package andronomos.blockpalette.data.client;

import andronomos.blockpalette.BlockPalette;
import andronomos.blockpalette.registry.ModBlocks;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.*;
import net.minecraftforge.client.model.generators.BlockStateProvider;
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
			String textureFolder = blockName;

			if(blockName.contains("rough") && blockName.contains("concrete")) {
				textureFolder = "rough_concrete";
			}

			if(blockName.contains("barricade")) {
				textureFolder = "barricade";
			}

			if(blockName.contains("borderless")) {
				textureFolder = "borderless_glass";
			}

			switch (blockType) {
				case "StairBlock" -> registerStairBlockStateAndModel((StairBlock)b, blockName.substring(0, blockName.indexOf("_stairs")), textureFolder);
				case "SlabBlock" -> registerSlabBlockStateAndModel((SlabBlock)b, blockName, textureFolder);
				case "WallBlock" -> registerWallBlockStateAndModel((WallBlock)b, blockName.substring(0, blockName.indexOf("_wall")), textureFolder);
				case "GlassBlock", "StainedGlassBlock" -> registerGlassBlockStateAndModel(b, blockName, textureFolder);
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

	private void registerGlassBlockStateAndModel(Block block, String name, String textureFolder) {
		ModelFile model;

		if (!textureFolder.equals("")) {
			model = models().cubeAll(name, modLoc("block/" + textureFolder + "/" + name))
					.renderType("translucent");
		} else {
			model = models().cubeAll(name, modLoc("block/" + name))
					.renderType("translucent");
		}

		simpleBlock(block, model);
		registerItemModel(name);
	}

	private void registerPaneBlockStateAndModel(IronBarsBlock block, String blockName, String textureFolder) {
		String cleanName = blockName.replace("_pane", "");
		String textureName = String.format("block/%s/%s", textureFolder, cleanName);
		paneBlockWithRenderType(block, modLoc(textureName), modLoc(textureName),"translucent");
		itemModels().singleTexture(blockName, mcLoc("item/generated"), "layer0", modLoc(textureName)).renderType("translucent");
	}

	private void registerItemModel(String name) {
		itemModels().withExistingParent(name, modLoc("block/" + name));
	}
}
