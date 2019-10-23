package com.example.practical1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    lateinit var diceImage : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener { rollDice() }

        //val countUpButton: Button = findViewById<Button>(R.id.countUp_button)
        //countUpButton.setOnClickListener { countUp() }

        val resetButton: Button = findViewById<Button>(R.id.reset_button)
        resetButton.setOnClickListener { reset() }

    }

    private fun rollDice() {
        Toast.makeText(
            this, "Roll Dice button clicked",
            Toast.LENGTH_SHORT
        ).show()

        // Dices
        for (i in 0..2) {
            val randomInt = Random().nextInt(6) + 1
            diceImage= findViewById(R.id.dice_image+i)
            val drawableResource = when (randomInt) {
                1 -> R.drawable.dice_1
                2 -> R.drawable.dice_2
                3 -> R.drawable.dice_3
                4 -> R.drawable.dice_4
                5 -> R.drawable.dice_5
                else -> R.drawable.dice_6
            }
            diceImage.setImageResource(drawableResource)
        }
    }
/*
    private fun countUp() {
        Toast.makeText(
            this, "Count Up button clicked",
            Toast.LENGTH_SHORT
        ).show()

        val diceImage: ImageView = findViewById(R.id.dice_image)

        if (resultText.text != "6") {
            val ans = resultText.text.toString().toInt() + 1
            resultText.text = "Counted Up!"
            resultText.text = ans.toString()
        }
    }
*/
    private fun reset() {
        Toast.makeText(
            this, "Reset button clicked",
            Toast.LENGTH_SHORT
        ).show()

        for (i in 0..2) {
            val randomInt = Random().nextInt(6) + 1
            if(i ==0){
                diceImage= findViewById(R.id.dice_image)
            }else{
                diceImage= findViewById(R.id.dice_image+i)}
            val drawableResource = R.drawable.empty_dice
            diceImage.setImageResource(drawableResource)
        }
    }
}

/*val on_screenText = result_text.text.toString().toIntOrNull()

val isInteger : Boolean = on_screenText != null
if(!isInteger){
    resultText.text = "1"
}*/