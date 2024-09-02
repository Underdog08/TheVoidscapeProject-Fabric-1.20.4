package com.underdog.voidscape.world.biome.surface;

import com.underdog.voidscape.block.ModBlocks;
import com.underdog.voidscape.world.biome.ModBiomes;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.world.gen.surfacebuilder.MaterialRules;

public class ModMaterialRules {
    private static final MaterialRules.MaterialRule WASTES_GROUND = makeStateRule(ModBlocks.END_SANDSTONE);
    private static final MaterialRules.MaterialRule WASTES_SURFACE = makeStateRule(ModBlocks.END_SAND);

    private static final MaterialRules.MaterialRule GROVE_GROUND = makeStateRule(Blocks.END_STONE);
    private static final MaterialRules.MaterialRule GROVE_SURFACE = makeStateRule(ModBlocks.VOIDLICH);

    public static MaterialRules.MaterialRule makeRules() {
        MaterialRules.MaterialCondition isAtOrAboveWaterLevel = MaterialRules.water(-1, 0);

        MaterialRules.MaterialRule wastes_surface = MaterialRules.sequence(MaterialRules.condition(isAtOrAboveWaterLevel, WASTES_SURFACE), WASTES_GROUND);

        MaterialRules.MaterialRule grove_surface = MaterialRules.sequence(MaterialRules.condition(isAtOrAboveWaterLevel, GROVE_SURFACE), GROVE_GROUND);

        return MaterialRules.sequence(
                MaterialRules.sequence(MaterialRules.condition(MaterialRules.biome(ModBiomes.END_WASTES), MaterialRules.condition(MaterialRules.STONE_DEPTH_FLOOR, wastes_surface)),
                        MaterialRules.condition(MaterialRules.biome(ModBiomes.END_GROVE), MaterialRules.condition(MaterialRules.STONE_DEPTH_FLOOR, grove_surface))));
    }

    private static MaterialRules.MaterialRule makeStateRule(Block block) {
        return MaterialRules.block(block.getDefaultState());
    }
}
