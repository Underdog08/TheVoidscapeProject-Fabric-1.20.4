package com.underdog.voidscape.world.biome.surface;

import com.underdog.voidscape.block.ModBlocks;
import com.underdog.voidscape.world.biome.ModBiomes;
import net.minecraft.block.Block;
import net.minecraft.world.gen.surfacebuilder.MaterialRules;

public class ModGroveMaterialRules {
    private static final MaterialRules.MaterialRule DIRT = makeStateRule(ModBlocks.END_SANDSTONE);
    private static final MaterialRules.MaterialRule GRASS_BLOCK = makeStateRule(ModBlocks.VOIDLICH);

    public static MaterialRules.MaterialRule makeRules() {
        MaterialRules.MaterialCondition isAtOrAboveWaterLevel = MaterialRules.water(-1, 0);

        MaterialRules.MaterialRule grassSurface = MaterialRules.sequence(MaterialRules.condition(isAtOrAboveWaterLevel, GRASS_BLOCK), DIRT);

        return MaterialRules.sequence(
                MaterialRules.sequence(MaterialRules.condition(MaterialRules.biome(ModBiomes.END_GROVE),

                // Default to a grass and dirt surface
                MaterialRules.condition(MaterialRules.STONE_DEPTH_FLOOR, grassSurface)
        )));
    }

    private static MaterialRules.MaterialRule makeStateRule(Block block) {
        return MaterialRules.block(block.getDefaultState());
    }
}
