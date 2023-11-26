package com.example.cryptocurrencyapp.presentation.coin_list.components

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment.Companion.CenterVertically
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import com.example.cryptocurrencyapp.domain.models.Coin
import com.example.cryptocurrencyapp.presentation.ui.theme.Gray

@Composable
fun CoinListItem(
    isDivide: Boolean,
    coin: Coin,
    onItemClick: (Coin) -> Unit
) {
    Row(
        modifier = Modifier
            .background(
                if (isDivide) MaterialTheme.colors.onPrimary else Gray
            )
            .fillMaxWidth()
            .clickable { onItemClick(coin) }
            .padding(20.dp),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Text(
            text = "${coin.rank}. ${coin.name} (${coin.symbol})",
            style = MaterialTheme.typography.body1,
            overflow = TextOverflow.Ellipsis
        )
        Indicator(isActive = coin.isActive, modifier = Modifier.align(CenterVertically))
    }
}

// индикатор активности
@Composable
fun Indicator(isActive: Boolean, modifier: Modifier) {
    Column(modifier = modifier) {
        Box(
            modifier = Modifier
                .size(10.dp)
                .clip(shape = CircleShape)
                .background(if (isActive) Color.Green else Color.Red)
        )
    }
}