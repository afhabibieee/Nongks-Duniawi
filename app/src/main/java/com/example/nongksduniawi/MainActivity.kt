package com.example.nongksduniawi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var rvCafe: RecyclerView
    private var list: ArrayList<Cafe> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvCafe = findViewById(R.id.rv_cafe)
        rvCafe.setHasFixedSize(true)

        list.addAll(CafeData.listData)
        showRecyclerView()
    }

    private fun showRecyclerView() {
        rvCafe.layoutManager = LinearLayoutManager(this)
        val viewCafeAdapter = ViewCafeAdapter(list)
        rvCafe.adapter = viewCafeAdapter

        viewCafeAdapter.setOnItemClickCallback(object : ViewCafeAdapter.OnItemClickCallback {
            override fun onItemClicked(data: Cafe) {
                showSelectedCafe(data)
            }
        })
    }

    private fun showSelectedCafe(cafe: Cafe) {
        val moveToDetail = Intent(this@MainActivity, DetailActivity::class.java)
        moveToDetail.putExtra(DetailActivity.EXTRA_NAME, cafe.name)
        moveToDetail.putExtra(DetailActivity.EXTRA_CITY, cafe.city)
        moveToDetail.putExtra(DetailActivity.EXTRA_SERVICE_OPTION, cafe.serviceOption)
        moveToDetail.putExtra(DetailActivity.EXTRA_PHONE, cafe.phone)
        moveToDetail.putExtra(DetailActivity.EXTRA_ADDRESS, cafe.address)
        moveToDetail.putExtra(DetailActivity.EXTRA_PHOTO, cafe.photo)
        moveToDetail.putExtra(DetailActivity.EXTRA_LATLONG, cafe.latLong)
        startActivity(moveToDetail)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_profile, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        setMenu(item.itemId)
        return super.onOptionsItemSelected(item)
    }

    private fun setMenu(itemId: Int) {
        when (itemId) {
            R.id.action_profile -> {
                val intentProfile = Intent(this@MainActivity, ProfileActivity::class.java)
                startActivity(intentProfile)
            }
        }
    }
}