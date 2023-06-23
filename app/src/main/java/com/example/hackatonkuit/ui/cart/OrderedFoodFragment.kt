package com.example.hackatonkuit.ui.cart

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.hackatonkuit.databinding.FragmentOrderedFoodBinding
import com.example.hackatonkuit.retrofit2.CartItem
import com.example.hackatonkuit.retrofit2.Category
import com.example.hackatonkuit.retrofit2.getRetrofitInterface
import com.example.hackatonkuit.ui.order.AllmenuInfo
import com.example.hackatonkuit.ui.order.MenuForAdapter
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class OrderedFoodFragment : Fragment() {
    lateinit var binding : FragmentOrderedFoodBinding
    lateinit var adapter : OrderedFoodAdapter
    val menuList = ArrayList<CartItem>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentOrderedFoodBinding.inflate(inflater, container, false)
        initLayout()
        return binding.root
    }

    fun initLayout(){
        adapter = OrderedFoodAdapter(menuList)
        binding.rvCartOrderedMenu.layoutManager = LinearLayoutManager(requireContext(), LinearLayoutManager.VERTICAL, false)
        binding.rvCartOrderedMenu.adapter = adapter


        val retrofitInterface = getRetrofitInterface()
        retrofitInterface.requestCarts(1L).enqueue(object :
            Callback<List<CartItem>> {
            override fun onResponse(
                call: Call<List<CartItem>>,
                response: Response<List<CartItem>>
            ) {
                Log.d("qwerty12345", response.body().toString())
                if (response.isSuccessful) {
                    menuList.clear()
                    response.body()!!.forEach {
                        menuList.add(CartItem(it.id, it.temp, it.size, it.cup, it.count, it.price, it.menuImage, it.menuName, it.menuEngName, it.menuPrice, it.optionItemReadResponseDtos))
                    }
                    binding.rvCartOrderedMenu.adapter?.notifyDataSetChanged()
                } else {

                }
            }

            override fun onFailure(call: Call<List<CartItem>>, t: Throwable) {
                Log.d("hello", t.message.toString())
            }
        })
    }

}