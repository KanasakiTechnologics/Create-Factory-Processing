package com.KanasakiTechnologics.CreateFactory.datagen;

import com.KanasakiTechnologics.CreateFactory.CreateFactory;
import com.KanasakiTechnologics.CreateFactory.block.EssenceCropBlock;
import com.KanasakiTechnologics.CreateFactory.block.FactoryBlocks;
import com.KanasakiTechnologics.CreateFactory.block.LightBlocksGlasses;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.CropBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.client.model.generators.ConfiguredModel;
import net.neoforged.neoforge.client.model.generators.ModelFile;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredBlock;

import java.util.function.Function;

public class FactoryBlockStateProvider extends BlockStateProvider {
    public FactoryBlockStateProvider(PackOutput output,ExistingFileHelper exFileHelper) {
        super(output, CreateFactory.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        blockWithItem(FactoryBlocks.COMPRESSED_COAL);
        blockWithItem(FactoryBlocks.UNPROCESSED_COMPRESSED_COAL);

        makeCrop(((CropBlock) FactoryBlocks.ESSENCE_CROP.get()),"essence_crop_stage","essence_crop_stage");

    }

    public void makeCrop(CropBlock block, String modelName, String textureName) {
        Function<BlockState, ConfiguredModel[]> function = state -> states(state, block, modelName, textureName);

        getVariantBuilder(block).forAllStates(function);
    }

    private ConfiguredModel[] states(BlockState state, CropBlock block, String modelName, String textureName) {
        ConfiguredModel[] models = new ConfiguredModel[1];
        models[0] = new ConfiguredModel(models().crop(modelName + state.getValue(((EssenceCropBlock) block).getAgeProperty()),
                ResourceLocation.fromNamespaceAndPath(CreateFactory.MOD_ID, "block/" + textureName + state.getValue(((EssenceCropBlock) block).getAgeProperty()))).renderType("cutout"));

        return models;
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
