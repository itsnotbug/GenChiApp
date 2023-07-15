package com.example.miniappgenchi

import android.content.Intent
import android.content.res.ColorStateList
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.miniappgenchi.fragmentsCollection.FragmentNumbers
import com.example.miniappgenchi.fragmentsCollection.FragmentPhrases
import com.example.miniappgenchi.fragmentsCollection.FragmentVocab
import com.example.miniappgenchi.databinding.ActivityMainBinding

class  MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val vocabList = FragmentVocab()
        val phraseList = FragmentPhrases()
        val numberList = FragmentNumbers()


        supportFragmentManager.beginTransaction().apply {
            replace(R.id.fragmentContainerView,vocabList)
            commit()
        }



        binding.bottomNavigationView.setOnItemSelectedListener {
            when (it.itemId) {
                R.id.item_Vocab -> {
                    this.supportFragmentManager.beginTransaction().apply {
                        replace(R.id.fragmentContainerView, vocabList)
                        commit()
                    }

                }
                R.id.item_Phrases -> {
                    this.supportFragmentManager.beginTransaction().apply {
                        replace(R.id.fragmentContainerView, phraseList)
                        commit()
                    }

                }
                R.id.item_Numbers -> {
                    this.supportFragmentManager.beginTransaction().apply {
                        replace(R.id.fragmentContainerView, numberList)
                        commit()
                    }

                }
            }
            true
        }

        binding.navigationBar.setOnMenuItemClickListener {
            when(it.itemId){
                R.id.item_about->{
                    var myIntent = Intent(this,About::class.java)
                    startActivity(myIntent)
                    finish()
                }
            }
            true
        }
    }
}
