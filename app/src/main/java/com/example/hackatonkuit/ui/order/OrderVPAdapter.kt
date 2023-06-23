package com.example.hackatonkuit.ui.order

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter

class OrderVPAdapter(fragment: Fragment): FragmentStateAdapter(fragment) {
    override fun getItemCount(): Int = 10

    override fun createFragment(position: Int): Fragment {
        return when(position) {
            1->AllMenuFragment()
            2->MyMenuFragment()
            else->OrderFragment()
        }
    }




}