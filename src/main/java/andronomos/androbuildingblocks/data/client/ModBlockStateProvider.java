package andronomos.androbuildingblocks.data.client;

import andronomos.androbuildingblocks.AndroBuildingBlocks;
import andronomos.androbuildingblocks.registry.BlockRegistry;
import net.minecraft.core.Direction;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraftforge.client.model.generators.*;
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
		//BlockRegistry.BLOCKS.getEntries().stream().map(RegistryObject::get)
		//		.filter(block -> block.getClass().getSimpleName().equals("StairBlock"))
		//		.forEach(block -> stairs(block, Objects.requireNonNull(ForgeRegistries.BLOCKS.getKey(block)).getPath()));

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
				case "StainedGlassPaneBlock" -> pane(block, blockPath);
				case "IronBarsBlock" -> bars(block, blockPath);
				case "TrapDoorBlock" -> trapDoor(block, blockPath);
				case "Block" -> simpleBlock(block, blockPath, false);
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
		//String parent = path.replace("_trapdoor", "");
		//parent = getProperParentName(parent);
		//ResourceLocation txt = modLoc("block/" + parent);
		ResourceLocation txt = modLoc("block/" + path);
		trapdoorBlock((TrapDoorBlock) block, txt, true);
		itemModels().trapdoorTop(path, txt);
	}

	private void bars(Block block, String path) {
		ResourceLocation barTexture = modLoc("block/" + path);
		ResourceLocation postTexture = modLoc("block/" + path + "_post");

		MultiPartBlockStateBuilder builder = getMultipartBuilder(block);

		BlockModelBuilder sideModel = models().withExistingParent(path + "_side", mcLoc("block/iron_bars_side"))
				.texture("bars", barTexture)
				.texture("edge", postTexture)
				.texture("particle", postTexture)
				.renderType("cutout_mipped")
				.ao(false);

		BlockModelBuilder sideAltModel = models().withExistingParent(path + "_side_alt", mcLoc("block/iron_bars_side_alt"))
				.texture("bars", barTexture)
				.texture("edge", postTexture)
				.texture("particle", postTexture);

		builder.part().modelFile(models().withExistingParent(path + "_post", mcLoc("block/iron_bars_post"))
						.texture("bars", postTexture)
						.texture("particle", postTexture))
				.addModel()
				.condition(BlockStateProperties.NORTH, false)
				.condition(BlockStateProperties.SOUTH, false)
				.condition(BlockStateProperties.EAST, false)
				.condition(BlockStateProperties.WEST, false)
				.end();

		builder.part().modelFile(models().withExistingParent(path + "_post_ends", mcLoc("block/iron_bars_post_ends"))
						.texture("edge", postTexture).texture("particle", postTexture)
		).addModel().end();
		builder.part().modelFile(sideModel).addModel().condition(BlockStateProperties.NORTH, true).end();
		builder.part().modelFile(sideModel).rotationY(90).addModel().condition(BlockStateProperties.EAST, true).end();
		builder.part().modelFile(sideAltModel).addModel().condition(BlockStateProperties.SOUTH, true).end();
		builder.part().modelFile(sideAltModel).rotationY(90).addModel().condition(BlockStateProperties.WEST, true).end();

		itemModels().singleTexture(path, mcLoc("item/generated"), "layer0", barTexture);
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
		if (dirtyParent.contains("steel") && !dirtyParent.contains("_")) {
			return dirtyParent + "_block";
		}
		return dirtyParent;
	}
}
