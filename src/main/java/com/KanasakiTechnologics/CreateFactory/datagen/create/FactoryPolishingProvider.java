package com.KanasakiTechnologics.CreateFactory.datagen.create;

import com.KanasakiTechnologics.CreateFactory.CreateFactory;
import com.KanasakiTechnologics.CreateFactory.item.AllFactoryItems;
import com.simibubi.create.api.data.recipe.PolishingRecipeGen;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.world.item.Items;

import java.util.concurrent.CompletableFuture;

@SuppressWarnings("unused")
public class FactoryPolishingProvider extends PolishingRecipeGen {
    public FactoryPolishingProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries, CreateFactory.MOD_ID);
    }
    GeneratedRecipe DIAMOND = create(AllFactoryItems.UNPOLISHED_DIAMOND::get, b -> b.output(Items.DIAMOND));
}
