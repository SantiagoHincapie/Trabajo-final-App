package com.example.paws

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MenuActivities : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        var buttonEmpezar:Button
        var intent: Intent

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu_activities)

        buttonEmpezar=this.findViewById(R.id.buttonEmpezar)

        buttonEmpezar.setOnClickListener {
            irA()
        }
    }

    fun irA(){
        intent=Intent(this,LogUpCorreo::class.java)
        startActivity(intent)
    }
}