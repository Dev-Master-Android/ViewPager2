package com.example.viewpager2

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView


class PictureFragment : Fragment() {

    companion object {
        private const val ARG_PICTURE = "picture"

        fun newInstance(picture: Picture): PictureFragment {
            val fragment = PictureFragment()
            val args = Bundle()
            args.putParcelable(ARG_PICTURE, picture)
            fragment.arguments = args
            return fragment
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_picture, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val picture: Picture? = arguments?.getParcelable(ARG_PICTURE)
        view.findViewById<TextView>(R.id.titleTextView).text = picture?.title
        view.findViewById<TextView>(R.id.authorTextView).text = picture?.author
        view.findViewById<ImageView>(R.id.imageView).setImageResource(picture?.imageResId ?: 0)
    }
}

