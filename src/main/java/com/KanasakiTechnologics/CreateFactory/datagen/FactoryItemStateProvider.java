package com.KanasakiTechnologics.CreateFactory.datagen;

import com.KanasakiTechnologics.CreateFactory.CreateFactory;
import com.KanasakiTechnologics.CreateFactory.item.AllFactoryItems;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

public class FactoryItemStateProvider extends ItemModelProvider {
    public FactoryItemStateProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, CreateFactory.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        basicItem(AllFactoryItems.ANCIENT_DUST.get());
        basicItem(AllFactoryItems.UNPROCESSED_ANCIENT_DUST.get());
        basicItem(AllFactoryItems.UNPOLISHED_DIAMOND.get());

    }
}
