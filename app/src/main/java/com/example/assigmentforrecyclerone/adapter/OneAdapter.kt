package com.example.assigmentforrecyclerone.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.assigmentforrecyclerone.R
import com.example.assigmentforrecyclerone.model.One
import kotlinx.android.synthetic.main.item_one.view.*

class OneAdapter (var oneList:ArrayList<One>): RecyclerView.Adapter<OneAdapter.OneViewHolder>(){
    class OneViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
        fun bindAssignOne(one: One)
        {
            this.itemView.imgChair.setImageResource(one.ChairImage)
            this.itemView.textChairName.text=one.ChairName
            this.itemView.textItemCount.text=one.ItemCount
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): OneViewHolder {
        var view=LayoutInflater.from(parent.context).inflate(R.layout.item_one,parent,false)
        return OneViewHolder(view)
    }

    override fun getItemCount(): Int {
        return oneList.size
    }

    override fun onBindViewHolder(holder: OneViewHolder, position: Int) {
        holder.bindAssignOne(oneList[position])
    }
}