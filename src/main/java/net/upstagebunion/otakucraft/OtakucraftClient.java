package net.upstagebunion.otakucraft;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;
import net.upstagebunion.otakucraft.block.ModBlocks;

public class OtakucraftClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.AVOCADO_CROP_BLOCK, RenderLayer.getCutout());
    }
}
