package com.example.assigmentforrecyclerone.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.assigmentforrecyclerone.R
import com.example.assigmentforrecyclerone.adapter.FourAdapter
import com.example.assigmentforrecyclerone.model.Four
import kotlinx.android.synthetic.main.fragment_four.*

class FourFragment : Fragment() {

       override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_four, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        var fourList = ArrayList<Four>()
        var fourAdapter= FourAdapter(fourList)

        fourList.add(Four(R.drawable.chair_yellow,"Ruffle Trim Spot Wrap Dress","$29.00"))
        fourList.add(Four(R.drawable.chair_yellow,"Leaf Floral Print Random Pattern Buckle","$29.00"))
        fourList.add(Four(R.drawable.chair_yellow,"Drop Shoulder Geo Pattern","$29.00"))

        recyclerFour.layoutManager = LinearLayoutManager(
            context,
            LinearLayoutManager.VERTICAL, false
        )
        recyclerFour.adapter=fourAdapter
    }
}