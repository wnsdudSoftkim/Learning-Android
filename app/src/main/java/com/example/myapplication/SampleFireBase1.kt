package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.google.firebase.FirebaseAppLifecycleListener
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseUser
import kotlinx.android.synthetic.main.activity_sample_fire_base1.*

class SampleFireBase1 : AppCompatActivity() {
    private lateinit var auth: FirebaseAuth
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sample_fire_base1)

    }

    fun onClick() {
        auth.createUserWithEmailAndPassword(edit_email.text.toString(), edit_password.text.toString())
            .addOnCompleteListener(this) {task ->
                val user = auth.currentUser
                updateUI(user)
            }
    }
    fun updateUI(account: FirebaseUser?) {
        if (account != null) {
            Toast.makeText(this, "홈 화면으로 이동합니다.", Toast.LENGTH_LONG).show()
            startActivity(Intent(this, Home::class.java))
        } else {
            Toast.makeText(this, "실패했당", Toast.LENGTH_SHORT).show()
        }
    }
}