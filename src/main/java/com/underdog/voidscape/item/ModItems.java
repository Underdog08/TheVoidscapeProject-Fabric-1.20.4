package com.underdog.voidscape.item;

import com.underdog.voidscape.Voidscape;
import com.underdog.voidscape.sound.ModSounds;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.item.MusicDiscItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item VOIDROOT_PODS = registerItem("voidroot_pods",
            new Item(new FabricItemSettings()
            .food(new FoodComponent.Builder()
                    .hunger(3)
                    .saturationModifier(0.3f)
                    .build())));

    public static final Item TWILIGHT_DISC = registerItem("twilight_disc",
            new MusicDiscItem(0, ModSounds.TWILIGHT_DISC, new FabricItemSettings().maxCount(1), 113));

    public static final Item MITE_GEL = registerItem("mite_gel",
            new Item(new FabricItemSettings()
                    .food(new FoodComponent.Builder()
                            .hunger(1)
                            .saturationModifier(0.5f)
                            //.statusEffect(new StatusEffectInstance(StatusEffects.NAUSEA, 10, 1, false, false, false), 1)
                            .build())));




    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(Voidscape.MOD_ID, name), item);
    }

    public static void registerModItems() {}




}
