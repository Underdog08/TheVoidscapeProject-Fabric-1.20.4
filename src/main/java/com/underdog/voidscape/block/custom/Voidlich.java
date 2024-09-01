package com.underdog.voidscape.block.custom;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.mob.EndermiteEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class Voidlich extends Block {
    public Voidlich(Settings settings) {
        super(settings);
    }



    @Override
    public void neighborUpdate(BlockState state, World world, BlockPos pos, Block block, BlockPos fromPos, boolean notify) {
        super.neighborUpdate(state, world, pos, block, fromPos, notify);

        // Check if the block above (pos.up()) has been updated
        if (fromPos.equals(pos.up())) {
            // Get the block state of the block above
            BlockState blockAboveState = world.getBlockState(pos.up());

            // Check if the block above is a full block
            if (blockAboveState.isFullCube(world, pos.up())) {
                // Change the current block to End Stone
                world.setBlockState(pos, Blocks.END_STONE.getDefaultState());
            }
        }
    }
}
