package com.example.mad_practical_21012012007

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.constraintlayout.widget.ConstraintLayout
import com.google.android.material.snackbar.Snackbar
class MainActivity : AppCompatActivity() {
    private val TAG = "MainActivity"
    private lateinit var mycl: ConstraintLayout
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mycl = findViewById(R.id.mycl)
        Log.i(TAG, "onCreate: Function called")
        Toast.makeText(this, "onCreate: Function called", Toast.LENGTH_SHORT).show()
        Snackbar.make(mycl, "onCreate: Function called", Snackbar.LENGTH_LONG).show()
    }
    override fun onStart() {
        super.onStart()
        Log.i(TAG, "onCreate: Function called")
        Toast.makeText(this, "onCreate: Function called", Toast.LENGTH_SHORT).show()
        Snackbar.make(mycl, "onCreate: Function called", Snackbar.LENGTH_LONG).show()
    }
    override fun onRestart() {
        super.onRestart()
        Log.i(TAG, "onCreate: Function called")
        Toast.makeText(this, "onCreate: Function called", Toast.LENGTH_SHORT).show()
        Snackbar.make(mycl, "onCreate: Function called", Snackbar.LENGTH_LONG).show()
    }
    override fun onResume() {
        super.onResume()
        Log.i(TAG, "onResume: Function called")
        Toast.makeText(this, "onResume: Function called", Toast.LENGTH_SHORT).show()
        Snackbar.make(mycl, "onResume: Function called", Snackbar.LENGTH_LONG).show()
    }
    override fun onPause() {
        super.onPause()
        Log.i(TAG, "onPause: Function called")
        Toast.makeText(this, "onPause: Function called", Toast.LENGTH_SHORT).show()
        Snackbar.make(mycl, "onPause: Function called", Snackbar.LENGTH_LONG).show()
    }
    override fun onStop() {
        super.onStop()
        Log.i(TAG, "onStop: Function called")
        Toast.makeText(this, "onStop: Function called", Toast.LENGTH_SHORT).show()
        Snackbar.make(mycl, "onStop: Function called", Snackbar.LENGTH_LONG).show()
    }
    override fun onDestroy() {
        super.onDestroy()
        Log.i(TAG, "onDestroy: Function called")
        Toast.makeText(this, "onDestroy: Function called", Toast.LENGTH_SHORT).show()
        Snackbar.make(mycl, "onDestroy: Function called", Snackbar.LENGTH_LONG).show()
    }
}
