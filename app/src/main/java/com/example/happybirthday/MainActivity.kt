package com.example.happybirthday

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_main)

		val boton: Button = findViewById<Button>(R.id.button_to_second)
		boton.setOnClickListener{val intent = Intent(this, MainActivity3::class.java)
		startActivity(intent)}
	}
}