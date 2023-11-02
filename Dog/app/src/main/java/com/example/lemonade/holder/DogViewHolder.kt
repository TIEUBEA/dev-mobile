package com.example.lemonade.holder

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.lemonade.R

class DogViewHolder(private  val view: View) : RecyclerView.ViewHolder(view){
    val desciptionview = view.findViewById<TextView>(R.id.item_description)
    val nameview = view.findViewById<TextView>(R.id.item_name)
    val imageView = view.findViewById<ImageView>(R.id.item_image)
}