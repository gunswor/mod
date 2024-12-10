package com.gunswor.bluecrystalindustry.item;

import com.gunswor.bluecrystalindustry.BlueCrystalIndustry;
import com.gunswor.bluecrystalindustry.block.ModBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup AZURITE_GROUP = Registry.register(Registries.ITEM_GROUP, Identifier.of(BlueCrystalIndustry.MOD_ID, "azurite_group"),
            ItemGroup.create(null, -1).displayName(Text.translatable("itemGroup.azurite_group"))
                    .icon(()-> new ItemStack(ModItems.AZURITE))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.AZURITE);

                        entries.add(ModBlocks.AZURITE_BLOCK);
                        entries.add(ModBlocks.AZURITE_ORE);
                        entries.add(ModBlocks.DEEPSLATE_AZURITE_ORE);

                        entries.add(ModItems.AZURITE_SWORD);
                        entries.add(ModItems.AZURITE_SHOVEL);
                        entries.add(ModItems.AZURITE_PICKAXE);
                        entries.add(ModItems.AZURITE_AXE);
                        entries.add(ModItems.AZURITE_HOE);

                        entries.add(ModItems.AZURITE_HELMET);
                        entries.add(ModItems.AZURITE_CHESTPLATE);
                        entries.add(ModItems.AZURITE_LEGGINGS);
                        entries.add(ModItems.AZURITE_BOOTS);
                    }).build());
    public static void registerModItemGroups() {
        BlueCrystalIndustry.LOGGER.info("Registering Item Groups");
    }
}
