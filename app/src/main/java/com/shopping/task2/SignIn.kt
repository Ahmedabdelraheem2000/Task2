package com.shopping.task2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.shopping.task2.databinding.SigninBinding

class SignIn : AppCompatActivity() {
    lateinit var binding: SigninBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=SigninBinding.inflate(layoutInflater)
        var view=binding.root
        setContentView(view)
        binding.btnSignin.setOnClickListener {
            initview()

        }
        binding.btnSignup.setOnClickListener {
            startActivity(Intent(this,SginUp::class.java))
        }
    }
    public fun initview(){
        var Email:String=binding.email.text.toString()
        var Password:String=binding.password.text.toString()
        if (Email.isEmpty()){
            binding.email.setError("Email is Empty!")
            return
        }
        if (Password.isEmpty()){
            binding.password.setError("Password is Empty!")
            return
        }
        if (Email.length<10){
            binding.email.setError("Email is Wrong!")
            return
        }
        if (Password.length<10){
            binding.password.setError("Password is Empty!")
            return
        }
        else{
            Toast.makeText(this,"Welcome Back ",Toast.LENGTH_SHORT).show()
            startActivity(Intent(this,Home::class.java))

        }
    }
}