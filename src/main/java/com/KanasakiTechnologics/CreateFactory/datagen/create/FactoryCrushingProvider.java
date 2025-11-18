package com.KanasakiTechnologics.CreateFactory.datagen.create;

import com.KanasakiTechnologics.CreateFactory.CreateFactory;
import com.KanasakiTechnologics.CreateFactory.item.AllFactoryItems;
import com.simibubi.create.AllBlocks;
import com.simibubi.create.AllItems;
import com.simibubi.create.api.data.recipe.CrushingRecipeGen;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Blocks;

import java.util.concurrent.CompletableFuture;

@SuppressWarnings("unused")
public class FactoryCrushingProvider extends CrushingRecipeGen {
    public FactoryCrushingProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries, CreateFactory.MOD_ID);
    }

    GeneratedRecipe
        BASALT = create(() -> Blocks.BASALT, b -> b.duration(200)
                .output(.05f,Items.NETHERITE_SCRAP)
        ),

        ECHO_SHARD = create(() -> Items.ECHO_SHARD, b -> b.duration(100)
                .output(AllFactoryItems.ENDER_PEARL_SHARD,2)
                .output(.25f,AllFactoryItems.ENDER_PEARL_SHARD)
                .output(.75f, AllItems.EXP_NUGGET)
        ),

        ROSE_QUARTZ_BLOCK = create(() -> AllBlocks.ROSE_QUARTZ_BLOCK, b -> b.duration(150)
                .output(.50f,AllItems.ROSE_QUARTZ)
        ),

        NETHER_WART = create(() -> Blocks.NETHER_WART_BLOCK, b -> b.duration(150)
                .output(Items.NETHER_WART,4)
                .output(.25F,Items.NETHER_WART)
        ),

        EXP_NUGGET = create(() -> Items.FLINT,b -> b.duration(150)
                .output(.20f,AllItems.EXP_NUGGET)
        ),

        QUARTZ = create(() -> Items.QUARTZ, b -> b.duration(100)
                .output(.25f,AllItems.EXP_NUGGET)
        );
}
