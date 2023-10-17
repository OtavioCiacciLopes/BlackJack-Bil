package com.example.blackjack

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button  // Importe a classe Button
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val startGameButton = findViewById<Button>(R.id.startGameButton)
        startGameButton.setOnClickListener {
            startGame()
        }
    }

    private fun startGame() {
        val intent = Intent(this, GameActivity::class.java)
        startActivity(intent)
    }
}

