package com.luizhbfilho.heroutine.core.data.repository

import com.google.firebase.auth.FirebaseUser
import com.luizhbfilho.heroutine.core.data.Resource

class AuthRepositoryImpl: AuthRepository {
    override val currentUser: FirebaseUser?
        get() = TODO("Not yet implemented")

    override suspend fun signIn(email: String, password: String): Resource<FirebaseUser> {
        TODO("Not yet implemented")
    }

    override suspend fun signUp(
        username: String,
        email: String,
        password: String
    ): Resource<FirebaseUser> {
        TODO("Not yet implemented")
    }

    override fun logout() {
        TODO("Not yet implemented")
    }
}