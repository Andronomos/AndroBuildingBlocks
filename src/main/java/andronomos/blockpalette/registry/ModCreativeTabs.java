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

	public static final String BASETABNAME = "blockpalette_tab";
	public static final String GLASSTABNAME = "blockpalette_glass_tab";

	public static final RegistryObject<CreativeModeTab> BLOCKPALETTE_TAB = CREATIVE_MODE_TABS.register(BASETABNAME, () -> CreativeModeTab.builder()
			.withTabsBefore(CreativeModeTabs.COMBAT)
			.title(Component.translatable("creativetab." + BASETABNAME))
			.icon(ModBlocks.ROUGH_WHITE_CONCRETE.get().asItem()::getDefaultInstance)
			.displayItems((parameters, output) -> {
				ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get).forEach(b -> {
					output.accept(b);
				});
			}).build());

	public static final RegistryObject<CreativeModeTab> BLOCKPALETTE_GLASS_TAB = CREATIVE_MODE_TABS.register(GLASSTABNAME, () -> CreativeModeTab.builder()
			.withTabsBefore(CreativeModeTabs.COMBAT)
			.title(Component.translatable("creativetab." + GLASSTABNAME))
			.icon(ModBlocks.BORDERLESS_WHITE_GLASS.get().asItem()::getDefaultInstance)
			.displayItems((parameters, output) -> {
				ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get).forEach(b -> {
					String blockType = b.getClass().getSimpleName();
					if(blockType.equals("GlassBlock") || blockType.equals("StainedGlassBlock")) {
						output.accept(b);
					}
				});
			}).build());
}