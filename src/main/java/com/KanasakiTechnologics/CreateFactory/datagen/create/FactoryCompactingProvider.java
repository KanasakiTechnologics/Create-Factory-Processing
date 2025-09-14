package com.KanasakiTechnologics.CreateFactory.datagen.create;

import com.KanasakiTechnologics.CreateFactory.CreateFactory;
import com.KanasakiTechnologics.CreateFactory.block.FactoryBlocks;
import com.simibubi.create.api.data.recipe.CompactingRecipeGen;
import com.simibubi.create.content.processing.recipe.HeatCondition;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Blocks;

import java.util.concurrent.CompletableFuture;

@SuppressWarnings("unused")
public class FactoryCompactingProvider extends CompactingRecipeGen {
    public FactoryCompactingProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries, CreateFactory.MOD_ID);
    }

    GeneratedRecipe COAL = create("coal_from_charcoal",b -> b.require(Items.CHARCOAL).require(Items.CHARCOAL).require(Items.CHARCOAL).require(Items.CHARCOAL).output(Items.COAL));
    GeneratedRecipe COMPRESSED_BLOCK = create("compressed_coal",b -> b.requiresHeat(HeatCondition.SUPERHEATED).require(Blocks.COAL_BLOCK).require(Blocks.COAL_BLOCK).require(Blocks.COAL_BLOCK).require(Blocks.COAL_BLOCK).require(Blocks.COAL_BLOCK).require(Blocks.COAL_BLOCK).require(Blocks.COAL_BLOCK).require(Blocks.COAL_BLOCK).require(Blocks.COAL_BLOCK).output(FactoryBlocks.COMPRESSED_COAL));
}
