package com.example.hackatonkuit.ui.order

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.hackatonkuit.ui.order.Menu
import com.example.hackatonkuit.databinding.FragmentMenuListBinding
import com.example.hackatonkuit.ui.menudetail.MenuDetailActivity

class MenuListFragment : Fragment() {
    lateinit var binding: FragmentMenuListBinding
    lateinit var adapter: MenuListAdapter
    lateinit var menuList: ArrayList<Menu>

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentMenuListBinding.inflate(inflater, container, false)
        initData()
        initLayout()
        return binding.root
    }

    fun initLayout(){
        adapter = MenuListAdapter(menuList)
        adapter.onItemClickedListener = object : MenuListAdapter.OnItemClickedListener{
            override fun onItemClicked(position: Int) {
                val i = Intent(requireContext(), MenuDetailActivity::class.java)
                startActivity(i)
            }
        }
        binding.rvMenuList.layoutManager = LinearLayoutManager(requireContext(), LinearLayoutManager.VERTICAL, false)
        binding.rvMenuList.adapter = adapter
        binding.ivMenuListBack.setOnClickListener {
            parentFragmentManager.popBackStack()
        }
    }

    fun initData(){
        menuList = arrayListOf(Menu("아이스 카페 아메리카노"), Menu("아이스 아이스티"), Menu("아이스 카페라뗴"))
    }

}