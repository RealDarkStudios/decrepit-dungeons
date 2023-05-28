package net.darkstudios.dungeons.util.rarities;

import net.darkstudios.rdslib.util.rarity.Rarities;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.TextColor;
import net.minecraft.world.item.Rarity;

public class DDRarities {
    public static final Rarity DUNGEON_KEY = new Rarities.Builder().name("dungeon_key").color(TextColor.fromRgb(0x555555)).bold().build();

}
