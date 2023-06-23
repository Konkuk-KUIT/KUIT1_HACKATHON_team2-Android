package com.example.hackatonkuit.ui.order

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.example.hackatonkuit.CartActivity
import com.example.hackatonkuit.databinding.FragmentOrderBinding
import com.google.android.material.tabs.TabLayoutMediator

class OrderFragment : Fragment() {
    lateinit var binding: FragmentOrderBinding
    val tabList: List<String> = listOf<String>("전체 메뉴", "나만의 메뉴")

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentOrderBinding.inflate(layoutInflater)
        initLayout()
        return binding.root
    }

    fun initLayout() {
        binding.searchIv.setOnClickListener {
            val i = Intent(requireContext(), SearchActivity::class.java)
            startActivity(i)
        }

        val adapter = OrderVPAdapter(this)
        binding.menuVp.adapter = adapter
        TabLayoutMediator(binding.menuTb1, binding.menuVp) {tab, position ->
            tab.text = tabList[position]
        }.attach()
        binding.bagIv.setOnClickListener {
            val i = Intent(requireContext(), CartActivity::class.java)
            startActivity(i)
        }
    }
}