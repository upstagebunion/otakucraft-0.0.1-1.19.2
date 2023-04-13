package net.upstagebunion.otakucraft.item;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.upstagebunion.otakucraft.Otakucraft;

public class ModItemGroup {
    public static final ItemGroup OTAKUCRAFT_GRP = FabricItemGroupBuilder.build(new Identifier(Otakucraft.MOD_ID, "otakucraft_group"), () -> new ItemStack(ModItems.CUM));
}
