package com.example.paws

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class LogUpConstrasenia : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        var intent:Intent
        var contrasenia:EditText
        var botonSiguiente:Button

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_log_up_constrasenia)

        botonSiguiente=this.findViewById(R.id.buttonSiguiente_Contrasenia)

        botonSiguiente.setOnClickListener {
            irA()
        }

    }

    private fun irA() {

        //TODO: organizar validaciones
        //TODO: organizar las clases para el consumo de las APIs
        //intent=Intent(this,)
    }
}