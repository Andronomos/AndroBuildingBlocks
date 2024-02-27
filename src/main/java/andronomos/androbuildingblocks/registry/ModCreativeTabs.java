package andronomos.androbuildingblocks.registry;

import andronomos.androbuildingblocks.AndroBuildingBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.Arrays;
import java.util.List;

public class ModCreativeTabs {
	public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, AndroBuildingBlocks.MODID);

	public static final String BASETABNAME = "androbuildingblocks_tab";
	public static final String MODERNTABNAME = "androbuildingblocks_modern_tab";

	private static final List<String> modernBlocks = Arrays.asList(
		"reinforced_concrete",
		"structural_glass",
		"carbon_steel",
		"caution"
	);

	public static final RegistryObject<CreativeModeTab> ANDROBUILDINGBLOCKS_TAB = CREATIVE_MODE_TABS.register(BASETABNAME, () -> CreativeModeTab.builder()
			.title(Component.translatable("creativetab." + BASETABNAME))
			.icon(BlockRegistry.REINFORCED_CONCRETE_WHITE.get().asItem()::getDefaultInstance)
			.displayItems((parameters, output) -> BlockRegistry.BLOCKS.getEntries().stream().map(RegistryObject::get).forEach(b -> {
				String blockName = ForgeRegistries.BLOCKS.getKey(b).getPath();
				modernBlocks.forEach(block -> {
					if(blockName.contains(block)) {
						return;
					}
				});
				output.accept(b);
			})).build());

	public static final RegistryObject<CreativeModeTab> ANDROBUILDINGBLOCKS_MODERN_TAB = CREATIVE_MODE_TABS.register(MODERNTABNAME, () -> CreativeModeTab.builder()
			.title(Component.translatable("creativetab." + MODERNTABNAME))
			.icon(BlockRegistry.REINFORCED_CONCRETE_WHITE.get().asItem()::getDefaultInstance)
			.displayItems((parameters, output) -> BlockRegistry.BLOCKS.getEntries().stream().map(RegistryObject::get).forEach(b -> {
				String blockName = ForgeRegistries.BLOCKS.getKey(b).getPath();
				modernBlocks.forEach(block -> {
					if(blockName.contains(block)) {
						output.accept(b);
					}
				});
			})).build());
}
