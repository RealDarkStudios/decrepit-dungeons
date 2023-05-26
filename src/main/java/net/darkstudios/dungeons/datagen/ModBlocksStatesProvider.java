package net.darkstudios.dungeons.datagen;

import net.darkstudios.dungeons.DecrepitDungeons;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ModBlocksStatesProvider extends BlockStateProvider {
    public ModBlocksStatesProvider(DataGenerator gen, ExistingFileHelper exFileHelper) {
        super(gen, DecrepitDungeons.MODID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {

    }
}
