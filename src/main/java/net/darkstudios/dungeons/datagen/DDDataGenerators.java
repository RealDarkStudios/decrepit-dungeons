package net.darkstudios.dungeons.datagen;

import net.darkstudios.dungeons.DecrepitDungeons;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = DecrepitDungeons.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class DDDataGenerators {
    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        PackOutput packOutput = generator.getPackOutput();
        ExistingFileHelper existingFileHelper = event.getExistingFileHelper();

        generator.addProvider(true, new DDRecipeProvider(packOutput));
        generator.addProvider(true, new DDLootTableProvider(packOutput));
        generator.addProvider(true, new DDBlocksStatesProvider(packOutput, existingFileHelper));
        generator.addProvider(true, new DDItemModelProvider(packOutput, existingFileHelper));
    }
}
