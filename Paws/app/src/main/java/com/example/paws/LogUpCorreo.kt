package com.example.paws

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class LogUpCorreo : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        var email:EditText
        var botonSiguiente:Button
        var intent:Intent

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_log_up_correo)

        botonSiguiente=this.findViewById(R.id.buttonSiguienteCorreo)
        email=this.findViewById(R.id.editTextCorreo)


        botonSiguiente.setOnClickListener {
            irA()
        }
    }

    fun irA(){

        //TODO: organizar validaciones
        //TODO: organizar las clases para el consumo de las APIs
        /**
         * intent.putExtra("correoUsuario",email)
         */

        intent=Intent(this, LogUpConstrasenia::class.java)
        startActivity(intent)
    }




}