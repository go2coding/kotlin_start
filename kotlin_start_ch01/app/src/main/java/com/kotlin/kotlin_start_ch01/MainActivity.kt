package com.kotlin.kotlin_start_ch01

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_click.setOnClickListener{
            Toast.makeText(this,"btn_click click",Toast.LENGTH_SHORT).show()
            tv_text.text = "btn_click click"
        }
    }
}