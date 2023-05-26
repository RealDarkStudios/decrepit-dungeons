package net.darkstudios.dungeons.items.custom;

import net.minecraft.world.item.Item;

public class KeyItem extends Item {
    public KeyItem(Properties pProperties) {
        super(pProperties);
    }

    public static Item create(Properties pProperties) {
        return new KeyItem(pProperties);
    }
}
