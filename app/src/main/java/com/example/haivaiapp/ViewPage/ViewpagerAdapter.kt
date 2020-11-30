package com.example.haivaiapp.ViewPage


import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter
import com.example.haivaiapp.SearchFragment
import com.example.haivaiapp.SettingFragment
import com.example.haivaiapp.Home.HomeFragment
import com.example.haivaiapp.Profile.ProfileFragment


class ViewpagerAdapter(fm: FragmentManager, behavior: Int) :
    FragmentStatePagerAdapter(fm, behavior) {
    override fun getCount(): Int {
        return 4
    }

    override fun getItem(position: Int): Fragment {
        return when (position) {
            0 -> HomeFragment()
            1 -> SearchFragment()
            2-> ProfileFragment()
            else -> SettingFragment()
        }
    }
}