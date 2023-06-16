package net.darkstudios.dungeons.datagen.loot;

import net.darkstudios.dungeons.blocks.DDBlocks;
import net.darkstudios.dungeons.blocks.TallDoorBlock;
import net.darkstudios.dungeons.util.states.TripleBlockPart;
import net.darkstudios.mines.blocks.MMBlocks;
import net.minecraft.data.loot.BlockLoot;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraftforge.registries.RegistryObject;

public class DDBlockLootTables extends BlockLoot {
    private static final float[] NORMAL_LEAVES_SAPLING_CHANCES = new float[] { 0.05f, 0.0625f, 0.083333336F, 0.1f };

    @Override
    protected void addTables() {
        add(DDBlocks.INDESTRUCTIBLE_STONE_BRICKS.get(), noDrop());
        add(DDBlocks.EXAMPLE_DOOR.get(), createTallDoorTable(DDBlocks.EXAMPLE_DOOR.get()));
    }

    public static LootTable.Builder createTallDoorTable(Block block) {
        return createSinglePropConditionTable(block, TallDoorBlock.THIRD, TripleBlockPart.LOWER);
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return DDBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
