package com.KanasakiTechnologics.CreateFactory.datagen;

import com.KanasakiTechnologics.CreateFactory.CreateFactory;
import com.KanasakiTechnologics.CreateFactory.block.FactoryBlocks;
import com.KanasakiTechnologics.CreateFactory.block.LightBlocksGlasses;
import com.KanasakiTechnologics.CreateFactory.content.FactoryTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.Blocks;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class FactoryBlockTagProvider extends BlockTagsProvider {
    public FactoryBlockTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, CreateFactory.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(FactoryBlocks.COMPRESSED_COAL.get())
                .add(FactoryBlocks.UNPROCESSED_COMPRESSED_COAL.get())
                .add(LightBlocksGlasses.BLACK_GLASS_LIGHT_BLOCK.get())
                .add(LightBlocksGlasses.BLUE_GLASS_LIGHT_BLOCK.get())
                .add(LightBlocksGlasses.BROWN_GLASS_LIGHT_BLOCK.get())
                .add(LightBlocksGlasses.CYAN_GLASS_LIGHT_BLOCK.get())
                .add(LightBlocksGlasses.GRAY_GLASS_LIGHT_BLOCK.get())
                .add(LightBlocksGlasses.GREEN_GLASS_LIGHT_BLOCK.get())
                .add(LightBlocksGlasses.LIGHT_BLUE_GLASS_LIGHT_BLOCK.get())
                .add(LightBlocksGlasses.LIGHT_GRAY_GLASS_LIGHT_BLOCK.get())
                .add(LightBlocksGlasses.LIME_GLASS_LIGHT_BLOCK.get())
                .add(LightBlocksGlasses.MAGENTA_GLASS_LIGHT_BLOCK.get())
                .add(LightBlocksGlasses.ORANGE_GLASS_LIGHT_BLOCK.get())
                .add(LightBlocksGlasses.PINK_GLASS_LIGHT_BLOCK.get())
                .add(LightBlocksGlasses.PURPLE_GLASS_LIGHT_BLOCK.get())
                .add(LightBlocksGlasses.RED_GLASS_LIGHT_BLOCK.get())
                .add(LightBlocksGlasses.WHITE_GLASS_LIGHT_BLOCK.get())
                .add(LightBlocksGlasses.YELLOW_GLASS_LIGHT_BLOCK.get())

                .add(LightBlocksGlasses.BLACK_LIGHT_BLOCK.get())
                .add(LightBlocksGlasses.BLUE_LIGHT_BLOCK.get())
                .add(LightBlocksGlasses.BROWN_LIGHT_BLOCK.get())
                .add(LightBlocksGlasses.CYAN_LIGHT_BLOCK.get())
                .add(LightBlocksGlasses.GRAY_LIGHT_BLOCK.get())
                .add(LightBlocksGlasses.GREEN_LIGHT_BLOCK.get())
                .add(LightBlocksGlasses.LIGHT_BLUE_LIGHT_BLOCK.get())
                .add(LightBlocksGlasses.LIGHT_GRAY_LIGHT_BLOCK.get())
                .add(LightBlocksGlasses.LIME_LIGHT_BLOCK.get())
                .add(LightBlocksGlasses.MAGENTA_LIGHT_BLOCK.get())
                .add(LightBlocksGlasses.ORANGE_LIGHT_BLOCK.get())
                .add(LightBlocksGlasses.PINK_LIGHT_BLOCK.get())
                .add(LightBlocksGlasses.PURPLE_LIGHT_BLOCK.get())
                .add(LightBlocksGlasses.RED_LIGHT_BLOCK.get())
                .add(LightBlocksGlasses.WHITE_LIGHT_BLOCK.get())
                .add(LightBlocksGlasses.YELLOW_LIGHT_BLOCK.get());

        tag(BlockTags.NEEDS_STONE_TOOL)
                .add(FactoryBlocks.COMPRESSED_COAL.get())
                .add(FactoryBlocks.UNPROCESSED_COMPRESSED_COAL.get())
                .add(LightBlocksGlasses.BLACK_GLASS_LIGHT_BLOCK.get())
                .add(LightBlocksGlasses.BLUE_GLASS_LIGHT_BLOCK.get())
                .add(LightBlocksGlasses.BROWN_GLASS_LIGHT_BLOCK.get())
                .add(LightBlocksGlasses.CYAN_GLASS_LIGHT_BLOCK.get())
                .add(LightBlocksGlasses.GRAY_GLASS_LIGHT_BLOCK.get())
                .add(LightBlocksGlasses.GREEN_GLASS_LIGHT_BLOCK.get())
                .add(LightBlocksGlasses.LIGHT_BLUE_GLASS_LIGHT_BLOCK.get())
                .add(LightBlocksGlasses.LIGHT_GRAY_GLASS_LIGHT_BLOCK.get())
                .add(LightBlocksGlasses.LIME_GLASS_LIGHT_BLOCK.get())
                .add(LightBlocksGlasses.MAGENTA_GLASS_LIGHT_BLOCK.get())
                .add(LightBlocksGlasses.ORANGE_GLASS_LIGHT_BLOCK.get())
                .add(LightBlocksGlasses.PINK_GLASS_LIGHT_BLOCK.get())
                .add(LightBlocksGlasses.PURPLE_GLASS_LIGHT_BLOCK.get())
                .add(LightBlocksGlasses.RED_GLASS_LIGHT_BLOCK.get())
                .add(LightBlocksGlasses.WHITE_GLASS_LIGHT_BLOCK.get())
                .add(LightBlocksGlasses.YELLOW_GLASS_LIGHT_BLOCK.get())

                .add(LightBlocksGlasses.BLACK_LIGHT_BLOCK.get())
                .add(LightBlocksGlasses.BLUE_LIGHT_BLOCK.get())
                .add(LightBlocksGlasses.BROWN_LIGHT_BLOCK.get())
                .add(LightBlocksGlasses.CYAN_LIGHT_BLOCK.get())
                .add(LightBlocksGlasses.GRAY_LIGHT_BLOCK.get())
                .add(LightBlocksGlasses.GREEN_LIGHT_BLOCK.get())
                .add(LightBlocksGlasses.LIGHT_BLUE_LIGHT_BLOCK.get())
                .add(LightBlocksGlasses.LIGHT_GRAY_LIGHT_BLOCK.get())
                .add(LightBlocksGlasses.LIME_LIGHT_BLOCK.get())
                .add(LightBlocksGlasses.MAGENTA_LIGHT_BLOCK.get())
                .add(LightBlocksGlasses.ORANGE_LIGHT_BLOCK.get())
                .add(LightBlocksGlasses.PINK_LIGHT_BLOCK.get())
                .add(LightBlocksGlasses.PURPLE_LIGHT_BLOCK.get())
                .add(LightBlocksGlasses.RED_LIGHT_BLOCK.get())
                .add(LightBlocksGlasses.WHITE_LIGHT_BLOCK.get())
                .add(LightBlocksGlasses.YELLOW_LIGHT_BLOCK.get());

        tag(FactoryTags.BlockTags.COLORED_GLASS.tag)
                .add(Blocks.WHITE_STAINED_GLASS)
                .add(Blocks.ORANGE_STAINED_GLASS)
                .add(Blocks.MAGENTA_STAINED_GLASS)
                .add(Blocks.LIGHT_BLUE_STAINED_GLASS)
                .add(Blocks.YELLOW_STAINED_GLASS)
                .add(Blocks.LIME_STAINED_GLASS)
                .add(Blocks.PINK_STAINED_GLASS)
                .add(Blocks.GRAY_STAINED_GLASS)
                .add(Blocks.LIGHT_GRAY_STAINED_GLASS)
                .add(Blocks.CYAN_STAINED_GLASS)
                .add(Blocks.PURPLE_STAINED_GLASS)
                .add(Blocks.BLUE_STAINED_GLASS)
                .add(Blocks.BROWN_STAINED_GLASS)
                .add(Blocks.GREEN_STAINED_GLASS)
                .add(Blocks.RED_STAINED_GLASS)
                .add(Blocks.BLACK_STAINED_GLASS);

        tag(FactoryTags.BlockTags.COLOURED_CONCRETE.tag)
                .add(Blocks.WHITE_CONCRETE)
                .add(Blocks.ORANGE_CONCRETE)
                .add(Blocks.MAGENTA_CONCRETE)
                .add(Blocks.LIGHT_BLUE_CONCRETE)
                .add(Blocks.YELLOW_CONCRETE)
                .add(Blocks.LIME_CONCRETE)
                .add(Blocks.PINK_CONCRETE)
                .add(Blocks.GRAY_CONCRETE)
                .add(Blocks.LIGHT_GRAY_CONCRETE)
                .add(Blocks.CYAN_CONCRETE)
                .add(Blocks.PURPLE_CONCRETE)
                .add(Blocks.BLUE_CONCRETE)
                .add(Blocks.BROWN_CONCRETE)
                .add(Blocks.GREEN_CONCRETE)
                .add(Blocks.RED_CONCRETE)
                .add(Blocks.BLACK_CONCRETE);

        tag(FactoryTags.BlockTags.CREATE_WRENCH_PICKUP.tag)
                .add(LightBlocksGlasses.BLACK_GLASS_LIGHT_BLOCK.get())
                .add(LightBlocksGlasses.BLUE_GLASS_LIGHT_BLOCK.get())
                .add(LightBlocksGlasses.BROWN_GLASS_LIGHT_BLOCK.get())
                .add(LightBlocksGlasses.CYAN_GLASS_LIGHT_BLOCK.get())
                .add(LightBlocksGlasses.GRAY_GLASS_LIGHT_BLOCK.get())
                .add(LightBlocksGlasses.GREEN_GLASS_LIGHT_BLOCK.get())
                .add(LightBlocksGlasses.LIGHT_BLUE_GLASS_LIGHT_BLOCK.get())
                .add(LightBlocksGlasses.LIGHT_GRAY_GLASS_LIGHT_BLOCK.get())
                .add(LightBlocksGlasses.LIME_GLASS_LIGHT_BLOCK.get())
                .add(LightBlocksGlasses.MAGENTA_GLASS_LIGHT_BLOCK.get())
                .add(LightBlocksGlasses.ORANGE_GLASS_LIGHT_BLOCK.get())
                .add(LightBlocksGlasses.PINK_GLASS_LIGHT_BLOCK.get())
                .add(LightBlocksGlasses.PURPLE_GLASS_LIGHT_BLOCK.get())
                .add(LightBlocksGlasses.RED_GLASS_LIGHT_BLOCK.get())
                .add(LightBlocksGlasses.WHITE_GLASS_LIGHT_BLOCK.get())
                .add(LightBlocksGlasses.YELLOW_GLASS_LIGHT_BLOCK.get())

                .add(LightBlocksGlasses.BLACK_LIGHT_BLOCK.get())
                .add(LightBlocksGlasses.BLUE_LIGHT_BLOCK.get())
                .add(LightBlocksGlasses.BROWN_LIGHT_BLOCK.get())
                .add(LightBlocksGlasses.CYAN_LIGHT_BLOCK.get())
                .add(LightBlocksGlasses.GRAY_LIGHT_BLOCK.get())
                .add(LightBlocksGlasses.GREEN_LIGHT_BLOCK.get())
                .add(LightBlocksGlasses.LIGHT_BLUE_LIGHT_BLOCK.get())
                .add(LightBlocksGlasses.LIGHT_GRAY_LIGHT_BLOCK.get())
                .add(LightBlocksGlasses.LIME_LIGHT_BLOCK.get())
                .add(LightBlocksGlasses.MAGENTA_LIGHT_BLOCK.get())
                .add(LightBlocksGlasses.ORANGE_LIGHT_BLOCK.get())
                .add(LightBlocksGlasses.PINK_LIGHT_BLOCK.get())
                .add(LightBlocksGlasses.PURPLE_LIGHT_BLOCK.get())
                .add(LightBlocksGlasses.RED_LIGHT_BLOCK.get())
                .add(LightBlocksGlasses.WHITE_LIGHT_BLOCK.get())
                .add(LightBlocksGlasses.YELLOW_LIGHT_BLOCK.get());
    }
}
