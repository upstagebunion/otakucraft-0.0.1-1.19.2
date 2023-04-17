package net.upstagebunion.otakucraft;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.upstagebunion.otakucraft.block.ModBlocks;
import net.upstagebunion.otakucraft.entity.ModEntities;
import net.upstagebunion.otakucraft.entity.custom.CapibaraEntity;
import net.upstagebunion.otakucraft.item.ModItems;
import net.upstagebunion.otakucraft.sound.ModSounds;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import software.bernie.geckolib3.GeckoLib;

public class Otakucraft implements ModInitializer {
	public static final String MOD_ID = "otakucraft";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);


	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		ModSounds.registerModSounds();

		GeckoLib.initialize();
		FabricDefaultAttributeRegistry.register(ModEntities.CAPIBARA, CapibaraEntity.setAttributes());
	}
}