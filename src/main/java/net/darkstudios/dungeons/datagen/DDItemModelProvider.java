package net.darkstudios.dungeons.datagen;

import net.darkstudios.dungeons.DecrepitDungeons;
import net.darkstudios.dungeons.items.DDItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class DDItemModelProvider extends ItemModelProvider {
    public DDItemModelProvider(PackOutput packOutput, ExistingFileHelper existingFileHelper) {
        super(packOutput, DecrepitDungeons.MODID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        simpleItem(DDItems.KEY);
        simpleItem(DDItems.GOLD_KEY);
        simpleItem(DDItems.DEMON_KEY);
        simpleItem(DDItems.FORGIUM_KEY);
    }


    private ItemModelBuilder simpleItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(DecrepitDungeons.MODID,"item/" + item.getId().getPath()));
    }

    private ItemModelBuilder handheldItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/handheld")).texture("layer0",
                new ResourceLocation(DecrepitDungeons.MODID,"item/" + item.getId().getPath()));
    }
}
