package com.KanasakiTechnologics.CreateFactory.datagen;

import com.KanasakiTechnologics.CreateFactory.block.FactoryBlocks;
import com.KanasakiTechnologics.CreateFactory.block.LightBlocksGlasses;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlagSet;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

import java.util.Set;
import java.util.stream.Stream;

public class FactoryLootTableProvider extends BlockLootSubProvider {
    protected FactoryLootTableProvider(HolderLookup.Provider registries) {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags(), registries);
    }

    @Override
    protected void generate() {
        dropSelf(LightBlocksGlasses.WHITE_LIGHT_BLOCK.get());
        dropSelf(LightBlocksGlasses.LIGHT_GRAY_LIGHT_BLOCK.get());
        dropSelf(LightBlocksGlasses.GRAY_LIGHT_BLOCK.get());
        dropSelf(LightBlocksGlasses.BLACK_LIGHT_BLOCK.get());
        dropSelf(LightBlocksGlasses.BROWN_LIGHT_BLOCK.get());
        dropSelf(LightBlocksGlasses.RED_LIGHT_BLOCK.get());
        dropSelf(LightBlocksGlasses.ORANGE_LIGHT_BLOCK.get());
        dropSelf(LightBlocksGlasses.YELLOW_LIGHT_BLOCK.get());
        dropSelf(LightBlocksGlasses.LIME_LIGHT_BLOCK.get());
        dropSelf(LightBlocksGlasses.GREEN_LIGHT_BLOCK.get());
        dropSelf(LightBlocksGlasses.CYAN_LIGHT_BLOCK.get());
        dropSelf(LightBlocksGlasses.LIGHT_BLUE_LIGHT_BLOCK.get());
        dropSelf(LightBlocksGlasses.BLUE_LIGHT_BLOCK.get());
        dropSelf(LightBlocksGlasses.PURPLE_LIGHT_BLOCK.get());
        dropSelf(LightBlocksGlasses.MAGENTA_LIGHT_BLOCK.get());
        dropSelf(LightBlocksGlasses.PINK_LIGHT_BLOCK.get());

        dropSelf(LightBlocksGlasses.WHITE_GLASS_LIGHT_BLOCK.get());
        dropSelf(LightBlocksGlasses.LIGHT_GRAY_GLASS_LIGHT_BLOCK.get());
        dropSelf(LightBlocksGlasses.GRAY_GLASS_LIGHT_BLOCK.get());
        dropSelf(LightBlocksGlasses.BLACK_GLASS_LIGHT_BLOCK.get());
        dropSelf(LightBlocksGlasses.BROWN_GLASS_LIGHT_BLOCK.get());
        dropSelf(LightBlocksGlasses.RED_GLASS_LIGHT_BLOCK.get());
        dropSelf(LightBlocksGlasses.ORANGE_GLASS_LIGHT_BLOCK.get());
        dropSelf(LightBlocksGlasses.YELLOW_GLASS_LIGHT_BLOCK.get());
        dropSelf(LightBlocksGlasses.LIME_GLASS_LIGHT_BLOCK.get());
        dropSelf(LightBlocksGlasses.GREEN_GLASS_LIGHT_BLOCK.get());
        dropSelf(LightBlocksGlasses.CYAN_GLASS_LIGHT_BLOCK.get());
        dropSelf(LightBlocksGlasses.LIGHT_BLUE_GLASS_LIGHT_BLOCK.get());
        dropSelf(LightBlocksGlasses.BLUE_GLASS_LIGHT_BLOCK.get());
        dropSelf(LightBlocksGlasses.PURPLE_GLASS_LIGHT_BLOCK.get());
        dropSelf(LightBlocksGlasses.MAGENTA_GLASS_LIGHT_BLOCK.get());
        dropSelf(LightBlocksGlasses.PINK_GLASS_LIGHT_BLOCK.get());
        dropSelf(FactoryBlocks.COMPRESSED_COAL.get());
        dropSelf(FactoryBlocks.UNPROCESSED_COMPRESSED_COAL.get());

    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return Stream.concat(
                FactoryBlocks.BLOCKS.getEntries().stream().map(entry -> entry.get()), // LightBlocks
                LightBlocksGlasses.BLOCKS.getEntries().stream().map(entry -> entry.get())    // AsmBlocks
        )::iterator;
    }
}
