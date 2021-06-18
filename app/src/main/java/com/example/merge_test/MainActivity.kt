package com.example.merge_test

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        println("Creo que empiezo a entender")


        var a: Boolean = true
        var b: Boolean = false

        when(a) {
            true -> b


        println("esta es mi linea, no la vayas a chingar")

        var seChinga = false

        if(seChinga){
            println("te chingaste mi linea")
        }else{
            println("todo bien bro")

        }

    }
}