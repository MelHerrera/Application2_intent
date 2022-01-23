package com.example.application2_intent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    var error: Int = 0
    val requestCode_intent: Int = 3
override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.button).setOnClickListener {
            val intent = Intent()

            intent.action = "com.example.application1_intent"
            intent.addCategory ("android.intent.category.DEFAULT")

            try {
                startActivityForResult(intent, requestCode_intent)
            } catch (e:Exception) {
                findViewById<TextView>(R.id.app1view).append("\n" + e.message + "\n")
                Toast.makeText(this, "¡Permission not declared Error!", Toast.LENGTH_LONG).show()
                error = 1
            }
        }
    findViewById<Button>(R.id.button1).setOnClickListener {
        val intent = Intent()

        intent.action = "com.example.application1_intent1"
        intent.addCategory ("android.intent.category.DEFAULT")

        try {
            startActivityForResult(intent, requestCode_intent)
        } catch (e:Exception) {
            findViewById<TextView>(R.id.app1view).append("\n" + e.message + "\n")
            Toast.makeText(this, "¡Permission not declared Error!", Toast.LENGTH_LONG).show()
            error = 1
        }
    }

    }
}