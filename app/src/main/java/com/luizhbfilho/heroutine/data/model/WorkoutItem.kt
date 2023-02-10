package com.luizhbfilho.heroutine.data.model

import com.google.firebase.Timestamp

data class WorkoutItem(
    val id: String? = null,
    var name: String? = null,
    var description: String? = null,
    var isCompleted: Boolean? = null,
    var dueDate: Timestamp? = null,
    var exercises: MutableList<ExerciseItem>? = null
)
