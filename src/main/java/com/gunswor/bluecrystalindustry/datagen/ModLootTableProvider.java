package com.gunswor.bluecrystalindustry.datagen;

import com.gunswor.bluecrystalindustry.block.ModBlocks;
import com.gunswor.bluecrystalindustry.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.AZURITE_BLOCK);
        addDrop(ModBlocks.AZURITE_ORE, oreDrops(ModBlocks.AZURITE_ORE, ModItems.AZURITE));
        addDrop(ModBlocks.DEEPSLATE_AZURITE_ORE, oreDrops(ModBlocks.DEEPSLATE_AZURITE_ORE, ModItems.AZURITE));
    }
}
