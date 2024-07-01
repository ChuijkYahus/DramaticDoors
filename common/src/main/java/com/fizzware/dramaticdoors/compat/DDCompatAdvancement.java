package com.fizzware.dramaticdoors.compat;

import java.util.ArrayList;
import java.util.List;

import com.fizzware.dramaticdoors.DramaticDoors;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

import net.minecraft.resources.ResourceLocation;

public class DDCompatAdvancement
{
	// The list of recipe advancements that will be filled out.
	public static List<JsonObject> RECIPE_ADVANCEMENTS = new ArrayList<JsonObject>();
	
    public static void createRecipeAdvancement(String recipeName, ResourceLocation triggeringItem) {
        //Creating a new json object, where we will store our recipe advancements.
        JsonObject json = new JsonObject();
        json.addProperty("parent", "dramaticdoors:recipe/root");
        
        //Create the criteria.
        JsonObject jsonCriteria = new JsonObject();
        
        JsonObject jsonHasRecipe = new JsonObject();
        jsonHasRecipe.addProperty("trigger", "minecraft:recipe_unlocked");
        JsonObject jsonHasRecipeCondition = new JsonObject();
        jsonHasRecipeCondition.addProperty("recipe", DramaticDoors.MOD_ID + ":" + recipeName);
        jsonHasRecipe.add("conditions", jsonHasRecipeCondition);
        
        JsonObject jsonHasItems = new JsonObject();
        jsonHasItems.addProperty("trigger", "minecraft:inventory_changed");
        JsonObject jsonHasItemsCondition = new JsonObject();
        JsonArray jsonHasItemsList = new JsonArray();
        JsonObject jsonHasItemsListEntry = new JsonObject();
        JsonArray jsonHasItemsListEntryArray = new JsonArray();
        jsonHasItemsListEntryArray.add(triggeringItem.toString());
        jsonHasItemsListEntry.add("items", jsonHasItemsListEntryArray);
        jsonHasItemsList.add(jsonHasItemsListEntry);
        jsonHasItemsCondition.add("items", jsonHasItemsList);
        jsonHasItems.add("conditions", jsonHasItemsCondition);
        		
        jsonCriteria.add("has_the_recipe", jsonHasRecipe);
        jsonCriteria.add("has_items", jsonHasItems);
        json.add("criteria", jsonCriteria);
 
        //Create the requirements.
        JsonArray jsonRequirements = new JsonArray();
        JsonArray jsonRequirementsInside = new JsonArray();
        jsonRequirementsInside.add("has_the_recipe");
        jsonRequirementsInside.add("has_items");
        jsonRequirements.add(jsonRequirementsInside);
        json.add("requirements", jsonRequirements);
        
        //Create the rewards.
        JsonObject jsonRewards = new JsonObject();
        JsonArray jsonRewardArray = new JsonArray();
        jsonRewardArray.add(DramaticDoors.MOD_ID + ":" + recipeName);
        jsonRewards.add("recipes", jsonRewardArray);
        json.add("rewards", jsonRewards);
 
        RECIPE_ADVANCEMENTS.add(json);
    }
}
