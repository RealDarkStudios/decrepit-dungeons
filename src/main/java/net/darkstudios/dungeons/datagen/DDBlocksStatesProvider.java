package net.darkstudios.dungeons.datagen;

import net.darkstudios.dungeons.DecrepitDungeons;
import net.minecraft.data.PackOutput;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class DDBlocksStatesProvider extends BlockStateProvider {
    public DDBlocksStatesProvider(PackOutput packOutput, ExistingFileHelper exFileHelper) {
        super(packOutput, DecrepitDungeons.MODID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {

    }
}
