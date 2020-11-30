package com.example.haivaiapp.postImage

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.haivaiapp.R

class PictureAdapter(private val pictureList: MutableList<Picture>) :
    RecyclerView.Adapter<PictureAdapter.PictureItemViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PictureItemViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.picture_item, parent, false)
        return PictureItemViewHolder(view)
    }

    override fun getItemCount(): Int = pictureList.size


    override fun onBindViewHolder(holder: PictureItemViewHolder, position: Int) {
        (holder as? PictureItemViewHolder)?.bindData(pictureList[position])
    }

    internal var onItemClick: (position: Int) -> Unit = {}

    inner class PictureItemViewHolder(itemView: View) :
        RecyclerView.ViewHolder(itemView) {
        private val imgPicture: ImageView = itemView.findViewById(R.id.imgPicture)

        init {
            imgPicture.setOnClickListener {
                onItemClick.invoke(adapterPosition)
            }
        }

        fun bindData(picture: Picture) {
            pictureList[adapterPosition]
            Glide.with(itemView).load(picture.path).into(imgPicture)

        }
    }

}