package net.darkstudios.dungeons.items;

import net.darkstudios.dungeons.DecrepitDungeons;
import net.darkstudios.dungeons.util.rarities.ModRarities;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, DecrepitDungeons.MODID);

    public static final RegistryObject<Item> KEY = ITEMS.register("key", () -> new Item(new Item.Properties().rarity(ModRarities.DUNGEON_KEY)));
    public static final RegistryObject<Item> GOLD_KEY = ITEMS.register("gold_key", () -> new Item(new Item.Properties().rarity(ModRarities.DUNGEON_KEY)));
    public static final RegistryObject<Item> DEMON_KEY = ITEMS.register("demon_key", () -> new Item(new Item.Properties().rarity(ModRarities.DUNGEON_KEY)));
    public static void register(IEventBus bus) {
        ITEMS.register(bus);
    }
}
