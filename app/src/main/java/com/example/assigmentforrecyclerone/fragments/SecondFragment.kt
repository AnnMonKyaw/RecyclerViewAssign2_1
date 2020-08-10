package com.example.assigmentforrecyclerone.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.assigmentforrecyclerone.R
import com.example.assigmentforrecyclerone.adapter.TwoAdapter
import com.example.assigmentforrecyclerone.model.Two
import kotlinx.android.synthetic.main.fragment_one.*
import kotlinx.android.synthetic.main.fragment_second.*

class SecondFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_second, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        var twoList = ArrayList<Two>()
        var twoAdapter= TwoAdapter(twoList)

        twoList.add(Two(R.drawable.chair_yellow,"Ivonne chair, green","$29.00"))
        twoList.add(Two(R.drawable.conference_chair,"Snakeskin Pattern Buckle","$29.00"))
        twoList.add(Two(R.drawable.chair_yellow,"Armchair Konna green","$29.00"))

//        twoList.add(Two(R.drawable.invonne_chair_green,"Ivonne chair, green","$29.00"))
//        twoList.add(Two(R.drawable.conference_chair,"Snakeskin Pattern Buckle","$29.00"))
//        twoList.add(Two(R.drawable.armchair_konna_green,"Armchair Konna green","$29.00"))

        recyclerTwo.layoutManager = LinearLayoutManager(
            context,
            LinearLayoutManager.VERTICAL, false
        )
        recyclerTwo.adapter=twoAdapter
    }
}