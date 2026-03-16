package com.KanasakiTechnologics.CreateFactory.datagen.create;


import com.KanasakiTechnologics.CreateFactory.CreateFactory;
import com.KanasakiTechnologics.CreateFactory.item.AllFactoryItems;
import com.simibubi.create.AllItems;
import com.simibubi.create.api.data.recipe.WashingRecipeGen;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Items;

import java.util.concurrent.CompletableFuture;

@SuppressWarnings("unused")
public class FactorySplashingProvider extends WashingRecipeGen {
    public FactorySplashingProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries, CreateFactory.MOD_ID);
    }

    GeneratedRecipe
            INK_SAC = create(("ink_sac_from_coal"),b -> b.require(ItemTags.COALS).output(Items.INK_SAC)),
            BRASS_NUGGETS = create(("brass_nuggets_washed"), b -> b.require(AllFactoryItems.CRUSHED_BRASS).output(AllItems.BRASS_NUGGET,9).output(.25f,Items.GLOWSTONE_DUST));
}
