package net.darkstudios.dungeons.util;

import net.darkstudios.dungeons.compat.Compats;
import net.darkstudios.mines.util.MMRarities;
import net.darkstudios.rdslib.util.RDSUtils;
import net.darkstudios.rdslib.util.item.ItemTier;


public class DDItemTiers {

    public static final ItemTier[] COIN_TIERS = RDSUtils.removeNulls(getCoinTiers());

    private static ItemTier[] getCoinTiers() {
        ItemTier BRONZE_COIN = new ItemTier("bronze_coin", DDRarities.Coins.BRONZE_COIN);
        ItemTier SILVER_COIN = new ItemTier("silver_coin", DDRarities.Coins.SILVER_COIN);
        ItemTier GOLD_COIN = new ItemTier("gold_coin", DDRarities.Coins.GOLD_COIN);
        ItemTier FORGIUM_COIN = null;

        if (Compats.MASTERFUL_MINES) {
            FORGIUM_COIN = new ItemTier("forgium_coin", MMRarities.FORGIUM);
        }

        return new ItemTier[]{
                BRONZE_COIN,
                SILVER_COIN,
                GOLD_COIN,
                FORGIUM_COIN
        };
    }
}
