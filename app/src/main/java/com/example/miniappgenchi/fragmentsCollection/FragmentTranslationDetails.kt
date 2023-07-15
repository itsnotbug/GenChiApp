package com.example.miniappgenchi.fragmentsCollection

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.miniappgenchi.databinding.FragmentTranslationDetailsBinding

/**
 * A simple [Fragment] subclass.
 * Use the [FragmentTranslationDetails.newInstance] factory method to
 * create an instance of this fragment.
 */
class FragmentTranslationDetails : Fragment() {
    private lateinit var binding:FragmentTranslationDetailsBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding =FragmentTranslationDetailsBinding.inflate(layoutInflater,container,false)
        binding.txtWord.text=activity?.intent?.getStringExtra("word")
        binding.txtTranslation.text = activity?.intent?.getStringExtra("trans")
        binding.txtJapChar.text=activity?.intent?.getStringExtra("japChar")

        return binding.root
    }

}