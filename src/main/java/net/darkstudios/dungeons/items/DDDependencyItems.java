package net.darkstudios.dungeons.items;

import net.darkstudios.dungeons.compat.Compats;
import net.darkstudios.dungeons.items.custom.KeyItem;
import net.darkstudios.mines.items.MMItems;
import net.darkstudios.mines.util.MMRarities;
import net.darkstudios.rdslib.util.item.MissingDependencyItem;
import net.minecraft.world.item.Item;

public class DDDependencyItems {
    public static Item forgiumKey(Item.Properties pProperties) {
        Item key;
        if (Compats.MASTERFUL_MINES) {
            key = KeyItem.create(pProperties.rarity(MMRarities.FORGIUM), MMItems.FORGIUM_INGOT.get());
        } else {
            key = new MissingDependencyItem(new Item.Properties(), "masterfulmines");
        }
        return key;
    }
}
