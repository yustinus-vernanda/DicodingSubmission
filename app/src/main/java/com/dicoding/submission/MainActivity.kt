package com.dicoding.submission

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var rvPlayer: RecyclerView
    private var list:ArrayList<Players> = arrayListOf()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        rvPlayer = findViewById(R.id.rv_players)
        rvPlayer.setHasFixedSize(true)
        list.addAll(PlayersData.listData)
        setTitle("Daftar Pemain Legenda")
        showRecyclerList()
    }

    private fun showRecyclerList() {
        rvPlayer.layoutManager = LinearLayoutManager(this)
        val listPlayerAdapter = ListPlayerAdapter(list)
        rvPlayer.adapter = listPlayerAdapter

        listPlayerAdapter.setOnItemClickCallback(object : ListPlayerAdapter.OnItemClickCallBack {
            override fun onItemClicked(data: Players) {
                showSelectedPlayer(data)
            }
        })
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val intent = Intent(this@MainActivity,AboutActivity::class.java)
        startActivity(intent)
        return super.onOptionsItemSelected(item)
    }

    fun showSelectedPlayer(data : Players){
        val intent = Intent(this@MainActivity,DetailActivity::class.java)
        intent.putExtra("index",data.index)
        startActivity(intent)
    }


}