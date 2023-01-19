package com.luizhbfilho.heroutine.core.model

data class UserDomain(
    val id: Int,
    val name: String = "",
    val email: String = "",
    val training: MutableList<TrainingDomain>?,
    val meals: MutableList<MealDomain>?
) {
}