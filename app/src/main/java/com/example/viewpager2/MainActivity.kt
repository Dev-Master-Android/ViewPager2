package com.example.viewpager2


import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager2.widget.ViewPager2


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val viewPager = findViewById<ViewPager2>(R.id.viewPager)
        val adapter = PicturePagerAdapter(supportFragmentManager, lifecycle)
        viewPager.adapter = adapter

        adapter.setPictures(OnBoardingFragmentViewPagerModel.pagerViewList)
    }
}
