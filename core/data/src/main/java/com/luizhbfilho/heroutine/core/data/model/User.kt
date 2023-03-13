package com.luizhbfilho.heroutine.core.data.model

import com.google.firebase.Timestamp
import com.google.firebase.auth.FirebaseUser

data class User(
    var id: String? = "",
    val username: String? = "",
    val email: String? = "",
    var isAuthenticated: Boolean? = false,
) {
    constructor(firebaseUser: FirebaseUser) : this(
        id = firebaseUser.uid,
        email = firebaseUser.email,
        username = null,
        isAuthenticated = firebaseUser.isEmailVerified
    )

    fun topMap(): Map<String, Any?> {
        return mapOf(
        "uid" to id,
        "username" to (username ?: ""),
        "email" to (email ?: ""),
        "isAuthenticated" to isAuthenticated)
    }
}