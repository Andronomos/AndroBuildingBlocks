package andronomos.androbuildingblocks.block;

import net.minecraft.world.level.block.Block;

import java.util.ArrayList;
import java.util.List;

public class AndroBlockCategory {
	public final String name;
	public final List<AndroBlockType> types = new ArrayList<>();
	public Block.Properties properties;

	public AndroBlockCategory(String name, Block.Properties properties) {
		this.name = name;
		this.properties = properties;
	}

	public void addType(AndroBlockType type) {
		types.add(type);
	}
}
