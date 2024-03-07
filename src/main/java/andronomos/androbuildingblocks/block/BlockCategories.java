package andronomos.androbuildingblocks.block;

import net.minecraft.world.item.DyeColor;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;

import java.util.ArrayList;
import java.util.List;

public class BlockCategories {
	public static final List<AndroBlockCategory> AndroBlockCategories = new ArrayList<>();
	public static final AndroBlockCategory REINFORCED_CONCRETE_BLOCKS = new AndroBlockCategory("reinforced_concrete", BlockBehaviour.Properties.copy(Blocks.WHITE_CONCRETE));
	public static final AndroBlockCategory GRAPHITE_BLOCKS = new AndroBlockCategory("graphite", BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK));
	public static final AndroBlockCategory STEEL_BLOCKS = new AndroBlockCategory("steel", BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK));
	public static final AndroBlockCategory STRUCTURAL_GLASS_BLOCKS = new AndroBlockCategory("structural_glass", BlockBehaviour.Properties.copy(Blocks.GLASS).strength(0.75f));

	public static void createCategories() {
		AndroBlockCategories.add(REINFORCED_CONCRETE_BLOCKS);
		REINFORCED_CONCRETE_BLOCKS.addBlockType(new AndroBlockType("black_" + REINFORCED_CONCRETE_BLOCKS.baseName).dyeColor(DyeColor.BLACK));
		REINFORCED_CONCRETE_BLOCKS.addBlockType(new AndroBlockType("blue_" + REINFORCED_CONCRETE_BLOCKS.baseName).dyeColor(DyeColor.BLUE));
		REINFORCED_CONCRETE_BLOCKS.addBlockType(new AndroBlockType("brown_" + REINFORCED_CONCRETE_BLOCKS.baseName).dyeColor(DyeColor.BROWN));
		REINFORCED_CONCRETE_BLOCKS.addBlockType(new AndroBlockType("green_" + REINFORCED_CONCRETE_BLOCKS.baseName).dyeColor(DyeColor.GREEN));
		REINFORCED_CONCRETE_BLOCKS.addBlockType(new AndroBlockType("gray_" + REINFORCED_CONCRETE_BLOCKS.baseName).dyeColor(DyeColor.GRAY));
		REINFORCED_CONCRETE_BLOCKS.addBlockType(new AndroBlockType("purple_" + REINFORCED_CONCRETE_BLOCKS.baseName).dyeColor(DyeColor.PURPLE));
		REINFORCED_CONCRETE_BLOCKS.addBlockType(new AndroBlockType("red_" + REINFORCED_CONCRETE_BLOCKS.baseName).dyeColor(DyeColor.RED));
		REINFORCED_CONCRETE_BLOCKS.addBlockType(new AndroBlockType("white_" + REINFORCED_CONCRETE_BLOCKS.baseName).dyeColor(DyeColor.WHITE));

		AndroBlockCategories.add(GRAPHITE_BLOCKS);
		GRAPHITE_BLOCKS.setSourceBlock(new AndroBlockType(GRAPHITE_BLOCKS.baseName));
		GRAPHITE_BLOCKS.addBlockType(new AndroBlockType(GRAPHITE_BLOCKS.baseName + "_grate", false, false, false).rotatable(true));
		GRAPHITE_BLOCKS.addBlockType(new AndroBlockType(GRAPHITE_BLOCKS.baseName + "_mesh", false, true, false));
		GRAPHITE_BLOCKS.addBlockType(new AndroBlockType(GRAPHITE_BLOCKS.baseName + "_tile"));

		AndroBlockCategories.add(STEEL_BLOCKS);
		STEEL_BLOCKS.setSourceBlock(new AndroBlockType(STEEL_BLOCKS.baseName));
		STEEL_BLOCKS.addBlockType(new AndroBlockType(STEEL_BLOCKS.baseName + "_tile"));
		STEEL_BLOCKS.addBlockType(new AndroBlockType(STEEL_BLOCKS.baseName + "_mesh", false, true, false));

		AndroBlockCategories.add(STRUCTURAL_GLASS_BLOCKS);
		for(DyeColor color : DyeColor.values()) {
			STRUCTURAL_GLASS_BLOCKS.addBlockType(new AndroBlockType(color.getName() + "_" + STRUCTURAL_GLASS_BLOCKS.baseName).dyeColor(color).glass(true));
		}
	}
}