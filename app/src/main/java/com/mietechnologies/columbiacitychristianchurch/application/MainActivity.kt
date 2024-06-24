package com.mietechnologies.columbiacitychristianchurch.application

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.compose.setContent
import com.mietechnologies.columbiacitychristianchurch.application.Application

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
//        enableEdgeToEdge()
        super.onCreate(savedInstanceState)

        setContent {
            Application()
        }
    }
}