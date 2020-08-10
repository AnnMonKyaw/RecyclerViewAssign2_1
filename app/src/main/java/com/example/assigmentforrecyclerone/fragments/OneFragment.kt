package com.example.assigmentforrecyclerone.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.assigmentforrecyclerone.R
import com.example.assigmentforrecyclerone.adapter.OneAdapter
import com.example.assigmentforrecyclerone.model.One
import kotlinx.android.synthetic.main.fragment_one.*

class OneFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_one, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        var oneList = ArrayList<One>()
        var oneAdapter = OneAdapter(oneList)

        oneList.add(One(R.drawable.chair_yellow,"Chairs","1126 items"))
        oneList.add(One(R.drawable.table1,"Tables","442 items"))
        oneList.add(One(R.drawable.sofa,"Sofa","1865 items"))

        recyclerOne.layoutManager = LinearLayoutManager(
            context,
            LinearLayoutManager.HORIZONTAL, false
        )
        recyclerOne.adapter = oneAdapter
    }
}