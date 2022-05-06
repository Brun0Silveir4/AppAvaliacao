package com.example.apprevisao

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnCalc: Button = findViewById(R.id.Calc)
        btnCalc.setOnClickListener { Calc() }
    }

    private fun Calc() {
        val valor01: EditText = findViewById(R.id.PrimeiroValor)
        val valor02: EditText = findViewById(R.id.SegundoValor)

        if (valor01.text.isNotEmpty() && valor02.text.isNotEmpty()) {
            if (Integer.parseInt(valor01.text.toString()) > Integer.parseInt(valor02.text.toString())) {
                Toast.makeText(this, "Campo 1 é maior que o campo 2", Toast.LENGTH_SHORT).show()
            } else if (Integer.parseInt(valor01.text.toString()) == Integer.parseInt(valor02.text.toString())) {
                Toast.makeText(this, "Campo 1 é igual ao Campo 2", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Campo 2 é maior que o Campo 1", Toast.LENGTH_SHORT).show()
            }
        }
    }
}

