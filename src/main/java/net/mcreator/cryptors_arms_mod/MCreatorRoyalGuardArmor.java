package net.mcreator.cryptors_arms_mod;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.item.ItemArmor;
import net.minecraft.item.Item;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;

@Elementscryptors_arms_mod.ModElement.Tag
public class MCreatorRoyalGuardArmor extends Elementscryptors_arms_mod.ModElement {
	@GameRegistry.ObjectHolder("cryptors_arms_mod:royalguardarmorhelmet")
	public static final Item helmet = null;
	@GameRegistry.ObjectHolder("cryptors_arms_mod:royalguardarmorbody")
	public static final Item body = null;
	@GameRegistry.ObjectHolder("cryptors_arms_mod:royalguardarmorlegs")
	public static final Item legs = null;
	@GameRegistry.ObjectHolder("cryptors_arms_mod:royalguardarmorboots")
	public static final Item boots = null;

	public MCreatorRoyalGuardArmor(Elementscryptors_arms_mod instance) {
		super(instance, 4);
	}

	@Override
	public void initElements() {
		ItemArmor.ArmorMaterial enuma = EnumHelper.addArmorMaterial("ROYALGUARDARMOR", "cryptors_arms_mod:royalguardarmor", 25, new int[]{10, 12, 15,
				10}, 10, null, 5f);
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.HEAD).setUnlocalizedName("royalguardarmorhelmet")
				.setRegistryName("royalguardarmorhelmet").setCreativeTab(MCreatorModTab.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.CHEST).setUnlocalizedName("royalguardarmorbody")
				.setRegistryName("royalguardarmorbody").setCreativeTab(MCreatorModTab.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.LEGS).setUnlocalizedName("royalguardarmorlegs")
				.setRegistryName("royalguardarmorlegs").setCreativeTab(MCreatorModTab.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.FEET).setUnlocalizedName("royalguardarmorboots")
				.setRegistryName("royalguardarmorboots").setCreativeTab(MCreatorModTab.tab));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(helmet, 0, new ModelResourceLocation("cryptors_arms_mod:royalguardarmorhelmet", "inventory"));
		ModelLoader.setCustomModelResourceLocation(body, 0, new ModelResourceLocation("cryptors_arms_mod:royalguardarmorbody", "inventory"));
		ModelLoader.setCustomModelResourceLocation(legs, 0, new ModelResourceLocation("cryptors_arms_mod:royalguardarmorlegs", "inventory"));
		ModelLoader.setCustomModelResourceLocation(boots, 0, new ModelResourceLocation("cryptors_arms_mod:royalguardarmorboots", "inventory"));
	}
}
