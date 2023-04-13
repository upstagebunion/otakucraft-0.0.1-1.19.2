package net.upstagebunion.otakucraft;

import net.fabricmc.api.ModInitializer;

import net.upstagebunion.otakucraft.block.ModBlocks;
import net.upstagebunion.otakucraft.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Otakucraft implements ModInitializer {
	public static final String MOD_ID = "otakucraft";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}