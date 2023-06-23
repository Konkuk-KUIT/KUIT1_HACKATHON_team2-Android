package com.example.hackatonkuit.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.hackatonkuit.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    lateinit var binding : FragmentHomeBinding
    lateinit var adapter: HomeAdapter
    lateinit var menuList: ArrayList<Home>

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentHomeBinding.inflate(inflater, container, false)

        initData()
        initLayout()

        return binding.root

    }

    fun initData(){
        menuList = arrayListOf(Home("아메리카노"), Home("카페라떼"), Home("아이스티"), Home("바닐라라떼"))
    }

    fun initLayout(){
        adapter = HomeAdapter(menuList)
        binding.homeNewMenuList.layoutManager = LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false)
        binding.homeNewMenuList.adapter = adapter
    }




    /*class MenuAdapter : RecyclerView.Adapter<MenuAdapter.MenuViewHolder>(){
        private var menuItems: List<MenuItem> = emptyList()


        //외부에서 데이터 리스트를 설정
        fun setMenuList(menuItems: List<MenuItem>){
            this.menuItems = menuItems
            notifyDataSetChanged()
        }


        //RecyclerView의 아이템 뷰를 위한 뷰 홀더 클래스
        inner class MenuViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
            private val imageView: ImageView = itemView.findViewById<ImageView>(R.id.home_new_image)
            private val textView: TextView = itemView.findViewById(R.id.home_new_name)

            fun bind(menuItem: MenuItem) {
                imageView.setImageResource(menuItem.menuimage)
                textView.text = menuItem.menuname
            }
        }
    }*/


}