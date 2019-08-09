package com.example.planetwork

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_writeletter.*
import kotlinx.android.synthetic.main.fragment_planet.*
import org.jetbrains.anko.support.v4.find
import org.jetbrains.anko.support.v4.intentFor
import java.lang.reflect.Array.newInstance

class PlanetFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        return inflater.inflate(R.layout.fragment_planet, container, false)

    }


    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        // count 값 받기
        val activity = getActivity() as MainActivity?
        val count = activity?.getMyCount()
        val name =activity?.getMyUsername()

        Log.e("꽃","$count")
        Log.e("이름","$name")

        if (count != null){
            if (count >= 0 && count < 10)
                planet.setImageResource(R.drawable.planet_0)

            else if (count >= 10 && count< 20)
                planet.setImageResource(R.drawable.planet_1)

            else if (count >= 20 && count < 30)
                planet.setImageResource(R.drawable.planet_2)

            else if (count >= 30 && count < 40)
                planet.setImageResource(R.drawable.planet_3)

            else if (count >= 40 && count <50)
                planet.setImageResource(R.drawable.planet_4)

            else if (count >= 50 && count < 60)
                planet.setImageResource(R.drawable.planet_5)

            else if (count >= 60 && count < 70)
                planet.setImageResource(R.drawable.planet_6)

            else if (count >= 70 && count < 80)
                planet.setImageResource(R.drawable.planet_7)

            else
                planet.setImageResource(R.drawable.planet_8)
        }

        username2.text = "$name"+"님 행성에 오신 것을 환영합니다!"
        tvFragmentPla.text = "$count"
    }

}

