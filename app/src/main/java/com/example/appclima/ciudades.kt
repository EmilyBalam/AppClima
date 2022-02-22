package com.example.appclima

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class ciudades : AppCompatActivity() {

    val TAG = "com.vidamrr.appclima.ciudades.ciudad"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ciudades)

        val bFelipe= findViewById<Button>(R.id.bFCP)
        val bPMorelos= findViewById<Button>(R.id.bPMorelos)
        val bJMM= findViewById<Button>(R.id.bJMMorelos)
        val bChetumal= findViewById<Button>(R.id.bChetumal)

        bFelipe.setOnClickListener(View.OnClickListener {
            val intent = Intent( this, MainActivity:: class.java)
            intent.putExtra(TAG,"Ciudad-felipeCP")
            startActivity(intent)
        })
        bPMorelos.setOnClickListener(View.OnClickListener {
            val intent = Intent( this, MainActivity:: class.java)
            intent.putExtra(TAG,"Ciudad-PuertoMorelos")
            startActivity(intent)
        })
        bJMM.setOnClickListener(View.OnClickListener {
            val intent = Intent( this, MainActivity:: class.java)
            intent.putExtra(TAG,"Ciudad-JoseMariaMorelos")
            startActivity(intent)
        })
        bChetumal.setOnClickListener(View.OnClickListener {
            val intent = Intent( this, MainActivity:: class.java)
            intent.putExtra(TAG,"Ciudad-Chetumal")
            startActivity(intent)
        })


    }
}