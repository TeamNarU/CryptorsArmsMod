package net.mcreator.cryptors_arms_mod;

import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.Entity;

@Elementscryptors_arms_mod.ModElement.Tag
public class MCreatorWandCultRangedItemUsed extends Elementscryptors_arms_mod.ModElement {
	public MCreatorWandCultRangedItemUsed(Elementscryptors_arms_mod instance) {
		super(instance, 7);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure MCreatorWandCultRangedItemUsed!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if ((!((entity instanceof EntityPlayer) ? ((EntityPlayer) entity).capabilities.isCreativeMode : false))) {
			if (entity instanceof EntityPlayer)
				((EntityPlayer) entity).inventory.clearMatchingItems(new ItemStack(MCreatorCultMana.block, (int) (1)).getItem(), -1, (int) 1, null);
		}
	}
}
