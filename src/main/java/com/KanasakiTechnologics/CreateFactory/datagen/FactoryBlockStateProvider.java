package com.KanasakiTechnologics.CreateFactory.datagen;

import com.KanasakiTechnologics.CreateFactory.CreateFactory;
import com.KanasakiTechnologics.CreateFactory.block.FactoryBlocks;
import com.KanasakiTechnologics.CreateFactory.block.LightBlocksGlasses;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.client.model.generators.ModelFile;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredBlock;

public class FactoryBlockStateProvider extends BlockStateProvider {
    public FactoryBlockStateProvider(PackOutput output,ExistingFileHelper exFileHelper) {
        super(output, CreateFactory.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        lightWithItem(LightBlocksGlasses.WHITE_LIGHT_BLOCK);
        lightWithItem(LightBlocksGlasses.LIGHT_GRAY_LIGHT_BLOCK);
        lightWithItem(LightBlocksGlasses.GRAY_LIGHT_BLOCK);
        lightWithItem(LightBlocksGlasses.BLACK_LIGHT_BLOCK);
        lightWithItem(LightBlocksGlasses.BROWN_LIGHT_BLOCK);
        lightWithItem(LightBlocksGlasses.RED_LIGHT_BLOCK);
        lightWithItem(LightBlocksGlasses.ORANGE_LIGHT_BLOCK);
        lightWithItem(LightBlocksGlasses.YELLOW_LIGHT_BLOCK);
        lightWithItem(LightBlocksGlasses.LIME_LIGHT_BLOCK);
        lightWithItem(LightBlocksGlasses.GREEN_LIGHT_BLOCK);
        lightWithItem(LightBlocksGlasses.CYAN_LIGHT_BLOCK);
        lightWithItem(LightBlocksGlasses.LIGHT_BLUE_LIGHT_BLOCK);
        lightWithItem(LightBlocksGlasses.BLUE_LIGHT_BLOCK);
        lightWithItem(LightBlocksGlasses.PURPLE_LIGHT_BLOCK);
        lightWithItem(LightBlocksGlasses.MAGENTA_LIGHT_BLOCK);
        lightWithItem(LightBlocksGlasses.PINK_LIGHT_BLOCK);

        glassWithItem(LightBlocksGlasses.WHITE_GLASS_LIGHT_BLOCK);
        glassWithItem(LightBlocksGlasses.LIGHT_GRAY_GLASS_LIGHT_BLOCK);
        glassWithItem(LightBlocksGlasses.GRAY_GLASS_LIGHT_BLOCK);
        glassWithItem(LightBlocksGlasses.BLACK_GLASS_LIGHT_BLOCK);
        glassWithItem(LightBlocksGlasses.BROWN_GLASS_LIGHT_BLOCK);
        glassWithItem(LightBlocksGlasses.RED_GLASS_LIGHT_BLOCK);
        glassWithItem(LightBlocksGlasses.ORANGE_GLASS_LIGHT_BLOCK);
        glassWithItem(LightBlocksGlasses.YELLOW_GLASS_LIGHT_BLOCK);
        glassWithItem(LightBlocksGlasses.LIME_GLASS_LIGHT_BLOCK);
        glassWithItem(LightBlocksGlasses.GREEN_GLASS_LIGHT_BLOCK);
        glassWithItem(LightBlocksGlasses.CYAN_GLASS_LIGHT_BLOCK);
        glassWithItem(LightBlocksGlasses.LIGHT_BLUE_GLASS_LIGHT_BLOCK);
        glassWithItem(LightBlocksGlasses.BLUE_GLASS_LIGHT_BLOCK);
        glassWithItem(LightBlocksGlasses.PURPLE_GLASS_LIGHT_BLOCK);
        glassWithItem(LightBlocksGlasses.MAGENTA_GLASS_LIGHT_BLOCK);
        glassWithItem(LightBlocksGlasses.PINK_GLASS_LIGHT_BLOCK);

        blockWithItem(FactoryBlocks.COMPRESSED_COAL);
        blockWithItem(FactoryBlocks.UNPROCESSED_COMPRESSED_COAL);

    }
    private void blockWithItem(DeferredBlock<?> deferredBlock) {
        simpleBlockWithItem(deferredBlock.get(), cubeAll(deferredBlock.get()));
    }

    private void glassWithItem(DeferredBlock<?> deferredBlock) {
        Block block = deferredBlock.get();
        String blockName = block.getDescriptionId().replace("block." + CreateFactory.MOD_ID + ".", "");

        ModelFile model = models()
                .cubeAll(blockName, modLoc("block/" + blockName))
                .renderType("minecraft:translucent"); //

        simpleBlock(block, model);
        simpleBlockItem(block, model);
    }

    private void lightWithItem(DeferredBlock<?> deferredBlock) {
        Block block = deferredBlock.get();
        String blockName = block.getDescriptionId().replace("block." + CreateFactory.MOD_ID + ".", "");

        ModelFile model = models()
                .cubeAll(blockName, modLoc("block/" + blockName))
                .renderType("minecraft:cutout");

        simpleBlock(block, model);
        simpleBlockItem(block, model);
    }


    private static String name(Block block) {
        return block.getDescriptionId().replace("block." + CreateFactory.MOD_ID + ".", "");
    }

}
