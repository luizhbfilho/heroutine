package com.luizhbfilho.heroutine.core.model

import com.google.type.DateTime
import java.util.Calendar

data class MealDomain(
    val name: String = "",
    var description: String = "",
    var isCompleted: Boolean = false,
    var dueDateTime: Calendar,
    val foods: MutableList<FoodDomain>?
) {
}