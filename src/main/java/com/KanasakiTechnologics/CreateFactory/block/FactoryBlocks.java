package com.KanasakiTechnologics.CreateFactory.block;

import com.KanasakiTechnologics.CreateFactory.CreateFactory;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

import static com.KanasakiTechnologics.CreateFactory.item.AllFactoryItems.ITEMS;

public class FactoryBlocks {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(CreateFactory.MOD_ID);

    public static final DeferredBlock<Block> COMPRESSED_COAL = registerBlock("compressed_coal",
            () -> new Block(BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final DeferredBlock<Block> UNPROCESSED_COMPRESSED_COAL = registerBlock("unprocessed_compressed_coal",
            () -> new Block(BlockBehaviour.Properties.of().strength(2f).requiresCorrectToolForDrops().sound(SoundType.STONE)));

    private static <T extends Block> DeferredBlock<T> registerBlock(String name, Supplier<T> block) {
        DeferredBlock<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, DeferredBlock<T> block){
        ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }


    public static void register(IEventBus eventBus){
        BLOCKS.register(eventBus);
    }
}
