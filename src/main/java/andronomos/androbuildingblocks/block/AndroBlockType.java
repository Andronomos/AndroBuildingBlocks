package andronomos.androbuildingblocks.block;

import net.minecraft.world.item.DyeColor;

public class AndroBlockType {
	public String name;
	public boolean hasStairVariant;
	public boolean hasSlabVariant;
	public boolean hasWallVariant;
	public DyeColor dyeColor;

	public AndroBlockType(String name) {
		this(name, true, true, true);
	}

	public AndroBlockType(String name, boolean hasStairVariant, boolean hasSlabVariant, boolean hasWallVariant) {
		this.name = name;
		this.hasStairVariant = hasStairVariant;
		this.hasSlabVariant = hasSlabVariant;
		this.hasWallVariant = hasWallVariant;
	}

	public AndroBlockType setDyeColor(DyeColor color) {
		this.dyeColor = color;
		return this;
	}

	public DyeColor getDyeColor() {
		return this.dyeColor;
	}
}


