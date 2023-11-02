package com.example.lemonade.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.lemonade.model.Dog
import com.example.lemonade.R
import com.example.lemonade.holder.DogViewHolder

class DogAdapter(private val context : Context, private val dataset : MutableList<Dog>) : RecyclerView.Adapter<DogViewHolder> (){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DogViewHolder {
        val adapterLayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.list_item,parent, false)
        return DogViewHolder(adapterLayout)
    }

    override fun getItemCount(): Int {
       return dataset.size
    }

    override fun onBindViewHolder(holder: DogViewHolder, position: Int) {
        holder.imageView.setImageResource(dataset[position].drawResDog)
        holder.nameview.text = context.resources.getString(dataset[position].dogNameId)
        holder.desciptionview.text = context.resources.getString(dataset[position].descriptionId)
       /* holder.cardview.setOnclickListener{
            Toast.makeText(holder.cardview.context,"salut",Toast.LENGTH_SHORT).show()
        }*/
    }


}