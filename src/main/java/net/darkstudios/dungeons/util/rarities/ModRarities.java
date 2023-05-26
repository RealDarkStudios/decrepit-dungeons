package net.darkstudios.dungeons.util.rarities;

import net.darkstudios.rdslib.util.rarity.Rarities;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.TextColor;
import net.minecraft.world.item.Rarity;

public class ModRarities {
    public static final Rarity DUNGEON_KEY = new Rarities.Builder().color(TextColor.fromLegacyFormat(ChatFormatting.DARK_GRAY)).bold().build();
}
