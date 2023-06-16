package net.darkstudios.dungeons.util;

import net.darkstudios.mines.MasterfulMines;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class DDTags {
    public static class Blocks {
        public static final TagKey<Block> TALL_DOORS = tag("tall_doors");
        public static final TagKey<Block> TALL_WOODEN_DOORS = tag("tall_wooden_doors");
        public static final TagKey<Block> HAND_OPENABLE_TALL_METAL_DOORS = tag("hand_openable_tall_metal_doors");

        private static TagKey<Block> tag(String name) {
            return BlockTags.create(new ResourceLocation(MasterfulMines.MODID, name));
        }

        private static TagKey<Block> forgeTag(String name) {
            return BlockTags.create(new ResourceLocation("forge", name));
        }
    }

    public static class Items {

        private static TagKey<Item> tag(String name) {
            return ItemTags.create(new ResourceLocation(MasterfulMines.MODID, name));
        }

        private static TagKey<Item> forgeTag(String name) {
            return ItemTags.create(new ResourceLocation("forge", name));
        }
    }
}
