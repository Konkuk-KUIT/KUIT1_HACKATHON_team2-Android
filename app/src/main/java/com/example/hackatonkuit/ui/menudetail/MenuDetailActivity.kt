package com.example.hackatonkuit.ui.menudetail

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.ViewGroup
import android.widget.LinearLayout
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.view.marginBottom
import androidx.core.view.marginEnd
import androidx.core.view.marginLeft
import androidx.core.view.marginStart
import androidx.core.view.marginTop
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.hackatonkuit.databinding.ActivityMenuDetailBinding
import com.example.hackatonkuit.ui.home.Home

class MenuDetailActivity : AppCompatActivity() {
    lateinit var binding: ActivityMenuDetailBinding
    lateinit var adapter: OtherMenuAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMenuDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initLayout()
    }

    fun initLayout() {
        binding.ivMenuDetailBack.setOnClickListener {
            finish()
        }
        adapter = OtherMenuAdapter(
            arrayListOf(
                Home("콜드 브루"),
                Home("에스프레소 프라푸치노"),
                Home("아이스 카페 라뗴"),
                Home("얼 그레이 티")
            )
        )
        binding.rvMenuDetailOtherMenu.layoutManager =
            LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        binding.rvMenuDetailOtherMenu.adapter = adapter
    }
}