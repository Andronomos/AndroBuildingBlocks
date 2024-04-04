package andronomos.androbuildingblocks;

import andronomos.androbuildingblocks.registry.BlockRegistry;
import andronomos.androbuildingblocks.registry.CreativeTabRegistry;
import andronomos.androbuildingblocks.registry.ItemRegistry;
import com.mojang.logging.LogUtils;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(AndroBuildingBlocks.MODID)
public class AndroBuildingBlocks
{
    public static final String MODID = "androbuildingblocks";
    public static final Logger LOGGER = LogUtils.getLogger();

    public AndroBuildingBlocks()
    {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        BlockRegistry.BLOCKS.register(modEventBus);
        BlockRegistry.registerBlocks();

        ItemRegistry.ITEMS.register(modEventBus);
        CreativeTabRegistry.CREATIVE_MODE_TABS.register(modEventBus);

        MinecraftForge.EVENT_BUS.register(this);

        // Register our mod's ForgeConfigSpec so that Forge can create and load the config file for us
        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, Config.SPEC);
    }
}
