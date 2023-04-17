package net.upstagebunion.otakucraft.entity;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.upstagebunion.otakucraft.Otakucraft;
import net.upstagebunion.otakucraft.entity.custom.CapibaraEntity;


public class ModEntities {
    public static final EntityType<CapibaraEntity> CAPIBARA = Registry.register(
            Registry.ENTITY_TYPE, new Identifier(Otakucraft.MOD_ID, "capibara"),
            FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, CapibaraEntity::new).dimensions(EntityDimensions.fixed(0.4f, 1.5f)).build());
}
