package com.luizhbfilho.heroutine.core.data.model

data class ExerciseItem(
    val id: String? = "",
    val userId: String? = "",
    val name: String? = "",
    var numberOfSeries: Int? = 0,
    var numberOfRepetitions: Int? = 0,
)
