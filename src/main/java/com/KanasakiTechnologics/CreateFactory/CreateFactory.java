package com.KanasakiTechnologics.CreateFactory;

import com.KanasakiTechnologics.CreateFactory.block.FactoryBlocks;
import com.KanasakiTechnologics.CreateFactory.block.LightBlocksGlasses;
import com.KanasakiTechnologics.CreateFactory.content.FactoryCreativeTab;
import com.KanasakiTechnologics.CreateFactory.content.FactoryTags;
import com.KanasakiTechnologics.CreateFactory.item.AllFactoryItems;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.resources.ResourceLocation;
import org.slf4j.Logger;

import com.mojang.logging.LogUtils;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.config.ModConfig;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraft.client.Minecraft;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.neoforge.event.server.ServerStartingEvent;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

// The value here should match an entry in the META-INF/neoforge.mods.toml file
@Mod(CreateFactory.MOD_ID)
public class CreateFactory{

    public static final String MOD_ID = "createfactory";
    public static final Logger LOGGER = LogUtils.getLogger();

    public CreateFactory(IEventBus modEventBus, ModContainer modContainer) {
        modEventBus.addListener(this::commonSetup);
        NeoForge.EVENT_BUS.register(this);

        FactoryTags.init();
        FactoryBlocks.register(modEventBus);
        AllFactoryItems.register(modEventBus);
        LightBlocksGlasses.register(modEventBus);
        FactoryCreativeTab.register(modEventBus);
        modContainer.registerConfig(ModConfig.Type.COMMON, Config.SPEC);
    }

    private void commonSetup(FMLCommonSetupEvent event) {
    }

    public static ResourceLocation loc(String path) {
        return ResourceLocation.fromNamespaceAndPath(MOD_ID, path);
    }

    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {
    }


    @EventBusSubscriber(modid = CreateFactory.MOD_ID, bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    static class ClientModEvents {
        @SubscribeEvent
        static void onClientSetup(FMLClientSetupEvent event) {
            event.enqueueWork(() -> {
                ItemBlockRenderTypes.setRenderLayer(LightBlocksGlasses.WHITE_GLASS_LIGHT_BLOCK.get(), RenderType.translucent());
                ItemBlockRenderTypes.setRenderLayer(LightBlocksGlasses.LIGHT_GRAY_GLASS_LIGHT_BLOCK.get(), RenderType.translucent());
                ItemBlockRenderTypes.setRenderLayer(LightBlocksGlasses.GRAY_GLASS_LIGHT_BLOCK.get(), RenderType.translucent());
                ItemBlockRenderTypes.setRenderLayer(LightBlocksGlasses.BLACK_GLASS_LIGHT_BLOCK.get(), RenderType.translucent());
                ItemBlockRenderTypes.setRenderLayer(LightBlocksGlasses.BROWN_GLASS_LIGHT_BLOCK.get(), RenderType.translucent());
                ItemBlockRenderTypes.setRenderLayer(LightBlocksGlasses.RED_GLASS_LIGHT_BLOCK.get(), RenderType.translucent());
                ItemBlockRenderTypes.setRenderLayer(LightBlocksGlasses.ORANGE_GLASS_LIGHT_BLOCK.get(), RenderType.translucent());
                ItemBlockRenderTypes.setRenderLayer(LightBlocksGlasses.YELLOW_GLASS_LIGHT_BLOCK.get(), RenderType.translucent());
                ItemBlockRenderTypes.setRenderLayer(LightBlocksGlasses.LIME_GLASS_LIGHT_BLOCK.get(), RenderType.translucent());
                ItemBlockRenderTypes.setRenderLayer(LightBlocksGlasses.GREEN_GLASS_LIGHT_BLOCK.get(), RenderType.translucent());
                ItemBlockRenderTypes.setRenderLayer(LightBlocksGlasses.CYAN_GLASS_LIGHT_BLOCK.get(), RenderType.translucent());
                ItemBlockRenderTypes.setRenderLayer(LightBlocksGlasses.LIGHT_BLUE_GLASS_LIGHT_BLOCK.get(), RenderType.translucent());
                ItemBlockRenderTypes.setRenderLayer(LightBlocksGlasses.BLUE_GLASS_LIGHT_BLOCK.get(), RenderType.translucent());
                ItemBlockRenderTypes.setRenderLayer(LightBlocksGlasses.PURPLE_GLASS_LIGHT_BLOCK.get(), RenderType.translucent());
                ItemBlockRenderTypes.setRenderLayer(LightBlocksGlasses.MAGENTA_GLASS_LIGHT_BLOCK.get(), RenderType.translucent());
                ItemBlockRenderTypes.setRenderLayer(LightBlocksGlasses.PINK_GLASS_LIGHT_BLOCK.get(), RenderType.translucent());
            });
        }
    }
}
