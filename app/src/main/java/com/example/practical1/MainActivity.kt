package com.example.practical1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener { rollDice() }
        val countUpButton: Button = findViewById<Button>(R.id.countUp_button)
        countUpButton.setOnClickListener { countUp() }
    }

    private fun rollDice() {
        Toast.makeText(this, "button clicked",
            Toast.LENGTH_SHORT).show()

        val resultText: TextView = findViewById(R.id.result_text)
        val resultText1: TextView = findViewById(R.id.result_text1)
        val resultText2: TextView = findViewById(R.id.result_text2)
        resultText.text = "Dice Rolled!"

        val randomInt = Random().nextInt(6) + 1
        resultText.text = randomInt.toString()

        val randomInt1 = Random().nextInt(6) + 1
        resultText1.text = randomInt1.toString()

        val randomInt2 = Random().nextInt(6) + 1
        resultText2.text = randomInt2.toString()
    }

    private fun countUp() {
        Toast.makeText(
            this, "button clicked",
            Toast.LENGTH_SHORT
        ).show()

        val resultText: TextView = findViewById(R.id.result_text)
        val resultText1: TextView = findViewById(R.id.result_text1)
        val resultText2: TextView = findViewById(R.id.result_text2)

        if (resultText.text == "Hello World!") {
            resultText.text = "Counted Up!"
            resultText.text = "1"
            resultText1.text = "1"
            resultText2.text = "1"
        }

        if (resultText.text != "6") {
            val ans = resultText.text.toString().toInt() + 1
            resultText.text = "Counted Up!"
            resultText.text = ans.toString()
        }

        if (resultText1.text != "6") {
            val ans1 = resultText1.text.toString().toInt() + 1
            resultText1.text = "Counted Up!"
            resultText1.text = ans1.toString()
        }

        if (resultText2.text != "6"){
            val ans2 = resultText2.text.toString().toInt() + 1
            resultText2.text = "Counted Up!"
            resultText2.text = ans2.toString()

        }


    }
}
