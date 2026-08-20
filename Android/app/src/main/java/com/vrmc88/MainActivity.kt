package com.vrmc88

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val remoteCard = findViewById<android.view.View>(R.id.remoteCard)
        remoteCard?.setOnClickListener {
            val intent = Intent(this, RemoteControlActivity::class.java)
            startActivity(intent)
        }
    }
}
