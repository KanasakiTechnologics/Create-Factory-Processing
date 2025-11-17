package com.KanasakiTechnologics.CreateFactory.datagen.create;

import com.KanasakiTechnologics.CreateFactory.CreateFactory;
import com.simibubi.create.api.data.recipe.MillingRecipeGen;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Blocks;

import java.util.concurrent.CompletableFuture;

@SuppressWarnings("unused")
public class FactoryMillingProvider extends MillingRecipeGen {
    public FactoryMillingProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries, CreateFactory.MOD_ID);
    }

    GeneratedRecipe
            NETHER_WART_BLOCK = create(() -> Blocks.NETHER_WART_BLOCK, b -> b.duration(150)
            .output(Items.NETHER_WART,2)
            .output(.25F,Items.NETHER_WART)
    );
}
