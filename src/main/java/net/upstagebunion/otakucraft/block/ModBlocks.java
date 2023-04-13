package net.upstagebunion.otakucraft.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.upstagebunion.otakucraft.Otakucraft;
import net.upstagebunion.otakucraft.item.ModItemGroup;

public class ModBlocks {

    //public static final Block DARKSAND = registerBlock("darksand_block", new Block(FabricBlockSettings.of(Material.SNOW_BLOCK).strength(1f)), ModItemGroup.OTAKUCRAFT_GRP);
    public static final Block DARKSAND = registerBlock("darksand_block", new DarkSandBlock2(0, FabricBlockSettings.of(Material.AGGREGATE).strength(0.5f).sounds(BlockSoundGroup.SAND)), ModItemGroup.OTAKUCRAFT_GRP);

    private static Block registerBlock (String name, Block block, ItemGroup tab){
        registerBlockItem(name, block, tab);
        return Registry.register(Registry.BLOCK, new Identifier(Otakucraft.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup tab){
        return Registry.register(Registry.ITEM, new Identifier(Otakucraft.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(tab)));
    }

    public static void registerModBlocks(){
        Otakucraft.LOGGER.debug("Registrando ModBlocks para " + Otakucraft.MOD_ID);
    }
}
