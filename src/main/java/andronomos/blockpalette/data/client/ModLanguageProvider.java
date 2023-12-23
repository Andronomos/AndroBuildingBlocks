package andronomos.blockpalette.data.client;

import andronomos.blockpalette.BlockPalette;
import andronomos.blockpalette.registry.ModBlocks;
import andronomos.blockpalette.registry.ModCreativeTabs;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.LanguageProvider;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.apache.commons.lang3.StringUtils;

public class ModLanguageProvider extends LanguageProvider {
	public ModLanguageProvider(PackOutput output, String locale) {
		super(output, BlockPalette.MODID, locale);
	}

	@Override
	protected void addTranslations() {
		add("creativetab." + ModCreativeTabs.TABNAME, "BlockPalette");

		ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get).forEach(b -> {
			String name = ForgeRegistries.BLOCKS.getKey(b).getPath();
			name = name.replaceAll("_", " ");
			name = StringUtils.capitalize(name);
			add(b, name);
		});
	}
}
