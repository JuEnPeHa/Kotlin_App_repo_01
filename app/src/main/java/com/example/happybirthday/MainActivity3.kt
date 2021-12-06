package com.example.happybirthday

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity3 : AppCompatActivity() {
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_main3)
		val rollButton: Button = findViewById(R.id.button)

		rollButton.setOnClickListener {
			rollDice()
			rollButton.text = "¡Lanzaste los dados!"
			val toast: Toast = Toast.makeText(this, "¡Lanzaste los dados!", Toast.LENGTH_SHORT)
			toast.show()
		}
	}

	private fun rollDice() {
		val dice = Dice(6)
		val (numDados, texto) = dice.roll()
		//TextView de arriba
		val cuantosDadosTiraste: TextView = findViewById(R.id.textView4)
		//TextView de abajo
		val resultadoDadosTiraste: TextView = findViewById(R.id.textView3)
		cuantosDadosTiraste.text = "Felicidades, lanzaste $numDados"
		resultadoDadosTiraste.text = texto

	}
}

class Dice(private var numSides: Int) {

	fun numDados(): Int {
		val numeroDeDados = 1..3
		return numeroDeDados.random()
	}

	fun roll(): Pair<Int,String> {
		val diceRange = 1..numSides
		val numDados = numDados()
		var randomNumber = intArrayOf()

		if (numDados == 1) {
			randomNumber = intArrayOf(diceRange.random())
			var texto = "Random number 1 : ${randomNumber[0]}"
			return Pair(numDados,texto)
		} else if (numDados == 2) {
			randomNumber = intArrayOf(diceRange.random(), diceRange.random())
			var texto = "Random number 1 : ${randomNumber[0]}, Random number 2 : ${randomNumber[1]}"
			return Pair(numDados,texto)
		} else {
			randomNumber = intArrayOf(diceRange.random(), diceRange.random(), diceRange.random())
			var texto = "Random number 1 : ${randomNumber[0]}, Random number 2 : ${randomNumber[1]}, Random number 3 : ${randomNumber[2]}"
			return Pair(numDados,texto)
		}
	}
}