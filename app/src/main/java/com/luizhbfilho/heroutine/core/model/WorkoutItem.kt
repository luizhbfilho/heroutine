package com.luizhbfilho.heroutine.core.model

import com.google.firebase.Timestamp

data class WorkoutItem(
    val id: String? = "",
    val userId: String? = "",
    var name: String? = "",
    var description: String? = "",
    var isCompleted: Boolean? = false,
    var dueDate: Timestamp? = null,
    var exercises: List<ExerciseItem>? = null
)
