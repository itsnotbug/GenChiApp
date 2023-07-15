package com.example.miniappgenchi.viewHolderCollection

import androidx.recyclerview.widget.RecyclerView
import com.example.miniappgenchi.dataClassCollection.Phrases
import com.example.miniappgenchi.databinding.PhrasesLayoutBinding

class PhraseViewHolder(private val binding: PhrasesLayoutBinding):RecyclerView.ViewHolder(binding.root) {
    fun bind(phrases: Phrases){
        binding.txtViewPhrases.text=phrases.phrase
        binding.txtViewJapaneseChar.text=phrases.japaneseCharacters

    }
}