package com.dicoding.submission

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.ProgressBar
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import java.util.*
import kotlin.collections.ArrayList
import kotlin.concurrent.schedule

class MainActivity : AppCompatActivity() {

    private lateinit var rvPlayer: RecyclerView
    private var list:ArrayList<Players> = arrayListOf()
    lateinit var listPlayerAdapter : ListPlayerAdapter
    var endFlag = false
    lateinit var pgBar : ProgressBar

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        rvPlayer = findViewById(R.id.rv_players)
        rvPlayer.setHasFixedSize(true)
        list.addAll(PlayersData.listData)
        rvPlayer.layoutManager = LinearLayoutManager(this)
        listPlayerAdapter = ListPlayerAdapter(list)
        rvPlayer.adapter = listPlayerAdapter
        title = "Daftar Pemain Legenda"
         pgBar  = findViewById(R.id.pgBar)
        showRecyclerList()
    }

    private fun showRecyclerList() {



        listPlayerAdapter.setOnItemClickCallback(object : ListPlayerAdapter.OnItemClickCallBack {
            override fun onItemClicked(data: Players) {
                showSelectedPlayer(data)
            }
        })

        rvPlayer.addOnScrollListener(object :RecyclerView.OnScrollListener(){
            override fun onScrolled(recyclerView: RecyclerView, dx: Int, dy: Int) {
                if(dy>0){
                    var vItem = (rvPlayer.layoutManager as LinearLayoutManager).childCount
                    var lItem = (rvPlayer.layoutManager as LinearLayoutManager).findFirstCompletelyVisibleItemPosition()
                    var count = listPlayerAdapter.itemCount
                    Log.e("item:",vItem.toString())
                    Log.e("find:",lItem.toString())
                    Log.e("count:",count.toString())
                    if(vItem+lItem-1>=count && !endFlag){
                        endFlag = true
                        addMoreData()
                    }
                }
                super.onScrolled(recyclerView, dx, dy)
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

    fun addMoreData(){
        //list.addAll(PlayersData.listData)
        pgBar.visibility = View.VISIBLE
        if (endFlag) {

            Handler().postDelayed({
                listPlayerAdapter.addMore(PlayersData.listData)
                Log.e("data:", listPlayerAdapter.itemCount.toString())
                pgBar.visibility = View.GONE
                endFlag = false
            }, 2000)

        }

    }



}