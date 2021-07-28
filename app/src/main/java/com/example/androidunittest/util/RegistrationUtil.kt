package com.example.androidunittest.util

object RegistrationUtil {

    /**
     * 1. username not null
     * 2. password not null
     * 3. confirmPassword not null
     * 4. confirmPassword and password must be the same
     * 5. user doesn't exist in the database
     *
     **/

    val users = ArrayList<String>(
        listOf<String>(
            "Paulo",
            "Mohaa",
            "Chacha"
        )
    )

    fun validateUser(
        userName:String,
        password:String,
        confirmPassword:String
    ):Boolean {

        if(userName.isNullOrBlank()){
            return false
        }
        if(password.isNullOrBlank()){
            return false
        }
        if(confirmPassword.isNullOrBlank()){
            return false
        }
        if(password != confirmPassword){
            return false
        }
        if(users.contains(userName)){
            return false
        }
        return true
    }
}