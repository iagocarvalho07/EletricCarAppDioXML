package com.iagocarvalho.eletriccarappdioxml.screens

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.iagocarvalho.eletriccarappdioxml.R

class calcularAutonomiaActivity : AppCompatActivity(){

    private lateinit var preco: EditText
    private lateinit var kmPercorrido: EditText
    private lateinit var btnCalcular: Button
    private lateinit var resultado: TextView
    private lateinit var close: ImageView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calcular_autonomia)
        setupView()
        setupLiteners()
        closeActivityCalcularAutonomia()
    }


    fun setupView() {
        preco = findViewById(R.id.editTextPreco)
        kmPercorrido = findViewById(R.id.km_percorrido)
        resultado = findViewById(R.id.resultado)
        btnCalcular = findViewById(R.id.btn_calcular)
        close = findViewById(R.id.imageViewClose)
    }

    fun setupLiteners() {
        btnCalcular.setOnClickListener {
            calcular()
        }
    }

    fun closeActivityCalcularAutonomia(){
        close.setOnClickListener {
            finish()
        }
    }

    fun calcular() {
        val preco = preco.text.toString().toFloat()
        val km = kmPercorrido.text.toString().toFloat()
        val result = preco / km
        resultado.text = result.toString()
    }

}