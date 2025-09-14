package com.KanasakiTechnologics.CreateFactory.item;

import com.KanasakiTechnologics.CreateFactory.CreateFactory;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class AllFactoryItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(CreateFactory.MOD_ID);

    public static final DeferredItem<Item> ANCIENT_DUST = ITEMS.register("ancient_dust",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> UNPROCESSED_ANCIENT_DUST = ITEMS.register("unprocessed_ancient_dust",
            () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> UNPOLISHED_DIAMOND = ITEMS.register("unpolished_diamond",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus){ITEMS.register(eventBus);}
}
