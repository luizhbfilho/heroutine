package com.luizhbfilho.heroutine.data.repository

import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase
import com.luizhbfilho.heroutine.core.model.WorkoutItem

class WorkoutFirestoreRepository: WorkoutRepository {

    private val database = Firebase.firestore
    override suspend fun fetchWorkoutOfTheDay(dayOfWeek: Int): WorkoutItem {
        TODO("Not yet implemented")
    }

    override suspend fun fetchAllWorkouts(): List<WorkoutItem> {
        TODO("Not yet implemented")
    }

    override suspend fun saveWorkout(workout: WorkoutItem) {
        TODO("Not yet implemented")
    }

    override suspend fun deleteWorkout(workout: WorkoutItem) {
        TODO("Not yet implemented")
    }
}