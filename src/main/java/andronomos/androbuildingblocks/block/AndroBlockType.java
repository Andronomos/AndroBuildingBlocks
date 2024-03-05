package andronomos.androbuildingblocks.block;

import net.minecraft.world.item.DyeColor;

public class AndroBlockType {
	public String name;
	public boolean hasStairVariant;
	public boolean hasSlabVariant;
	public boolean hasWallVariant;
	public boolean hasTransparency = false;
	public boolean isRotatable = false;
	public DyeColor dyeColor;
	public boolean isGlass = false;

	public AndroBlockType(String name) {
		this(name, true, true, true);
	}

	public AndroBlockType(String name, boolean hasStairVariant, boolean hasSlabVariant, boolean hasWallVariant) {
		this.name = name;
		this.hasStairVariant = hasStairVariant;
		this.hasSlabVariant = hasSlabVariant;
		this.hasWallVariant = hasWallVariant;
	}

	public AndroBlockType dyeColor(DyeColor color) {
		this.dyeColor = color;
		return this;
	}

	public AndroBlockType rotatable(boolean value) {
		this.isRotatable = value;
		return this;
	}

	public AndroBlockType transparency(boolean value) {
		this.hasTransparency = value;
		return this;
	}

	public AndroBlockType glass(boolean value) {
		this.isGlass = value;
		return this;
	}
}


