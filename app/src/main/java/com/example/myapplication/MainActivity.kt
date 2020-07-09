package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //  val btnlogin : Button = findViewById(R.id.btn_login)
        btn_login.setOnClickListener {
            btn_login.setText("준영")
           val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)

        }


        val intents = Intent(this,sample5_1_customtab::class.java)
        intents.putExtra("jun",10)
        startActivity(intents)

    }

}
