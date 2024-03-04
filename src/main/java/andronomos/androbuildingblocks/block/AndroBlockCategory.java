package andronomos.androbuildingblocks.block;

import java.util.ArrayList;
import java.util.List;

public class AndroBlockCategory {
	public final String name;
	public final List<AndroBlockType> types = new ArrayList<>();

	public AndroBlockCategory(String name) {
		this.name = name;
	}

	public void addType(AndroBlockType type) {
		types.add(type);
	}
}
