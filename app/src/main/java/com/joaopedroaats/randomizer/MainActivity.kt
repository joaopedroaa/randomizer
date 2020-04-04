package com.joaopedroaats.randomizer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.SeekBar
import android.widget.TextView
import android.widget.Toast
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton = findViewById<Button>(R.id.rollButton)
        val resultsTextView = findViewById<TextView>(R.id.resultsTextView)
        val seekBar = findViewById<SeekBar>(R.id.seekBar)
        val seekBarTextView = findViewById<TextView>(R.id.seekBarTextView)


        rollButton.setOnClickListener {
            val randomNumber =  ( 1  until  (seekBar.progress + 2 ) + 1).random()
            resultsTextView.text = randomNumber.toString()
        }

        seekBar?.setOnSeekBarChangeListener(object:  SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(seekBar: SeekBar, progress: Int, fromUser: Boolean) {
                seekBarTextView.text = ("range of " + (seekBar.progress + 2) + " numbers" )
            }
            override fun onStartTrackingTouch(seekBar: SeekBar) {}
            override fun onStopTrackingTouch(seekBar: SeekBar) {}
        })


    }
}
