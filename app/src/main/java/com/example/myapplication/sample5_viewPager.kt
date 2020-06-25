package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter
import kotlinx.android.synthetic.main.activity_sample5_view_pager.*
import kotlinx.android.synthetic.main.activity_sample5_view_pager.view.*

class sample5_viewPager : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sample5_view_pager)


        //sample4 Fragment를 불러와서 사용
        val fragmentOne = sample4fragment()
        val adapters = pagerAdapter(supportFragmentManager)
        //넣어주고
        adapters.addItems(fragmentOne)
        //adapter에 연동시켜줌
        viewPager.adapter = adapters
        //탭 레이아웃에도 연동시켜줌
        tabLayout.setupWithViewPager(viewPager)
        //Tab의 0번째 인덱스를 가져와서 aa 라는 이름을 지어줌
        tabLayout.getTabAt(0)?.setText("aa")
        //응용해서 setCostomView로 할수 있음




    }
    //PagerAdapter 구현
    //fragment를 하나씩 리스트에 넣어줌.
    private inner class pagerAdapter(fragmentmanager :FragmentManager):FragmentStatePagerAdapter(fragmentmanager) {
       private val fragments : ArrayList<Fragment> = ArrayList()
        override fun getItem(position: Int): Fragment {
            return fragments[position]
        }

        override fun getCount(): Int {
            return fragments.size
        }
        fun addItems(item:Fragment){
            fragments.add(item)
        }
    }

}
