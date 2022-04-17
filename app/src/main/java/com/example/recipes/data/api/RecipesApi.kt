package com.example.recipes.data.api

import com.example.recipes.core.Constants
import com.example.recipes.models.RecipesDto
import retrofit2.http.GET

interface RecipesApi {

    @GET(Constants.END_POINTS)
    suspend fun getRecipe():List<RecipesDto>
}