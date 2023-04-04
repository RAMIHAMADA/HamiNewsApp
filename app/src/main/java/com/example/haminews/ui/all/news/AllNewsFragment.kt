package com.example.haminews.ui.all.news

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.haminews.databinding.FragmentAllNewsBinding


class AllNewsFragment : Fragment() {
    private var _binding: FragmentAllNewsBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        //Раздуваем макет для фрагмента
        _binding = FragmentAllNewsBinding.inflate(inflater, container, false)
        return binding.root
    }


}