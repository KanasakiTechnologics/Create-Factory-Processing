package com.KanasakiTechnologics.CreateFactory.datagen;

import com.KanasakiTechnologics.CreateFactory.CreateFactory;
import com.KanasakiTechnologics.CreateFactory.item.AllFactoryItems;
import com.KanasakiTechnologics.CreateFactory.loot.AddItemModifier;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemRandomChanceCondition;
import net.neoforged.neoforge.common.data.GlobalLootModifierProvider;
import net.neoforged.neoforge.common.loot.LootTableIdCondition;

import java.util.concurrent.CompletableFuture;

public class FactoryGlobalLootModifierProvider extends GlobalLootModifierProvider {
    public FactoryGlobalLootModifierProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries, CreateFactory.MOD_ID);
    }

    @Override
    protected void start() {
        this.add("sniffing_dye_seed",
                new AddItemModifier(new LootItemCondition[]{
                        new LootTableIdCondition.Builder(ResourceLocation.withDefaultNamespace("gameplay/sniffer_digging")).build(),
                        LootItemRandomChanceCondition.randomChance(0.45f).build()
                }, AllFactoryItems.ESSENCE_SEED.get()));

        this.add("leatherworker_dye_seed",
                new AddItemModifier(new LootItemCondition[]{
                        new LootTableIdCondition.Builder(ResourceLocation.withDefaultNamespace("chests/village/village_tannery")).build(),
                        LootItemRandomChanceCondition.randomChance(0.45f).build()
                }, AllFactoryItems.ESSENCE_SEED.get()));

        this.add("sheep_dye_seed",
                new AddItemModifier(new LootItemCondition[]{
                        new LootTableIdCondition.Builder(ResourceLocation.withDefaultNamespace("chests/village/village_shepherd")).build(),
                        LootItemRandomChanceCondition.randomChance(0.45f).build()
                }, AllFactoryItems.ESSENCE_SEED.get()));

    }
}
