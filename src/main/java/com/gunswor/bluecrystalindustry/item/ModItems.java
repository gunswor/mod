package com.gunswor.bluecrystalindustry.item;

import com.gunswor.bluecrystalindustry.BlueCrystalIndustry;
import com.gunswor.bluecrystalindustry.item.custom.ModArmorItem;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item AZURITE = registerItems("azurite", new Item(new Item.Settings().fireproof()));
    public static final Item AZURITE_SWORD = registerItems("azurite_sword", new SwordItem(ModToolMaterials.AZURITE, new Item.Settings().fireproof().attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.AZURITE, 3, -2.0f))));
    public static final Item AZURITE_SHOVEL = registerItems("azurite_shovel", new ShovelItem(ModToolMaterials.AZURITE, new Item.Settings().fireproof().attributeModifiers(ShovelItem.createAttributeModifiers(ModToolMaterials.AZURITE, 1.5f, -3.0f))));
    public static final Item AZURITE_PICKAXE = registerItems("azurite_pickaxe", new PickaxeItem(ModToolMaterials.AZURITE, new Item.Settings().fireproof().attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterials.AZURITE,1.5f, -2.8f))));
    public static final Item AZURITE_AXE = registerItems("azurite_axe", new AxeItem(ModToolMaterials.AZURITE, new Item.Settings().fireproof().attributeModifiers(AxeItem.createAttributeModifiers(ModToolMaterials.AZURITE,6.0f,-3.0f))));
    public static final Item AZURITE_HOE = registerItems("azurite_hoe", new HoeItem(ModToolMaterials.AZURITE, new Item.Settings().fireproof().attributeModifiers(HoeItem.createAttributeModifiers(ModToolMaterials.AZURITE, -4.0f,0.0f))));
    public static final Item AZURITE_HELMET = registerItems("azurite_helmet", new ModArmorItem(ModArmorMaterials.AZURITE, ArmorItem.Type.HELMET, new Item.Settings().fireproof().maxDamage(ArmorItem.Type.HELMET.getMaxDamage(40))));
    public static final Item AZURITE_CHESTPLATE = registerItems("azurite_chestplate", new ModArmorItem(ModArmorMaterials.AZURITE, ArmorItem.Type.CHESTPLATE, new Item.Settings().fireproof().maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(48))));
    public static final Item AZURITE_LEGGINGS = registerItems("azurite_leggings", new ModArmorItem(ModArmorMaterials.AZURITE, ArmorItem.Type.LEGGINGS, new Item.Settings().fireproof().maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(42))));
    public static final Item AZURITE_BOOTS = registerItems("azurite_boots", new ModArmorItem(ModArmorMaterials.AZURITE, ArmorItem.Type.BOOTS, new Item.Settings().fireproof().maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(40))));
    private static Item registerItems(String id, Item item){
        return Registry.register(Registries.ITEM, Identifier.of(BlueCrystalIndustry.MOD_ID, id), item);
    }
    public static void addItemToItemGroup(FabricItemGroupEntries fabricItemGroupEntries){
        fabricItemGroupEntries.add(AZURITE);
    }
    public static void registerModItems(){
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemToItemGroup);
        BlueCrystalIndustry.LOGGER.info("Registering Items");
    }
}
