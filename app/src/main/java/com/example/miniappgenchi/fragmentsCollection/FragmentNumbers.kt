package com.example.miniappgenchi.fragmentsCollection

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.miniappgenchi.adapterCollection.NumbersAdapter
import com.example.miniappgenchi.adapterCollection.PhrasesAdapter
import com.example.miniappgenchi.dataClassCollection.Numbers
import com.example.miniappgenchi.databinding.FragmentNumbersBinding
import com.example.miniappgenchi.mockDataCollection.NumberData
import com.example.miniappgenchi.mockDataCollection.PhraseData

/**
 * A simple [Fragment] subclass.
 * Use the [FragmentNumbers.newInstance] factory method to
 * create an instance of this fragment.
 */
class FragmentNumbers : Fragment() {
    private lateinit var binding:FragmentNumbersBinding
    private lateinit var recycleView:RecyclerView
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentNumbersBinding.inflate(layoutInflater,container,false)
        recycleView = binding.numbersRecycleView
        recycleView.layoutManager = LinearLayoutManager(context)
        val numbers = NumberData()
        val numberList =numbers.getNumberData()
        recycleView.adapter= NumbersAdapter(numberList)
        return binding.root
    }
}