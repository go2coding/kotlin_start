package com.kotlin.banner

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.FrameLayout
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager2.widget.ViewPager2
import kotlinx.coroutines.Job
import kotlinx.coroutines.MainScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

/**
 * Created by lqp on 2022/11/18.
 */
class BannerView @JvmOverloads constructor(context: Context,attrs: AttributeSet?, defStyleAttr: Int = 0) :
    FrameLayout(context,attrs,defStyleAttr) {


    var viewPager:ViewPager2

    var autoplayJob:Job?=null
    var viewScope = MainScope()


    init {
        viewPager = ViewPager2(context)
        viewPager.orientation = ViewPager2.ORIENTATION_HORIZONTAL
        viewPager.offscreenPageLimit = 1

        val viewPageLP = LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT)

        addView(viewPager,viewPageLP)
    }

    fun setData(dataList:ArrayList<BannerInfo>){

        var adapter = Adapter(dataList)
        viewPager.adapter = adapter

        autoplayJob = viewScope.launch {
            while (true){

                if (viewPager.currentItem >= dataList.size-1){
                    viewPager.setCurrentItem(0,true)
                }
                else{
                    viewPager.setCurrentItem(viewPager.currentItem+1,true)
                }


                delay(3000)
            }
        }

    }

    inner class Adapter(var dataList:ArrayList<BannerInfo>):RecyclerView.Adapter<Adapter.ViewHolder>(){

        inner class ViewHolder(view:View):RecyclerView.ViewHolder(view){
            var pic:ImageView = view.findViewById(R.id.image_view1)

        }

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

            val view = LayoutInflater.from(parent.context).inflate(R.layout.item_banner_image,parent,false)
            val viewHolder = ViewHolder(view as View)
            return viewHolder;
        }

        override fun onBindViewHolder(holder: ViewHolder, position: Int) {
            val banner = dataList[position]
            holder.pic.setImageResource(banner.imageId)
        }

        override fun getItemCount(): Int {
            return dataList.size
        }
    }
}