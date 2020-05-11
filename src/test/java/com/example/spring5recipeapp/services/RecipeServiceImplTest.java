package com.example.spring5recipeapp.services;

import com.example.spring5recipeapp.models.Recipe;
import com.example.spring5recipeapp.repositories.RecipeRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.HashSet;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.BDDMockito.then;
import static org.mockito.Mockito.*;

class RecipeServiceImplTest {
    RecipeServiceImpl recipeService;

    @Mock
    RecipeRepository recipeRepository;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
        recipeService = new RecipeServiceImpl(recipeRepository);
    }

    @Test
    void getRecipes() {
        HashSet recipes = new HashSet();
        recipes.add(new Recipe());
        when(recipeRepository.findAll()).thenReturn(recipes);
        assertEquals(recipeService.getRecipes().size(),1);
        verify(recipeRepository,times(1) ).findAll();
    }
}