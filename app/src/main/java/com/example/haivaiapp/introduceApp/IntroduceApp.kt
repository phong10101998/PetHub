package com.example.haivaiapp.introduceApp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.viewpager.widget.ViewPager
import com.example.haivaiapp.MainActivity
import com.example.haivaiapp.R
import kotlinx.android.synthetic.main.activity_introduce_app.*

class IntroduceApp : AppCompatActivity() {
    var adapter = IntroduceAdapter(supportFragmentManager)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_introduce_app)
        imgGoToHome.bringToFront()
        imgGoToHome.setOnClickListener {
            val intent: Intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
        vp1.adapter = adapter
        vp1.addOnPageChangeListener(object : ViewPager.OnPageChangeListener {
            override fun onPageScrollStateChanged(state: Int) {}

            override fun onPageScrolled(
                position: Int,
                positionOffset: Float,
                positionOffsetPixels: Int
            ) {
            }

            override fun onPageSelected(position: Int) {
                if (position == 2) {
                    imgGoToHome.visibility = View.VISIBLE
                } else imgGoToHome.visibility = View.INVISIBLE
            }


        })
    }
}