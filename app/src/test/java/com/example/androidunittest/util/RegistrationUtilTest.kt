package com.example.androidunittest.util


import com.google.common.truth.Truth.assertThat
import org.junit.Test

class RegistrationUtilTest{


    @Test
    fun `test Fails if UserName Is Null`(){
        val validateUser = RegistrationUtil.validateUser(
            "",
            "1234",
            "1234"
        )
        assertThat(validateUser).isFalse()
    }
    @Test
    fun `test Fails if password Is Null`(){
        val validateUser = RegistrationUtil.validateUser(
            "user",
            "",
            "1234"
        )
        assertThat(validateUser).isFalse()
    }
    @Test
    fun `test Fails if confirmPassword Is Null`(){
        val validateUser = RegistrationUtil.validateUser(
            "user",
            "1234",
            ""
        )
        assertThat(validateUser).isFalse()
    }
    @Test
    fun `test Fails if password and confirmedPassword are not same`(){
        val validateUser = RegistrationUtil.validateUser(
            "user",
            "wertyu",
            "1234"
        )
        assertThat(validateUser).isFalse()
    }
    @Test
    fun `test Fails if user does not exist`(){
        val validateUser = RegistrationUtil.validateUser(
            "user",
            "wertyu",
            "1234"
        )
        assertThat(validateUser).isFalse()
    }

}