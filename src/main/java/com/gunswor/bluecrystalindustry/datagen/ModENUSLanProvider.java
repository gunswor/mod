package com.gunswor.bluecrystalindustry.datagen;

import com.gunswor.bluecrystalindustry.block.ModBlocks;
import com.gunswor.bluecrystalindustry.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ModENUSLanProvider extends FabricLanguageProvider {
    public ModENUSLanProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, "en_us", registryLookup);
    }

    @Override
    public void generateTranslations(RegistryWrapper.WrapperLookup wrapperLookup, TranslationBuilder translationBuilder) {
        translationBuilder.add(ModItems.AZURITE, "Azurite");

        translationBuilder.add(ModBlocks.AZURITE_BLOCK, "Azurite Block");
        translationBuilder.add(ModBlocks.AZURITE_ORE, "Azurite Ore");
        translationBuilder.add(ModBlocks.DEEPSLATE_AZURITE_ORE, "Deepslate Azurite Ore");

        translationBuilder.add(ModItems.AZURITE_SWORD, "azurite_sword");
        translationBuilder.add(ModItems.AZURITE_SHOVEL, "azurite_shovel");
        translationBuilder.add(ModItems.AZURITE_PICKAXE, "azurite_pickaxe");
        translationBuilder.add(ModItems.AZURITE_AXE, "azurite_axe");
        translationBuilder.add(ModItems.AZURITE_HOE, "azurite_hoe");

        translationBuilder.add(ModItems.AZURITE_HELMET, "azurite_helmet");
        translationBuilder.add(ModItems.AZURITE_CHESTPLATE, "azurite_chestplate");
        translationBuilder.add(ModItems.AZURITE_LEGGINGS, "azurite_leggings");
        translationBuilder.add(ModItems.AZURITE_BOOTS, "azurite_boots");

        translationBuilder.add("itemGroup.azurite_group", "Azurite Group");
    }
}
