package andronomos.androbuildingblocks.block;

import net.minecraft.world.item.DyeColor;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;

import java.util.ArrayList;
import java.util.List;

public class BlockCategories {
	//public static final List<String> concreteColors = Arrays.asList("white", "blue", "black", "brown", "green", "gray", "purple", "red");

	public static final List<AndroBlockCategory> AndroBlockCategories = new ArrayList<>();

	public static final AndroBlockCategory REINFORCED_CONCRETE_BLOCKS = new AndroBlockCategory("reinforced_concrete", BlockBehaviour.Properties.copy(Blocks.WHITE_CONCRETE));
	public static final AndroBlockCategory GRAPHITE_BLOCKS = new AndroBlockCategory("graphite", BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK));
	public static final AndroBlockCategory STEEL_BLOCKS = new AndroBlockCategory("steel", BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK));
	public static final AndroBlockCategory STRUCTURAL_GLASS_BLOCKS = new AndroBlockCategory("structural_glass", BlockBehaviour.Properties.copy(Blocks.GLASS).strength(0.75f));

	public static void setupBlocks() {
		AndroBlockCategories.add(REINFORCED_CONCRETE_BLOCKS);
		REINFORCED_CONCRETE_BLOCKS.addType(new AndroBlockType("black"));
		REINFORCED_CONCRETE_BLOCKS.addType(new AndroBlockType("blue"));
		REINFORCED_CONCRETE_BLOCKS.addType(new AndroBlockType("brown"));
		REINFORCED_CONCRETE_BLOCKS.addType(new AndroBlockType("green"));
		REINFORCED_CONCRETE_BLOCKS.addType(new AndroBlockType("gray"));
		REINFORCED_CONCRETE_BLOCKS.addType(new AndroBlockType("purple"));
		REINFORCED_CONCRETE_BLOCKS.addType(new AndroBlockType("red"));
		REINFORCED_CONCRETE_BLOCKS.addType(new AndroBlockType("white"));

		AndroBlockCategories.add(GRAPHITE_BLOCKS);
		GRAPHITE_BLOCKS.addType(new AndroBlockType("grate"));
		GRAPHITE_BLOCKS.addType(new AndroBlockType("mesh"));
		GRAPHITE_BLOCKS.addType(new AndroBlockType("tile", false, false, false));

		AndroBlockCategories.add(STEEL_BLOCKS);
		STEEL_BLOCKS.addType(new AndroBlockType("plate", false, false, false));

		AndroBlockCategories.add(STRUCTURAL_GLASS_BLOCKS);
		for(DyeColor color : DyeColor.values()) {
			AndroBlockType type = new AndroBlockType(color.getName());
			type.setDyeColor(color);
			STRUCTURAL_GLASS_BLOCKS.addType(type);
		}
	}
}