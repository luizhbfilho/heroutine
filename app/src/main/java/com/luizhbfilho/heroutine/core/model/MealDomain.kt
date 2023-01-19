package com.luizhbfilho.heroutine.core.model

data class MealDomain(
    val name: String = "",
    val foods: MutableList<FoodDomain>?
) {
}