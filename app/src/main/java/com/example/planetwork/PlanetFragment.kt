package com.example.planetwork

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_writeletter.*
import kotlinx.android.synthetic.main.fragment_planet.*
import org.jetbrains.anko.support.v4.intentFor
import java.lang.reflect.Array.newInstance

class PlanetFragment : Fragment() {

    private var count:Int? = null

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        return inflater.inflate(R.layout.fragment_planet, container, false)

    }


    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        // count 값 받기
        val activity = getActivity() as MainActivity?
        val count = activity?.getMyCount()

        tvFragmentPla.text = "$count"
    }

}

