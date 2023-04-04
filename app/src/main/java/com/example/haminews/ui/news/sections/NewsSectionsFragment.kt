package com.example.haminews.ui.news.sections

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.haminews.databinding.FragmentNewsSectionsBinding

class NewsSectionsFragment : Fragment() {
    private var _binding: FragmentNewsSectionsBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        //Раздуваем макет для фрагмента
       _binding = FragmentNewsSectionsBinding.inflate(inflater, container, false)
        return binding.root
    }
}