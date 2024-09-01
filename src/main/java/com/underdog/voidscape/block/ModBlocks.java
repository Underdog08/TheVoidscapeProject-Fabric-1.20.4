package com.underdog.voidscape.block;

import com.mojang.serialization.MapCodec;
import com.underdog.voidscape.Voidscape;
import com.underdog.voidscape.block.custom.DelayedFallingBlock;
import com.underdog.voidscape.block.custom.MiteNest;
import com.underdog.voidscape.block.custom.Voidlich;
import com.underdog.voidscape.block.custom.VoidlichFoliage;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.block.enums.Instrument;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;

public class ModBlocks {

    public static final Block END_SAND = registerBlock("end_sand", new DelayedFallingBlock(FabricBlockSettings.of()
            .strength(0.5f,1f)
            .instrument(Instrument.BASS)
            .mapColor(MapColor.PALE_YELLOW)
            .sounds(BlockSoundGroup.SAND)) {
        @Override
        protected MapCodec<? extends FallingBlock> getCodec() {
            return null;
        }
    });

    public static final Block END_SANDSTONE = registerBlock("end_sandstone", new Block(FabricBlockSettings.of()
            .strength(1f,1f)
            .instrument(Instrument.BASS)
            .mapColor(MapColor.PALE_YELLOW)
            .sounds(BlockSoundGroup.STONE)
            .requiresTool())
    );

    public static final Block INFESTED_ENDSTONE = registerBlock("infested_endstone", new MiteNest(FabricBlockSettings.of()
            .strength(0.1f,0.1f)
            .instrument(Instrument.BASS)
            .mapColor(MapColor.PALE_YELLOW)
            .sounds(BlockSoundGroup.STONE))
    );




    public static final Block NULL_STONE = registerBlock("null_stone", new Block(FabricBlockSettings.of()
            .strength(20, 0)
            .instrument(Instrument.IRON_XYLOPHONE)
            .mapColor(MapColor.BLACK)
            .sounds(BlockSoundGroup.DEEPSLATE)
            .requiresTool())
    );

    public static final Block NULL_STONE_BRICKS = registerBlock("null_stone_bricks", new Block(FabricBlockSettings.of()
            .strength(20, 0)
            .instrument(Instrument.IRON_XYLOPHONE)
            .mapColor(MapColor.BLACK)
            .sounds(BlockSoundGroup.DEEPSLATE)
            .requiresTool())
    );

    public static final Block CUT_NULL_STONE = registerBlock("cut_null_stone", new Block(FabricBlockSettings.of()
            .strength(20, 0)
            .instrument(Instrument.IRON_XYLOPHONE)
            .mapColor(MapColor.BLACK)
            .sounds(BlockSoundGroup.DEEPSLATE)
            .requiresTool())
    );

    public static final Block CHISELED_NULL_STONE = registerBlock("chiseled_null_stone", new Block(FabricBlockSettings.of()
            .strength(20, 0)
            .instrument(Instrument.IRON_XYLOPHONE)
            .mapColor(MapColor.BLACK)
            .sounds(BlockSoundGroup.DEEPSLATE)
            .requiresTool())
    );





    public static final Block VOIDLICH = registerBlock("voidlich", new Voidlich(FabricBlockSettings.of()
            .strength(0.2f,0.5f)
            .instrument(Instrument.CHIME)
            .mapColor(MapColor.YELLOW)
            .sounds(BlockSoundGroup.MOSS_BLOCK))
    );

    public static final Block VOIDLICH_GRASS = registerBlock("voidlich_grass", new VoidlichFoliage(FabricBlockSettings.of()
            .mapColor(MapColor.PALE_YELLOW)
            .noCollision()
            .breakInstantly()
            .sounds(BlockSoundGroup.GRASS)
            .offset(AbstractBlock.OffsetType.XZ)
            .pistonBehavior(PistonBehavior.DESTROY)
            .dynamicBounds()) {

                @Override
                public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
                    return VoxelShapes.cuboid(0.3, 0, 0.3, 0.7, 0.6, 0.7);}}
    );

    public static final Block VOIDLICH_FRILL = registerBlock("voidlich_frill", new VoidlichFoliage(FabricBlockSettings.of()
            .mapColor(MapColor.PALE_YELLOW)
            .noCollision()
            .breakInstantly()
            .sounds(BlockSoundGroup.GRASS)
            .offset(AbstractBlock.OffsetType.XZ)
            .pistonBehavior(PistonBehavior.DESTROY)
            .dynamicBounds()) {
                @Override
                public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
                    return VoxelShapes.cuboid(0.3, 0, 0.3, 0.7, 0.6, 0.7);}}
    );






    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(Voidscape.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(Voidscape.MOD_ID, name), new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerModBlocks() {}
}
