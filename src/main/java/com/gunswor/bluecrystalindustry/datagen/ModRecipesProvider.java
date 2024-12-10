package com.gunswor.bluecrystalindustry.datagen;

import com.gunswor.bluecrystalindustry.BlueCrystalIndustry;
import com.gunswor.bluecrystalindustry.block.ModBlocks;
import com.gunswor.bluecrystalindustry.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.RecipeProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.util.Identifier;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModRecipesProvider extends FabricRecipeProvider {
    private static final List<ItemConvertible> AZURITE = List.of(ModBlocks.AZURITE_ORE);
    public ModRecipesProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void generate(RecipeExporter exporter) {
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, ModItems.AZURITE,
                RecipeCategory.BUILDING_BLOCKS, ModBlocks.AZURITE_BLOCK);

        offerSmelting(exporter, AZURITE, RecipeCategory.MISC, ModItems.AZURITE,
                0.7f, 200, "azurite");
        offerBlasting(exporter, AZURITE, RecipeCategory.MISC, ModItems.AZURITE,
                0.7f, 100, "azurite");

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.AZURITE_HELMET, 1)
                .pattern("###")
                .pattern("# #")
                .input('#', Ingredient.ofItems(ModItems.AZURITE))
                .criterion("has_item", RecipeProvider.conditionsFromItem(ModItems.AZURITE))
                .offerTo(exporter, Identifier.of(BlueCrystalIndustry.MOD_ID, "azurite_to_azurite_helmet"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.AZURITE_CHESTPLATE, 1)
                .pattern("# #")
                .pattern("###")
                .pattern("###")
                .input('#', Ingredient.ofItems(ModItems.AZURITE))
                .criterion("has_item", RecipeProvider.conditionsFromItem(ModItems.AZURITE))
                .offerTo(exporter, Identifier.of(BlueCrystalIndustry.MOD_ID, "azurite_to_azurite_chestplate"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.AZURITE_LEGGINGS, 1)
                .pattern("###")
                .pattern("# #")
                .pattern("# #")
                .input('#', Ingredient.ofItems(ModItems.AZURITE))
                .criterion("has_item", RecipeProvider.conditionsFromItem(ModItems.AZURITE))
                .offerTo(exporter, Identifier.of(BlueCrystalIndustry.MOD_ID, "azurite_to_azurite_leggings"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.AZURITE_BOOTS, 1)
                .pattern("# #")
                .pattern("# #")
                .input('#', Ingredient.ofItems(ModItems.AZURITE))
                .criterion("has_item", RecipeProvider.conditionsFromItem(ModItems.AZURITE))
                .offerTo(exporter, Identifier.of(BlueCrystalIndustry.MOD_ID, "azurite_to_azurite_boots"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.AZURITE_SWORD, 1)
                .pattern(" # ")
                .pattern(" # ")
                .pattern(" * ")
                .input('#', Ingredient.ofItems(ModItems.AZURITE))
                .input('*', Ingredient.ofItems(Items.STICK))
                .criterion("has_item", RecipeProvider.conditionsFromItem(ModItems.AZURITE))
                .offerTo(exporter, Identifier.of(BlueCrystalIndustry.MOD_ID, "azurite_to_azurite_sword"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.AZURITE_SHOVEL, 1)
                .pattern(" # ")
                .pattern(" * ")
                .pattern(" * ")
                .input('#', Ingredient.ofItems(ModItems.AZURITE))
                .input('*', Ingredient.ofItems(Items.STICK))
                .criterion("has_item", RecipeProvider.conditionsFromItem(ModItems.AZURITE))
                .offerTo(exporter, Identifier.of(BlueCrystalIndustry.MOD_ID, "azurite_to_azurite_shovel"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.AZURITE_PICKAXE, 1)
                .pattern("###")
                .pattern(" * ")
                .pattern(" * ")
                .input('#', Ingredient.ofItems(ModItems.AZURITE))
                .input('*', Ingredient.ofItems(Items.STICK))
                .criterion("has_item", RecipeProvider.conditionsFromItem(ModItems.AZURITE))
                .offerTo(exporter, Identifier.of(BlueCrystalIndustry.MOD_ID, "azurite_to_azurite_pickaxe"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.AZURITE_AXE, 1)
                .pattern("## ")
                .pattern("#* ")
                .pattern(" * ")
                .input('#', Ingredient.ofItems(ModItems.AZURITE))
                .input('*', Ingredient.ofItems(Items.STICK))
                .criterion("has_item", RecipeProvider.conditionsFromItem(ModItems.AZURITE))
                .offerTo(exporter, Identifier.of(BlueCrystalIndustry.MOD_ID, "azurite_to_azurite_axe"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ModItems.AZURITE_HOE, 1)
                .pattern("## ")
                .pattern(" * ")
                .pattern(" * ")
                .input('#', Ingredient.ofItems(ModItems.AZURITE))
                .input('*', Ingredient.ofItems(Items.STICK))
                .criterion("has_item", RecipeProvider.conditionsFromItem(ModItems.AZURITE))
                .offerTo(exporter, Identifier.of(BlueCrystalIndustry.MOD_ID, "azurite_to_azurite_hoe"));
    }
}
