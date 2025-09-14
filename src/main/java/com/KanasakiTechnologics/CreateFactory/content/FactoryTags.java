package com.KanasakiTechnologics.CreateFactory.content;

import net.createmod.catnip.lang.Lang;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.FluidTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.BucketItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.material.FluidState;

import static com.KanasakiTechnologics.CreateFactory.CreateFactory.MOD_ID;

public class FactoryTags {
    public static <T> TagKey<T> optionalTag(Registry<T> registry, ResourceLocation id) {
        return TagKey.create(registry.key(), id);
    }

    public static <T> TagKey<T> commonTag(Registry<T> registry, String path) {
        return optionalTag(registry, ResourceLocation.fromNamespaceAndPath("c", path));
    }

    public static<T>TagKey<T> minecraftTag(Registry<T> registry, String path){
        return optionalTag(registry, ResourceLocation.fromNamespaceAndPath("minecraft", path));
    }

    public static <T> TagKey<T> modTag(Registry<T> registry, String path) {
        return optionalTag(registry, ResourceLocation.fromNamespaceAndPath(MOD_ID, path));
    }

    public static TagKey<Block> commonBlockTag(String path) {return commonTag(BuiltInRegistries.BLOCK, path);}
    public static TagKey<Item> commonItemTag(String path) {return commonTag(BuiltInRegistries.ITEM, path);}
    public static TagKey<Item> minecraftItemTag(String path) {return minecraftTag(BuiltInRegistries.ITEM, path);}
    public static TagKey<Fluid> commonFluidTag(String path) {return commonTag(BuiltInRegistries.FLUID, path);}
    public static TagKey<Block> modBlockTag(String path) {return modTag(BuiltInRegistries.BLOCK, path);}
    public static TagKey<Item> modItemTag(String path) {return modTag(BuiltInRegistries.ITEM, path);}
    public static TagKey<Fluid> modFluidTag(String path) {return modTag(BuiltInRegistries.FLUID, path);}

    public enum NameSpace {
        MOD(MOD_ID, false, true),
        COMMON("c"),
        CREATE("create"),
        NEOFORGE("neoforge");

        public final String id;
        public final boolean optionalDefault;
        public final boolean alwaysDatagenDefault;

        NameSpace(String id) {
            this(id, true, false);
        }

        NameSpace(String id, boolean optionalDefault, boolean alwaysDatagenDefault) {
            this.id = id;
            this.optionalDefault = optionalDefault;
            this.alwaysDatagenDefault = alwaysDatagenDefault;
        }
    }

    public enum BlockTags {
        CREATE_WRENCH_PICKUP(NameSpace.CREATE, "wrench_pickup"),
        COLORED_GLASS(NameSpace.MOD,"colored_glass"),
        COLOURED_CONCRETE(NameSpace.MOD,"colored_concrete");

        public final TagKey<Block> tag;
        public final boolean alwaysDatagen;

        BlockTags() { this(NameSpace.MOD); }
        BlockTags(NameSpace namespace) { this(namespace, namespace.optionalDefault, namespace.alwaysDatagenDefault); }
        BlockTags(NameSpace namespace, String path) { this(namespace, path, namespace.optionalDefault, namespace.alwaysDatagenDefault); }
        BlockTags(NameSpace namespace, boolean optional, boolean alwaysDatagen) { this(namespace, null, optional, alwaysDatagen); }
        BlockTags(NameSpace namespace, String path, boolean optional, boolean alwaysDatagen) {
            ResourceLocation id = ResourceLocation.fromNamespaceAndPath(namespace.id, path == null ? name().toLowerCase() : path);
            if (optional) tag = FactoryTags.optionalTag(BuiltInRegistries.BLOCK, id);
            else tag = net.minecraft.tags.BlockTags.create(id);
            this.alwaysDatagen = alwaysDatagen;
        }
        @SuppressWarnings("deprecation")
        public boolean is(Block block) { return block.builtInRegistryHolder().is(tag); }
        public boolean is(ItemStack stack) { return stack != null && stack.getItem() instanceof BlockItem blockItem && is(blockItem.getBlock()); }
        public boolean is(ItemLike item) { return item instanceof BlockItem blockItem && is(blockItem.getBlock()); }
        public boolean is(BlockState state) {return state.is(tag);}
        public boolean is(TagKey<Block> tag) {return tag==this.tag;}

        private static void init() {}
    }


    public static void init() {
        BlockTags.init();
    }
}
