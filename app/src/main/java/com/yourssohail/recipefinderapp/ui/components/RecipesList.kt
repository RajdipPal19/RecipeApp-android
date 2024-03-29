package com.yourssohail.recipefinderapp.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.yourssohail.recipefinderapp.data.model.Meal
import com.yourssohail.recipefinderapp.ui.theme.Pink80

@Composable
fun RecipesList(recipes: List<Meal>) {
    LazyColumn(
        modifier = Modifier.fillMaxSize().background(Pink80)
    ){
        items(recipes) {
            RecipeListItem(it)
        }
    }
}