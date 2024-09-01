package com.underdog.voidscape;

import com.underdog.voidscape.block.ModBlocks;
import com.underdog.voidscape.datagen.ModBlockTagProvider;
import com.underdog.voidscape.item.ModItemGroups;
import com.underdog.voidscape.item.ModItems;
import com.underdog.voidscape.sound.ModSounds;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Voidscape implements ModInitializer {
	public static final String MOD_ID = "voidscape";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		ModItemGroups.registerItemGroups();
		ModSounds.registerSounds();
	}
}