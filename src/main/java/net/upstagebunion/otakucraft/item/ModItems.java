package net.upstagebunion.otakucraft.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.upstagebunion.otakucraft.Otakucraft;
import net.upstagebunion.otakucraft.block.ModBlocks;
import net.upstagebunion.otakucraft.entity.ModEntities;
import net.upstagebunion.otakucraft.item.custom.MassiveDildoItem;

public class ModItems {

    public static final Item CUM = registerItem("cum", new Item(new FabricItemSettings().group(ModItemGroup.OTAKUCRAFT_GRP)));
    public static final Item CUM_BUCKET = registerItem("cum_bucket", new Item(new FabricItemSettings().group(ModItemGroup.OTAKUCRAFT_GRP)));
    public static final Item AVOCADO_SEEDS = registerItem("avocado_seeds", new AliasedBlockItem(ModBlocks.AVOCADO_CROP_BLOCK, new FabricItemSettings().group(ModItemGroup.OTAKUCRAFT_GRP)));
    public static final Item AVOCADO = registerItem("avocado", new Item(new FabricItemSettings().group(ModItemGroup.OTAKUCRAFT_GRP).food(new FoodComponent.Builder().hunger(4).saturationModifier(4f).build())));
    public static final Item CAPIBARA_SPAWN_EGG = registerItem("capibara_spawn_egg", new SpawnEggItem(ModEntities.CAPIBARA, 0x846432, 0x50350b, new FabricItemSettings().group(ModItemGroup.OTAKUCRAFT_GRP).maxCount(1)));

    public static final Item MASSIVEDILDO = registerItem("massive_dildo_item", new MassiveDildoItem(new FabricItemSettings().group(ModItemGroup.OTAKUCRAFT_GRP).maxCount(1)));

    private static Item registerItem(String name, Item item){
        return Registry.register(Registry.ITEM, new Identifier(Otakucraft.MOD_ID, name), item);
    }

    public static void registerModItems(){
        Otakucraft.LOGGER.info("Registrando Item Mod para " + Otakucraft.MOD_ID);
    }
}
