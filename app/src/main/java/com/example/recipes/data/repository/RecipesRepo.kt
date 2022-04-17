package com.example.recipes.data.repository

import com.example.recipes.data.api.RecipesApi
import com.example.recipes.models.RecipesDto
import javax.inject.Inject

class RecipesRepo @Inject constructor(
    private val recipesApi: RecipesApi
) {
    suspend fun getRecipes(): List<RecipesDto> {
        return recipesApi.getRecipe()
    }
}