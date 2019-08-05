package com.example.planetwork

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.likelion.planetwork.RegisterActivity
import kotlinx.android.synthetic.main.fragment_writeletter.*

class WriteLetterFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_writeletter, container, false)
        return view
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

//        //뷰 설정
//        //tvFragmentWrite.text = "WriteLetter Fragment"
//        tvFragmentWrite.text = "WriteLetter Fragment"

        // 그림을 터치하면 편지쓰는 액티비티로 전환
        mv_write.setOnClickListener(object :View.OnClickListener {
            override fun onClick(v: View?) {
                val intent = Intent(context, WriteLetterActivity::class.java)
                startActivity(intent)
                activity?.finish()
            }
        })





    }

}