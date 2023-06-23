package com.example.hackatonkuit.ui.cart

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.hackatonkuit.databinding.FragmentOrderedFoodBinding
import com.example.hackatonkuit.ui.order.MenuForAdapter

class OrderedFoodFragment : Fragment() {
    lateinit var binding : FragmentOrderedFoodBinding
    lateinit var adapter : OrderedFoodAdapter
    lateinit var menuList : ArrayList<MenuForAdapter>

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentOrderedFoodBinding.inflate(inflater, container, false)
        initData()
        initLayout()
        return binding.root
    }

    fun initLayout(){
        adapter = OrderedFoodAdapter(menuList)
        binding.rvCartOrderedMenu.layoutManager = LinearLayoutManager(requireContext(), LinearLayoutManager.VERTICAL, false)
        binding.rvCartOrderedMenu.adapter = adapter
    }

    fun initData(){
        menuList = arrayListOf(MenuForAdapter(0L, "", "민트 초코 라뗴", "", 0, ""), MenuForAdapter(0L, "", "민트 초코 라뗴", "", 0, ""))
    }
}