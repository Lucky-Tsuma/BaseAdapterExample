package com.example.baseadapterexample

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.baseadapterexample.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    private var pictures = intArrayOf(
        R.drawable.image1,
        R.drawable.image2,
        R.drawable.image3,
        R.drawable.image4,
        R.drawable.image5,
        R.drawable.image6,
        R.drawable.image7,
        R.drawable.image8,
        R.drawable.image9,
        R.drawable.image10
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val customAdapter = CustomAdapter(applicationContext, pictures)
        binding.simpleGridView.adapter = customAdapter
    }
}