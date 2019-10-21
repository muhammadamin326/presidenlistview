package com.example.listviewpresiden_

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.listviewpreside.adapter.presidenAdapter
import com.example.listviewpresiden_.model.BioPresiden
import com.example.listviewpresiden_.model.Presiden

class   MainActivity : AppCompatActivity() {
    private lateinit var rvPresiden: RecyclerView
    private var list: ArrayList<Presiden> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvPresiden = findViewById(R.id.rv_presiden)
        rvPresiden.setHasFixedSize(true)
        list.addAll(BioPresiden.listPresiden)
        showPresidenList()
    }

    private fun showPresidenList(){
        rvPresiden.layoutManager = LinearLayoutManager(this)
        rvPresiden.adapter = presidenAdapter(this,list){
            Toast.makeText(this,it.data,Toast.LENGTH_SHORT).show();
        }
    }
}
