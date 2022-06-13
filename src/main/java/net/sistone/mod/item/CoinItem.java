package net.sistone.mod.item;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;

public class CoinItem extends Item{

    public CoinItem(Settings item$settings_1) {
        super(item$settings_1);
    }
    

@Override
public TypedActionResult<ItemStack> use(World world, PlayerEntity PlayerEntity, Hand hand) {
PlayerEntity.playSound(SoundEvents.BLOCK_NOTE_BLOCK_IRON_XYLOPHONE, 1.0F, 1.0F);
return new TypedActionResult<ItemStack>(ActionResult.SUCCESS, PlayerEntity.getStackInHand(hand));
    }
}