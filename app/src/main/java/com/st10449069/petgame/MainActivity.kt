package com.st10449069.petgame

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    var etAppName: EditText? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val etBunny = findViewById<EditText>(R.id.etAppName)
        val imageView = findViewById<ImageView>(R.id.etBunny)
        val btnNextScreen = findViewById<Button>(R.id.btnNextScreen)
        btnNextScreen.setOnClickListener {
            // call the next screen
            val intent = Intent(this, MainActivity2::class.java)
            //start your next activity
            startActivity(intent)

        }

    }
}