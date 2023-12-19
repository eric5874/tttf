package com.example.tttf

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val thin = findViewById<EditText>(R.id.edth)
        val money = findViewById<EditText>(R.id.edmon)
        val save = findViewById<Button>(R.id.button1)
        val date = findViewById<EditText>(R.id.date)
        val search = findViewById<Button>(R.id.button2)

        //val dbHelper = MyDBHandler(this)

        save.setOnClickListener {
            val item = thin.text.toString()
            val amount = money.text.toString().toDouble()
            val inputDate = date.text.toString()

            /*if (inputDate.isNotEmpty()) {
                // 在這裡保存到資料庫
                val result = dbHelper.addEntry(inputDate, item, amount)

                if (result > 0) {
                    Toast.makeText(this, "Entry saved successfully", Toast.LENGTH_SHORT).show()
                } else {
                    Toast.makeText(this, "Failed to save entry", Toast.LENGTH_SHORT).show()
                }
            } else {
                Toast.makeText(this, "Please enter a date", Toast.LENGTH_SHORT).show()
            }
        }*/

            search.setOnClickListener {
                // 在這裡處理查詢的邏輯
                val intent = Intent(this, MainActivity2::class.java)
                startActivity(intent)
            }
        }

    }
}