package com.example.nongksduniawi

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import java.util.*

class DetailActivity : AppCompatActivity(), View.OnClickListener {
    companion object {
        const val EXTRA_NAME = "extra_name"
        const val EXTRA_CITY = "extra_city"
        const val EXTRA_SERVICE_OPTION = "extra_service_option"
        const val EXTRA_PHONE = "extra_phone"
        const val EXTRA_ADDRESS = "extra_address"
        const val EXTRA_PHOTO = "extra_photo"
        const val EXTRA_LATLONG = "extra_latlong"
    }

    private lateinit var phone: String
    private lateinit var latLong: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        // component view on layout
        val tvName: TextView = findViewById(R.id.tv_item_name)
        val tvCity: TextView = findViewById(R.id.tv_item_city)
        val tvServiceOption: TextView = findViewById(R.id.tv_service_option_content)
        val tvPhone: TextView = findViewById(R.id.tv_phone_content)
        val tvAddress: TextView = findViewById(R.id.tv_address_content)
        val imgPhoto: ImageView = findViewById(R.id.img_item_photo)

        // receiving data
        val name = intent.getStringExtra(EXTRA_NAME)
        val city = intent.getStringExtra(EXTRA_CITY)
        val serviceOption = intent.getStringExtra(EXTRA_SERVICE_OPTION)
        phone = intent.getStringExtra(EXTRA_PHONE).toString()
        val address = intent.getStringExtra(EXTRA_ADDRESS)
        val photo = intent.getIntExtra(EXTRA_PHOTO,0)
        latLong = intent.getStringExtra(EXTRA_LATLONG).toString()

        // sending data into views respectively
        tvName.text = name
        tvCity.text = city
        tvServiceOption.text = serviceOption
        tvPhone.text = phone
        tvAddress.text = address
        Glide.with(this)
            .load(photo)
            .apply(RequestOptions().override(2520, 1500))
            .into(imgPhoto)

        val btnCall: Button = findViewById(R.id.btn_set_dialog_call)
        btnCall.setOnClickListener(this)

        val btnIntentMap: Button = findViewById(R.id.btn_intent_map)
        btnIntentMap.setOnClickListener(this)

        // set the title bar
        supportActionBar?.title = name
    }

    override fun onClick(v: View?) {
        when(v?.id){
            R.id.btn_set_dialog_call -> {
                val dialPhoneIntent = Intent(Intent.ACTION_DIAL, Uri.parse("tel:$phone"))
                startActivity(dialPhoneIntent)
            }

            R.id.btn_intent_map -> {
                val uri = "http://maps.google.com/maps?q=loc:$latLong"
                val mapIntent = Intent(Intent.ACTION_VIEW, Uri.parse(uri))
                mapIntent.setPackage("com.google.android.apps.maps")
                startActivity(mapIntent)
            }
        }
    }
}