package com.example.firstapp

import android.R
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_gamepage.*


class Gamepage : AppCompatActivity() {

    companion object{
        const val NAME = "name"
        const val NAME2 ="name2"
    }
    var flag =0
    var count =0


    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(com.example.firstapp.R.layout.activity_gamepage)

        imageView.translationY=-1000f
        imageView.animate().translationY(0f).duration=1200
        val name = intent.getStringExtra("NAME")
        val name2 = intent.getStringExtra("NAME2")
        fun newgame ( ){
            button.text =""
            button2.text =""
            button3.text =""
            button4.text =""
            button5.text =""
            button6.text =""
            button7.text =""
            button8.text =""
            button9.text =""
            flag =0
            count =0
        }




        fun playerTap(view:View) {


            val btncurrent = view as Button
            if ( btncurrent.text== "") {
                count ++

                if ( flag == 0){
                    btncurrent.text = " X"

                }
                else {
                    btncurrent.text = "O"
                }
                val b1 = button.text.toString()
                val b2 = button2.text.toString()
                val b3 = button3.text.toString()
                val b4 = button4.text.toString()
                val b5 = button5.text.toString()
                val b6 = button6.text.toString()
                val b7 = button7.text.toString()
                val b8 = button8.text.toString()
                val b9 = button9.text.toString()

                if ( b1== b2 && b2 == b3 && b3!=" "){
                    Toast.makeText(this@Gamepage , " Winner is $b1 ", Toast.LENGTH_LONG).show()
                    newgame()
                } else if (b7 == b8 && b8 == b9 && b9 != " "){
                    Toast.makeText(this@Gamepage , " Winner is $b7 ", Toast.LENGTH_LONG).show()
                    newgame()
                } else if (b4 == b5 && b5 == b6 && b6 != " "){
                    Toast.makeText(this@Gamepage , " Winner is $b4 ", Toast.LENGTH_LONG).show()
                    newgame()
                } else if (b1 == b4 && b4 == b7 && b7 != " "){
                    Toast.makeText(this@Gamepage , " Winner is $b1 ", Toast.LENGTH_LONG).show()
                    newgame()
                } else if (b2 == b5 && b5 == b8 && b8 != " "){
                    Toast.makeText(this@Gamepage , " Winner is $b2 ", Toast.LENGTH_LONG).show()
                    newgame()
                } else if (b3 == b6 && b6 == b9 && b9 != " "){
                    Toast.makeText(this@Gamepage , " Winner is $b3 ", Toast.LENGTH_LONG).show()
                    newgame()
                } else if (b1 == b5 && b5 == b9 && b9 != " "){
                    Toast.makeText(this@Gamepage , " Winner is $b1 ", Toast.LENGTH_LONG).show()
                    newgame()
                }else if (b3 == b5 && b5 == b7 && b7 != " "){
                    Toast.makeText(this@Gamepage , " Winner is $b3 ", Toast.LENGTH_LONG).show()
                    newgame()
                } else if (count ==9){
                    Toast.makeText(this@Gamepage," Match is Draw. ", Toast.LENGTH_LONG).show()
                    newgame()
                }
            }

        }


    }

}