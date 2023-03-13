package com.luizhbfilho.heroutine.core.data.repository

import com.luizhbfilho.heroutine.core.data.model.WorkoutItem

interface WorkoutFirestoreRepository {
    suspend fun fetchWorkoutOfTheDay(dayOfWeek: Int): WorkoutItem

    suspend fun fetchAllWorkouts(): List<WorkoutItem>

    suspend fun saveWorkout(workout: WorkoutItem)

    suspend fun deleteWorkout(workout: WorkoutItem)
}