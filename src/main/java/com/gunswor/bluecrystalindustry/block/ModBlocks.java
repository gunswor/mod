package com.gunswor.bluecrystalindustry.block;

import com.gunswor.bluecrystalindustry.BlueCrystalIndustry;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {
    public static final Block AZURITE_BLOCK = register("azurite_block", new Block(AbstractBlock.Settings.create().strength(3.0f, 3.0f)));
    public static final Block AZURITE_ORE = register("azurite_ore", new Block(AbstractBlock.Settings.create().strength(4.5f, 6.0f)));
    public static final Block DEEPSLATE_AZURITE_ORE = register("deepslate_azurite_ore", new Block(AbstractBlock.Settings.create().strength(6.0f, 7.5f)));
    public static void registerBlockItems(String id, Block block) {
        Item item = Registry.register(Registries.ITEM, Identifier.of(BlueCrystalIndustry.MOD_ID, id), new BlockItem(block, new Item.Settings()));
        if (item instanceof BlockItem) {
            ((BlockItem)item).appendBlocks(Item.BLOCK_ITEMS, item);
        }
    }
    public static Block register(String id, Block block) {
        registerBlockItems(id, block);
        return Registry.register(Registries.BLOCK, Identifier.of(BlueCrystalIndustry.MOD_ID, id), block);
    }
    public static void registerModBlocks() {
        BlueCrystalIndustry.LOGGER.info("Registering Blocks");
    }
}