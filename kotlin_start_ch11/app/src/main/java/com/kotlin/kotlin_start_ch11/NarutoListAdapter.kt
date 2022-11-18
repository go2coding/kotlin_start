package com.kotlin.kotlin_start_ch11

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

/**
 * Created by lqp on 2022/11/17.
 */
class NarutoListAdapter(private var narutoList:ArrayList<Naruto>):RecyclerView.Adapter<NarutoListAdapter.ViewHolder>() {

    inner class ViewHolder(view:View):RecyclerView.ViewHolder(view){
        var narutoPic:ImageView = view.findViewById(R.id.naruto_pic)
        var narutoName:TextView = view.findViewById(R.id.naruto_name)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.naruto_item_layout,parent,false)
        val viewHolder = ViewHolder(view as View)

        viewHolder.itemView.setOnClickListener{
            val position = viewHolder.adapterPosition
            val naruto = narutoList[position]
            Toast.makeText(parent.context,"你点击的是${naruto.name}",Toast.LENGTH_SHORT).show()
        }

        return viewHolder
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val naruto = narutoList[position]
        holder.narutoPic.setImageResource(naruto.imageId)
        holder.narutoName.setText(naruto.name)
    }

    override fun getItemCount(): Int {
        return narutoList.size
    }
}