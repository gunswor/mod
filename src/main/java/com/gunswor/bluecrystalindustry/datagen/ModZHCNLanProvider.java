package com.gunswor.bluecrystalindustry.datagen;

import com.gunswor.bluecrystalindustry.block.ModBlocks;
import com.gunswor.bluecrystalindustry.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ModZHCNLanProvider extends FabricLanguageProvider {
    public ModZHCNLanProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, "zh_cn", registryLookup);
    }

    @Override
    public void generateTranslations(RegistryWrapper.WrapperLookup wrapperLookup, TranslationBuilder translationBuilder) {
        translationBuilder.add(ModItems.AZURITE, "蓝晶");

        translationBuilder.add(ModBlocks.AZURITE_BLOCK, "蓝晶块");
        translationBuilder.add(ModBlocks.AZURITE_ORE, "蓝晶矿石");
        translationBuilder.add(ModBlocks.DEEPSLATE_AZURITE_ORE, "深层蓝晶矿石");

        translationBuilder.add(ModItems.AZURITE_SWORD, "蓝晶剑");
        translationBuilder.add(ModItems.AZURITE_SHOVEL, "蓝晶锹");
        translationBuilder.add(ModItems.AZURITE_PICKAXE, "蓝晶镐");
        translationBuilder.add(ModItems.AZURITE_AXE, "蓝晶斧");
        translationBuilder.add(ModItems.AZURITE_HOE, "蓝晶锄");

        translationBuilder.add(ModItems.AZURITE_HELMET, "蓝晶头盔");
        translationBuilder.add(ModItems.AZURITE_CHESTPLATE, "蓝晶胸甲");
        translationBuilder.add(ModItems.AZURITE_LEGGINGS, "蓝晶护腿");
        translationBuilder.add(ModItems.AZURITE_BOOTS, "蓝晶靴子");


        translationBuilder.add("itemGroup.azurite_group", "蓝晶模组");
    }
}
