package com.example.lemonade

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.VERTICAL
import com.example.lemonade.adapter.DogAdapter
import com.example.lemonade.data.DataSource

class DogActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_affirmation)

        val recycleView = findViewById<RecyclerView>(R.id.recycle_view)
        val myDataSource = DataSource().loadDog()
        val myAdapter = DogAdapter(this, myDataSource)

        recycleView.layoutManager = LinearLayoutManager(this, VERTICAL,false)

        recycleView.adapter = myAdapter
    }
}