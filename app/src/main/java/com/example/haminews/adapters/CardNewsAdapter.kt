package com.example.haminews.adapters

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import coil.load
import com.example.haminews.R
import com.example.haminews.databinding.ItemCardNewsBinding
import com.example.haminews.model.NewsModel
import java.text.SimpleDateFormat

class CardNewsAdapter(private val listener: (NewsModel) -> Unit) :
    ListAdapter<NewsModel, CardNewsAdapter.CardNewsViewHolder>(ItemCallback),
    View.OnClickListener {

    class CardNewsViewHolder(val binding: ItemCardNewsBinding) :
        RecyclerView.ViewHolder(binding.root)

    object ItemCallback : DiffUtil.ItemCallback<NewsModel>() {
        override fun areItemsTheSame(oldItem: NewsModel, newItem: NewsModel): Boolean {
            return oldItem.title == newItem.title
        }

        override fun areContentsTheSame(oldItem: NewsModel, newItem: NewsModel): Boolean {
            return oldItem == newItem
        }

    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardNewsViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = ItemCardNewsBinding.inflate(inflater, parent, false)
        binding.root.setOnClickListener(this)
        return CardNewsViewHolder(binding = binding)
    }

    override fun onBindViewHolder(holder: CardNewsViewHolder, position: Int) {
        val news = getItem(position)
        with(holder.binding) {
            root.tag = news

            tvTitle.text = news.title
            tvDataNews.text = convertLongTime(news.date_added)
            if (news.image?.isEmpty()!!) {
                ivPicture.setImageResource(R.drawable.ic_item_card_news)
            } else {
                ivPicture.load(news.image) {
                    placeholder(R.drawable.ic_item_card_news)
                }

            }

        }
    }

    override fun onClick(view: View) {
        val newsCard = view.tag as NewsModel
        listener(newsCard)
    }

    @SuppressLint("SimpleDateFormat")
    fun convertLongTime(time: Long): String {
        val dateNews = java.sql.Date(time)
        val format = SimpleDateFormat("yyyy.MM.dd  HH:mm")
        return format.format(dateNews)

    }
}