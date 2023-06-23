package com.example.hackatonkuit.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.hackatonkuit.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    lateinit var binding : FragmentHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentHomeBinding.inflate(inflater, container, false)

        binding.homeNewaccountButton.setOnClickListener {
            //회원가입 버튼 클릭 시
        }

        binding.homeLoginButton.setOnClickListener {
            //로그인 버튼 클릭 시
        }
        return binding.root

    }


}