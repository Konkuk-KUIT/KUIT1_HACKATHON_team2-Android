package com.example.hackatonkuit

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager2.widget.ViewPager2
import com.example.hackatonkuit.databinding.ActivityCartBinding
import com.example.hackatonkuit.ui.cart.CartVPAdapter
import com.google.android.material.tabs.TabLayoutMediator

class CartActivity : AppCompatActivity() {
    lateinit var binding : ActivityCartBinding
    val tabList = listOf<String>("음료/푸드", "상품")


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCartBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initLayout()
    }

    fun initLayout(){
        val adapter = CartVPAdapter(this)
        binding.vpCart.adapter = adapter
        TabLayoutMediator(binding.tbCart, binding.vpCart){tab, position ->
            tab.text = tabList[position]
        }.attach()
    }
}