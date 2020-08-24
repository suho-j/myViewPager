package com.example.myviewpager

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.layout_intro.view.*

class PagerViewHolder(itemView:View):RecyclerView.ViewHolder(itemView) {
    fun bindWidthView(item:pageItem)
    {
        itemView.setBackgroundColor(item.bgColor)
        itemView.textView.text = item.context
        itemView.imageView.setImageResource(item.ImageSrc)
    }
}