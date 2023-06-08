package net.darkstudios.dungeons.blocks;

import net.darkstudios.dungeons.DecrepitDungeons;
import net.darkstudios.dungeons.items.DDItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class DDBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, DecrepitDungeons.MODID);

    public static final RegistryObject<Block> INDESTRUCTIBLE_STONE_BRICKS = registerBlock("indestructible_stone_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.BEDROCK)), new Item.Properties());
    public static final RegistryObject<Block> EXAMPLE_DOOR = registerBlock("example_door",
            () -> new TallDoorBlock(BlockBehaviour.Properties.copy(Blocks.IRON_DOOR)), new Item.Properties());

    private static <T extends Block> RegistryObject<T> registerBlock(String pName, Supplier<T> pBlock, Item.Properties pProperties) {
        RegistryObject<T> toReturn = BLOCKS.register(pName, pBlock);
        registerBlockItem(pName, toReturn, pProperties);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String pName, RegistryObject<T> pBlock, Item.Properties pProperties) {
        return DDItems.ITEMS.register(pName, () -> new BlockItem(pBlock.get(), pProperties));
    }

    public static void register(IEventBus bus) {
        BLOCKS.register(bus);
    }
}
