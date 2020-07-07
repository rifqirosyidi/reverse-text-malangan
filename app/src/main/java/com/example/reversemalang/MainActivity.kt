package com.example.reversemalang

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        displayOriginalText.text = ""
        displayReversedText.text = ""

        fun String.capitalizeWords(): String = split(" ").map { it.capitalize() }.joinToString(" ")

        reverseBtn.setOnClickListener {
            val myInput = inputTxt.text.toString().toLowerCase()
            val repInput = myInput.replace("ng", "gn")
            val revInput = repInput.reversed()

            displayOriginalText.text = myInput.capitalizeWords()
            displayReversedText.text = revInput.capitalizeWords()
        }

    }
}