package com.example.spring5recipeapp.services;

import com.example.spring5recipeapp.models.Recipe;

import java.util.Set;

public interface RecipeService {
    Set<Recipe> getRecipes();
}
