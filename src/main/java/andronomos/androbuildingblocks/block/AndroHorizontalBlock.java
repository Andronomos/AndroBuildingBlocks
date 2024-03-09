package andronomos.androbuildingblocks.block;

import net.minecraft.world.level.block.HorizontalDirectionalBlock;

public class AndroHorizontalBlock extends HorizontalDirectionalBlock {
	public static String topResource;

	public AndroHorizontalBlock(Properties properties, String topResource) {
		super(properties);
		this.topResource = topResource;
	}
}
