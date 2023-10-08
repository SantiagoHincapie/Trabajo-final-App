package com.example.paws

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class LogUpNombreUsuario : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        var intent:Intent
        var nombreUsuario:EditText
        var botonSiguiente:Button

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_log_up_nombre_usuario)

        botonSiguiente=this.findViewById(R.id.buttonSiguiente_Nombre)

        botonSiguiente.setOnClickListener {
            irA()
        }
    }

    private fun irA() {
        //TODO:VAlidacion del nombre??
        //TODO:consumo de una API para el inicio de sesion

        //Debido a esta funcion se esta volviendo repetitiva, se podria independizar
        intent=Intent(this,LogUpTipoDeMascota::class.java)
        startActivity(intent)
    }
}