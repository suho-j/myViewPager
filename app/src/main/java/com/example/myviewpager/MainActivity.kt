package com.example.myviewpager

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.viewpager2.widget.ViewPager2
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var pageItemList = ArrayList<pageItem>()




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnPrevious.setOnClickListener{
            viewPager2.currentItem = viewPager2.currentItem - 1
        }

        btnNext.setOnClickListener{
            viewPager2.currentItem = viewPager2.currentItem + 1
        }

        pageItemList.add(pageItem(Color.RED, "첫번째", R.drawable.ic_pager_item_1))
        pageItemList.add(pageItem(Color.GREEN, "두번째", R.drawable.ic_pager_item_2))
        pageItemList.add(pageItem(Color.BLUE, "세번째", R.drawable.ic_pager_item_3))

        // Hide the status bar.
        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN
        // Remember that you should never show the action bar if the
        // status bar is hidden, so hide that too if necessary.
        actionBar?.hide()

        var pagerRecyclerAdapter = PagerRecyclerAdapter(pageItemList)

        viewPager2.apply{
            adapter = pagerRecyclerAdapter
            orientation = ViewPager2.ORIENTATION_HORIZONTAL
        }

//        viewPager2.adapter = pagerRecyclerAdapter
//        viewPager2.orientation = ViewPager2.ORIENTATION_HORIZONTAL
    }
}