package com.example.hackatonkuit.ui.menudetail

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.hackatonkuit.databinding.ItemHomeBinding
import com.example.hackatonkuit.ui.home.Home

class OtherMenuAdapter(var items: ArrayList<Home>) : RecyclerView.Adapter<OtherMenuAdapter.ViewHolder>(){

    var onItemClickedListener : OnItemClickedListener? = null
    interface OnItemClickedListener {
        fun onItemClicked(position: Int)
    }
    inner class ViewHolder(val binding : ItemHomeBinding) : RecyclerView.ViewHolder(binding.root){
        fun bind(position: Int){
            binding.homeNewMenuName.text = items[position].name
            binding.root.setOnClickListener {
                onItemClickedListener?.onItemClicked(position)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = ItemHomeBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(position)
    }

}