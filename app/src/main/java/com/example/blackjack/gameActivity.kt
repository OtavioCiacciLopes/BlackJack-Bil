package com.example.blackjack

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class GameActivity : AppCompatActivity() {

    private var score = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.game_activity)
        updateScore()
    }

    // Método chamado quando o botão "Hit" é clicado
    fun hit(view: View) {
        // Lógica para adicionar carta ao jogador e atualizar a pontuação
        // Exemplo: score += carta
        updateScore()

        // Lógica para verificar se o jogador ultrapassou 21 (estourou)
        // Se sim, encerre o jogo ou tome medidas apropriadas
    }

    // Método chamado quando o botão "Stand" é clicado
    fun stand(view: View) {
        // Lógica para encerrar o jogo e comparar pontuações
        // Exemplo: verificar se a pontuação do jogador é maior que a do dealer
        // Você pode adicionar mais lógica aqui, como a lógica do dealer, etc.

        // Exemplo simples de mensagem de resultado
        val resultTextView = findViewById<TextView>(R.id.resultTextView)
        if (score > 21) {
            resultTextView.text = "Você estourou! Perdeu!"
        } else {
            resultTextView.text = "Você venceu!"
        }
    }

    private fun updateScore() {
        // Atualiza o TextView com a pontuação atual
        val scoreTextView = findViewById<TextView>(R.id.scoreTextView)
        scoreTextView.text = "Score: $score"
    }
}
