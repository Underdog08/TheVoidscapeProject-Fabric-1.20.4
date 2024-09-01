package com.underdog.voidscape.datagen;

import com.underdog.voidscape.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.END_SAND);
        addDrop(ModBlocks.END_SANDSTONE);
        addDrop(ModBlocks.NULL_STONE);
        addDrop(ModBlocks.POLISHED_NULL_STONE);
        addDrop(ModBlocks.NULL_STONE_BRICKS);
        addDrop(ModBlocks.CHISELED_NULL_STONE);
        addDrop(ModBlocks.CUT_NULL_STONE);

        addDrop(ModBlocks.VOIDLICH);
        addDrop(ModBlocks.VOIDLICH_FRILL);
    }
}