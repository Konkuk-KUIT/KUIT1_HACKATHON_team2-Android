package com.example.hackatonkuit.ui.order

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.hackatonkuit.databinding.ItemMenulistBinding

class MenuListAdapter(var items: ArrayList<MenuForAdapter>) : RecyclerView.Adapter<MenuListAdapter.ViewHolder>(){

    var onItemClickedListener : OnItemClickedListener? = null
    interface OnItemClickedListener {
        fun onItemClicked(position: Int)
    }
    inner class ViewHolder(val binding : ItemMenulistBinding) : RecyclerView.ViewHolder(binding.root){
        fun bind(position: Int){
            binding.tvMenuName.text = items[position].name
            binding.tvMenuEngName.text = items[position].eng_name
            binding.tvMenuPrice.text = items[position].price.toString() + "원"
            if(items[position].menuStatus != "best")
                binding.tvMenuBest.visibility = View.GONE
            binding.root.setOnClickListener {
                onItemClickedListener?.onItemClicked(position)
            }
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