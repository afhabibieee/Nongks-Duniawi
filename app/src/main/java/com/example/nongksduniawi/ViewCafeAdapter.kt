package com.example.nongksduniawi

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class ViewCafeAdapter(private val listCafe: ArrayList<Cafe>) : RecyclerView.Adapter<ViewCafeAdapter.CardViewViewHolder>() {
    inner class CardViewViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var imgPhoto: ImageView = itemView.findViewById(R.id.img_item_photo)
        var tvName: TextView = itemView.findViewById(R.id.tv_item_name)
        var tvCity: TextView = itemView.findViewById(R.id.tv_item_city)
    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): CardViewViewHolder {
        val view: View = LayoutInflater
            .from(viewGroup.context)
            .inflate(R.layout.item_view_cafe, viewGroup, false)
        return CardViewViewHolder(view)
    }

    override fun onBindViewHolder(holder: CardViewViewHolder, position: Int) {
        val cafe = listCafe[position]

        Glide.with(holder.itemView.context)
            .load(cafe.photo)
            .apply(RequestOptions().override(2520, 1500))
            .into(holder.imgPhoto)

        holder.tvName.text = cafe.name
        holder.tvCity.text = cafe.city

        // while item clicked
        holder.itemView.setOnClickListener{ onItemClickCallback.onItemClicked(listCafe[holder.adapterPosition]) }
    }

    override fun getItemCount(): Int {
        return listCafe.size
    }

    // item clicked
    interface OnItemClickCallback {
        fun onItemClicked(data: Cafe)
    }

    private lateinit var onItemClickCallback: OnItemClickCallback

    fun setOnItemClickCallback(onItemClickCallback: OnItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback
    }
}