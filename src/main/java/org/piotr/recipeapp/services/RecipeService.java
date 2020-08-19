package org.piotr.recipeapp.services;

import org.piotr.recipeapp.domain.Recipe;

import java.util.Set;

public interface RecipeService {

    Set<Recipe> getRecipes();
}
