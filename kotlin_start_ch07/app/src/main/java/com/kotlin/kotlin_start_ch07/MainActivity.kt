package com.kotlin.kotlin_start_ch07

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlin.Int as Int1

class MainActivity : AppCompatActivity() {

    fun myAdd(a: Int1, b: Int1): Int1 {
        return a+b
    }

    fun isA(v:Char,ignorecase:Boolean=true):Boolean{
        var c:Char = '1'
        if (ignorecase)
            c = v.lowercaseChar()
        return c == 'a'

    }

    fun myLog(vararg args: String) {
        println(args::class)
        println(args.contentToString())
        for (i in args.indices) {
            println(args[i])
        }
    }

    fun powerAlgorithm(x: Int1, power:(a: Int1)-> Int1): Int1 {
        return  power(x)
    }

    fun funpower3(x: Int1): Int1 {
        return x*x*x
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        println(myAdd(1,2).toString())

        var ba:Boolean = isA('A', ignorecase = false)

        myLog("1","2","3")

        var sum =  { x: Int1, y: Int1 -> x + y}
        println(sum(1,1))


        //println(powerAlgorithm(2, funpower3))

        println(powerAlgorithm(2,{x: Int1 ->x*x*x}))

        var power3 = powerAlgorithm(2){
            it*it*it
        }

        var numList:MutableList<Int1> = mutableListOf(1,2,3,4,5)

        var num2 = numList.map{it*2}
    }


}