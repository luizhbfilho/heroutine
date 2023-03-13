package com.luizhbfilho.heroutine.core.data.model

import java.sql.Timestamp

data class MealItem(
    val id: String? = "",
    val userId: String? = "",
    var name: String? = "",
    var description: String? = "",
    var isCompleted: Boolean? = false,
    var dueDate: Timestamp? = null,
    var foods: MutableList<FoodItem>? = null,
)
