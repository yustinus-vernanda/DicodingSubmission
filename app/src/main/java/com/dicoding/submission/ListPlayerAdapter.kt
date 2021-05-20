package com.dicoding.submission

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class ListPlayerAdapter(private val listPlayer:ArrayList<Players>) : RecyclerView.Adapter<ListPlayerAdapter.ListViewHolder>() {

    private lateinit var onItemClickCallback : OnItemClickCallBack

    fun setOnItemClickCallback(onItemClickCallback: OnItemClickCallBack){
        this.onItemClickCallback = onItemClickCallback

    }

    class ListViewHolder(itemview : View) : RecyclerView.ViewHolder(itemview) {
        var tvName: TextView = itemView.findViewById(R.id.tv_item_name)
        var tvClub: TextView = itemView.findViewById(R.id.tv_item_club)
        var imgPhoto: ImageView = itemView.findViewById(R.id.img_item_photo)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_row_players, parent, false)
        return ListViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val hero = listPlayer[position]
        Glide.with(holder.itemView.context)
            .load(hero.photo)
            .apply(RequestOptions().override(55, 55))
            .into(holder.imgPhoto)
        holder.tvName.text = hero.name
        holder.tvClub.text = hero.club
        holder.itemView.setOnClickListener{onItemClickCallback.onItemClicked(listPlayer[holder.adapterPosition])}
    }

    override fun getItemCount(): Int {
        return listPlayer.size
    }

    interface OnItemClickCallBack {
        fun onItemClicked(data: Players)
    }
}