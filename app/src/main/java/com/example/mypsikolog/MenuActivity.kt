package com.example.mypsikolog

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_menu.*

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)
        
        btnChat.setOnClickListener {
            val intent = Intent(this, MainChatActivity::class.java)
            startActivity(intent)
        }
    }
}