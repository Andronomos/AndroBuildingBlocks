package andronomos.androbuildingblocks.data.client;

import andronomos.androbuildingblocks.AndroBuildingBlocks;
import net.minecraft.data.PackOutput;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ModItemModelProvider extends ItemModelProvider {
	public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
		super(output, AndroBuildingBlocks.MODID, existingFileHelper);
	}

	@Override
	protected void registerModels() {
		createSingleTexture("sandpaper");
		createSingleTexture("steel_ingot");
		//withExistingParent("steel_catwalk_rail", modLoc("block/steel_catwalk_rail"));
	}

	private ItemModelBuilder createSingleTexture(String name) {
		return singleTexture(name, mcLoc("item/generated"), "layer0", modLoc("item/" + name));
	}
}
