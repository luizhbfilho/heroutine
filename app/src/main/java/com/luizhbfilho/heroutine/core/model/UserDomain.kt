package com.luizhbfilho.heroutine.core.model

data class UserDomain(
    val id: Int,
    val name: String = "",
    val email: String = "",
    val workouts: MutableList<WorkoutDomain>?,
    val meals: MutableList<MealDomain>?
) {
}