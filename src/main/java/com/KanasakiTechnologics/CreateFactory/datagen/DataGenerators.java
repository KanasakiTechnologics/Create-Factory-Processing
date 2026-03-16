package com.KanasakiTechnologics.CreateFactory.datagen;


import com.KanasakiTechnologics.CreateFactory.CreateFactory;
import com.KanasakiTechnologics.CreateFactory.datagen.create.*;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraft.data.loot.LootTableProvider;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.data.event.GatherDataEvent;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.CompletableFuture;

@SuppressWarnings("removal")
@EventBusSubscriber(modid = CreateFactory.MOD_ID, bus = EventBusSubscriber.Bus.MOD)
public class DataGenerators {
    @SubscribeEvent
    public static void gatherData(GatherDataEvent event){
        DataGenerator generator = event.getGenerator();
        PackOutput packOutput = generator.getPackOutput();
        ExistingFileHelper existingFileHelper = event.getExistingFileHelper();
        CompletableFuture<HolderLookup.Provider> lookupProvider = event.getLookupProvider();

        generator.addProvider(event.includeClient(), new FactoryItemStateProvider(packOutput, existingFileHelper));
        generator.addProvider(event.includeClient(),new FactoryBlockStateProvider(packOutput,existingFileHelper));
        generator.addProvider(event.includeServer(), new FactoryRecipeProvider(packOutput,lookupProvider));
        generator.addProvider(event.includeServer(), new FactoryPolishingProvider(packOutput,lookupProvider));
        generator.addProvider(event.includeServer(), new FactorySequenceAssemblyProvider(packOutput,lookupProvider));
        generator.addProvider(event.includeServer(), new FactoryMixingProvider(packOutput,lookupProvider));
        generator.addProvider(event.includeServer(), new FactorySplashingProvider(packOutput,lookupProvider));
        generator.addProvider(event.includeServer(), new FactoryCrushingProvider(packOutput,lookupProvider));
        generator.addProvider(event.includeServer(), new FactoryMillingProvider(packOutput,lookupProvider));
        generator.addProvider(event.includeServer(), new FactoryHauntingProvider(packOutput,lookupProvider));
        generator.addProvider(event.includeServer(), new FactoryCompactingProvider(packOutput,lookupProvider));
        generator.addProvider(event.includeServer(), new FactoryDataMapProvider(packOutput, lookupProvider));
        generator.addProvider(event.includeServer(), new LootTableProvider(packOutput, Collections.emptySet(), List.of(new LootTableProvider.SubProviderEntry(FactoryLootTableProvider::new, LootContextParamSets.BLOCK)), lookupProvider));
        generator.addProvider(event.includeServer(), new FactoryGlobalLootModifierProvider(packOutput,lookupProvider));
        BlockTagsProvider blockTagsProvider = new FactoryBlockTagProvider(packOutput, lookupProvider, existingFileHelper);
        generator.addProvider(event.includeServer(), blockTagsProvider);
    }
}
