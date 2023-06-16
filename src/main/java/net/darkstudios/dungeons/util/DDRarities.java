package net.darkstudios.dungeons.util;

import net.darkstudios.rdslib.util.rarity.Rarities;
import net.minecraft.network.chat.TextColor;
import net.minecraft.world.item.Rarity;

public class DDRarities {
    public static final Rarity KEY = new Rarities.Builder().name("ddkey").color(TextColor.fromRgb(0x606060)).build();
    public static final Rarity GOLD_KEY = new Rarities.Builder().name("ddgoldkey").color(TextColor.fromRgb(0xFFAA00)).bold().build();
    public static final Rarity DEMON_KEY = new Rarities.Builder().name("dddemonkey").color(TextColor.fromRgb(0xFF0000)).bold().build();

    public static class Coins {
        public static final Rarity BRONZE_COIN = new Rarities.Builder().name("ddcoinbronze").color(TextColor.fromRgb(0xa37e49)).build();
        public static final Rarity SILVER_COIN = new Rarities.Builder().name("ddcoinsilver").color(TextColor.fromRgb(0xc0c0c0)).build();
        public static final Rarity GOLD_COIN = new Rarities.Builder().name("ddcoingold").color(TextColor.fromRgb(0xFFAA00)).build();

    }
}
