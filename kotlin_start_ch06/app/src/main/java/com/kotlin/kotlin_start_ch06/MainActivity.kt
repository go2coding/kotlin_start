package com.kotlin.kotlin_start_ch06

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var str:String
        //var len = str.length

        str = "1231"

        var strn:String? =null

        var len = strn?.length


        strn = "1231"

        println(strn!!.length)

    }
}