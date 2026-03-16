package com.KanasakiTechnologics.CreateFactory.datagen;

import com.KanasakiTechnologics.CreateFactory.block.LightBlocksGlasses;
import com.KanasakiTechnologics.CreateFactory.item.AllFactoryItems;
import com.simibubi.create.AllItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.BlastingRecipe;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.item.crafting.SmeltingRecipe;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.neoforged.neoforge.common.Tags;
import net.neoforged.neoforge.common.conditions.IConditionBuilder;

import java.util.List;
import java.util.concurrent.CompletableFuture;

import static com.KanasakiTechnologics.CreateFactory.CreateFactory.MOD_ID;

public class FactoryRecipeProvider extends RecipeProvider implements IConditionBuilder {
    public FactoryRecipeProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries);
    }

    List<ItemLike> BRASS_CRUSHED = List.of(AllFactoryItems.CRUSHED_BRASS);

    @Override
    protected void buildRecipes(RecipeOutput recipeOutput) {
        concreteLight(recipeOutput, Items.WHITE_CONCRETE, LightBlocksGlasses.WHITE_LIGHT_BLOCK.get());
        concreteLight(recipeOutput, Items.LIGHT_GRAY_CONCRETE, LightBlocksGlasses.LIGHT_GRAY_LIGHT_BLOCK.get());
        concreteLight(recipeOutput, Items.GRAY_CONCRETE, LightBlocksGlasses.GRAY_LIGHT_BLOCK.get());
        concreteLight(recipeOutput, Items.BLACK_CONCRETE, LightBlocksGlasses.BLACK_LIGHT_BLOCK.get());
        concreteLight(recipeOutput, Items.BROWN_CONCRETE, LightBlocksGlasses.BROWN_LIGHT_BLOCK.get());
        concreteLight(recipeOutput, Items.RED_CONCRETE, LightBlocksGlasses.RED_LIGHT_BLOCK.get());
        concreteLight(recipeOutput, Items.ORANGE_CONCRETE, LightBlocksGlasses.ORANGE_LIGHT_BLOCK.get());
        concreteLight(recipeOutput, Items.YELLOW_CONCRETE, LightBlocksGlasses.YELLOW_LIGHT_BLOCK.get());
        concreteLight(recipeOutput, Items.LIME_CONCRETE, LightBlocksGlasses.LIME_LIGHT_BLOCK.get());
        concreteLight(recipeOutput, Items.GREEN_CONCRETE, LightBlocksGlasses.GREEN_LIGHT_BLOCK.get());
        concreteLight(recipeOutput, Items.CYAN_CONCRETE, LightBlocksGlasses.CYAN_LIGHT_BLOCK.get());
        concreteLight(recipeOutput, Items.LIGHT_BLUE_CONCRETE, LightBlocksGlasses.LIGHT_BLUE_LIGHT_BLOCK.get());
        concreteLight(recipeOutput, Items.BLUE_CONCRETE, LightBlocksGlasses.BLUE_LIGHT_BLOCK.get());
        concreteLight(recipeOutput, Items.PURPLE_CONCRETE, LightBlocksGlasses.PURPLE_LIGHT_BLOCK.get());
        concreteLight(recipeOutput, Items.MAGENTA_CONCRETE, LightBlocksGlasses.MAGENTA_LIGHT_BLOCK.get());
        concreteLight(recipeOutput, Items.PINK_CONCRETE, LightBlocksGlasses.PINK_LIGHT_BLOCK.get());
        glassLight(recipeOutput, Items.WHITE_STAINED_GLASS, LightBlocksGlasses.WHITE_GLASS_LIGHT_BLOCK.get());
        glassLight(recipeOutput, Items.GLASS, LightBlocksGlasses.CLEAR_GLASS_LIGHT_BLOCK.get());
        glassLight(recipeOutput, Items.LIGHT_GRAY_STAINED_GLASS, LightBlocksGlasses.LIGHT_GRAY_GLASS_LIGHT_BLOCK.get());
        glassLight(recipeOutput, Items.GRAY_STAINED_GLASS, LightBlocksGlasses.GRAY_GLASS_LIGHT_BLOCK.get());
        glassLight(recipeOutput, Items.BLACK_STAINED_GLASS, LightBlocksGlasses.BLACK_GLASS_LIGHT_BLOCK.get());
        glassLight(recipeOutput, Items.BROWN_STAINED_GLASS, LightBlocksGlasses.BROWN_GLASS_LIGHT_BLOCK.get());
        glassLight(recipeOutput, Items.RED_STAINED_GLASS, LightBlocksGlasses.RED_GLASS_LIGHT_BLOCK.get());
        glassLight(recipeOutput, Items.ORANGE_STAINED_GLASS, LightBlocksGlasses.ORANGE_GLASS_LIGHT_BLOCK.get());
        glassLight(recipeOutput, Items.YELLOW_STAINED_GLASS, LightBlocksGlasses.YELLOW_GLASS_LIGHT_BLOCK.get());
        glassLight(recipeOutput, Items.LIME_STAINED_GLASS, LightBlocksGlasses.LIME_GLASS_LIGHT_BLOCK.get());
        glassLight(recipeOutput, Items.GREEN_STAINED_GLASS, LightBlocksGlasses.GREEN_GLASS_LIGHT_BLOCK.get());
        glassLight(recipeOutput, Items.CYAN_STAINED_GLASS, LightBlocksGlasses.CYAN_GLASS_LIGHT_BLOCK.get());
        glassLight(recipeOutput, Items.LIGHT_BLUE_STAINED_GLASS, LightBlocksGlasses.LIGHT_BLUE_GLASS_LIGHT_BLOCK.get());
        glassLight(recipeOutput, Items.BLUE_STAINED_GLASS, LightBlocksGlasses.BLUE_GLASS_LIGHT_BLOCK.get());
        glassLight(recipeOutput, Items.PURPLE_STAINED_GLASS, LightBlocksGlasses.PURPLE_GLASS_LIGHT_BLOCK.get());
        glassLight(recipeOutput, Items.MAGENTA_STAINED_GLASS, LightBlocksGlasses.MAGENTA_GLASS_LIGHT_BLOCK.get());
        glassLight(recipeOutput, Items.PINK_STAINED_GLASS, LightBlocksGlasses.PINK_GLASS_LIGHT_BLOCK.get());

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC,Items.SKELETON_SKULL)
                .define('S',Items.AMETHYST_SHARD)
                .define('B', Blocks.BONE_BLOCK)
                .define('M',Items.BONE_MEAL)
                .pattern("BMB")
                .pattern("MSM")
                .pattern("BMB")
                .unlockedBy("has_bone_meal",has(Items.BONE_MEAL))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC,Items.ENDER_PEARL)
                .define('E', AllFactoryItems.ENDER_PEARL_SHARD)
                .pattern("EEE")
                .pattern("E E")
                .pattern("EEE")
                .unlockedBy("has_ender_shard",has(AllFactoryItems.ENDER_PEARL_SHARD)).save(recipeOutput,"minecraft:ender_pearl_shard");

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC,Items.ENDER_EYE)
                .define('E', AllFactoryItems.ENDER_PEARL_SHARD)
                .define('B', Items.BLAZE_POWDER)
                .pattern("EEE")
                .pattern("EBE")
                .pattern("EEE")
                .unlockedBy("has_ender_shard",has(AllFactoryItems.ENDER_PEARL_SHARD)).save(recipeOutput,"minecraft:ender_eye_shard");

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC,Blocks.CHEST,4)
                .define('L', ItemTags.LOGS)
                .pattern("LLL")
                .pattern("L L")
                .pattern("LLL")
                .unlockedBy("has_logs",has(ItemTags.LOGS)).save(recipeOutput,"minecraft:chest_from_logs");

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC,Blocks.DIAMOND_ORE,1)
                .define('L', AllFactoryItems.DIAMOND_BITS)
                .define('D', Blocks.STONE)
                .pattern("LLL")
                .pattern("LDL")
                .pattern("LLL")
                .unlockedBy("has_diamond_bits",has(AllFactoryItems.DIAMOND_BITS)).save(recipeOutput,"minecraft:hardest_diamond");

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC,Items.STICK,16)
                .define('L', ItemTags.LOGS)
                .pattern("L")
                .pattern("L")
                .unlockedBy("has_logs",has(ItemTags.LOGS)).save(recipeOutput,"minecraft:stick_from_logs");

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC,Items.STRING)
                .define('L', ItemTags.LEAVES)
                .pattern("LLL")
                .unlockedBy("has_leaves",has(ItemTags.LEAVES)).save(recipeOutput,"minecraft:string_from_leaves");

        oreSmelting(recipeOutput,BRASS_CRUSHED,RecipeCategory.MISC, AllItems.BRASS_INGOT.get(),0.25f,100,"rubber");
        oreBlasting(recipeOutput,BRASS_CRUSHED,RecipeCategory.MISC,AllItems.BRASS_INGOT.get(),0.50f,100,"tin");

    }

    protected static void oreSmelting(RecipeOutput recipeOutput, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTIme, String pGroup) {
        oreCooking(recipeOutput, RecipeSerializer.SMELTING_RECIPE, SmeltingRecipe::new, pIngredients, pCategory, pResult, pExperience, pCookingTIme, pGroup, "_from_smelting");
    }

    protected static void oreBlasting(RecipeOutput recipeOutput, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup) {
        oreCooking(recipeOutput, RecipeSerializer.BLASTING_RECIPE, BlastingRecipe::new, pIngredients, pCategory, pResult, pExperience, pCookingTime, pGroup, "_from_blasting");
    }

    private static void concreteLight(RecipeOutput out, Item concrete, Block result) {
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, result)
                .define('G', Items.GLOW_INK_SAC)
                .define('C', concrete)
                .pattern(" G ")
                .pattern("GCG")
                .pattern(" G ")
                .unlockedBy("has_glow_ink", has(Items.GLOW_INK_SAC))
                .save(out, id("light_block", result));
    }

    private static void glassLight(RecipeOutput out, Item glass, Block result) {
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, result)
                .define('G', Items.GLOW_INK_SAC)
                .define('X', glass)
                .pattern(" G ")
                .pattern("GXG")
                .pattern(" G ")
                .unlockedBy("has_glow_ink", has(Items.GLOW_INK_SAC))
                .save(out, id("light_glass_block", result));
    }

    private static ResourceLocation id(String folder, Block result) {
        ResourceLocation key = BuiltInRegistries.BLOCK.getKey(result);
        if (key == null) {
            throw new IllegalStateException("Unregistered block: " + result);
        }
        return ResourceLocation.fromNamespaceAndPath(MOD_ID, folder + "/" + key.getPath());
    }
}
