package com.example.myviewpager

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class PagerRecyclerAdapter (var item: ArrayList<pageItem>):RecyclerView.Adapter<PagerViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PagerViewHolder {
        return PagerViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.layout_intro, parent, false))
    }

    override fun getItemCount(): Int {
        return item.size
    }

    override fun onBindViewHolder(holder: PagerViewHolder, position: Int) {
        holder.bindWidthView(item[position])
    }
}