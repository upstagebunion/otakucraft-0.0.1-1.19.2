package net.upstagebunion.otakucraft.block.custom;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.CropBlock;
import net.minecraft.item.ItemConvertible;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.IntProperty;
import net.upstagebunion.otakucraft.Otakucraft;
import net.upstagebunion.otakucraft.item.ModItems;

public class AvocadoCropBlock extends CropBlock {

    private static final IntProperty AGE = IntProperty.of("age", 0, 6);

    public AvocadoCropBlock(Settings settings) {
        super(settings);
    }

    @Override
    protected ItemConvertible getSeedsItem() {
        return ModItems.AVOCADO_SEEDS;
    }

    @Override
    public int getMaxAge() {
        return 6;
    }

    @Override
    public IntProperty getAgeProperty() {
        return AGE;
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(AGE);
    }
}
