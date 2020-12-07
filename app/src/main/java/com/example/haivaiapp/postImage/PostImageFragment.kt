package com.example.haivaiapp.postImage

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import com.bumptech.glide.Glide
import com.example.haivaiapp.R
import kotlinx.android.synthetic.main.fragment_post_image.*
import kotlinx.android.synthetic.main.picture_item.*
import kotlinx.android.synthetic.main.picture_item.view.*

class PostImageFragment : Fragment() {

    companion object {
        fun newInstance(imageUri: String) = PostImageFragment().apply {
            arguments = Bundle().apply {
                putString("imageKey", imageUri)
            }
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_post_image, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        arguments?.getString("imageKey")?.run {
            Glide.with(ImagePickFrame).load(this).into(ImgImageChoose)
        }
    }
}