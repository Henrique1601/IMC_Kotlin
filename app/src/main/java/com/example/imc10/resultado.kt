package com.example.imc10

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class resultado : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultado)

        val tvResultado = findViewById<TextView>(R.id.tvResultado)
        val imc = intent.getFloatExtra("imc", 0f)
        val btnVoltar = findViewById<Button>(R.id.btnVoltar)
        // Aqui você pode implementar a lógica para classificar o IMC e exibir o resultado
        // Por exemplo:

        val classificacao = when {
            imc < 18.5 -> "Abaixo do peso"
            imc < 25 -> "Peso normal"
            imc < 30 -> "Sobrepeso"
            else -> "Obesidade"

        }

        tvResultado.text = "Seu IMC é: $imc\nClassificação: $classificacao"

        btnVoltar.setOnClickListener {
            finish()
        }
    }

}