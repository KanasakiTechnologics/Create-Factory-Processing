package com.KanasakiTechnologics.CreateFactory.content;

import com.KanasakiTechnologics.CreateFactory.CreateFactory;
import com.KanasakiTechnologics.CreateFactory.block.FactoryBlocks;
import com.KanasakiTechnologics.CreateFactory.block.LightBlocksGlasses;
import com.KanasakiTechnologics.CreateFactory.item.AllFactoryItems;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;


public class FactoryCreativeTab {
    public static DeferredRegister<CreativeModeTab> CREATIVE_MOD_TAB = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, CreateFactory.MOD_ID);

    public static Supplier<CreativeModeTab> COLOR_LIGHT_BLOCKS = CREATIVE_MOD_TAB.register("color_light_blocks",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(LightBlocksGlasses.BLACK_LIGHT_BLOCK.get()))
                    .title(Component.translatable("creativetab.createfactory.color_light_blocks"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(LightBlocksGlasses.WHITE_LIGHT_BLOCK);
                        output.accept(LightBlocksGlasses.LIGHT_GRAY_LIGHT_BLOCK);
                        output.accept(LightBlocksGlasses.GRAY_LIGHT_BLOCK);
                        output.accept(LightBlocksGlasses.BLACK_LIGHT_BLOCK);
                        output.accept(LightBlocksGlasses.BROWN_LIGHT_BLOCK);
                        output.accept(LightBlocksGlasses.RED_LIGHT_BLOCK);
                        output.accept(LightBlocksGlasses.ORANGE_LIGHT_BLOCK);
                        output.accept(LightBlocksGlasses.YELLOW_LIGHT_BLOCK);
                        output.accept(LightBlocksGlasses.LIME_LIGHT_BLOCK);
                        output.accept(LightBlocksGlasses.GREEN_LIGHT_BLOCK);
                        output.accept(LightBlocksGlasses.CYAN_LIGHT_BLOCK);
                        output.accept(LightBlocksGlasses.LIGHT_BLUE_LIGHT_BLOCK);
                        output.accept(LightBlocksGlasses.BLUE_LIGHT_BLOCK);
                        output.accept(LightBlocksGlasses.PURPLE_LIGHT_BLOCK);
                        output.accept(LightBlocksGlasses.MAGENTA_LIGHT_BLOCK);
                        output.accept(LightBlocksGlasses.PINK_LIGHT_BLOCK);
                        output.accept(LightBlocksGlasses.WHITE_GLASS_LIGHT_BLOCK);
                        output.accept(LightBlocksGlasses.LIGHT_GRAY_GLASS_LIGHT_BLOCK);
                        output.accept(LightBlocksGlasses.GRAY_GLASS_LIGHT_BLOCK);
                        output.accept(LightBlocksGlasses.BLACK_GLASS_LIGHT_BLOCK);
                        output.accept(LightBlocksGlasses.BROWN_GLASS_LIGHT_BLOCK);
                        output.accept(LightBlocksGlasses.RED_GLASS_LIGHT_BLOCK);
                        output.accept(LightBlocksGlasses.ORANGE_GLASS_LIGHT_BLOCK);
                        output.accept(LightBlocksGlasses.YELLOW_GLASS_LIGHT_BLOCK);
                        output.accept(LightBlocksGlasses.LIME_GLASS_LIGHT_BLOCK);
                        output.accept(LightBlocksGlasses.GREEN_GLASS_LIGHT_BLOCK);
                        output.accept(LightBlocksGlasses.CYAN_GLASS_LIGHT_BLOCK);
                        output.accept(LightBlocksGlasses.LIGHT_BLUE_GLASS_LIGHT_BLOCK);
                        output.accept(LightBlocksGlasses.BLUE_GLASS_LIGHT_BLOCK);
                        output.accept(LightBlocksGlasses.PURPLE_GLASS_LIGHT_BLOCK);
                        output.accept(LightBlocksGlasses.MAGENTA_GLASS_LIGHT_BLOCK);
                        output.accept(LightBlocksGlasses.PINK_GLASS_LIGHT_BLOCK);
                    }).build());

    public static Supplier<CreativeModeTab> CREATE_FACTORY_PROCESSING = CREATIVE_MOD_TAB.register("create_factory_processing",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(AllFactoryItems.ANCIENT_DUST.get()))
                    .title(Component.translatable("creativetab.createfactory.create_factory_processing"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(AllFactoryItems.ANCIENT_DUST);
                        output.accept(AllFactoryItems.UNPOLISHED_DIAMOND);
                        output.accept(FactoryBlocks.COMPRESSED_COAL);

                    }).build());

    public static void register(IEventBus eventBus){CREATIVE_MOD_TAB.register(eventBus);}

}
