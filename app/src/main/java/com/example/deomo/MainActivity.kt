package com.example.deomo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ImageView
import androidx.constraintlayout.motion.widget.MotionLayout

class MainActivity : AppCompatActivity() {


    lateinit var vMotion :MotionLayout
    lateinit var vAdd :ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        vAdd = findViewById(R.id.ic_add)
        vMotion = findViewById(R.id.v_motion)

        vAdd.setOnClickListener {
            vMotion.transitionToState(R.id.end_view_menu)
        }
        

    }
}