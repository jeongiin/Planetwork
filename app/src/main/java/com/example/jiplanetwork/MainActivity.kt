package com.example.PlaNetwork

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager.widget.ViewPager
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    private val adapter by lazy { MainAdapter(supportFragmentManager) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //뷰 페이저 어뎁터 연결
        vpMainActivity.adapter= MainActivity@adapter

        vpMainActivity.addOnPageChangeListener(object: ViewPager.OnPageChangeListener {

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