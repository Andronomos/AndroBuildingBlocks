package andronomos.androbuildingblocks.block;

import net.minecraft.world.level.block.Block;

import java.util.ArrayList;
import java.util.List;

public class AndroBlockCategory {
	/**
	 * The string each sub block will use in its name
	 */
	public final String baseName;

	/**
	 * The block all sub blocks are based off of. Some categories may not have a source block if
	 * all sub blocks are intended to be unique rather than variations of the source.
	 */
	public AndroBlockType sourceBlock = null;

	/**
	 * If the category has a source block, these are the different variations of it,
	 * otherwise it's simply the blocks that fit this category
	 */
	public final List<AndroBlockType> blockTypes = new ArrayList<>();
	public Block.Properties properties;

	public AndroBlockCategory(String name, Block.Properties properties) {
		this.baseName = name;
		this.properties = properties;
	}

	public void setSourceBlock(AndroBlockType type) {
		sourceBlock = type;
	}

	public void addBlockType(AndroBlockType blockType) {
		blockTypes.add(blockType);
	}
}
