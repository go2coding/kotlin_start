package com.kotlin.kotlin_start_ch08

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var auto:AutoMobile = AutoMobile("汽车")

        auto.Driver()

        var auto1:AutoMobile = Car("大众")
        auto1.Driver()
    }
}