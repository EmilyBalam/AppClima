package com.example.appclima

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    var tvciudad:TextView?=null
    var tvgrados:TextView?=null
    var tvestatus:TextView?=null

    override fun onCreate(savedInstanceState: Bundle?) {

        tvciudad= findViewById(R.id.tvCiudad)
        tvgrados=findViewById(R.id.tvGrados)
        tvestatus=findViewById(R.id.tvEstatus)

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

         val ciudad = intent.getStringExtra("com.vidamrr.appclima.ciudades.ciudad" )

        val ciudadFCP = Ciudad("Felipe Carrillo Puerto", 27,"Despejado")
        val ciudadPuertoM = Ciudad("Puerto Morelos", 30,"Soleado")
        val ciudadJoseMM = Ciudad("Jose Maria Morelos", 10,"Nublado")
        val ciudadChe = Ciudad("Chetumal", 18,"Lloviendo")

        if(ciudad == "Ciudad-felipeCP"){
            tvciudad?.text= ciudadFCP.nombre
            tvgrados?.text= ciudadFCP.grados.toString() + "°"
            tvestatus?.text = ciudadFCP.estatus

        }else if(ciudad == "Ciudad-PuertoMorelos"){
            tvciudad?.text= ciudadPuertoM.nombre
            tvestatus?.text = ciudadPuertoM.estatus
            tvgrados?.text= ciudadPuertoM.grados.toString() + "°"

        }else if(ciudad =="Ciudad-JoseMariaMorelos"){
            tvciudad?.text= ciudadJoseMM.nombre
            tvestatus?.text = ciudadJoseMM.estatus
            tvgrados?.text= ciudadJoseMM.grados.toString() + "°"

        }else if(ciudad == "Ciudad-Chetumal"){
            tvciudad?.text= ciudadChe.nombre
            tvestatus?.text = ciudadChe.estatus
            tvgrados?.text= ciudadChe.grados.toString() + "°"

        }else {
            Toast.makeText(this,"No se encontro la informacion",Toast.LENGTH_SHORT).show()
        }

    }
}