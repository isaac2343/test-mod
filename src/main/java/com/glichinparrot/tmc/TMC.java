package com.glichinparrot.tmc;

import com.glichinparrot.tmc.block.ModBlocks;
import com.glichinparrot.tmc.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TMC implements ModInitializer {
 public static final String Mod_ID = "tmc";
 public static final  Logger LOGGER = LoggerFactory.getLogger(Mod_ID);
	@Override
	public void onInitialize() {
        ModItems.registerModItems();
        ModBlocks.registerModBlocks();
	}
}