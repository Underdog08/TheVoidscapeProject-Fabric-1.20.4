package com.underdog.voidscape.block.custom;

import com.mojang.serialization.MapCodec;
import com.underdog.voidscape.block.ModBlocks;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.PlantBlock;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockView;

public class VoidlichFoliage extends PlantBlock {
    public VoidlichFoliage(Settings settings) {
        super(settings);
    }
    @Override
    protected MapCodec<? extends PlantBlock> getCodec() {
        return null;
    }

    protected boolean canPlantOnTop(BlockState floor, BlockView world, BlockPos pos) {
        return floor.isOf(ModBlocks.END_SAND) || floor.isOf(ModBlocks.VOIDLICH);
    }
}