package com.example.planetwork_hg

import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class PostFragment : Fragment() {
    // 쪽지 리스트
    var letterList = arrayListOf<Letter>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val mAdapter = RvAdapter(this, letterList)
        recyclerView.adapter = mAdapter

        val lm = LinearLayoutManager(this)
        recyclerView.layoutManager = lm
        recyclerView.setHasFixedSize(true)      //바뀔 수 있는 크기를 고정해줌.

}