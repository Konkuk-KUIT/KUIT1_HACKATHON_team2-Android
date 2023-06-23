package com.example.hackatonkuit.ui.order

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.hackatonkuit.R
import com.example.hackatonkuit.databinding.FragmentAllMenuBinding
import com.example.hackatonkuit.retrofit2.Category
import com.example.hackatonkuit.retrofit2.getRetrofitInterface
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class AllMenuFragment : Fragment() {
    lateinit var binding: FragmentAllMenuBinding
    lateinit var adapter: AllmenuAdapter
    var orderList = ArrayList<AllmenuInfo>()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentAllMenuBinding.inflate(inflater, container, false)
        initLayout()
        return binding.root
    }

    fun initLayout() {
        val retrofitInterface = getRetrofitInterface()
        retrofitInterface.requestCategories().enqueue(object :
            Callback<List<Category>> {
            override fun onResponse(
                call: Call<List<Category>>,
                response: Response<List<Category>>
            ) {
                Log.d("qwerty123", response.body().toString())
                if (response.isSuccessful) {
                    orderList.clear()
                    response.body()!!.forEach {
                        orderList.add(AllmenuInfo(it.id, it.image, it.name, it.eng_name))
                    }
                    binding.allmenuRv.adapter?.notifyDataSetChanged()
                } else {

                }
            }

            override fun onFailure(call: Call<List<Category>>, t: Throwable) {
                Log.d("hello", t.message.toString())
            }
        })
        adapter = AllmenuAdapter(orderList)
        adapter.onItemClickListener = object : AllmenuAdapter.OnItemClickListener {
            override fun onItemClicked(position: Int) {
                requireActivity().supportFragmentManager.beginTransaction().addToBackStack(null)
                    .replace(R.id.main_frm, MenuListFragment()).commit()
            }
        }
        binding.allmenuRv.layoutManager =
            LinearLayoutManager(requireContext(), LinearLayoutManager.VERTICAL, false)
        binding.allmenuRv.adapter = adapter

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

    }
}
