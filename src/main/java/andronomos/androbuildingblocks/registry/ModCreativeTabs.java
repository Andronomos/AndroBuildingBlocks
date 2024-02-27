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

	public static final RegistryObject<CreativeModeTab> ANDROBUILDINGBLOCKS_TAB = CREATIVE_MODE_TABS.register(BASETABNAME, () -> CreativeModeTab.builder()
			.title(Component.translatable("creativetab." + BASETABNAME))
			.icon(BlockRegistry.REINFORCED_CONCRETE_WHITE.get().asItem()::getDefaultInstance)
			.displayItems((parameters, output) -> BlockRegistry.BLOCKS.getEntries().stream().map(RegistryObject::get).forEach(b -> {
				output.accept(b);
			})).build());
}
