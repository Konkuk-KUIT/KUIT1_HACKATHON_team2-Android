package com.example.hackatonkuit.ui.home

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.hackatonkuit.databinding.ItemHomeBinding

class HomeAdapter(var items: ArrayList<HomeInfo>): RecyclerView.Adapter<HomeAdapter.MyViewHolder>() {

    inner class MyViewHolder(val binding: ItemHomeBinding):RecyclerView.ViewHolder(binding.root){
        fun bind(position: Int){
            binding.homeNewMenuName.text = items[position].name
            //binding.homeNewImage.id = HomeFragment.MenuItem.menuimage
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val binding = ItemHomeBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return MyViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.bind(position)
    }
}