package andronomos.blockpalette.block;

import net.minecraft.world.level.block.Block;

public class BPBlock extends Block {
	private String textureFolder;

	public BPBlock(Properties properties, String textureFolder) {
		super(properties);
		this.textureFolder = textureFolder;
	}

	public String getTextureFolder() {
		return textureFolder;
	}
}
