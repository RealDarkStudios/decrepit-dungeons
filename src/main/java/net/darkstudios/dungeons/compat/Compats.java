package net.darkstudios.dungeons.compat;


import net.minecraftforge.fml.ModList;

public class Compats {
    public static final boolean MASTERFUL_MINES;

    static {
        MASTERFUL_MINES = ModList.get().isLoaded("masterfulmines");
    }
}
