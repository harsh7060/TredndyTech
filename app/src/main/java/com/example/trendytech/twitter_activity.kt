package com.example.trendytech

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class twitter_activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_twitter)

        val btn = findViewById<Button>(R.id.x_btn)

        btn.setOnClickListener{
            intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://twitter.com/i/flow/login")
            startActivity(intent)
        }
    }
}