package com.example.appclima

import android.content.Context
import android.net.ConnectivityManager
import androidx.appcompat.app.AppCompatActivity

class Network {

    companion object{
        fun hayRed(activity: AppCompatActivity):Boolean{
            val ConnectivityManager = activity.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
            val networkInfo = ConnectivityManager.activeNetworkInfo
            return networkInfo != null && networkInfo.isConnected
        }
    }
}