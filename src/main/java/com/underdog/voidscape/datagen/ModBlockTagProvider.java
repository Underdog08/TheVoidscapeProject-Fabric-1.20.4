package com.underdog.voidscape.datagen;

import com.underdog.voidscape.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.block.Block;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {
        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.END_SANDSTONE)
                .add(ModBlocks.INFESTED_ENDSTONE)
                .add(ModBlocks.NULL_STONE)
                .add(ModBlocks.POLISHED_NULL_STONE)
                .add(ModBlocks.NULL_STONE_BRICKS)
                .add(ModBlocks.CUT_NULL_STONE)
                .add(ModBlocks.CHISELED_NULL_STONE);

        getOrCreateTagBuilder(BlockTags.SHOVEL_MINEABLE)
                .add(ModBlocks.END_SAND);

        getOrCreateTagBuilder(BlockTags.HOE_MINEABLE)
                .add(ModBlocks.VOIDLICH);

        getOrCreateTagBuilder(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.NULL_STONE)
                .add(ModBlocks.POLISHED_NULL_STONE)
                .add(ModBlocks.NULL_STONE_BRICKS)
                .add(ModBlocks.CUT_NULL_STONE)
                .add(ModBlocks.CHISELED_NULL_STONE);
    }
}
