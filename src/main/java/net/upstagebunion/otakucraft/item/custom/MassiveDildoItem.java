package net.upstagebunion.otakucraft.item.custom;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.sound.SoundCategory;
import net.minecraft.stat.Stats;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;
import net.upstagebunion.otakucraft.Otakucraft;
import net.upstagebunion.otakucraft.item.ModItems;
import net.upstagebunion.otakucraft.sound.ModSounds;

public class MassiveDildoItem extends Item {
    public MassiveDildoItem(Settings settings) {
        super(settings);
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        ItemStack itemStack = user.getStackInHand(hand);
        if(!world.isClient() && hand == Hand.MAIN_HAND ){
            world.playSound(
                    null, // Player - if non-null, will play sound for every nearby player *except* the specified player
                    user.getX(), user.getY(), user.getZ(), // The position of where the sound will come from
                    ModSounds.WOMANMOANEVENT, // The sound that will play
                    SoundCategory.PLAYERS, // This determines which of the volume sliders affect this sound
                    0.5f, //Volume multiplier, 1 is normal, 0.5 is half volume, etc
                    1f // Pitch multiplier, 1 is normal, 0.5 is half pitch, etc
            );
            user.setHealth(10);

            user.incrementStat(Stats.USED.getOrCreateStat(this));
            if (!user.getAbilities().creativeMode) {
                itemStack.decrement(1);
            }

            user.getInventory().insertStack(new ItemStack(ModItems.CUM, 10));

        }


        return super.use(world, user, hand);
    }
}
