package com.example.paws

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton

//TODO:Se debe de recivir el tipo de mascota del layaout anterior
//TODO: se debe de realizar el registro de la mascota
//TODO:Deberia de poder tomar una foto y guardarla
//TODO:Validaciones para el guardado de las fotos

class LogUpNombreMascotayFoto : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        var intent:Intent
        var botonSiguiente:Button
        var BtnTomarFoto:ImageButton
        var txVNombreMascota:EditText

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_log_up_nombre_mascotay_foto)

        botonSiguiente=this.findViewById(R.id.buttonSiguiente_NombreYFoto)
        botonSiguiente.setOnClickListener {
            irA()
        }
    }

    private fun irA() {
        intent=Intent(this,Home::class.java)
        startActivity(intent)
    }
}