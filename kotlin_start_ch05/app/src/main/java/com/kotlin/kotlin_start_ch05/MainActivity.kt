package com.kotlin.kotlin_start_ch05

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val num:Int = 1

        if (num == 1){

            println("num is 1")

        }else if(num == 3){
            println("num is 3")
        }
        else{

            println("num is not 1 or 3")

        }


        var returnstr = if (num == 1){
            "23"
        }
        else{
            "45"
        }

        when(num){
            1 -> {
                println(num)
            }
            2 -> {
                println(num)
            }
        }


        for(i in 1..20){
            println(i.toString())
        }




    }
}