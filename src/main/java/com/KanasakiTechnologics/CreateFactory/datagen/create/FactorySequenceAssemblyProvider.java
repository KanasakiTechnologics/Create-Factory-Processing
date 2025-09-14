package com.KanasakiTechnologics.CreateFactory.datagen.create;

import com.KanasakiTechnologics.CreateFactory.CreateFactory;
import com.KanasakiTechnologics.CreateFactory.block.FactoryBlocks;
import com.KanasakiTechnologics.CreateFactory.item.AllFactoryItems;
import com.simibubi.create.AllItems;
import com.simibubi.create.api.data.recipe.SequencedAssemblyRecipeGen;
import com.simibubi.create.content.fluids.transfer.FillingRecipe;
import com.simibubi.create.content.kinetics.press.PressingRecipe;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.material.Fluids;
import plus.dragons.createenchantmentindustry.common.registry.CEIFluids;

import java.util.concurrent.CompletableFuture;

@SuppressWarnings("unused")
public class FactorySequenceAssemblyProvider extends SequencedAssemblyRecipeGen {
    public FactorySequenceAssemblyProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries, CreateFactory.MOD_ID);
    }

    GeneratedRecipe NETHERITE_SCRAP = create("netherite_scrap",b -> b.require(AllFactoryItems.ANCIENT_DUST)
            .transitionTo(AllFactoryItems.UNPROCESSED_ANCIENT_DUST)
            .addOutput(Items.NETHERITE_SCRAP,40)
            .addOutput(AllItems.POWDERED_OBSIDIAN,50)
            .addOutput(AllItems.CINDER_FLOUR,50)
            .loops(5)
            .addStep(FillingRecipe::new, rb -> rb.require(CEIFluids.EXPERIENCE.get(),250))
            .addStep(FillingRecipe::new,rb ->rb.require(Fluids.LAVA,250))
            .addStep(PressingRecipe::new, rb -> rb)
    );

    GeneratedRecipe DIAMOND = create("diamond",b -> b.require(FactoryBlocks.COMPRESSED_COAL)
            .transitionTo(FactoryBlocks.UNPROCESSED_COMPRESSED_COAL)
            .addOutput(AllFactoryItems.UNPOLISHED_DIAMOND,40)
            .addOutput(Items.COAL,60)
            .loops(4)
            .addStep(FillingRecipe::new,rb ->rb.require(Fluids.LAVA,500))
            .addStep(PressingRecipe::new,rb -> rb)
            .addStep(PressingRecipe::new,rb -> rb)
    );

}
