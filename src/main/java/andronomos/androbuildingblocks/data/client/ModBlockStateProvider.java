package andronomos.androbuildingblocks.data.client;

import andronomos.androbuildingblocks.AndroBuildingBlocks;
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

import java.util.Objects;

public class ModBlockStateProvider extends BlockStateProvider {
	public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
		super(output, AndroBuildingBlocks.MODID, exFileHelper);
	}

	@Override
	protected void registerStatesAndModels() {
		BlockRegistry.BLOCKS.getEntries().stream().map(RegistryObject::get).forEach(block -> {
			String blockPath = Objects.requireNonNull(ForgeRegistries.BLOCKS.getKey(block)).getPath();
			String className = block.getClass().getSimpleName();

			switch (className) {
				case "StairBlock" -> stairs(block, blockPath);
				case "SlabBlock" -> slab(block, blockPath);
				case "WallBlock" -> wall(block, blockPath);
				case "FenceBlock" -> fenceBlock(block, blockPath);
				case "RotatedPillarBlock" -> rotatableBlock(block, blockPath);
				case "StainedGlassBlock" -> simpleBlock(block, blockPath, true);
				case "StainedGlassPaneBlock", "IronBarsBlock" -> pane(block, blockPath);
				default -> simpleBlock(block, blockPath, false);
			}
		});
	}

	private void simpleBlock(Block block, String path, boolean isTranslucent) {
		ModelFile model = models().cubeAll(path, modLoc("block/" + path));
		if(isTranslucent) {
			model = models().cubeAll(path, modLoc("block/" + path)).renderType("translucent");
		}
		simpleBlock(block, model);
		itemModel(path);
	}

	private void fenceBlock(Block block, String path) {
		String parent = path.replace("_fence", "");
		parent = getProperParentName(parent);
		ResourceLocation txt = modLoc("block/" + parent);
		fenceBlock((FenceBlock) block, txt);
		itemModels().fenceInventory(path, txt);
	}

	private void trapDoor(Block block, String path) {
		String parent = path.replace("_trapdoor", "");
		parent = getProperParentName(parent);
		ResourceLocation txt = modLoc("block/" + parent);
		trapdoorBlock((TrapDoorBlock) block, txt, true);
		itemModels().trapdoorTop(path, txt);
	}

	public void stairs(Block block, String path) {
		String parent = path.replace("_stairs", "");
		parent = getProperParentName(parent);
		stairsBlock((StairBlock) block, modLoc("block/" + parent));
		itemModel(path);
	}

	public void slab(Block slab, String path) {
		String parent = path.replace("_slab", "");
		parent = getProperParentName(parent);
		ResourceLocation txt = modLoc("block/" + parent);
		slabBlock((SlabBlock) slab, txt, txt);
		itemModel(path);
	}

	private void wall(Block block, String path) {
		String parent = path.replace("_wall", "");
		parent = getProperParentName(parent);
		ResourceLocation txt = modLoc("block/" + parent);
		wallBlock((WallBlock) block, txt);
		itemModels().wallInventory(path, txt);
	}

	private void pane(Block block, String path) {
		String parent = path.replace("_pane", "");
		String textureName = String.format("block/%s", parent);
		paneBlockWithRenderType((IronBarsBlock)block, modLoc(textureName), modLoc(textureName),"translucent");
		itemModels().singleTexture(path, mcLoc("item/generated"), "layer0", modLoc(textureName)).renderType("translucent");
	}

	private void rotatableBlock(Block block, String path) {
		ResourceLocation side = modLoc("block/" + path);
		ResourceLocation end = modLoc("block/" + path + "_top");

		ModelFile model = models().cubeColumn(path, side, end);

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

		itemModel(path);
	}

	private void itemModel(String name) {
		itemModels().withExistingParent(name, modLoc("block/" + name));
	}

	private String getProperParentName(String dirtyParent) {
		if (dirtyParent.contains("brick") && !dirtyParent.contains("bricks")) {
			return dirtyParent.replace("brick","bricks");
		}
		if (dirtyParent.contains("steel") && !dirtyParent.contains("siding")) {
			return dirtyParent + "_block";
		}
		return dirtyParent;
	}
}
