package com.example.miniappgenchi.fragmentsCollection

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.miniappgenchi.adapterCollection.PhrasesAdapter
import com.example.miniappgenchi.mockDataCollection.PhraseData
import com.example.miniappgenchi.databinding.FragmentPhrasesBinding

/**
 * A simple [Fragment] subclass.
 * Use the [FragmentPhrases.newInstance] factory method to
 * create an instance of this fragment.
 */
class FragmentPhrases : Fragment() {
    private lateinit var binding: FragmentPhrasesBinding
    private lateinit var recycleView:RecyclerView
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentPhrasesBinding.inflate(layoutInflater,container,false)
        recycleView = binding.phrasesRecycleView
        recycleView.layoutManager = LinearLayoutManager(context)
        val phrases = PhraseData()
        val phraseList = phrases.getPhraseData()
        recycleView.adapter= PhrasesAdapter(phraseList)
        return binding.root
    }
}