package com.example.planetwork_hg

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.viewpager.widget.ViewPager
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    private    val adapter by lazy { MainAdapter(supportFragmentManager) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //뷰 페이저 어뎁터 연결
        //vpMainActivity.adapter= MainActivity@adapter
        val fragmentAdapter = MainAdapter(supportFragmentManager)
        vpMainActivity.adapter = fragmentAdapter

        vpMainActivity.addOnPageChangeListener(object: ViewPager.OnPageChangeListener {

            override fun onPageScrollStateChanged(state: Int) {
                Log.e("히지페이지스테이트체인지","done")
            }

            override fun onPageScrolled(position: Int, positionOffset: Float, positionOffsetPixels: Int) {
                Log.e("히지페이지스크롤",position.toString())
            }

            override fun onPageSelected(position: Int) {

                tabLayout.getTabAt(0)?.setIcon(R.drawable.planet_g)
                tabLayout.getTabAt(1)?.setIcon(R.drawable.blue_bird_g)
                tabLayout.getTabAt(2)?.setIcon(R.drawable.write_g)
                tabLayout.getTabAt(3)?.setIcon(R.drawable.post2_g)
                tabLayout.getTabAt(4)?.setIcon(R.drawable.set_g)
                Log.e("히지Position",position.toString())

                when(position) {

                    0   ->    tabLayout.getTabAt(0)?.setIcon(R.drawable.planet_w)
                    1   ->    tabLayout.getTabAt(1)?.setIcon(R.drawable.blue_bird_w)
                    2   ->    tabLayout.getTabAt(2)?.setIcon(R.drawable.write_w)
                    3   ->    tabLayout.getTabAt(3)?.setIcon(R.drawable.post2_w)
                    4   ->    tabLayout.getTabAt(4)?.setIcon(R.drawable.set_w)
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


}