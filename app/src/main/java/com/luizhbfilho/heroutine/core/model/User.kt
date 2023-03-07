package com.luizhbfilho.heroutine.core.model

import com.google.firebase.Timestamp
import com.google.firebase.auth.FirebaseUser

data class User(
    val uid: String? = null,
    val username: String? = null,
    val email: String? = null,
    var isAuthenticated: Boolean? = false,
    val dateOfBirth: Timestamp? = null
) {
    constructor(firebaseUser: FirebaseUser) : this(
        uid = firebaseUser.uid,
        email = firebaseUser.email,
        username = null,
        isAuthenticated = firebaseUser.isEmailVerified
    )

    fun topMap(): Map<String, Any?> {
        return mapOf(
        "uid" to uid,
        "username" to (username ?: ""),
        "email" to (email ?: ""),
        "isAuthenticated" to isAuthenticated)
    }
}