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
		REINFORCED_CONCRETE_BLOCKS.addType(new AndroBlockType("black").dyeColor(DyeColor.BLACK));
		REINFORCED_CONCRETE_BLOCKS.addType(new AndroBlockType("blue").dyeColor(DyeColor.BLUE));
		REINFORCED_CONCRETE_BLOCKS.addType(new AndroBlockType("brown").dyeColor(DyeColor.BROWN));
		REINFORCED_CONCRETE_BLOCKS.addType(new AndroBlockType("green").dyeColor(DyeColor.GREEN));
		REINFORCED_CONCRETE_BLOCKS.addType(new AndroBlockType("gray").dyeColor(DyeColor.GRAY));
		REINFORCED_CONCRETE_BLOCKS.addType(new AndroBlockType("purple").dyeColor(DyeColor.PURPLE));
		REINFORCED_CONCRETE_BLOCKS.addType(new AndroBlockType("red").dyeColor(DyeColor.RED));
		REINFORCED_CONCRETE_BLOCKS.addType(new AndroBlockType("white").dyeColor(DyeColor.WHITE));

		AndroBlockCategories.add(GRAPHITE_BLOCKS);
		GRAPHITE_BLOCKS.addType(new AndroBlockType("grate", false, false, false).rotatable(true));
		GRAPHITE_BLOCKS.addType(new AndroBlockType("mesh", false, false, false).transparency(true));
		GRAPHITE_BLOCKS.addType(new AndroBlockType("tile"));

		AndroBlockCategories.add(STEEL_BLOCKS);
		STEEL_BLOCKS.addType(new AndroBlockType("tile"));
		STEEL_BLOCKS.addType(new AndroBlockType("mesh").transparency(true));

		AndroBlockCategories.add(STRUCTURAL_GLASS_BLOCKS);
		for(DyeColor color : DyeColor.values()) {
			AndroBlockType type = new AndroBlockType(color.getName());
			type.dyeColor(color);
			STRUCTURAL_GLASS_BLOCKS.addType(type);
		}
	}
}