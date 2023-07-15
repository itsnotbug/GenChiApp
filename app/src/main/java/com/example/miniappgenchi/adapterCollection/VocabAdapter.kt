package com.example.miniappgenchi.adapterCollection

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.miniappgenchi.TranslationActivity
import com.example.miniappgenchi.viewHolderCollection.VocabViewHolder
import com.example.miniappgenchi.dataClassCollection.Vocabulary
import com.example.miniappgenchi.databinding.VocabLayoutBinding

class VocabAdapter(var vocabList: List<Vocabulary>):RecyclerView.Adapter<VocabViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VocabViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = VocabLayoutBinding.inflate(inflater,parent,false)
        return VocabViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return vocabList.size
    }

    override fun onBindViewHolder(holder: VocabViewHolder, position: Int) {
       holder.bind(vocabList[position])
        holder.itemView.setOnClickListener{
            var myIntent = Intent(holder.itemView.context, TranslationActivity::class.java)
            myIntent.putExtra("word",vocabList[position].vocabulary)
            myIntent.putExtra("trans",vocabList[position].translation)
            myIntent.putExtra("japChar",vocabList[position].japaneseCharacters)
            holder.itemView.context.startActivity(myIntent)
        }
    }
}