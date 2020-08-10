package com.example.assigmentforrecyclerone.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.assigmentforrecyclerone.R
import com.example.assigmentforrecyclerone.model.Four
import kotlinx.android.synthetic.main.item_four.view.*

class FourAdapter(var fourList:ArrayList<Four>): RecyclerView.Adapter<FourAdapter.FourViewHolder>() {
    class FourViewHolder (itemView: View):RecyclerView.ViewHolder(itemView)
    {
        fun bindAssignFour(four: Four)
        {
            this.itemView.imgItem1.setImageResource(four.ItemImage)
            this.itemView.textName1.text=four.nameOne
            this.itemView.textPrice1.text=four.Price
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FourViewHolder {
        var view= LayoutInflater.from(parent.context).inflate(R.layout.item_four,parent,false)
        return FourAdapter.FourViewHolder(view)
    }

    override fun getItemCount(): Int {
        return fourList.size
    }

    override fun onBindViewHolder(holder: FourViewHolder, position: Int) {
        holder.bindAssignFour(fourList[position])
    }
}