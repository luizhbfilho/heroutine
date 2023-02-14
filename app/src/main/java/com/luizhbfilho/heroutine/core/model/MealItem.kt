package com.luizhbfilho.heroutine.core.model

import java.sql.Timestamp

data class MealItem(
    val id: String? = null,
    var name: String? = null,
    var description: String? = null,
    var isCompleted: Boolean? = null,
    var dueDate: Timestamp? = null,
    var foods: MutableList<FoodItem>? = null,
)
