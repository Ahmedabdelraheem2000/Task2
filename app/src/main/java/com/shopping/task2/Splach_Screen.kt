package com.shopping.task2

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class Splach_Screen : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.splaash_screen)
        CoroutineScope(Dispatchers.IO).launch {
            delay(2000)
            startActivity(Intent(this@Splach_Screen,SignIn::class.java))
        }
    }
}