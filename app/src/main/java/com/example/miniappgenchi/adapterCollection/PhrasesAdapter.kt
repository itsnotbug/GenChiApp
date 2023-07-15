package com.example.miniappgenchi.adapterCollection

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.miniappgenchi.TranslationActivity
import com.example.miniappgenchi.viewHolderCollection.PhraseViewHolder
import com.example.miniappgenchi.dataClassCollection.Phrases
import com.example.miniappgenchi.databinding.PhrasesLayoutBinding

class PhrasesAdapter(var phraseList:List<Phrases>):RecyclerView.Adapter<PhraseViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PhraseViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = PhrasesLayoutBinding.inflate(inflater,parent,false)
        return PhraseViewHolder(binding)
    }

    override fun getItemCount(): Int {
       return phraseList.size
    }

    override fun onBindViewHolder(holder: PhraseViewHolder, position: Int) {
        holder.bind(phraseList[position])
        holder.itemView.setOnClickListener {
            var myIntent = Intent(holder.itemView.context, TranslationActivity::class.java)
            myIntent.putExtra("word", phraseList[position].phrase)
            myIntent.putExtra("trans", phraseList[position].translation)
            myIntent.putExtra("japChar", phraseList[position].japaneseCharacters)
            holder.itemView.context.startActivity(myIntent)
        }
    }
}