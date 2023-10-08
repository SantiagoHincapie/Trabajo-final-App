package com.example.paws

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.Spinner


//TODO: En caso de que el usuario seleccione la opcion otro, se debe de mostrar el edit text para que ingrese su tipo de mascota
//Todo: se debe de enviar el tipo de la mascota a la siguiente actividad
class LogUpTipoDeMascota : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        var intent:Intent
        var spinner:Spinner
        var botonSiguiente:Button

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_log_up_tipo_de_mascota)

        spinner=this.findViewById(R.id.spinnerTiposMascotas)
        ArrayAdapter.createFromResource(this,R.array.tipos_mascotas,android.R.layout.simple_spinner_item).also { adapter->
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            spinner.adapter=adapter
        }
        //spinnerArray()

        botonSiguiente=this.findViewById(R.id.buttonSiguiente_TipoMascota)
        botonSiguiente.setOnClickListener {
            irA()
        }
    }

     fun irA() {

        intent=Intent(this,LogUpNombreMascotayFoto::class.java)
        startActivity(intent)
    }


}