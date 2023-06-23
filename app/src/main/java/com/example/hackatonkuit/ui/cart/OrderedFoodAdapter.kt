package com.example.hackatonkuit.ui.cart

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.hackatonkuit.databinding.ItemCartOrderedMenuBinding
import com.example.hackatonkuit.ui.order.MenuForAdapter

class OrderedFoodAdapter(var items: ArrayList<MenuForAdapter>) : RecyclerView.Adapter<OrderedFoodAdapter.ViewHolder>(){

    inner class ViewHolder(val binding : ItemCartOrderedMenuBinding) : RecyclerView.ViewHolder(binding.root){
        fun bind(position: Int){
            binding.tvCartOrderedMenuName.text = items[position].name
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = ItemCartOrderedMenuBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(position)
    }

}