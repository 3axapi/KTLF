package com.example.loyauts

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var myTextView: TextView
    lateinit var myLyt: LinearLayout
    lateinit var myButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        myTextView = findViewById(R.id.textView)
        myLyt = findViewById(R.id.LLi)
        myButton = findViewById(R.id.button)

        myTextView.setOnClickListener {
            myTextView.setTextColor(Color.MAGENTA)
            myTextView.setText("TO JEST NADPISANY TEXT")
        }

        myButton.setOnClickListener {
            myLyt.setBackgroundColor(Color.BLUE)
        }
    }

    override fun onStart() {
        super.onStart()
        Log.d("LIFECYCLE", "onStart")
    }
    override fun onResume() {
        super.onResume()
        Log.d("LIFECYCLE", "onResume")
    }
    override fun onPause() {
        super.onPause()
        Log.d("LIFECYCLE", "onPause")
    }
    override fun onStop() {
        super.onStop()
        Log.d("LIFECYCLE", "onStop")
    }
    override fun onRestart() {
        super.onRestart()
        Log.d("LIFECYCLE", "onRestart")
    }
    override fun onDestroy() {
        super.onDestroy()
        Log.d("LIFECYCLE", "onDestroy")
    }
}