package com.example.hackatonkuit.ui.order

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.hackatonkuit.databinding.FragmentMenuListBinding
import com.example.hackatonkuit.retrofit2.MenuPreview
import com.example.hackatonkuit.retrofit2.getRetrofitInterface
import com.example.hackatonkuit.ui.menudetail.MenuDetailActivity
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MenuListFragment : Fragment() {
    lateinit var binding: FragmentMenuListBinding
    lateinit var adapter: MenuListAdapter
    var menuList = ArrayList<MenuForAdapter>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentMenuListBinding.inflate(inflater, container, false)
        initLayout()
        return binding.root
    }

    fun initLayout(){
        adapter = MenuListAdapter(menuList)
        adapter.onItemClickedListener = object : MenuListAdapter.OnItemClickedListener{
            override fun onItemClicked(position: Int) {
                val i = Intent(requireContext(), MenuDetailActivity::class.java)
                Log.d("qwerty1234", adapter.items[position].menuId.toString())
                i.putExtra("menu_id", adapter.items[position].menuId)
                startActivity(i)
            }
        }
        binding.rvMenuList.layoutManager = LinearLayoutManager(requireContext(), LinearLayoutManager.VERTICAL, false)
        binding.rvMenuList.adapter = adapter
        binding.ivMenuListBack.setOnClickListener {
            parentFragmentManager.popBackStack()
        }

        binding.ivMenuListSearch.setOnClickListener {
            val i = Intent(requireContext(), SearchActivity::class.java)
            startActivity(i)
        }

        val bundle = arguments
        val category_id = bundle?.getInt("category_id")


        val retrofitInterface = getRetrofitInterface()
        retrofitInterface.requestMenuList(category_id!!.toLong()).enqueue(object : Callback<List<MenuPreview>>{
            override fun onResponse(call: Call<List<MenuPreview>>, response: Response<List<MenuPreview>>) {
                Log.d("qwerty123", response.body().toString())
                if(response.isSuccessful) {
                    menuList.clear()
                    val list = response.body()!!.forEach {
                        menuList.add(MenuForAdapter(it.menuId, it.image, it.name, it.eng_name, it.price, it.menuStatus))
                    }
                    binding.rvMenuList.adapter?.notifyDataSetChanged()
                }
            }

            override fun onFailure(call: Call<List<MenuPreview>>, t: Throwable) {
                Log.d("qwerty123", t.message.toString())
            }

        })
    }

}