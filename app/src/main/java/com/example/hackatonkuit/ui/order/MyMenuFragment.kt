package com.example.hackatonkuit.ui.order

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.hackatonkuit.R
import com.example.hackatonkuit.databinding.FragmentMyMenuBinding
import com.example.hackatonkuit.databinding.FragmentOrderBinding
import com.google.android.material.tabs.TabLayoutMediator

class MyMenuFragment : Fragment() {
    lateinit var binding: FragmentMyMenuBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentMyMenuBinding.inflate(layoutInflater)
        return binding.root
    }

}