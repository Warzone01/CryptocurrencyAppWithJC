package com.example.cryptocurrencyapp.domain.models

import android.media.tv.TvContract.Channels.Logo
import com.example.cryptocurrencyapp.data.remote.dto.TeamMember

data class CoinDetail(
    val coinId: String,
    val name: String,
    val description: String,
    val symbol: String,
    val rank: Int,
    val isActive: Boolean,
    val tags: List<String>,
    val team: List<TeamMember>,
    val logo: String
)
