package com.example.counter_app

import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private var counter = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val counterTextView = TextView(this).apply {
            textSize = 24f
            text = counter.toString()
        }

        val incrementButton = Button(this).apply {
            text = "Increment"
            setOnClickListener {
                counter++
                counterTextView.text = counter.toString()
            }
        }

        val decrementButton = Button(this).apply {
            text = "Decrement"
            setOnClickListener {
                counter--
                counterTextView.text = counter.toString()
            }
        }

        val buttonLayout = LinearLayout(this).apply {
            orientation = LinearLayout.HORIZONTAL
            addView(incrementButton)
            addView(decrementButton)
        }

        val mainLayout = LinearLayout(this).apply {
            orientation = LinearLayout.VERTICAL
            addView(counterTextView)
            addView(buttonLayout)
        }

        setContentView(mainLayout)
    }
}
