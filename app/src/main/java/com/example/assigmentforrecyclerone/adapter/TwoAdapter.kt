package com.example.assigmentforrecyclerone.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.assigmentforrecyclerone.R
import com.example.assigmentforrecyclerone.model.Two
import kotlinx.android.synthetic.main.item_two.view.*

class TwoAdapter (var twoList:ArrayList<Two>): RecyclerView.Adapter<TwoAdapter.TwoViewHolder>(){
    class TwoViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        fun bindAssignTwo(two: Two)
        {
            this.itemView.imgItem.setImageResource(two.ItemImage)
            this.itemView.textName.text=two.Name
            this.itemView.textPrice.text=two.Price
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TwoViewHolder {
        var view= LayoutInflater.from(parent.context).inflate(R.layout.item_two,parent,false)
        return TwoViewHolder(view)
    }

    override fun getItemCount(): Int {
        return twoList.size
    }

    override fun onBindViewHolder(holder: TwoViewHolder, position: Int) {
        holder.bindAssignTwo(twoList[position])
    }
}