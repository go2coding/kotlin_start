package com.kotlin.kotlin_start_ch11

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val narutoList = ArrayList<Naruto>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initData()

        recycleViewItem.layoutManager = LinearLayoutManager(this)

        var adapter = NarutoListAdapter(narutoList)

        recycleViewItem.adapter = adapter
    }

    fun initData(){
        narutoList.add(Naruto(" 漩涡鸣人 ",R.drawable.image_1))
        narutoList.add(Naruto(" 宇智波佐助 ",R.drawable.image_2))
        narutoList.add(Naruto(" 小樱 ",R.drawable.image_3))
        narutoList.add(Naruto(" 旗木卡卡西 ",R.drawable.image_4))
        narutoList.add(Naruto(" 奈良鹿丸 ",R.drawable.image_5))
        narutoList.add(Naruto(" 日向雏田 ",R.drawable.image_6))
        narutoList.add(Naruto(" 山中井野 ",R.drawable.image_7))
        narutoList.add(Naruto(" 秋道丁次 ",R.drawable.image_8))
        narutoList.add(Naruto(" 猿飞阿斯玛 ",R.drawable.image_9))
        narutoList.add(Naruto(" 犬冢牙 ",R.drawable.image_10))
        narutoList.add(Naruto(" 油女志乃 ",R.drawable.image_11))
        narutoList.add(Naruto(" 夕日红 ",R.drawable.image_12))
        narutoList.add(Naruto(" 李洛克 ",R.drawable.image_13))
        narutoList.add(Naruto(" 日向宁次 ",R.drawable.image_14))
        narutoList.add(Naruto(" 天天 ",R.drawable.image_15))
        narutoList.add(Naruto(" 迈特凯 ",R.drawable.image_16))
        narutoList.add(Naruto(" 自来也 ",R.drawable.image_17))
        narutoList.add(Naruto(" 大蛇丸 ",R.drawable.image_18))
        narutoList.add(Naruto(" 纲手 ",R.drawable.image_19))
        narutoList.add(Naruto(" 赤丸 ",R.drawable.image_20))
        narutoList.add(Naruto(" 大和 ",R.drawable.image_21))
        narutoList.add(Naruto(" 志村团藏 ",R.drawable.image_22))
        narutoList.add(Naruto(" 佐井 ",R.drawable.image_23))
        narutoList.add(Naruto(" 千手柱间 ",R.drawable.image_24))
        narutoList.add(Naruto(" 宇智波斑 ",R.drawable.image_25))
        narutoList.add(Naruto(" 千手扉间 ",R.drawable.image_26))
        narutoList.add(Naruto(" 波风水门 ",R.drawable.image_27))
        narutoList.add(Naruto(" 伊鲁卡 ",R.drawable.image_28))
        narutoList.add(Naruto(" 猿飞日斩 ",R.drawable.image_29))
        narutoList.add(Naruto(" 玖辛奈 ",R.drawable.image_30))

    }
}