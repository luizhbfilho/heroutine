package com.luizhbfilho.heroutine.core.usecases

import com.luizhbfilho.heroutine.core.model.WorkoutItem

interface GetAllWorkoutsUseCase {

    suspend operator fun invoke(): List<WorkoutItem>
}