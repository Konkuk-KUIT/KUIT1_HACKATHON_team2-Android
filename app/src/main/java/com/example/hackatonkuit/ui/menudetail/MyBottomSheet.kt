package com.example.hackatonkuit.ui.menudetail

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
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
        return binding.root
    }


}