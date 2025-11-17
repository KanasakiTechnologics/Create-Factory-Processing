package com.KanasakiTechnologics.CreateFactory.datagen.create;

import com.KanasakiTechnologics.CreateFactory.CreateFactory;
import com.simibubi.create.api.data.recipe.HauntingRecipeGen;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.world.item.Items;

import java.util.concurrent.CompletableFuture;

@SuppressWarnings("unused")
public class FactoryHauntingProvider extends HauntingRecipeGen {
    public FactoryHauntingProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries, CreateFactory.MOD_ID);
    }

    GeneratedRecipe
            BROWN_MUSHROOM = convert(Items.RED_MUSHROOM,Items.BROWN_MUSHROOM),
            RED_MUSHROOM = convert(Items.BROWN_MUSHROOM,Items.RED_MUSHROOM),
            SPIDER_EYE = create("redstone_eye", b->b.require(Items.REDSTONE)
                    .output(.35F,Items.SPIDER_EYE)
            );
}
