package com.underdog.voidscape.item;

import com.underdog.voidscape.Voidscape;
import com.underdog.voidscape.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {


    public static final ItemGroup VOIDSCAPE_BLOCKS = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(Voidscape.MOD_ID, "voidscape_items"),
            FabricItemGroup.builder()
                    .icon(() -> new ItemStack(ModBlocks.END_SAND))
                    .displayName(Text.translatable("itemgroup.voidscape.voidscape_blocks"))
                    .entries(((displayContext, entries) -> {
                        entries.add(ModBlocks.END_SAND);
                        entries.add(ModBlocks.END_SANDSTONE);
                        entries.add(ModBlocks.NULL_STONE);
                        entries.add(ModBlocks.NULL_STONE_BRICKS);
                        entries.add(ModBlocks.CUT_NULL_STONE);
                        entries.add(ModBlocks.CHISELED_NULL_STONE);
                        entries.add(ModBlocks.INFESTED_ENDSTONE);
                        entries.add(ModBlocks.VOIDLICH);
                        entries.add(ModBlocks.VOIDLICH_GRASS);
                        entries.add(ModBlocks.VOIDLICH_FRILL);
                    }))
                    .build());

    public static final ItemGroup VOIDSCAPE_ITEMS = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(Voidscape.MOD_ID, "voidscape_blocks"),
            FabricItemGroup.builder()
                    .icon(() -> new ItemStack(ModItems.VOIDROOT_PODS))
                    .displayName(Text.translatable("itemgroup.voidscape.voidscape_items"))
                    .entries((displayContext, entries) -> {
                                entries.add(ModItems.VOIDROOT_PODS);
                                entries.add(ModItems.TWILIGHT_DISC);
                            }
                    )
                    .build());


    public static void registerItemGroups() {}
}
