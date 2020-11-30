package com.example.haivaiapp.ViewPage


import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter
import com.example.haivaiapp.FavouriteFragment
import com.example.haivaiapp.SettingFragment
import com.example.haivaiapp.Home.HomeFragment


class ViewpagerAdapter(fm: FragmentManager, behavior: Int) :
    FragmentStatePagerAdapter(fm, behavior) {
    override fun getCount(): Int {
        return 3
    }

    override fun getItem(position: Int): Fragment {
        return when (position) {
            0 -> HomeFragment()
            1 -> FavouriteFragment()
            else -> SettingFragment()
        }
    }
}