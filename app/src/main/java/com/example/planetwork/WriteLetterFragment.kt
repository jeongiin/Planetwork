package com.example.planetwork

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.likelion.planetwork.RegisterActivity
import kotlinx.android.synthetic.main.fragment_writeletter.*
import org.jetbrains.anko.sdk27.coroutines.onClick

class WriteLetterFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_writeletter, container, false)
//        mv_write.setOnClickListener {view ->
//            val intent = Intent(context, WriteLetterActivity::class.java)
//            startActivity (intent)
//            activity?.finish()
//        }
        return view
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        mv_write.setOnClickListener {view ->
            val intent = Intent(context, WriteLetterActivity::class.java)
            startActivity (intent)
            //activity?.finish()
        }
    }
}