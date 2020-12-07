package com.example.haivaiapp.introduceApp

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter


class IntroduceAdapter(fragment: FragmentManager) : FragmentStatePagerAdapter(fragment) {
    override fun getItem(position: Int): Fragment {
        return when (position) {
            0 -> Introduce1()
            1 -> Introduce2()
            else -> Introduce3()
        }
    }
    override fun getCount() = 3
}