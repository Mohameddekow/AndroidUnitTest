package com.example.androidunittest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.androidunittest.databinding.ActivityMainBinding
import com.example.androidunittest.util.RegistrationUtil

class MainActivity : AppCompatActivity() {
    lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

//users details
        val userName: String = binding.etUserNameRegister.text.toString()
        val password: String = binding.etPasswordRegister.text.toString()
        val confirmPassword: String = binding.etConfirmPasswordRegister.text.toString()

        val validateUser = RegistrationUtil.validateUser(userName, password, confirmPassword)



        binding.btnRegister.setOnClickListener {

            if (validateUser){
                Toast.makeText(this,"User registration successful", Toast.LENGTH_SHORT).show()
            }else{
                Toast.makeText(this,"User registration failed", Toast.LENGTH_SHORT).show()
            }

        }

    }
}