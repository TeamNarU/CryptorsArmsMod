package net.mcreator.cryptors_arms_mod;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;

import net.minecraft.item.ItemStack;
import net.minecraft.creativetab.CreativeTabs;

@Elementscryptors_arms_mod.ModElement.Tag
public class MCreatorModTab extends Elementscryptors_arms_mod.ModElement {
	public MCreatorModTab(Elementscryptors_arms_mod instance) {
		super(instance, 8);
	}

	@Override
	public void initElements() {
		tab = new CreativeTabs("tabmodtab") {
			@SideOnly(Side.CLIENT)
			@Override
			public ItemStack getTabIconItem() {
				return new ItemStack(MCreatorCryptorsSoul.block, (int) (1));
			}

			@SideOnly(Side.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static CreativeTabs tab;
}
