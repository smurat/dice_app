package com.example.diceapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import com.example.diceapp.databinding.ActivityMainBinding
import java.util.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_main)
        val rollButton: Button = findViewById(R.id.roll_button)
        val count: TextView = findViewById(R.id.dice_count)
        rollButton.text = "Let's Roll"
        //val rollButton:Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener {
            //count.text=(1..6).random().toString()
            rollDice()
            //showtoast()
        }
    }

    private fun rollDice() {
        val resultText: TextView = findViewById(R.id.dice_count)
        val diceImage: ImageView = findViewById(R.id.dice_image)
        //val randomInt = Random().nextInt(6)+1
        //resultText.text=randomInt.toString()
        var randomDice = (1..6).random().toString()
        resultText.text = randomDice
        println("rolled ${resultText.text}")
        val drawableSrc: Int = when (randomDice) {
            "1" -> R.drawable.dice_1
            "2" -> R.drawable.dice_2
            "3" -> R.drawable.dice_3
            "4" -> R.drawable.dice_4
            "5" -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        diceImage.setImageResource(drawableSrc)
    }

    fun showtoast(): Unit {
        var myToast = Toast.makeText(this, null, Toast.LENGTH_SHORT);
        myToast.setText("Clicked")
        myToast.show()
        //Toast.makeText(this,"Tıklandı",Toast.LENGTH_SHORT).show()
    }

}
