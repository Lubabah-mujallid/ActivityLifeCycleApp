package com.example.activitylifecycleapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.i("MainActivity", "On Create State")
    }
    override fun onStart() {
        super.onStart()
        Log.i("MainActivity", "On Start State")
    }

    override fun onPause() {
        super.onPause()
        Log.i("MainActivity", "On Pause State")
    }

    override fun onResume() {
        super.onResume()
        Log.i("MainActivity", "On Resume State")
    }

    override fun onStop() {
        super.onStop()
        Log.i("MainActivity", "On Stop State")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("MainActivity", "On Destroy State")
    }
}