package com.example.hackatonkuit.ui.pay

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.hackatonkuit.databinding.FragmentPayBinding

class PayFragment : Fragment() {

    lateinit var binding : FragmentPayBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentPayBinding.inflate(inflater, container, false)
        return binding.root
    }
}