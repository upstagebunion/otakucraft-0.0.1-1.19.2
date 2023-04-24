package net.upstagebunion.otakucraft.entity.client;

import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;
import net.upstagebunion.otakucraft.Otakucraft;
import net.upstagebunion.otakucraft.entity.custom.CapibaraEntity;
import org.jetbrains.annotations.Nullable;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class CapibaraRenderer extends GeoEntityRenderer<CapibaraEntity> {
    public CapibaraRenderer(EntityRendererFactory.Context renderManager) {
        super(renderManager, new CapibaraModel());
        this.shadowRadius = 1.0f;
    }

    @Override
    public Identifier getTextureResource(CapibaraEntity animatable) {
        return new Identifier(Otakucraft.MOD_ID, "textures/entity/capibara_texture.png");
    }

    @Override
    public RenderLayer getRenderType(CapibaraEntity animatable, float partialTick, MatrixStack poseStack, @Nullable VertexConsumerProvider bufferSource, @Nullable VertexConsumer buffer, int packedLight, Identifier texture) {

        return super.getRenderType(animatable, partialTick, poseStack, bufferSource, buffer, packedLight, texture);
    }
}
