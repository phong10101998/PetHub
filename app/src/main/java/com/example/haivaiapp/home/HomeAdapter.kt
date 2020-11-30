package com.example.haivaiapp.home

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.uits.baseproject.base.BaseAdapter
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.haivaiapp.R
import kotlinx.android.synthetic.main.viewholder_item_home.view.*

class HomeAdapter(private val mContext: Context) : BaseAdapter<HomeAdapter.ItemViewHolder>(mContext) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        var view = LayoutInflater.from(parent.context)
            .inflate(R.layout.viewholder_item_home, parent, false)
        return ItemViewHolder(view)

    }

    override fun getItemCount(): Int {
        return 100
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        holder.onBind()
    }

    inner class ItemViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun onBind() {
            Glide.with(itemView)

                .load("")
                .placeholder(R.drawable.logoapp).into(itemView.mImgAvatar)

        }
    }
}