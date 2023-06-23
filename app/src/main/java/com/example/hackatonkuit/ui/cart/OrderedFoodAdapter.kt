package com.example.hackatonkuit.ui.cart

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.hackatonkuit.databinding.ItemCartOrderedMenuBinding
import com.example.hackatonkuit.retrofit2.CartItem
import com.example.hackatonkuit.ui.order.MenuForAdapter

class OrderedFoodAdapter(var items: ArrayList<CartItem>) :
    RecyclerView.Adapter<OrderedFoodAdapter.ViewHolder>() {

    inner class ViewHolder(val binding: ItemCartOrderedMenuBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(position: Int) {
            val item = items[position]
            binding.tvCartOrderedMenuName.text = item.menuName
            binding.tvCartOrderedMenuEngName.text = item.menuEngName
            binding.tvCartOrderedMenuOptionPrice.text = item.menuPrice + "원"
            binding.tvCartOrderedMenuTotalPrice.text = item.price.toString() + "원"
            binding.tvCartOrderedMenuSelectedOptions.text =
                item.temp + "|" + item.size + "|" + item.cup
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding =
            ItemCartOrderedMenuBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(position)
    }
//
//    fun checkAll(){
//        items.forEach {
//            it.
//        }
//    }

}