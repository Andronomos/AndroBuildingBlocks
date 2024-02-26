package andronomos.androbuildingblocks.registry;

import andronomos.androbuildingblocks.AndroBuildingBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeTabs {
	public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, AndroBuildingBlocks.MODID);

	public static final String BASETABNAME = "androbuildingblocks_tab";
	public static final String GLASSTABNAME = "androbuildingblocks_glass_tab";

	public static final RegistryObject<CreativeModeTab> ANDROBUILDINGBLOCKS_TAB = CREATIVE_MODE_TABS.register(BASETABNAME, () -> CreativeModeTab.builder()
			.title(Component.translatable("creativetab." + BASETABNAME))
			.icon(BlockRegistry.REINFORCED_CONCRETE_WHITE.get().asItem()::getDefaultInstance)
			.displayItems((parameters, output) -> BlockRegistry.BLOCKS.getEntries().stream().map(RegistryObject::get).forEach(b -> {
				switch (b.getClass().getSimpleName()) {
					case "GlassBlock", "StainedGlassBlock", "StainedGlassPaneBlock":
						return;
				}
				output.accept(b);
			})).build());

	public static final RegistryObject<CreativeModeTab> ANDROBUILDINGBLOCKS_GLASS_TAB = CREATIVE_MODE_TABS.register(GLASSTABNAME, () -> CreativeModeTab.builder()
			.title(Component.translatable("creativetab." + GLASSTABNAME))
			.icon(BlockRegistry.WHITE_STRUCTURAL_GLASS.get().asItem()::getDefaultInstance)
			.displayItems((parameters, output) -> BlockRegistry.BLOCKS.getEntries().stream().map(RegistryObject::get).forEach(b -> {
				switch (b.getClass().getSimpleName()) {
					case "GlassBlock", "StainedGlassBlock", "StainedGlassPaneBlock" -> output.accept(b);
				}
			})).build());
}
