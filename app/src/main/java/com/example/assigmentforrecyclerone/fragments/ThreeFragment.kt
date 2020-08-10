package com.example.assigmentforrecyclerone.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.assigmentforrecyclerone.R
import com.example.assigmentforrecyclerone.adapter.ThreeAdapter
import com.example.assigmentforrecyclerone.adapter.TwoAdapter
import com.example.assigmentforrecyclerone.model.Three
import com.example.assigmentforrecyclerone.model.Two
import kotlinx.android.synthetic.main.fragment_second.*
import kotlinx.android.synthetic.main.fragment_three.*

class ThreeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_three, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        var threeList = ArrayList<Three>()
        var threeAdapter= ThreeAdapter(threeList)

        threeList.add(Three("Collection","New Arrivals","Winter",R.drawable.chair_new_arrival1))
        threeList.add(Three("Collection","New Arrivals","Winter",R.drawable.chair_new_arrival))
//        threeList.add(Two(R.drawable.invonne_chair_green,"Ivonne chair, green","$29.00"))
//        threeList.add(Two(R.drawable.conference_chair,"Snakeskin Pattern Buckle","$29.00"))
//        threeList.add(Two(R.drawable.armchair_konna_green,"Armchair Konna green","$29.00"))

        recyclerThree.layoutManager = LinearLayoutManager(
            context,
            LinearLayoutManager.HORIZONTAL, false
        )
        recyclerThree.adapter=threeAdapter
    }
}