package net.darkstudios.dungeons.items;

import net.darkstudios.dungeons.DecrepitDungeons;
import net.darkstudios.dungeons.util.DDRarities;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class DDItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, DecrepitDungeons.MODID);

    // public static final RegistryObject<Item> DUNGEON_COIN = ITEMS.register("dungeon_coin",
    //        () -> new CoinItem(DDItemTiers.COIN_TIERS, 0, new Item.Properties()));

    public static final RegistryObject<Item> KEY = ITEMS.register("key",
            () -> new Item(new Item.Properties().rarity(DDRarities.KEY)));
    public static final RegistryObject<Item> GOLD_KEY = ITEMS.register("gold_key",
            () -> new Item(new Item.Properties().rarity(DDRarities.GOLD_KEY)));
    public static final RegistryObject<Item> DEMON_KEY = ITEMS.register("demon_key",
            () -> new Item(new Item.Properties().rarity(DDRarities.DEMON_KEY)));

    public static final RegistryObject<Item> FORGIUM_KEY = ITEMS.register("forgium_key",
            () -> DDDependencyItems.forgiumKey(new Item.Properties()));

    public static void register(IEventBus bus) {
        ITEMS.register(bus);
    }
}
