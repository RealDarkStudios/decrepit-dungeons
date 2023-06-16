package net.darkstudios.dungeons;

import com.mojang.logging.LogUtils;
import net.darkstudios.dungeons.blocks.DDBlocks;
import net.darkstudios.dungeons.compat.Compats;
import net.darkstudios.dungeons.items.DDItems;
import net.darkstudios.mines.items.MMItems;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

@Mod(DecrepitDungeons.MODID)
public class DecrepitDungeons {

    public static final String MODID = "decrepitdungeons";
    private static final Logger LOGGER = LogUtils.getLogger();

    public DecrepitDungeons() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        modEventBus.addListener(this::commonSetup);

        if (Compats.MASTERFUL_MINES) {
            MMItems.register(modEventBus);
        }
        DDItems.register(modEventBus);
        DDBlocks.register(modEventBus);

        MinecraftForge.EVENT_BUS.register(this);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
        LOGGER.info("Decrepit Dungeons is starting");
    }

    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {
        LOGGER.info("Decrepit Dungeons Server is starting");
    }

    @Mod.EventBusSubscriber(modid = MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class ClientModEvents {

        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {
            LOGGER.info("Decrepit Dungeons Client is starting");
        }
    }
}
