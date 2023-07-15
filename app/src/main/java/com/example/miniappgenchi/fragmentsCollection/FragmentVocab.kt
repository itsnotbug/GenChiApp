package com.example.miniappgenchi.fragmentsCollection

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.miniappgenchi.adapterCollection.VocabAdapter
import com.example.miniappgenchi.mockDataCollection.VocabData
import com.example.miniappgenchi.databinding.FragmentVocabBinding


/**
 * A simple [Fragment] subclass.
 * Use the [FragmentVocab.newInstance] factory method to
 * create an instance of this fragment.
 */
class FragmentVocab : Fragment() {
    private lateinit var binding:FragmentVocabBinding
    private lateinit var  recycleView: RecyclerView
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentVocabBinding.inflate(layoutInflater,container,false)
        recycleView = binding.vocabRecycleView
        recycleView.layoutManager = LinearLayoutManager(context)
        val vocabularyData = VocabData()
        val vocabList =vocabularyData.getVocabData()
        recycleView.adapter= VocabAdapter(vocabList)
        return binding.root
    }

}