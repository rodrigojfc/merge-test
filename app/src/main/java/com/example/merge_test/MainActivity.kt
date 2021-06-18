package com.example.merge_test

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        println("esta es mi linea, no la vayas a chingar")

        var seChinga = false

        if(seChinga){
            println("te chingaste mi linea")
        }else{
            println("todo bien bro")
        }

    }
}