package com.example.miniappgenchi.viewHolderCollection

import androidx.recyclerview.widget.RecyclerView
import com.example.miniappgenchi.dataClassCollection.Vocabulary
import com.example.miniappgenchi.databinding.VocabLayoutBinding

class VocabViewHolder(private val binding:VocabLayoutBinding):RecyclerView.ViewHolder(binding.root) {
    fun bind(vocab: Vocabulary){
        binding.txtViewVocab.text = vocab.vocabulary
        binding.txtViewJapaneseChar.text=vocab.japaneseCharacters
    }
}