package com.example.hackatonkuit.ui.order

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.hackatonkuit.databinding.FragmentAllMenuBinding

class AllMenuFragment : Fragment() {
    lateinit var binding: FragmentAllMenuBinding
    lateinit var adapter: AllmenuAdapter
    lateinit var orderlist: ArrayList<AllmenuInfo>

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentAllMenuBinding.inflate(inflater, container, false)
        initData()
        initLayout()
        return binding.root
    }

    fun initLayout() {
        adapter = AllmenuAdapter(orderlist)
        binding.allmenuRv.layoutManager =
            LinearLayoutManager(requireContext(), LinearLayoutManager.VERTICAL, false)
        binding.allmenuRv.adapter = adapter

    }

    fun initData() {
        orderlist = arrayListOf(
            AllmenuInfo(
                "NEW",
                ""
            ),
            AllmenuInfo(
                "추천",
                "Recommend"
            ),
            AllmenuInfo(
                "콜드 브루",
                "Cold Brew"
            ),
            AllmenuInfo(
                "블론드",
                "Blonde Coffee"
            ),
            AllmenuInfo(
                "에스프레소",
                "Espresso"
            ),
            AllmenuInfo(
                "프라푸치노",
                "Frappuccino"
            ),
        )

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

    }
}
