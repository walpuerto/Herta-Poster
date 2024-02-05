package com.example.test

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.LinearLayout
import androidx.core.view.setMargins

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val hertaButton = findViewById<ImageButton>(R.id.imageButton)

        hertaButton.setOnClickListener {
            val hertaImage = findViewById<ImageView>(R.id.imageView2)
            hertaImage.x = 10F

        }
    }
}