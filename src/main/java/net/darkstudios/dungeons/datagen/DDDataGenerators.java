package net.darkstudios.dungeons.datagen;

import net.darkstudios.dungeons.DecrepitDungeons;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = DecrepitDungeons.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class DDDataGenerators {
    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        ExistingFileHelper existingFileHelper = event.getExistingFileHelper();

        generator.addProvider(true, new DDRecipeProvider(generator));
        generator.addProvider(true, new DDLootTableProvider(generator));
        generator.addProvider(true, new DDBlocksStatesProvider(generator, existingFileHelper));
        generator.addProvider(true, new DDItemModelProvider(generator, existingFileHelper));
    }
}
