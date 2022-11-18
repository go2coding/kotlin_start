package com.kotlin.kotlin_start_ch08

/**
 * Created by lqp on 2022/11/14.
 */
class Car(name:String):AutoMobile(name) {

    init {
        println(name)
    }
}