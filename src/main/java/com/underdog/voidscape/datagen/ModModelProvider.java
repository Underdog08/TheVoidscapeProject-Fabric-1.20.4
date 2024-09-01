package com.underdog.voidscape.datagen;

import com.underdog.voidscape.block.ModBlocks;
import com.underdog.voidscape.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.block.Blocks;
import net.minecraft.data.client.*;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.END_SAND);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.END_SANDSTONE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.INFESTED_ENDSTONE);




        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.NULL_STONE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.POLISHED_NULL_STONE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.NULL_STONE_BRICKS);
        blockStateModelGenerator.registerSingleton(ModBlocks.CHISELED_NULL_STONE, TexturedModel.CUBE_COLUMN);
        blockStateModelGenerator.registerSingleton(ModBlocks.CUT_NULL_STONE, TexturedModel.CUBE_COLUMN);




        blockStateModelGenerator.registerSingleton(ModBlocks.VOIDLICH, TexturedModel.CUBE_BOTTOM_TOP);
        blockStateModelGenerator.registerTintableCross(ModBlocks.VOIDLICH_FRILL, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerTintableCross(ModBlocks.VOIDLICH_GRASS, BlockStateModelGenerator.TintType.NOT_TINTED);
    }



    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.VOIDROOT_PODS, Models.GENERATED);
        itemModelGenerator.register(ModItems.MITE_GEL, Models.GENERATED);
        itemModelGenerator.register(ModItems.TWILIGHT_DISC, Models.GENERATED);
    }
}