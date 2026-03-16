package com.KanasakiTechnologics.CreateFactory.datagen.create;

import com.KanasakiTechnologics.CreateFactory.CreateFactory;
import com.KanasakiTechnologics.CreateFactory.item.AllFactoryItems;
import com.simibubi.create.AllItems;
import com.simibubi.create.api.data.recipe.MixingRecipeGen;
import com.simibubi.create.content.processing.recipe.HeatCondition;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.material.Fluids;
import net.neoforged.neoforge.common.Tags;

import java.util.concurrent.CompletableFuture;

@SuppressWarnings("unused")
public class FactoryMixingProvider extends MixingRecipeGen {
    public FactoryMixingProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries, CreateFactory.MOD_ID);
    }

    private GeneratedRecipe dye_double(Item dye) {
        String name = "dye_double_" + dye.builtInRegistryHolder().key().location().getPath();

        return create(name, b -> b
                .require(AllFactoryItems.DYE_ESSENCE.get())
                .require(dye)
                .output(dye,2)
        );
    }

    GeneratedRecipe
            SKELETON_SKULL = create("skeleton_skull",b -> b.require(Items.AMETHYST_SHARD).require(Items.BONE_MEAL).require(Items.BONE_MEAL).require(Items.BONE_MEAL).require(Items.BONE_MEAL).require(Blocks.BONE_BLOCK).require(Blocks.BONE_BLOCK).require(Blocks.BONE_BLOCK).require(Blocks.BONE_BLOCK).output(Items.SKELETON_SKULL)),
            ANCIENT_DUST = create("ancient_dust",b -> b.requiresHeat(HeatCondition.SUPERHEATED).require(AllItems.POWDERED_OBSIDIAN).require(AllItems.CINDER_FLOUR).output(AllFactoryItems.ANCIENT_DUST)),
            AMETHYST_BLOCK = create("amethyst_block", b -> b.require(Items.AMETHYST_SHARD).require(Items.AMETHYST_SHARD).require(Items.AMETHYST_SHARD).require(Fluids.WATER,500).output(Blocks.AMETHYST_BLOCK)),
            ECHO_SHARD = create("echo_shard", b -> b.requiresHeat(HeatCondition.HEATED).require(Items.AMETHYST_SHARD).require(Blocks.SCULK_CATALYST).output(Items.ECHO_SHARD).output(Blocks.SCULK_CATALYST)),
            NETHERRACK = create("netherrack", b -> b.requiresHeat(HeatCondition.HEATED).require(Ingredient.of(Tags.Items.STONES)).require(Items.NETHER_WART).output(Blocks.NETHERRACK)),

            DYE_WHITE = dye_double(Items.WHITE_DYE),
            DYE_LIGHT_GRAY = dye_double(Items.LIGHT_GRAY_DYE),
            DYE_GRAY = dye_double(Items.GRAY_DYE),
            DYE_BLACK = dye_double(Items.BLACK_DYE),
            DYE_BROWN = dye_double(Items.BROWN_DYE),
            DYE_RED = dye_double(Items.RED_DYE),
            DYE_ORANGE = dye_double(Items.ORANGE_DYE),
            DYE_YELLOW = dye_double(Items.YELLOW_DYE),
            DYE_LIME = dye_double(Items.LIME_DYE),
            DYE_GREEN = dye_double(Items.GREEN_DYE),
            DYE_CYAN = dye_double(Items.CYAN_DYE),
            DYE_LIGHT_BLUE = dye_double(Items.LIGHT_BLUE_DYE),
            DYE_BLUE = dye_double(Items.BLUE_DYE),
            DYE_PURPLE = dye_double(Items.PURPLE_DYE),
            DYE_MAGENTA = dye_double(Items.MAGENTA_DYE),
            DYE_PINK = dye_double(Items.PINK_DYE);


}


