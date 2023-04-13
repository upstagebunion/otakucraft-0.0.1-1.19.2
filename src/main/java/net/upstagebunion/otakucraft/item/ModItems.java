package net.upstagebunion.otakucraft.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.upstagebunion.otakucraft.Otakucraft;

public class ModItems {

    public static final Item CUM = registerItem("cum", new Item(new FabricItemSettings().group(ModItemGroup.OTAKUCRAFT_GRP)));
    public static final Item CUM_BUCKET = registerItem("cum_bucket", new Item(new FabricItemSettings().group(ModItemGroup.OTAKUCRAFT_GRP)));

    private static Item registerItem(String name, Item item){
        return Registry.register(Registry.ITEM, new Identifier(Otakucraft.MOD_ID, name), item);
    }

    public static void registerModItems(){
        Otakucraft.LOGGER.info("Registrando Item Mod para " + Otakucraft.MOD_ID);
    }
}
