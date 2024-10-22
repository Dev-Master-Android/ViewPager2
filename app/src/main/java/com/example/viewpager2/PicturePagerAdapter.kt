package com.example.viewpager2

import android.annotation.SuppressLint
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter

class PicturePagerAdapter(fragmentManager: FragmentManager, lifecycle: Lifecycle) :
    FragmentStateAdapter(fragmentManager, lifecycle) {

    private val pictureList = mutableListOf<Picture>()

    @SuppressLint("NotifyDataSetChanged")
    fun setPictures(pictures: List<Picture>) {
        pictureList.clear()
        pictureList.addAll(pictures)
        notifyDataSetChanged()
    }

    override fun getItemCount(): Int = pictureList.size

    override fun createFragment(position: Int): Fragment {
        return PictureFragment.newInstance(pictureList[position])
    }
}

