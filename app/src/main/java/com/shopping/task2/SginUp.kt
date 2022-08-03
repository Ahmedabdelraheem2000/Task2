package com.shopping.task2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.shopping.task2.databinding.ActivitySginUpBinding

class SginUp : AppCompatActivity() {
    lateinit var binding: ActivitySginUpBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivitySginUpBinding.inflate(layoutInflater)
        var view=binding.root
        setContentView(view)
        binding.btnRegister.setOnClickListener {
            initview()

        }
        binding.btnSignin.setOnClickListener {
            startActivity(Intent(this,SginUp::class.java))

        }
    }
    public fun initview(){
        var frist_name:String=binding.ftName.text.toString()
        var last_name:String=binding.ltName.text.toString()
        var phone_number:String=binding.phonenumber.text.toString()
        var Email:String=binding.email.text.toString()
        var Password:String=binding.password.text.toString()


        if (frist_name.isEmpty()){
            binding.ftName.setError(" Empty!")
            return
        }
        if (last_name.isEmpty()){
            binding.ltName.setError(" Empty!")
            return
        }
        if (phone_number.isEmpty()){
            binding.phonenumber.setError(" Empty!")
            return
        }

        if (frist_name.length<10){
            binding.ftName.setError(" Wrong!")
            return
        }
        if (last_name.length<10){
            binding.ltName.setError(" Empty!")
            return
        }
        if (phone_number.length<10){
            binding.password.setError(" Empty!")
            return
        }

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
            Toast.makeText(this,"Successful Register", Toast.LENGTH_SHORT).show()
            startActivity(Intent(this,SignIn::class.java))
        }
    }
}