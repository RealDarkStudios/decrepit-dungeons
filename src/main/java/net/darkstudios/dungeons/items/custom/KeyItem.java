package net.darkstudios.dungeons.items.custom;

import net.minecraft.world.item.Item;
import net.minecraft.world.level.ItemLike;

public class KeyItem extends Item {
    private final Item ingot;

    public KeyItem(Properties pProperties, ItemLike pIngot) {
        super(pProperties);
        this.ingot = pIngot.asItem();
    }

    public static Item create(Properties pProperties, ItemLike pIngot) {
        return new KeyItem(pProperties, pIngot);
    }
}
