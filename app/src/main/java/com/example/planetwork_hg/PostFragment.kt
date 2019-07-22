package com.example.planetwork_hg

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
import androidx.recyclerview.widget.RecyclerView



class PostFragment : Fragment() {
    // 쪽지 리스트
    val letterList : ArrayList<Letter> = ArrayList()
    lateinit var recyclerView : RecyclerView

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        super.onCreate(savedInstanceState)
        var rootView = inflater.inflate(R.layout.fragment_post, container, false) as ViewGroup
        letterList.add(Letter("사진","타입","시간","희지"))

        recyclerView = rootView.findViewById(R.id.rvPost) as RecyclerView

        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager = LinearLayoutManager(requireContext())
        recyclerView.adapter = RvAdapter(requireContext(),letterList)

        return rootView
    }



}