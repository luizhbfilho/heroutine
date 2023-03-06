package com.luizhbfilho.heroutine.domain.usecases

import com.luizhbfilho.heroutine.core.model.WorkoutItem

interface GetAllWorkoutsUseCase {

    suspend operator fun invoke(): List<WorkoutItem>
}