package com.example.hackatonkuit.ui.order

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.hackatonkuit.databinding.ActivityMenuOrderBinding

class MenuOrderActivity : AppCompatActivity() {

    lateinit var binding: ActivityMenuOrderBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMenuOrderBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}