package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_sample5_1_customtab.*
import kotlinx.android.synthetic.main.custom_tab.view.*

class sample5_1_customtab : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sample5_1_customtab)
        initView()

    }
    //여기서 반환값을 View를 명시해줌.
    fun createView(tabName:String): View {
        val tabView  = LayoutInflater.from(this).inflate(R.layout.custom_tab,null)
        tabView.text_custom.text = tabName
        when(tabName) {
            "홈" -> {
                tabView.image_custom.setImageResource(R.drawable.ic_baseline_home_24)
            }
            "정보" -> {
                tabView.image_custom.setImageResource(R.drawable.ic_baseline_person_24)
            }
            else -> {
                return tabView
            }
        }
        return tabView
    }
    fun initView() {
        val fragment1 = sample4fragment()
        val fragment2 = sample4fragmenttwo()
        val adapter = pagerAdapter(supportFragmentManager)
        adapter.addItems(fragment1)
        adapter.addItems(fragment2)
        viewPager3.adapter = adapter
        tabLayout3.setupWithViewPager(viewPager3)
        tabLayout3.getTabAt(0)?.setCustomView(createView("홈"))
        tabLayout3.getTabAt(1)?.setCustomView(createView("정보"))
    }

}


