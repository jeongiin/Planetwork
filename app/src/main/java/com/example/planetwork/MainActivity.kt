package com.example.planetwork

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.viewpager.widget.ViewPager
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_planet.*
import android.R.attr.fragment
import android.R.attr.fragment
import android.content.Intent
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction


class MainActivity : AppCompatActivity() {

    private val adapter by lazy { MainAdapter(supportFragmentManager) }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //뷰 페이저 어뎁터 연결
        //vpMainActivity.adapter= MainActivity@adapter
        val fragmentAdapter = MainAdapter(supportFragmentManager)
        vpMainActivity.adapter = fragmentAdapter

        vpMainActivity.addOnPageChangeListener(object : ViewPager.OnPageChangeListener {

            override fun onPageScrollStateChanged(state: Int) {
            }

            override fun onPageScrolled(position: Int, positionOffset: Float, positionOffsetPixels: Int) {
            }

            override fun onPageSelected(position: Int) {

                tabLayout.getTabAt(0)?.setIcon(R.drawable.planet_g)
                tabLayout.getTabAt(1)?.setIcon(R.drawable.blue_bird_g)
                tabLayout.getTabAt(2)?.setIcon(R.drawable.write_g)
                tabLayout.getTabAt(3)?.setIcon(R.drawable.post2_g)
                tabLayout.getTabAt(4)?.setIcon(R.drawable.set_g)

                when (position) {

                    0 -> tabLayout.getTabAt(0)?.setIcon(R.drawable.planet_w)
                    1 -> tabLayout.getTabAt(1)?.setIcon(R.drawable.blue_bird_w)
                    2 -> tabLayout.getTabAt(2)?.setIcon(R.drawable.write_w)
                    3 -> tabLayout.getTabAt(3)?.setIcon(R.drawable.post2_w)
                    4 -> tabLayout.getTabAt(4)?.setIcon(R.drawable.set_w)
                }


            }

        })
        //탭 레이아웃에 뷰테이저 연결
        tabLayout.setupWithViewPager(vpMainActivity)



        tabLayout.getTabAt(0)?.setIcon(R.drawable.planet_w)
        tabLayout.getTabAt(1)?.setIcon(R.drawable.blue_bird_g)
        tabLayout.getTabAt(2)?.setIcon(R.drawable.write_g)
        tabLayout.getTabAt(3)?.setIcon(R.drawable.post_g)
        tabLayout.getTabAt(4)?.setIcon(R.drawable.set_g)


    }

    fun getMyCount():Int{

        // count를 intent로 받음 ( 단, 초기 값은 0 )
        var count = intent.getIntExtra("count",0)

        // 저장된 count 값 불러오기 위한 선언 후 에디터로 초기화
        val pref = this.getPreferences(0)

        //데이터 호출 데이터 없으면 0됨
        var count_saved = pref.getInt("count",0)

        // 에디터로 초기화 후 count값 저장
        val editor = pref.edit()

        Log.e("count","$count")
        Log.e("count_saved","$count_saved")

        // 보내기 해줬을 때 새롭게 editor 갱신
        if ( count != 0 ) {
            editor.putInt("count", count).apply()
            return count
        }

        else
            return count_saved

    }

    fun getMyUsername(): String{
        var name=intent.getStringExtra("username")

        // 저장된 count 값 불러오기 위한 선언 후 에디터로 초기화
        val pref = this.getPreferences(0)

        //데이터 호출 데이터 없으면 0됨
        var name_saved = pref.getString("username",name)

        // 에디터로 초기화 후 name값 저장
        val editor = pref.edit()

        Log.e("name","$name")
        Log.e("name_saved","$name_saved")
        editor.putString("username",name_saved).apply()

        // 보내기 해줬을 때 새롭게 editor 갱신
        if ( name != null ) {
            return  name
        }
        else {
            Log.e("이름_Main","$name_saved")
            return name_saved.toString()
        }
    }


}
