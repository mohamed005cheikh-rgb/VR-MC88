package com.vrmc88

import android.os.Bundle
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity

class RemoteControlActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_remote_control)

        val backButton = findViewById<ImageButton>(R.id.backButton)
        backButton?.setOnClickListener {
            finish()
        }
    }
}

