package com.example.miniappgenchi.viewHolderCollection

import androidx.recyclerview.widget.RecyclerView
import com.example.miniappgenchi.dataClassCollection.Numbers
import com.example.miniappgenchi.databinding.NumbersLayoutBinding

class NumberViewHolder(private val binding:NumbersLayoutBinding):RecyclerView.ViewHolder(binding.root) {
    fun bind(number: Numbers){
        binding.txtViewNumbers.text = number.numbers
        binding.txtViewJapaneseChar.text = number.japaneseCharacters
    }
}