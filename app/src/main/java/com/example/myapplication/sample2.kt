package com.example.myapplication

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.android.synthetic.main.activity_sample2.*

//로그인 페이지 startActivity 연습
//Intent는 쓸 일이 되게 많음.
class sample2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sample2)
        //첫번쨰 방법
//        val btnlogin :Button = findViewById(R.id.btn_login)
////        btnlogin.setOnClickListener {
////            startActivity(Intent(this,sample3::class.java))
                //val intent = Intent(this,sample::class.java))
        //              startActivity(intent)
////        }
        //두번째방법
        btn_login.setOnClickListener {
            sample2()
        }

    }
    //이부분은 데이터 전송
    fun sample2(){
        val intent = Intent(this,sample3::class.java)
        intent.putExtra("sample2","뭘봐")
        startActivity(intent)
    }

    //startactivityResult
    fun sample2_1() {
        val intent = Intent(this,sample3::class.java)
        startActivityForResult(intent,200)
    }
    //결과값 받는 부분.
    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if(requestCode==200) {
            if(resultCode== Activity.RESULT_OK){
                //여기서 내가 하고싶은 작업을 하면됨.
            }
        }
    }
}