package com.example.assigmentforrecyclerone.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.assigmentforrecyclerone.R
import com.example.assigmentforrecyclerone.model.Three
import kotlinx.android.synthetic.main.activity_main.view.*
import kotlinx.android.synthetic.main.item_three.view.*

class ThreeAdapter(var threeList:ArrayList<Three>):RecyclerView.Adapter<ThreeAdapter.ThreeViewHolder>() {
    class ThreeViewHolder(itemView: View):RecyclerView.ViewHolder(itemView)
    {
        fun bindThree(three: Three)
        {
            this.itemView.txt1.text=three.Text1
            this.itemView.txt2.text=three.Text2
            this.itemView.txt3.text=three.Text3
            this.itemView.img1.setImageResource(three.Image)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ThreeViewHolder {
        var view=LayoutInflater.from(parent.context).inflate(R.layout.item_three,parent,false)
        return ThreeViewHolder(view)
    }

    override fun getItemCount(): Int {
        return threeList.size
    }

    override fun onBindViewHolder(holder: ThreeViewHolder, position: Int) {
        holder.bindThree(threeList[position])
    }
}