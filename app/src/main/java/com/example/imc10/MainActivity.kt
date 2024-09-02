package com.example.imc10

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnCalcular = findViewById<Button>(R.id.btnCalcular)
        btnCalcular.setOnClickListener{

            val etPeso = findViewById<EditText>(R.id.etPeso)
            val etAltura = findViewById<EditText>(R.id.etAltura)

            val peso = etPeso.text.toString().toFloatOrNull()
            val altura = etAltura.text.toString().toFloatOrNull()

            if (peso != null && altura != null) {
                val imc = peso / (altura * altura)
                // Aqui você pode implementar a lógica para classificar o IMC e exibir o resultado
                // Por exemplo, usando um Toast ou navegando para outra Activity
                Toast.makeText(this, "Seu IMC é: $imc", Toast.LENGTH_SHORT).show()

                // Exemplo de navegação para outra Activity
                 val intent = Intent(this, resultado::class.java)
                 intent.putExtra("imc", imc)
                 startActivity(intent)
            } else {
                Toast.makeText(this, "Por favor, insira valores válidos.", Toast.LENGTH_SHORT).show()
         }   }
    }
}

