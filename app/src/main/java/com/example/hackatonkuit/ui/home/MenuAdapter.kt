package com.example.hackatonkuit.ui.home

import android.view.LayoutInflater
import android.view.MenuItem
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.hackatonkuit.databinding.FragmentHomeBinding

class MenuAdapter(var items:): RecyclerView.Adapter<MenuAdapter.MyViewHolder>() {

    var datalist = mutableListOf<HomeFragment>()

    inner class MyViewHolder(private val binding: FragmentHomeBinding):RecyclerView.ViewHolder(binding.root){
        fun bind(menuItem: MenuItem){
            binding.homeNewName.text = MenuItem.menuname
            binding.homeNewImage.id = HomeFragment.MenuItem.menuimage
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = ItemMenuBinding.inflate(inflater, parent, false)
        return MenuViewHolder(binding)
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val menuItem = menuItems[position]
        holder.bind(menuItem)
    }
}