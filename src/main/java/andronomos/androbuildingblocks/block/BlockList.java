package andronomos.androbuildingblocks.block;

import java.util.Arrays;
import java.util.List;

public class BlockList {
	public static final List<String> concreteColors = Arrays.asList("white", "blue", "black", "brown", "green", "gray", "purple", "red");

	public static final AndroBlockCategory CONCRETE_BLOCKS = new AndroBlockCategory("reinforced_concrete");
	public static final AndroBlockCategory GRAPHITE_BLOCKS = new AndroBlockCategory("graphite");
	public static final AndroBlockCategory STEEL_BLOCKS = new AndroBlockCategory("steel");


	public static void setupBlocks() {
		CONCRETE_BLOCKS.addType(new AndroBlockType("black"));
		CONCRETE_BLOCKS.addType(new AndroBlockType("blue"));
		CONCRETE_BLOCKS.addType(new AndroBlockType("brown"));
		CONCRETE_BLOCKS.addType(new AndroBlockType("green"));
		CONCRETE_BLOCKS.addType(new AndroBlockType("gray"));
		CONCRETE_BLOCKS.addType(new AndroBlockType("purple"));
		CONCRETE_BLOCKS.addType(new AndroBlockType("red"));
		CONCRETE_BLOCKS.addType(new AndroBlockType("white"));

		GRAPHITE_BLOCKS.addType(new AndroBlockType("grate"));
		GRAPHITE_BLOCKS.addType(new AndroBlockType("mesh"));
		GRAPHITE_BLOCKS.addType(new AndroBlockType("tile", false, false, false));

		STEEL_BLOCKS.addType(new AndroBlockType("plate", false, false, false));
	}
}
