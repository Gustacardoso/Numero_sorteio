package com.example.ifood.com.numero_sorteio

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    fun numeroSorte(view: View){
       var numero = findViewById<TextView>(R.id.numSorte)
        var sorteio = Random.nextInt(11)
        numero.text = "numero sorteado é" +sorteio
    }

}
