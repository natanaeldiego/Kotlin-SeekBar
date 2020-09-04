package com.example.seekbar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.SeekBar
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    lateinit var texto: TextView
    lateinit var seekBar: SeekBar
    lateinit var botao: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        texto = findViewById(R.id.valorAtual)
        seekBar = findViewById(R.id.seekBar)
        botao = findViewById(R.id.button)

        seekBar.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {
                texto.text = "" + progress
            }

            override fun onStartTrackingTouch(seekBar1: SeekBar?) {
                Toast.makeText(applicationContext, "Começou !!! "+seekBar.progress, Toast.LENGTH_LONG).show()
            }

            override fun onStopTrackingTouch(seekBar1: SeekBar?) {
                Toast.makeText(applicationContext, "Terminou !!!", Toast.LENGTH_LONG).show()
            }
        })

        botao.setOnClickListener{
            Toast.makeText(applicationContext, "Clicando o botão !!! "+seekBar.progress, Toast.LENGTH_LONG).show()
        }
    }
}