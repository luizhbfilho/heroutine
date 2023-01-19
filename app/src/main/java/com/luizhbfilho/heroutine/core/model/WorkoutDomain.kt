package com.luizhbfilho.heroutine.core.model

data class WorkoutDomain(
    var name: String = "",
    var exercises: MutableList<ExerciseDomain>,
    var dayOfWeek: Int = 0
) {
}