package com.drovo.nestedrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.drovo.nestedrecyclerview.adapter.MainAdapter
import com.drovo.nestedrecyclerview.databinding.ActivityMainBinding
import com.drovo.nestedrecyclerview.utils.SampleData

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.apply {
            recyclerviwMain.adapter = MainAdapter(SampleData.collection)
        }
    }
}