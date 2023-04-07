package com.example.haminews.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize


@Parcelize
data class NewsModel(
    val image: String? = "",
    val title: String? = "",
    val date_added: Long = 0L,
    val text: String? = ""
):Parcelable