package com.example.miniappgenchi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.miniappgenchi.databinding.ActivityTranslationDetailsBinding

class TranslationActivity : AppCompatActivity() {
    private lateinit var binding:ActivityTranslationDetailsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTranslationDetailsBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}