package com.maciejkozlowski.constraintlayoutperformance

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import java.util.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        setContentView(R.layout.activity_main)
        (recyclerView).layoutManager = LinearLayoutManager(this)
        (recyclerView).adapter = Adapter(getList())
    }

    private fun getList(): List<String> {
        val random = Random()
        val list = mutableListOf<String>()
        for (i in 1..100) {
            list.add(random.nextLong().toString())
        }

        return list
    }
}
