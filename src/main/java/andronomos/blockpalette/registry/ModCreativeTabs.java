package andronomos.blockpalette.registry;

import andronomos.blockpalette.BlockPalette;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeTabs {
	public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, BlockPalette.MODID);

	public static final String TABNAME = "blockpalette_tab";

	public static final RegistryObject<CreativeModeTab> BLOCKPALETTE_TAB = CREATIVE_MODE_TABS.register(TABNAME, () -> CreativeModeTab.builder()
			.withTabsBefore(CreativeModeTabs.COMBAT)
			.title(Component.translatable("creativetab.blockpalette_tab"))
			.icon(() -> ModBlocks.ROUGH_WHITE_CONCRETE.get().asItem().getDefaultInstance())
			.displayItems((parameters, output) -> {
				ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get).forEach(b -> {
					output.accept(b);
				});
			}).build());
}
