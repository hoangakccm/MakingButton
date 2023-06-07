package com.example.makingbutton

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.FrameLayout
import android.widget.TextView
import kotlin.math.log

class MainActivity : AppCompatActivity() {
    private lateinit var countButton: FrameLayout
    private lateinit var countTextview: TextView
    private var count = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initView()
        initUIEvenHander()
    }

    private fun initUIEvenHander() {
        countButton.setOnClickListener{
            count++
            countTextview.text = "$count"
            Log.i("Count.", "Count: $count")
        }
    }

    private fun initView() {
        countButton = findViewById(R.id.countBt)
        countTextview = findViewById(R.id.counttv)
    }
}