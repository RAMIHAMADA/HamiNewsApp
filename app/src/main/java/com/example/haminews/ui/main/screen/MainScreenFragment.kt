package com.example.haminews.ui.main.screen

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.haminews.adapters.CardNewsAdapter
import com.example.haminews.databinding.FragmentMainScreenBinding
import com.example.haminews.utils.GetNews

class MainScreenFragment : Fragment() {
    private lateinit var adapter: CardNewsAdapter
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

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initAdapter()
    }

    private fun initAdapter() {
        adapter = CardNewsAdapter {

        }
        binding.rvItemCardNews.layoutManager = LinearLayoutManager(requireContext())
        binding.rvItemCardNews.adapter = adapter

        adapter.submitList(
            GetNews.getListNews()
        )


    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }

}