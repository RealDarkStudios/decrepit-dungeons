package net.darkstudios.dungeons.items;

import net.darkstudios.dungeons.items.custom.KeyItem;
import net.darkstudios.mines.items.MMItems;
import net.darkstudios.mines.util.rarities.MMRarities;
import net.darkstudios.rdslib.util.item.MissingDependencyItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.fml.ModList;

public class DDDependencyItems {
    public static Item forgiumKey(Item.Properties pProperties) {
        Item key;
        if (ModList.get().isLoaded("masterfulmines")) {
            key = KeyItem.create(pProperties.rarity(MMRarities.FORGIUM), MMItems.FORGIUM_INGOT.get());
        } else {
            key = new MissingDependencyItem(new Item.Properties(), "masterfulmines");
        }
        return key;
    }
}
