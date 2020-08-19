package org.piotr.recipeapp.services;

import ch.qos.logback.core.BasicStatusManager;
import org.piotr.recipeapp.domain.Recipe;
import org.piotr.recipeapp.repositories.RecipeRepository;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class RecipeServiceImpl implements RecipeService{

    private final RecipeRepository recipeRepository;

    public RecipeServiceImpl(RecipeRepository recipeRepository) {
        this.recipeRepository = recipeRepository;
    }

    public Set<Recipe> getRecipes() {
        Set<Recipe> recipes = new HashSet<>();
        recipeRepository.findAll().forEach(recipes::add);
        return recipes;
    }

}
