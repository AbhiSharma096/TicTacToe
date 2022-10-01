package com.example.firstapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.view.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        textView.translationY=-1000f
        imageView11.translationY=1000f
        textView.animate().translationY(0f).duration=2000
        imageView11.animate().translationY(0f).duration=1200


        val btnclick = findViewById<Button>(R.id.nextpage)



    }

    fun movegamepage(view: View) {

        val name = editTextTextPersonName2.text.toString()// Creating a variable named "name"
        val name2 = editTextTextPersonName.text.toString()
        Toast.makeText(this ,"Name is $name and $name2 ",Toast.LENGTH_LONG).show()// showing a popup on button press
        val intent = Intent(this@MainActivity,Gamepage::class.java)//passing to new activity on running this fun
        intent.putExtra("NAME",name )//passing the name second page
        intent.putExtra("NAME2",name2)
        startActivity(intent) // Opening new activity with intent
    }
}