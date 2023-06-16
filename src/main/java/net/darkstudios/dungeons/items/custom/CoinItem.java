package net.darkstudios.dungeons.items.custom;

import net.darkstudios.rdslib.util.item.TieredItem;
import net.darkstudios.rdslib.util.item.ItemTier;

public class CoinItem extends TieredItem {
    public CoinItem(ItemTier[] pTiers, Properties pProperties) {
        super(pTiers, pProperties);
    }

    public CoinItem(ItemTier[] pTiers, int startingTier, Properties pProperties) {
        super(pTiers, startingTier, pProperties);
    }
}
