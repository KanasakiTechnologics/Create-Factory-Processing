package com.KanasakiTechnologics.CreateFactory.datagen.create;

import com.KanasakiTechnologics.CreateFactory.CreateFactory;
import com.KanasakiTechnologics.CreateFactory.item.AllFactoryItems;
import com.simibubi.create.AllItems;
import com.simibubi.create.api.data.recipe.MixingRecipeGen;
import com.simibubi.create.content.processing.recipe.HeatCondition;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;

import java.util.concurrent.CompletableFuture;

@SuppressWarnings("unused")
public class FactoryMixingProvider extends MixingRecipeGen {
    public FactoryMixingProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries, CreateFactory.MOD_ID);
    }
    GeneratedRecipe ANCIENT_DUST = create("ancient_dust",b -> b.requiresHeat(HeatCondition.SUPERHEATED).require(AllItems.POWDERED_OBSIDIAN).require(AllItems.CINDER_FLOUR).output(AllFactoryItems.ANCIENT_DUST));
}
