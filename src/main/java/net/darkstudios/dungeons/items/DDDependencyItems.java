package net.darkstudios.dungeons.items;

import net.darkstudios.dungeons.items.custom.KeyItem;
import net.darkstudios.rdslib.util.item.MissingDependencyItem;
import net.darkstudios.rdslib.util.rarity.Rarities;
import net.minecraft.world.item.Item;
import net.minecraftforge.fml.ModList;

public class DDDependencyItems {
    public static Item forgiumIngot(Item.Properties pProperties) {
        Item key;
        if (ModList.get().isLoaded("masterfulmines")) {
            key = KeyItem.create(pProperties);
        } else {
            key = new MissingDependencyItem(new Item.Properties().rarity(Rarities.DEPENDENCY_MISSING));
        }
        return key;
    }
}
