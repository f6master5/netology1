package com.example.netologia

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    val Tag: String = "MainActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        Log.d(Tag, "start of onCreate function")

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val name: String = "Ivan"
        val surname: String = "Ivanov"
        var age: Int = 37
        var height: Double = 172.2


        val summary: String = "Name: $name Surname: $surname age: $age height: $height"

        val output: TextView = findViewById(R.id.output)
        output.text = summary

        Log.d(Tag, "end of onCreate function")

    }
}