package com.example.recipes.models

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class RecipesDto(
    val name: String,
    val headline: String,
    val image: String
)
