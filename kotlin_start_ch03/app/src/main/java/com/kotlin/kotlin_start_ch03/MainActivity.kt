package com.kotlin.kotlin_start_ch03

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tv_text.setText("String ")

        val str:String = "Hello Kotlin"

        var index = str.indexOf("kotlin",0,true)


        var substr = str.substring(0,10)

        var substr1 = str.subSequence(0,10)

        var newstr = str.replace("Kotlin","World")

        val str1:String = "Hello 1234 kotlin 1234"
        val newStr = str1.replace(Regex("[0-9]+"),{
            "abcd"
        })

        println(newStr)

        println(str.split(" "))


        val str_sp = str1.split(Regex("[0-9]+"))
        for (str in str_sp){
            println("$str")
        }

        var str2 = str1 + str

        println(str2)

        println(str2.reversed())

        str2.startsWith("Kotlin")





    }
}