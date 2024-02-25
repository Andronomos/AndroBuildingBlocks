package androbuildingblocks.blockpalette.data.client;

import androbuildingblocks.blockpalette.AndroBuildingBlocks;
import androbuildingblocks.blockpalette.registry.BlockRegistry;
import androbuildingblocks.blockpalette.registry.ModCreativeTabs;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.LanguageProvider;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.Arrays;
import java.util.Objects;
import java.util.stream.Collectors;

public class ModLanguageProvider extends LanguageProvider {
	public ModLanguageProvider(PackOutput output, String locale) {
		super(output, AndroBuildingBlocks.MODID, locale);
	}

	@Override
	protected void addTranslations() {
		add("creativetab." + ModCreativeTabs.BASETABNAME, "BlockPalette");
		add("creativetab." + ModCreativeTabs.GLASSTABNAME, "BlockPalette Glass");

		BlockRegistry.BLOCKS.getEntries().stream().map(RegistryObject::get).forEach(b -> {
			String name = Objects.requireNonNull(ForgeRegistries.BLOCKS.getKey(b)).getPath();
			name = name.replaceAll("_", " ");
			name = capitalizeWords(name);
			add(b, name);
		});
	}

	static String capitalizeWords(String input) {
		return Arrays.stream(input.split("\\s+"))
				.map(word -> word.substring(0, 1).toUpperCase() + word.substring(1))
				.collect(Collectors.joining(" "));
	}
}
