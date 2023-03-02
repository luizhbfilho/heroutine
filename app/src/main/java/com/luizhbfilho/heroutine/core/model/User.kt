package com.luizhbfilho.heroutine.core.model

import com.google.firebase.Timestamp

data class User(
    val uid: String? = null,
    val username: String? = null,
    val email: String? = null,
    var isAuthenticated: Boolean? = false
    val dateOfBirth: Timestamp? = null
) {
}