package com.kotlin.kotlin_start_ch12

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.kotlin.banner.BannerInfo
import com.kotlin.banner.BannerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var bfs:ArrayList<BannerInfo> = arrayListOf(BannerInfo(R.drawable.banner_1, displayText = "hello"),
            BannerInfo(R.drawable.banner_2, displayText = "hello"),
            BannerInfo(R.drawable.banner_3, displayText = "hello"))



        var bv:BannerView = findViewById(R.id.bannerView1)
        bv.setData(bfs)


    }
}