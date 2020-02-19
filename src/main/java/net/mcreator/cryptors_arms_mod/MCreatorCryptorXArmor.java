package net.mcreator.cryptors_arms_mod;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.util.ResourceLocation;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.Item;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;

@Elementscryptors_arms_mod.ModElement.Tag
public class MCreatorCryptorXArmor extends Elementscryptors_arms_mod.ModElement {
	@GameRegistry.ObjectHolder("cryptors_arms_mod:cryptorxarmorhelmet")
	public static final Item helmet = null;
	@GameRegistry.ObjectHolder("cryptors_arms_mod:cryptorxarmorbody")
	public static final Item body = null;
	@GameRegistry.ObjectHolder("cryptors_arms_mod:cryptorxarmorlegs")
	public static final Item legs = null;
	@GameRegistry.ObjectHolder("cryptors_arms_mod:cryptorxarmorboots")
	public static final Item boots = null;

	public MCreatorCryptorXArmor(Elementscryptors_arms_mod instance) {
		super(instance, 14);
	}

	@Override
	public void initElements() {
		ItemArmor.ArmorMaterial enuma = EnumHelper.addArmorMaterial("CRYPTORXARMOR", "cryptors_arms_mod:cryptorxarmor_", 100, new int[]{99, 99, 99,
				99}, 9, (net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY.getObject(new ResourceLocation("")), 5f);
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.HEAD).setUnlocalizedName("cryptorxarmorhelmet")
				.setRegistryName("cryptorxarmorhelmet").setCreativeTab(MCreatorModTab.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.CHEST).setUnlocalizedName("cryptorxarmorbody")
				.setRegistryName("cryptorxarmorbody").setCreativeTab(MCreatorModTab.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.LEGS).setUnlocalizedName("cryptorxarmorlegs")
				.setRegistryName("cryptorxarmorlegs").setCreativeTab(MCreatorModTab.tab));
		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.FEET).setUnlocalizedName("cryptorxarmorboots")
				.setRegistryName("cryptorxarmorboots").setCreativeTab(MCreatorModTab.tab));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(helmet, 0, new ModelResourceLocation("cryptors_arms_mod:cryptorxarmorhelmet", "inventory"));
		ModelLoader.setCustomModelResourceLocation(body, 0, new ModelResourceLocation("cryptors_arms_mod:cryptorxarmorbody", "inventory"));
		ModelLoader.setCustomModelResourceLocation(legs, 0, new ModelResourceLocation("cryptors_arms_mod:cryptorxarmorlegs", "inventory"));
		ModelLoader.setCustomModelResourceLocation(boots, 0, new ModelResourceLocation("cryptors_arms_mod:cryptorxarmorboots", "inventory"));
	}
}
