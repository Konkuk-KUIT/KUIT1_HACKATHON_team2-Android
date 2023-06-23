package com.example.hackatonkuit

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import com.example.hackatonkuit.databinding.ActivityMainBinding
import com.example.hackatonkuit.ui.home.HomeFragment
import com.example.hackatonkuit.ui.order.OrderFragment
import com.example.hackatonkuit.ui.other.OtherFragment
import com.example.hackatonkuit.ui.pay.PayFragment
import com.google.android.material.navigation.NavigationBarView

class MainActivity : AppCompatActivity(), NavigationBarView.OnItemSelectedListener {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.navView.setOnItemSelectedListener {
            onNavigationItemSelected(it)
        }
        binding.navView.selectedItemId = R.id.navigation_home
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        Log.d("qwerty123", item.toString())
        when (item.itemId) {
            R.id.navigation_home -> {
                supportFragmentManager.beginTransaction().replace(R.id.main_frm, HomeFragment())
                    .commit()
            }

            R.id.navigation_pay -> {
                supportFragmentManager.beginTransaction().replace(R.id.main_frm, PayFragment())
                    .commit()
            }

            R.id.navigation_order -> {
                supportFragmentManager.beginTransaction().replace(R.id.main_frm, OrderFragment())
                    .commit()
            }

            R.id.navigation_shop -> {
                val i = Intent(this, CartActivity::class.java)
                startActivity(i)
            }

            R.id.navigation_other -> {
                supportFragmentManager.beginTransaction().replace(R.id.main_frm, OtherFragment())
                    .commit()
            }
        }
        return true
    }

}