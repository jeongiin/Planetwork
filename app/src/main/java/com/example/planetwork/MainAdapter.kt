package com.example.planetwork
import android.util.Log
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter

class MainAdapter(fm: FragmentManager) : FragmentStatePagerAdapter(fm) {

    // private val fragmentTitleList = mutableListOf("WriteLetter","BlueBirdFragment","PlanetFragment","PostFragment","SettingFragment")

    override fun getItem(position: Int): Fragment? {

        return when(position) {

            0       ->  {PlanetFragment()}

            1       ->  {BlueBirdFragment()}

            2       ->  {WriteLetterFragment()}

            3       ->  {PostFragment()}

            4       ->  {SettingFragment()}

            else    ->  {PlanetFragment()}
        }

    }

    // 생성 할 Fragment 의 개수
    override fun getCount() = 5

    override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {
        super.destroyItem(container, position, `object`)
        Log.e("FragmentPagerAdapter", "destroyItem position : $position")
    }
    override fun getPageTitle(position: Int): CharSequence? {
        return null//fragmentTitleList[position] 글자 안보이게
    }



}