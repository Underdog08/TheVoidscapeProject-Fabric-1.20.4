package com.underdog.voidscape.world.biome;

import com.underdog.voidscape.Voidscape;
import com.underdog.voidscape.world.biome.surface.ModGroveMaterialRules;
import com.underdog.voidscape.world.biome.surface.ModMaterialRules;
import net.minecraft.world.biome.BiomeKeys;
import terrablender.api.EndBiomeRegistry;
import terrablender.api.SurfaceRuleManager;
import terrablender.api.TerraBlenderApi;

public class ModTerrablenderAPI implements TerraBlenderApi {

    @Override
    public void onTerraBlenderInitialized() {
        EndBiomeRegistry.registerHighlandsBiome(ModBiomes.END_GROVE, 50);
        EndBiomeRegistry.registerMidlandsBiome(ModBiomes.END_GROVE, 50);
        EndBiomeRegistry.registerEdgeBiome(ModBiomes.END_GROVE, 50);
        EndBiomeRegistry.registerIslandBiome(ModBiomes.END_GROVE, 50);
        SurfaceRuleManager.addSurfaceRules(SurfaceRuleManager.RuleCategory.END, Voidscape.MOD_ID, ModGroveMaterialRules.makeRules());
        EndBiomeRegistry.registerHighlandsBiome(ModBiomes.END_WASTES, 50);
        EndBiomeRegistry.registerMidlandsBiome(ModBiomes.END_WASTES, 50);
        EndBiomeRegistry.registerEdgeBiome(ModBiomes.END_WASTES, 50);
        EndBiomeRegistry.registerIslandBiome(ModBiomes.END_WASTES, 50);
        SurfaceRuleManager.addSurfaceRules(SurfaceRuleManager.RuleCategory.END, Voidscape.MOD_ID, ModMaterialRules.makeRules());
        EndBiomeRegistry.registerHighlandsBiome(BiomeKeys.END_HIGHLANDS, 50);
        EndBiomeRegistry.registerMidlandsBiome(BiomeKeys.END_MIDLANDS, 50);
        EndBiomeRegistry.registerEdgeBiome(BiomeKeys.END_BARRENS, 50);
        EndBiomeRegistry.registerIslandBiome(BiomeKeys.SMALL_END_ISLANDS, 50);
    }
}