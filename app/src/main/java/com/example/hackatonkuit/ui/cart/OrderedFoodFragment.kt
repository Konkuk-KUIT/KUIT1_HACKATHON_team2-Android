package com.example.hackatonkuit.ui.cart

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.hackatonkuit.R
import com.example.hackatonkuit.databinding.FragmentOrderedFoodBinding
import com.example.hackatonkuit.ui.order.Menu

class OrderedFoodFragment : Fragment() {
    lateinit var binding : FragmentOrderedFoodBinding
    lateinit var adapter : OrderedFoodAdapter
    lateinit var menuList : ArrayList<Menu>

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
        menuList = arrayListOf(Menu("민트 콜드 브루"), Menu("콜드 브루"))
    }
}