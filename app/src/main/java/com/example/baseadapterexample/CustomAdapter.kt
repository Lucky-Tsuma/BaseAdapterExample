package com.example.baseadapterexample

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView

class CustomAdapter(private var context: Context, private var pictures: IntArray) :
    BaseAdapter() {

    override fun getCount(): Int {
        return pictures.size
    }

    override fun getItem(position: Int): Any {
        return pictures[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val mView: View? =
            LayoutInflater.from(context).inflate(R.layout.activity_gridview, parent, false)

        val icon = mView!!.findViewById<ImageView>(R.id.icon)
        icon.setImageResource(pictures[position])
        return mView
    }
}