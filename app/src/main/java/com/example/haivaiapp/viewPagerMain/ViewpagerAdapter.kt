package com.example.haivaiapp.viewPagerMain


import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter

import com.example.haivaiapp.search.SearchFragment
import com.example.haivaiapp.setting.SettingFragment
import com.example.haivaiapp.home.HomeFragment

import com.example.haivaiapp.profile.ProfileFragment


class ViewpagerAdapter(fm: FragmentManager, behavior: Int) :
    FragmentStatePagerAdapter(fm, behavior) {
    override fun getCount(): Int {
        return 4
    }

    override fun getItem(position: Int): Fragment {
        return when (position) {
            0 -> HomeFragment()
            1 -> SearchFragment()
            2 -> ProfileFragment()
            else -> SettingFragment()
        }
    }
}