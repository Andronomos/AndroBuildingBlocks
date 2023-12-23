package andronomos.blockpalette.data.client;

import andronomos.blockpalette.BlockPalette;
import net.minecraft.data.PackOutput;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ModItemModelProvider extends ItemModelProvider {
	public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
		super(output, BlockPalette.MODID, existingFileHelper);
	}

	@Override
	protected void registerModels() {

	}
}
