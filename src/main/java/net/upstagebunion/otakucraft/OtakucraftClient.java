package net.upstagebunion.otakucraft;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.minecraft.client.render.RenderLayer;
import net.upstagebunion.otakucraft.block.ModBlocks;
import net.upstagebunion.otakucraft.entity.ModEntities;
import net.upstagebunion.otakucraft.entity.client.CapibaraRenderer;

public class OtakucraftClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.AVOCADO_CROP_BLOCK, RenderLayer.getCutout());

        EntityRendererRegistry.register(ModEntities.CAPIBARA, CapibaraRenderer::new);
    }
}
