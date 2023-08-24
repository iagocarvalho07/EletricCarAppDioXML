package com.iagocarvalho.eletriccarappdioxml

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.iagocarvalho.eletriccarappdioxml.adapter.CarAdapter
import com.iagocarvalho.eletriccarappdioxml.adapter.tabsAdapter
import com.iagocarvalho.eletriccarappdioxml.data.carFectory
import com.iagocarvalho.eletriccarappdioxml.screens.calcularAutonomiaActivity


class MainActivity : AppCompatActivity() {

    private lateinit var btnCalcular: Button
    lateinit var lista: RecyclerView
    lateinit var tabLayout: TabLayout
    lateinit var viewPager2: ViewPager2




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupView()
        setupLiteners()
        setupList()
        setupTabs()
    }

    fun setupView() {
        tabLayout = findViewById(R.id.tab_layout_Main)
        btnCalcular = findViewById(R.id.Btc_redictic)
        lista = findViewById(R.id.LV_Informacoes)
        viewPager2 = findViewById(R.id.view_Pager_Main)
    }

    fun setupList(){
        val dadados = carFectory().list
        val adapater = CarAdapter( dadados)
     //   lista.layoutManager =LinearLayoutManager(this)
        lista.adapter = adapater
    }

    fun setupTabs(){
        val tabsAdapter = tabsAdapter(this)
        viewPager2.adapter = tabsAdapter

    }

    fun setupLiteners() {
        btnCalcular.setOnClickListener {
            startActivity(Intent(this, calcularAutonomiaActivity::class.java))
        }
        tabLayout.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener{
            override fun onTabSelected(tab: TabLayout.Tab?) {
                tab?.let {
                    viewPager2.currentItem = it.position
                }
            }

            override fun onTabUnselected(tab: TabLayout.Tab?) {

            }

            override fun onTabReselected(tab: TabLayout.Tab?) {

            }

        })
    }
}