package com.example.hackatonkuit.ui.order

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.hackatonkuit.databinding.ItemMenulistBinding

class MenuListAdapter(var items: ArrayList<Menu>) : RecyclerView.Adapter<MenuListAdapter.ViewHolder>(){

    inner class ViewHolder(val binding : ItemMenulistBinding) : RecyclerView.ViewHolder(binding.root){
        fun bind(position: Int){
            binding.tvMenuName.text = items[position].name
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = ItemMenulistBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(position)
    }

}