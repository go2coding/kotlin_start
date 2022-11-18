package com.kotlin.kotlin_start_ch02

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var f:Float = 1.0f
        var i:Int = f.toInt()

        tv_text.setText(i.toString())

        var charli:CharArray = charArrayOf('a','b')

        var strli:Array<String> = arrayOf("pear","tomato","apple")

        var li:Array<Int> = arrayOf(1,2,3)

        var strofli:String = ""



        li.forEach { strofli = strofli + it.toString() }

        tv_text.setText(strli.joinToString() + strofli)


    }
}