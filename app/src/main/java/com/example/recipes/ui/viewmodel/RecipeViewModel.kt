package com.example.recipes.ui.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.recipes.data.repository.RecipesRepo
import com.example.recipes.models.RecipesDto
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class RecipeViewModel @Inject constructor(
    private val recipesRepo: RecipesRepo
) : ViewModel() {

    private val _state = MutableStateFlow(emptyList<RecipesDto>())
    val state: StateFlow<List<RecipesDto>>
        get() = _state


    init {

        viewModelScope.launch {
            val recipes = recipesRepo.getRecipes()
            _state.value = recipes
        }


    }


}