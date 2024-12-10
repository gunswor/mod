package com.gunswor.bluecrystalindustry.datagen;

import com.gunswor.bluecrystalindustry.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagsProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagsProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.AZURITE_BLOCK)
                .add(ModBlocks.AZURITE_ORE)
                .add(ModBlocks.DEEPSLATE_AZURITE_ORE);

        getOrCreateTagBuilder(BlockTags.NEEDS_DIAMOND_TOOL)
                .add(ModBlocks.AZURITE_BLOCK)
                .add(ModBlocks.AZURITE_ORE)
                .add(ModBlocks.DEEPSLATE_AZURITE_ORE);
    }
}
