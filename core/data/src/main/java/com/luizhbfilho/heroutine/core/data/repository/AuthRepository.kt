package com.luizhbfilho.heroutine.core.data.repository

import com.google.firebase.auth.FirebaseUser
import com.luizhbfilho.heroutine.core.data.Resource

interface AuthRepository {
    val currentUser: FirebaseUser?

    suspend fun signIn(email: String, password: String): Resource<FirebaseUser>

    suspend fun signUp(username: String, email: String, password: String): Resource<FirebaseUser>

    fun logout()
}