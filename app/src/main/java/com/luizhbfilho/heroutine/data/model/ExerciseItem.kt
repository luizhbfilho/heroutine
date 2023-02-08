package com.luizhbfilho.heroutine.data.model

data class ExerciseItem(
    val id: String? = null,
    val name: String? = null,
    var description: String? = null,
    var numberOfSeries: Int? = 0,
    var numberOfRepetitions: Int? = 0,
)
