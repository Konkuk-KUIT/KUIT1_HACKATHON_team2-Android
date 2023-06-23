package com.example.hackatonkuit.ui.menudetail

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.view.marginBottom
import androidx.core.view.marginEnd
import androidx.core.view.marginLeft
import androidx.core.view.marginStart
import androidx.core.view.marginTop
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.hackatonkuit.R
import com.example.hackatonkuit.databinding.ActivityMenuDetailBinding
import com.example.hackatonkuit.retrofit2.Menu
import com.example.hackatonkuit.retrofit2.MenuPreview
import com.example.hackatonkuit.retrofit2.getRetrofitInterface
import com.example.hackatonkuit.ui.home.Home
import com.example.hackatonkuit.ui.order.MenuForAdapter
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

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

        binding.rbHot.setOnCheckedChangeListener { compoundButton, b ->
            if(b)
                binding.rbHot.setTextColor(getColor(R.color.white))
            else
                binding.rbHot.setTextColor(getColor(R.color.black))
        }

        binding.rbIced.setOnCheckedChangeListener { compoundButton, b ->
            if(b)
                binding.rbIced.setTextColor(getColor(R.color.white))
            else
                binding.rbIced.setTextColor(getColor(R.color.black))
        }

        val menu_id = intent.getLongExtra("menu_id", -1)
        Log.d("qwerty1234", menu_id.toString())

        val retrofitInterface = getRetrofitInterface()
        retrofitInterface.requestMenu(menu_id!!.toLong()).enqueue(object :
            Callback<List<Menu>> {
            override fun onResponse(call: Call<List<Menu>>, response: Response<List<Menu>>) {
                Log.d("qwerty123", response.body().toString())
                if(response.isSuccessful) {
                    val list = response.body()!!.forEach {
                        binding.tvMenuDetailName.text = it.name
                        binding.tvMenuDetailEngName.text = it.eng_name
                        binding.tvMenuDetailContent.text = it.description
                        binding.tvMenuDetailPrice.text = it.price.toString() + "원"
                        if(it.menuStatus!="best"){
                            binding.tvMenuDetailBest.visibility = View.GONE
                        }
                    }
                }
            }

            override fun onFailure(call: Call<List<Menu>>, t: Throwable) {
                Log.d("qwerty123", t.message.toString())
            }

        })
    }
}