package com.example.planetwork_hg

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import java.net.BindException

class RvAdapter(val context: Context, val letterList, ArrayList<Letter>) :
RecyclerView.Adapter<RvAdapter.Holder>() {

    inner class Holder(itemView: View?) : RecyclerView.ViewHolder(itemView) {
        val letterPhoto = itemView?.findViewById<ImageView>(R.id.imgLetterType)
        val letterType = itemView?.findViewById<TextView>(R.id.tvLetterType)
        val letterTime = itemView?.findViewById<TextView>(R.id.tvLetterTime)

        fun bind (letter: Letter, context: Context ) {
            /* letterPhoto의 setImageResource에 들어갈 이미지의 id를 파일명(String)으로 찾고,
          이미지가 없는 경우 안드로이드 기본 아이콘으로 표시.*/
            if (letter.photo != "") {
                val resourceId = context.resources.getIdentifier(letter.photo, "drawable", context.packageName)
                letterPhoto?.setImageResource(resourceId)
            } else {
                letterPhoto?.setImageResource(R.mipmap.ic_launcher)
            }
            /* 나머지 TextView와 String 데이터를 연결한다. */
            letterType?.text = letter.type
            letterTime?.text = letter.time
        }
    }

    // 화면을 최초 로딩하여 만들어진 View가 없는 경우, xml파일을 inflate하여 ViewHolder를 생성
    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): Holder {
        val view = LayoutInflater.from(context).inflate(R.layout.item_letter, parent, false)
        return Holder(view)
    }
    //  RecyclerView로 만들어지는 item의 총 개수를 반환
    override fun getItemCount(): Int {
        return letterList.size
    }
    // 위의 onCreateViewHolder에서 만든 view와 실제 입력되는 각각의 데이터를 연결
    override fun onBindViewHolder(holder: Holder?, position: Int) {
        holder?.bind(letterList[position], context)
    }
}