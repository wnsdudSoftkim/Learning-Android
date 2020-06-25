package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.activity_sample4fragment.*

class sample4fragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,// 나의 뷰를 가져오는 것.
        container: ViewGroup?, // 부모 뷰 라고 생각
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.activity_sample4fragment,container,false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        //Fragment 안에 ViewPager 넣어줌.
        val fragmenttwo = sample4fragmenttwo()
        val adapters = pagerAdapter(fragmentManager!!)
        adapters.addItems(fragmenttwo)
        viewPager2.adapter =adapters
        tabLayout2.setupWithViewPager(viewPager2)
        tabLayout2.getTabAt(0)?.setText("안녕하세뎡")
    }
}