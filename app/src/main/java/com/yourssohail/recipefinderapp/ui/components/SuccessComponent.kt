package com.yourssohail.recipefinderapp.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.yourssohail.recipefinderapp.data.model.Meal
import com.yourssohail.recipefinderapp.ui.theme.Pink80

@Composable
fun SuccessComponent(recipes: List<Meal>, onSearchClicked: (query: String) -> Unit) {
    Column(modifier = Modifier
        .background(Pink80)) {
        Text(
            text = "Start your Meal with us ",
            fontWeight = FontWeight(900),
            fontFamily = FontFamily.Cursive,
            fontSize = 32.sp,
            modifier = Modifier.padding(8.dp).background(Pink80)
        )
        SearchComponent(onSearchClicked = onSearchClicked)
        RecipesList(recipes = recipes)
    }
}