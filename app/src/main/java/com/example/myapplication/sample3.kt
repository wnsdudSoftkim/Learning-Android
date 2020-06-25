package com.example.myapplication

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_sample3.*

class sample3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sample3)
        //intent 로 받은 데이터를 getStringExtra 로 받아줌
        //그리고 setText를 통해 text를 바꿔줌
        val getintent = intent.getStringExtra("aa")
        text_sample3.setText(getintent)
        
        //여기는 startactivityforREsult 예제
        val exintent = Intent()
        exintent.putExtra("result","hi")
        setResult(Activity.RESULT_OK,exintent)
        finish()
    }

}