package com.example.hackatonkuit.ui.cart

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.hackatonkuit.ui.order.MenuListFragment
import com.example.hackatonkuit.ui.pay.PayFragment

class CartVPAdapter(fragment: FragmentActivity) : FragmentStateAdapter(fragment) {
    override fun getItemCount(): Int {
        return 2
    }

    override fun createFragment(position: Int): Fragment {
        return when(position){
            0 -> OrderedFoodFragment()
            1 -> OrderedProductFragment()
            else -> OrderedFoodFragment()
        }
    }

}