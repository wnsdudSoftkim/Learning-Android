package com.example.myapplication

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter
// pageradapter 를 다른곳에도 쓰기위해 class를 따로 만들어줌.


class pagerAdapter(fragmentmanager : FragmentManager): FragmentStatePagerAdapter(fragmentmanager) {
    private val fragments : ArrayList<Fragment> = ArrayList()
    override fun getItem(position: Int): Fragment {
        return fragments[position]
    }

    override fun getCount(): Int {
        return fragments.size
    }
    fun addItems(item: Fragment){
        fragments.add(item)
    }
}