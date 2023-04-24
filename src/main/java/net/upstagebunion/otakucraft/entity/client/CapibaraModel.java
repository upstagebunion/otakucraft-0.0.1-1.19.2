package net.upstagebunion.otakucraft.entity.client;

import net.minecraft.util.Identifier;
import net.upstagebunion.otakucraft.Otakucraft;
import net.upstagebunion.otakucraft.entity.custom.CapibaraEntity;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class CapibaraModel extends AnimatedGeoModel<CapibaraEntity> {


    @Override
    public Identifier getModelResource(CapibaraEntity object) {
        return new Identifier(Otakucraft.MOD_ID, "geo/capibara2.geo.json");
    }

    @Override
    public Identifier getTextureResource(CapibaraEntity object) {
        return new Identifier(Otakucraft.MOD_ID, "textures/entity/capibara_texture.png");
    }

    @Override
    public Identifier getAnimationResource(CapibaraEntity animatable) {
        return new Identifier(Otakucraft.MOD_ID, "animations/capibara.animation.json");
    }
}
