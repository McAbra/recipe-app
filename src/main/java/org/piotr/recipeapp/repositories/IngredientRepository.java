package org.piotr.recipeapp.repositories;

import org.piotr.recipeapp.domain.Ingredient;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface IngredientRepository extends CrudRepository<Ingredient, Long> {

    Optional<Ingredient> findByDescription(String description);
}
