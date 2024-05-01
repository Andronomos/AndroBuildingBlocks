package andronomos.androbuildingblocks.data.client;

import andronomos.androbuildingblocks.AndroBuildingBlocks;
import andronomos.androbuildingblocks.block.AndroRotatableBlock;
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
		BlockRegistry.BLOCKS.getEntries().stream().map(RegistryObject::get).forEach(block -> {
			String blockPath = ForgeRegistries.BLOCKS.getKey(block).getPath();
			String className = block.getClass().getSimpleName();

			switch (className) {
				case "StairBlock" -> registerStairsBlock(block, blockPath);
				case "SlabBlock" -> registerSlabBlock(block, blockPath);
				case "WallBlock" -> registerWallBlock(block, blockPath);
				case "FenceBlock" -> registerFenceBlock(block, blockPath);
				case "StainedGlassBlock" -> registerSimpleBlock(block, blockPath, true);
				case "StainedGlassPaneBlock", "IronBarsBlock" -> registerPaneBlock(block, blockPath);
				default -> registerSimpleBlock(block, blockPath, false);
			}
		});
	}

	private void registerSimpleBlock(Block block, String path, boolean isTranslucent) {
		ModelFile model = models().cubeAll(path, modLoc("block/" + path));
		if(isTranslucent) {
			model = models().cubeAll(path, modLoc("block/" + path)).renderType("translucent");
		}
		simpleBlock(block, model);
		registerItemModel(path);
	}

	private void registerFenceBlock(Block block, String path) {
		String parent = path.replace("_fence", "");
		parent = getProperParentName(parent);
		ResourceLocation txt = modLoc("block/" + parent);
		fenceBlock((FenceBlock) block, txt);
		itemModels().fenceInventory(path, txt);
	}

	private void registerTrapDoorBlockStateAndModel(Block block, String path) {
		String parent = path.replace("_trapdoor", "");
		parent = getProperParentName(parent);
		ResourceLocation txt = modLoc("block/" + parent);
		trapdoorBlock((TrapDoorBlock) block, txt, true);
		itemModels().trapdoorTop(path, txt);
	}

	public void registerStairsBlock(Block block, String path) {
		String parent = path.replace("_stairs", "");
		parent = getProperParentName(parent);
		stairsBlock((StairBlock) block, modLoc("block/" + parent));
		registerItemModel(path);
	}

	public void registerSlabBlock(Block slab, String path) {
		String parent = path.replace("_slab", "");
		parent = getProperParentName(parent);
		ResourceLocation txt = modLoc("block/" + parent);
		slabBlock((SlabBlock) slab, txt, txt);
		registerItemModel(path);
	}

	private void registerWallBlock(Block block, String path) {
		String parent = path.replace("_wall", "");
		parent = getProperParentName(parent);
		ResourceLocation txt = modLoc("block/" + parent);
		wallBlock((WallBlock) block, txt);
		itemModels().wallInventory(path, txt);
	}

	private void registerPaneBlock(Block block, String path) {
		String parent = path.replace("_pane", "");
		String textureName = String.format("block/%s", parent);
		paneBlockWithRenderType((IronBarsBlock)block, modLoc(textureName), modLoc(textureName),"translucent");
		itemModels().singleTexture(path, mcLoc("item/generated"), "layer0", modLoc(textureName)).renderType("translucent");
	}

	private void registerRotatableBlock(AndroRotatableBlock block, String blockName) {
		String resource = "block/" + blockName;
		ResourceLocation side = modLoc(resource);
		ResourceLocation end;

		if(!block.topResource.equals("")) {
			end = modLoc("block/" + block.topResource);
		} else {
			end = side;
		}

		ModelFile model = models().cubeColumn(blockName, side, end);

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

		registerItemModel(blockName);
	}

	private void registerHorizontalBlock(GlazedTerracottaBlock b, String blockName) {
		String resource = "block/" + blockName;
		ResourceLocation side = modLoc(resource);
		horizontalBlock(b, side, side, side);
		registerItemModel(blockName);
	}

	private void registerItemModel(String name) {
		itemModels().withExistingParent(name, modLoc("block/" + name));
	}

	private String getProperParentName(String dirtyParent) {
		if (dirtyParent.contains("brick") && !dirtyParent.contains("bricks")) {
			return dirtyParent.replace("brick","bricks");
		}
		return dirtyParent;
	}
}
