package com.example.birthdaygreet

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class birthday_greet_activity : AppCompatActivity() {

    companion object{
        const val NAME_EXTRA = "name_extra"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_birthday_greet)

        val name = intent.getStringExtra(NAME_EXTRA)
        val happy_birthday = findViewById<TextView>(R.id.happy_birthday)
        happy_birthday.text = "Happy Birthday\n$name !"
    }

}