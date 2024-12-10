package com.gunswor.bluecrystalindustry.datagen;

import com.gunswor.bluecrystalindustry.block.ModBlocks;
import com.gunswor.bluecrystalindustry.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.minecraft.item.ArmorItem;

public class ModModelsProvider extends FabricModelProvider {

    public ModModelsProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.AZURITE_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.AZURITE_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DEEPSLATE_AZURITE_ORE);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.AZURITE, Models.GENERATED);

        itemModelGenerator.register(ModItems.AZURITE_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.AZURITE_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.AZURITE_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.AZURITE_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.AZURITE_HOE, Models.HANDHELD);

        itemModelGenerator.registerArmor((ArmorItem) ModItems.AZURITE_HELMET);
        itemModelGenerator.registerArmor((ArmorItem) ModItems.AZURITE_CHESTPLATE);
        itemModelGenerator.registerArmor((ArmorItem) ModItems.AZURITE_LEGGINGS);
        itemModelGenerator.registerArmor((ArmorItem) ModItems.AZURITE_BOOTS);
    }
}
