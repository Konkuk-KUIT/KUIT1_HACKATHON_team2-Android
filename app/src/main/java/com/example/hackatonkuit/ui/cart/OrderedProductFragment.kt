package com.example.hackatonkuit.ui.cart

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.hackatonkuit.databinding.FragmentOrderedProductBinding

class OrderedProductFragment : Fragment() {
    lateinit var binding: FragmentOrderedProductBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentOrderedProductBinding.inflate(inflater, container, false)
        return binding.root
    }
}