package com.example.birthdaygreet

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_birth_greeting.*

class BirthGreeting : AppCompatActivity() {

    companion object{
        const val NAME="name"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_birth_greeting)
        val name=intent.getStringExtra(NAME)
        birthdayGreeting.text="Happy Birthday\n$name!"
    }
}