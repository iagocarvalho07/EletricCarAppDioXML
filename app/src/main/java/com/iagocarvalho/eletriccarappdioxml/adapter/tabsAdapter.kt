package com.iagocarvalho.eletriccarappdioxml.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.iagocarvalho.eletriccarappdioxml.screens.CarFavoriteFragment
import com.iagocarvalho.eletriccarappdioxml.screens.CarFragment

class tabsAdapter(framentActivity: FragmentActivity) : FragmentStateAdapter(framentActivity) {
    override fun getItemCount(): Int = 2

    override fun createFragment(position: Int): Fragment {
      return when(position){
           0 -> CarFragment()
           1 -> CarFavoriteFragment()
          else -> CarFragment()
       }
    }
}