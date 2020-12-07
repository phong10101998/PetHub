package com.example.haivaiapp.postImage

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.haivaiapp.R
import kotlinx.android.synthetic.main.picture_item.view.*

class PictureAdapter(private val pictureList: MutableList<Picture>,val onPictureClick : (Int, String) -> Unit) :
    RecyclerView.Adapter<PictureAdapter.PictureItemViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PictureItemViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.picture_item, parent, false)
        return PictureItemViewHolder(view,onPictureClick)
    }

    override fun getItemCount(): Int = pictureList.size


    override fun onBindViewHolder(holder: PictureItemViewHolder, position: Int) {
        (holder as? PictureItemViewHolder)?.bindData(pictureList[position])

    }


    inner class PictureItemViewHolder(itemView: View, var onItemClick: (Int, String) -> Unit) :
        RecyclerView.ViewHolder(itemView) {
        private val imgPicture: ImageView = itemView.imgPicture

        fun bindData(picture: Picture) {
            pictureList[adapterPosition]
            Glide.with(itemView).load(picture.path).into(imgPicture)
            imgPicture.setOnClickListener { onItemClick.invoke(adapterPosition, picture.path) }
        }
    }

}