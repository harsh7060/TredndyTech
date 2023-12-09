package com.example.trendytech

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val android_card = findViewById<CardView>(R.id.android_card)

        val ai_card = findViewById<CardView>(R.id.ai_card)

        val ios_card = findViewById<CardView>(R.id.ios_card)

        val yt_card = findViewById<CardView>(R.id.yt_card)

        val linkdin_card = findViewById<CardView>(R.id.linkdin_card)

        val bt_card = findViewById<CardView>(R.id.bitcoin_card)

        val web_card = findViewById<CardView>(R.id.web3_card)

        val twit_card = findViewById<CardView>(R.id.twitter_card)

        val call_card = findViewById<CardView>(R.id.call_card)

        val ig_card = findViewById<CardView>(R.id.ig_card)

        val x_card = findViewById<CardView>(R.id.x_card)

        val github_card = findViewById<CardView>(R.id.github_card)

        val lin_card = findViewById<CardView>(R.id.lin_card)



        android_card.setOnClickListener {
            intent = Intent(applicationContext,android_activity::class.java)
            startActivity(intent)
        }

        ai_card.setOnClickListener {
            intent = Intent(applicationContext,ai_activity::class.java)
            startActivity(intent)
        }

        ios_card.setOnClickListener {
            intent = Intent(applicationContext,ios_activity::class.java)
            startActivity(intent)
        }

        yt_card.setOnClickListener {
            intent = Intent(applicationContext,yt_activity::class.java)
            startActivity(intent)
        }

        linkdin_card.setOnClickListener {
            intent = Intent(applicationContext,linkdin_activity::class.java)
            startActivity(intent)
        }

        bt_card.setOnClickListener {
            intent = Intent(applicationContext,bt_activity::class.java)
            startActivity(intent)
        }

        web_card.setOnClickListener {
            intent = Intent(applicationContext,web3_activity::class.java)
            startActivity(intent)
        }

        twit_card.setOnClickListener {
            intent = Intent(applicationContext,twitter_activity::class.java)
            startActivity(intent)
        }

        call_card.setOnClickListener {
            intent = Intent(Intent.ACTION_DIAL)
            intent.data = Uri.parse("tel:"+"+918630494035")
            startActivity(intent)
        }

        ig_card.setOnClickListener {
            intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://www.instagram.com/its_harsh__24/?igshid=NGVhN2U2NjQ0Yg%3D%3D")
            startActivity(intent)
        }

        x_card.setOnClickListener {
            intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://twitter.com/HarshMi78138121?t=CyWuda3ptFbIea9-kB_CtA&s=09")
            startActivity(intent)
        }

        github_card.setOnClickListener {
            intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://github.com/harsh7060")
            startActivity(intent)
        }

        lin_card.setOnClickListener {
            intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://www.linkedin.com/in/harsh-mishra-7a3424253/")
            startActivity(intent)
        }

    }
}