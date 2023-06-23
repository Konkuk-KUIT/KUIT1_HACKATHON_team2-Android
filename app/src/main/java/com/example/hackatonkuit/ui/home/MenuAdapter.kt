package com.example.hackatonkuit.ui.home

import android.view.LayoutInflater
import android.view.MenuItem
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.hackatonkuit.databinding.FragmentHomeBinding

class MenuAdapter(var items: ArrayList<MenuItem>): RecyclerView.Adapter<MenuAdapter.MyViewHolder>() {

    inner class MyViewHolder(val binding: FragmentHomeBinding):RecyclerView.ViewHolder(binding.root){
        fun bind(position: Int){
            //binding.homeNewName.text = items[position].
            //binding.homeNewImage.id = HomeFragment.MenuItem.menuimage
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val binding = FragmentHomeBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return MyViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.bind(position)
    }
}