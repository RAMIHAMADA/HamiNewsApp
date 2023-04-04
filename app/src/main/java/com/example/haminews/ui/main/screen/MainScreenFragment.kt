package com.example.haminews.ui.main.screen

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.haminews.databinding.FragmentMainScreenBinding

class MainScreenFragment : Fragment() {
    private var _binding: FragmentMainScreenBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        //Раздуваем макет для фрагмента
        _binding = FragmentMainScreenBinding.inflate(inflater, container, false)
        return binding.root
    }

}