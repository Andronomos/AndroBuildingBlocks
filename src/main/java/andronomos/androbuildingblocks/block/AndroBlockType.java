package andronomos.androbuildingblocks.block;

public class AndroBlockType {
	public final String name;
	public final boolean hasStairVariant;
	public final boolean hasSlabVariant;
	public final boolean hasWallVariant;

	public AndroBlockType(String name) {
		this(name, true, true, true);
	}

	public AndroBlockType(String name, boolean hasStairVariant, boolean hasSlabVariant, boolean hasWallVariant) {
		this.name = name;
		this.hasStairVariant = hasStairVariant;
		this.hasSlabVariant = hasSlabVariant;
		this.hasWallVariant = hasWallVariant;
	}
}


