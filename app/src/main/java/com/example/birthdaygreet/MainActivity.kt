package com.example.birthdaygreet

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun birthdayCardMake(view: View) {
        val name=nameInput.editableText.toString()
//        Toast.makeText(this,"clicked by $name",Toast.LENGTH_LONG).show()
        val intent=Intent(this,BirthGreeting::class.java)
        intent.putExtra(BirthGreeting.NAME,name)
        startActivity(intent)


    }
}