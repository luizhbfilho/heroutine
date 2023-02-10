package com.luizhbfilho.heroutine.data.repository

import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase

class WorkoutFirestoreRepository: WorkoutRepository {

    private val database = Firebase.firestore
}