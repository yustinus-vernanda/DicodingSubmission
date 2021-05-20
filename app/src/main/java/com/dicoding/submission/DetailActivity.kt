package com.dicoding.submission

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class DetailActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
        val position = intent.getIntExtra("index",0)
        val players = PlayersData.listData[position]
        val name = players.name
        val detail = players.detail
        val age = players.age
        val club = players.club
        val photo = players.photo
        val img_detail_photo:ImageView = findViewById(R.id.img_detail_photo)
        val tvAgeDetail:TextView = findViewById(R.id.age_detail)
        val tvNameDetail:TextView = findViewById(R.id.tv_detail_name)
        val tvClubDetail:TextView = findViewById(R.id.tv_detail_club)
        val tvDetailsDetail:TextView = findViewById(R.id.tv_detail_details)
        setTitle("Detail Player")
        img_detail_photo.setImageResource(photo)
        tvAgeDetail.text = "$age Tahun"
        tvNameDetail.text = name
        tvClubDetail.text = club
        tvDetailsDetail.text = detail


    }
}