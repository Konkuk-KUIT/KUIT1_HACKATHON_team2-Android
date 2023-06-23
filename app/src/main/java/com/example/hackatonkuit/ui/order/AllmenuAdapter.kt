package com.example.hackatonkuit.ui.order

import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.hackatonkuit.databinding.ItemAllmenuCvBinding
import org.intellij.lang.annotations.JdkConstants.TitledBorderTitlePosition

class AllmenuAdapter(private val items: ArrayList<AllmenuInfo>) : RecyclerView.Adapter<AllmenuAdapter.ViewHolder>() {

    var onItemClickListener: OnItemClickListener? = null
    interface OnItemClickListener {
        fun onItemClicked(position: Int)
    }

    inner class ViewHolder(val binding: ItemAllmenuCvBinding) : RecyclerView.ViewHolder(binding.root) {

        fun bind(position: Int) {
            Log.d("qwerty123", items[position].image)
            binding.coffeekorTv.text = items[position].name
            binding.coffeeengTv.text = items[position].eng_name
            binding.root.setOnClickListener {
                onItemClickListener?.onItemClicked(position)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding =
            ItemAllmenuCvBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(position)
    }




}