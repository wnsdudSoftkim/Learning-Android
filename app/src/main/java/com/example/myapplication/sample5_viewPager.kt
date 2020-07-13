package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter
import kotlinx.android.synthetic.main.activity_sample4.*
import kotlinx.android.synthetic.main.activity_sample5_view_pager.*
import kotlinx.android.synthetic.main.activity_sample5_view_pager.view.*


class sample5_viewPager : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sample5_view_pager)
        val fragmentOne = sample4fragment()
    }
}

class pagerAdapter(fragmentmanager : FragmentManager):FragmentStatePagerAdapter(fragmentmanager) {
    val list :ArrayList<Fragment> = ArrayList()
    override fun getItem(position: Int): Fragment {
        return list[position]
    }

    override fun getCount(): Int {
        return list.size
    }
    fun addItems(item:Fragment){
        list.add(item)
    }
}

