package net.darkstudios.dungeons.datagen;

import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

public class DDRecipeProvider extends RecipeProvider implements IConditionBuilder {
    public DDRecipeProvider(DataGenerator pGenerator) {
        super(pGenerator);
    }
}
