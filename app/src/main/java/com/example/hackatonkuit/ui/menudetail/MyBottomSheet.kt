package com.example.hackatonkuit.ui.menudetail

import android.app.Activity
import android.content.Context
import android.os.Bundle
import android.util.DisplayMetrics
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.hackatonkuit.R
import com.example.hackatonkuit.databinding.FragmentMenuOrderBinding
import com.google.android.material.bottomsheet.BottomSheetDialogFragment

class MyBottomSheet() : BottomSheetDialogFragment() {

    lateinit var binding : FragmentMenuOrderBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentMenuOrderBinding.inflate(inflater, container, false)
        initLayout()
        return binding.root
    }

    fun initLayout(){
        binding.rbMenuOrderCup1.setOnCheckedChangeListener { compoundButton, b ->
            if(b)
                binding.rbMenuOrderCup1.setTextColor(requireContext().getColor(R.color.white))
            else
                binding.rbMenuOrderCup1.setTextColor(requireContext().getColor(R.color.black))
        }
        binding.rbMenuOrderCup2.setOnCheckedChangeListener { compoundButton, b ->
            if(b)
                binding.rbMenuOrderCup2.setTextColor(requireContext().getColor(R.color.white))
            else
                binding.rbMenuOrderCup2.setTextColor(requireContext().getColor(R.color.black))
        }
        binding.rbMenuOrderCup3.setOnCheckedChangeListener { compoundButton, b ->
            if(b)
                binding.rbMenuOrderCup3.setTextColor(requireContext().getColor(R.color.white))
            else
                binding.rbMenuOrderCup3.setTextColor(requireContext().getColor(R.color.black))
        }
        binding.rbMenuOrderSize1.setOnCheckedChangeListener { compoundButton, b ->
            if(b)
                binding.rbMenuOrderSize1.setTextColor(requireContext().getColor(R.color.white))
            else
                binding.rbMenuOrderSize1.setTextColor(requireContext().getColor(R.color.black))
        }
        binding.rbMenuOrderSize2.setOnCheckedChangeListener { compoundButton, b ->
            if(b)
                binding.rbMenuOrderSize2.setTextColor(requireContext().getColor(R.color.white))
            else
                binding.rbMenuOrderSize2.setTextColor(requireContext().getColor(R.color.black))
        }
        binding.rbMenuOrderSize3.setOnCheckedChangeListener { compoundButton, b ->
            if(b)
                binding.rbMenuOrderSize3.setTextColor(requireContext().getColor(R.color.white))
            else
                binding.rbMenuOrderSize3.setTextColor(requireContext().getColor(R.color.black))
        }
    }


}