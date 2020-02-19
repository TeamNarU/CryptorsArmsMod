package net.mcreator.cryptors_arms_mod;

import net.minecraftforge.items.ItemHandlerHelper;

import net.minecraft.util.DamageSource;
import net.minecraft.potion.PotionEffect;
import net.minecraft.item.ItemStack;
import net.minecraft.init.MobEffects;
import net.minecraft.init.Items;
import net.minecraft.init.Blocks;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.Entity;

@Elementscryptors_arms_mod.ModElement.Tag
public class MCreatorCryptorsSoulItemInInventoryTick extends Elementscryptors_arms_mod.ModElement {
	public MCreatorCryptorsSoulItemInInventoryTick(Elementscryptors_arms_mod instance) {
		super(instance, 10);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure MCreatorCryptorsSoulItemInInventoryTick!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		entity.attackEntityFrom(DamageSource.GENERIC, (float) 1);
		if (entity instanceof EntityLivingBase)
			((EntityLivingBase) entity).addPotionEffect(new PotionEffect(MobEffects.POISON, (int) 3600, (int) 10, (false), (false)));
		if (((entity instanceof EntityPlayer) ? ((EntityPlayer) entity).inventory.hasItemStack(new ItemStack(Items.MILK_BUCKET, (int) (1))) : false)) {
			if (entity instanceof EntityPlayer)
				((EntityPlayer) entity).inventory.clearMatchingItems(new ItemStack(Items.MILK_BUCKET, (int) (1)).getItem(), -1, (int) 36, null);
			if (entity instanceof EntityPlayer)
				ItemHandlerHelper.giveItemToPlayer(((EntityPlayer) entity), new ItemStack(Blocks.DEADBUSH, (int) (36)));
		}
	}
}
