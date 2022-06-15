package com.pandora.travelapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.pandora.travelapp.databinding.ActivityOptionsBinding

class OptionsActivity : AppCompatActivity() {
    private lateinit var binding: ActivityOptionsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()
        binding = ActivityOptionsBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}