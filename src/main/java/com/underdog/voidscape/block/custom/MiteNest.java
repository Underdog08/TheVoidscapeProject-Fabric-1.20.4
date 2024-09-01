package com.underdog.voidscape.block.custom;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.mob.EndermiteEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class MiteNest extends Block {
    public MiteNest(Settings settings) {
        super(settings);
    }

    @Override
    public BlockState onBreak(World world, BlockPos pos, BlockState state, PlayerEntity player) {
        BlockState newState = super.onBreak(world, pos, state, player);
        EndermiteEntity endermiteEntity = (EndermiteEntity) EntityType.ENDERMITE.create(world);
        endermiteEntity.refreshPositionAndAngles((double)pos.getX() + 0.5, pos.getY(), (double)pos.getZ() + 0.5, 0.0F, 0.0F);
        world.spawnEntity(endermiteEntity);
        endermiteEntity.playSpawnEffects();
        return newState;
    }
}
