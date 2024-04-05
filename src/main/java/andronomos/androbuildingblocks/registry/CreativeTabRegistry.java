package andronomos.androbuildingblocks.registry;

import andronomos.androbuildingblocks.AndroBuildingBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class CreativeTabRegistry {
	public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, AndroBuildingBlocks.MODID);

	public static final RegistryObject<CreativeModeTab> ANDROBUILDINGBLOCKS_TAB = CREATIVE_MODE_TABS.register("scratchpad_tab", () -> CreativeModeTab.builder()
			.title(Component.translatable("creativetab.androbuildingblocks_tab"))
			.icon(BlockRegistry.BLOCKS.getEntries().stream().findFirst().map(RegistryObject::get).get().asItem()::getDefaultInstance)
			.displayItems((parameters, output) -> {
				BlockRegistry.BLOCKS.getEntries().stream().map(RegistryObject::get).forEach(b -> output.accept(b));
				output.accept(ItemRegistry.SANDPAPER.get());
			})
			.build());
}
