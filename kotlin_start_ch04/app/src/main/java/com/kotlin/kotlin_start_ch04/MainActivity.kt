package com.kotlin.kotlin_start_ch04

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var people:MutableSet<String> = mutableSetOf("user1","user2")

        people.add("user3")
        people.add("user1")

        people.forEach { println(it) }


        var feature1 :MutableSet<String> = mutableSetOf("user1","user2","user3")
        var feature2 :MutableSet<String> = mutableSetOf("user2","user3","user4")

        var all = feature1.intersect(feature2)

        all.forEach { println(it) }

        var array1:Array<Int> = arrayOf(1,2,2,3)

        for(item in array1){
            println(item.toString())
        }

        array1.forEach { println(it) }

        var list1:MutableList<String> = mutableListOf("user1","user2","user3")

        for(i in list1.indices){
            println(list1[1])
        }


        var map1:MutableMap<String,Int> = mutableMapOf("tomato" to 1,"apple" to 2)

        map1.forEach { println(it.key + ": " + it.value.toString()) }


        var list2:MutableList<Int> = mutableListOf(4,5,1,2,6,89,34)

        list2.sort()

        list2.sortBy { -it }



    }
}