
package com.st10449069.petgame

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity2 : AppCompatActivity() {

    // Declare variables
    private var hungerLevel = 0
    private var cleanlinessLevel = 0
    private var happinessLevel = 0

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val btnFeed = findViewById<Button>(R.id.btnFeed)
        val btnClean = findViewById<Button>(R.id.btnPlay)
        val btnPlay = findViewById<Button>(R.id.btnPlay)

        btnFeed.setOnClickListener {
            feedPet()
        }

        btnClean.setOnClickListener {
            cleanPet()
        }

        btnPlay.setOnClickListener {
            playWithPet()
        }
    }

    private fun feedPet() {
        // Add logic to feed the pet
        hungerLevel -= 10 // Decrease hunger level by 3
        // Inside MainActivity2 class

            // Ensure hunger level doesn't go below 0
            if (hungerLevel < 0) {
                hungerLevel = 0
            }
        updatePetStatus()
        // go to next screen to feed
        val intent = Intent(this, MainActivity3::class.java)
        //start your next activity
        startActivity(intent)
    }

    private fun cleanPet() {
        // Add logic to clean the pet
        cleanlinessLevel += 10
        updatePetStatus()
    }

    private fun playWithPet() {
        // Add logic to play with the pet
        happinessLevel += 10
        updatePetStatus()
    }

    private fun updatePetStatus() {
        // Update UI to reflect pet's status
        // For example, update TextViews with hunger, cleanliness, happiness levels

    }
}
