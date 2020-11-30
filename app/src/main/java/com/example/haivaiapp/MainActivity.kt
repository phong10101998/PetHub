package com.example.haivaiapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.FragmentStatePagerAdapter
import androidx.viewpager.widget.ViewPager
import com.example.haivaiapp.ViewPage.ViewpagerAdapter
import com.google.android.material.bottomnavigation.BottomNavigationView
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {
    val saveToHistory : Boolean = true
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setUpViewPager()
        bottomNavigationView.setOnNavigationItemSelectedListener(BottomNavigationView.OnNavigationItemSelectedListener {
            when (it.itemId) {
                R.id.miHome -> {
                    //replaceFragment(HomeFragment(), R.id.homefr)
                    viewPager.currentItem = 0
                }
                R.id.miSearch -> {
                    viewPager.currentItem = 1
                }
                R.id.miProfile -> {
                    viewPager.currentItem = 2
                }
                R.id.miSettings -> {
                    viewPager.currentItem = 3
                }
            }
            false
        })
    }

    private fun setUpViewPager() {
        val adapter = ViewpagerAdapter(
            supportFragmentManager,
            FragmentStatePagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT
        )
        viewPager.adapter = adapter
        viewPager.addOnPageChangeListener(object : ViewPager.OnPageChangeListener {
            override fun onPageScrolled(
                position: Int,
                positionOffset: Float,
                positionOffsetPixels: Int
            ) {
            }

            override fun onPageSelected(position: Int) {
                bottomNavigationView.menu.getItem(position).isChecked = true



            }

            override fun onPageScrollStateChanged(state: Int) {

            }
        })
    }

}
