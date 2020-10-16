package com.example.age

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }

    fun OnClicking(view: View) {
        val myyear:Int=year.text.toString().toInt()
        val currentYear=Calendar.getInstance().get(Calendar.YEAR)
        val myAge=currentYear-myyear
        answer.setText("Your age is $myAge years")

    }
}