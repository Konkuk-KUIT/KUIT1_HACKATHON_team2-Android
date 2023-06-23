package com.example.hackatonkuit.ui.menudetail

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.hackatonkuit.R
import com.example.hackatonkuit.databinding.ActivityMenuDetailBinding

class MenuDetailActivity : AppCompatActivity() {
    lateinit var binding: ActivityMenuDetailBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMenuDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}