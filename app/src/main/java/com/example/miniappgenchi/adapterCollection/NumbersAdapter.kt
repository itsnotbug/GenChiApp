package com.example.miniappgenchi.adapterCollection

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.miniappgenchi.TranslationActivity
import com.example.miniappgenchi.dataClassCollection.Numbers
import com.example.miniappgenchi.databinding.NumbersLayoutBinding
import com.example.miniappgenchi.viewHolderCollection.NumberViewHolder


class NumbersAdapter(var numberList: List<Numbers>):RecyclerView.Adapter<NumberViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NumberViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = NumbersLayoutBinding.inflate(inflater,parent,false)
        return NumberViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return numberList.size
    }

    override fun onBindViewHolder(holder: NumberViewHolder, position: Int) {
        holder.bind(numberList[position])
        holder.itemView.setOnClickListener{
            var myIntent = Intent(holder.itemView.context, TranslationActivity::class.java)
            myIntent.putExtra("word",numberList[position].numbers)
            myIntent.putExtra("trans",numberList[position].translation)
            myIntent.putExtra("japChar",numberList[position].japaneseCharacters)
            holder.itemView.context.startActivity(myIntent)
        }
    }
}