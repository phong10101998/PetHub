package com.example.haivaiapp

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.example.haivaiapp.introduceApp.IntroduceApp

class SplashScreenActivity : AppCompatActivity() {
    var check: Boolean = false
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)
        val sharedPreferences = this.getSharedPreferences("change1", Context.MODE_PRIVATE)
        check = sharedPreferences.getBoolean("change2", false)
        Handler().postDelayed({
            if (!check) {
                val i = Intent(this, IntroduceApp::class.java)
                startActivity(i)
                finish()
                sharedPreferences.getBoolean("change2", true)
            } else {
                val intent: Intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
                finish()
            }
        }, 1500)
    }

}