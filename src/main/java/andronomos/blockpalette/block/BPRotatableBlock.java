package andronomos.blockpalette.block;

import net.minecraft.world.level.block.RotatedPillarBlock;

public class BPRotatableBlock extends RotatedPillarBlock {
	private String topTexture;

	public BPRotatableBlock(Properties properties, String topTexture) {
		super(properties);
		this.topTexture = topTexture;
	}

	public String getTopTexture() {
		return topTexture;
	}
}
