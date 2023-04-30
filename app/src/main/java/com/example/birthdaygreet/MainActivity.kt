package com.example.birthdaygreet

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    fun createbirthdaycard(view: View) {
        val nameInput = findViewById<EditText>(R.id.nameInput)
        val name = nameInput.editableText.toString()
        //Toast.makeText(this,"Name is $name",Toast.LENGTH_LONG).show()
        val intent = Intent(this, birthday_greet_activity::class.java)
        intent.putExtra(birthday_greet_activity.NAME_EXTRA, name)
        startActivity(intent)
    }
}