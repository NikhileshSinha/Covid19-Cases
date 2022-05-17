package com.example.covid19cases.models

data class CoinData(
    val coins: List<Coin>,
    val remaining: Int
) {
    data class Coin(
        val delta_1h: String,
        val delta_24h: String,
        val delta_30d: String,
        val delta_7d: String,
        val high_24h: String,
        val last_updated_timestamp: Int,
        val low_24h: String,
        val market_cap: String,
        val markets: List<Market>,
        val name: String,
        val price: String,
        val rank: Int,
        val show_symbol: String,
        val symbol: String,
        val total_volume_24h: String
    ) {
        data class Market(
            val exchanges: List<Exchange>,
            val price: String,
            val symbol: String,
            val volume_24h: String
        ) {
            data class Exchange(
                val name: String,
                val price: String,
                val volume_24h: String
            )
        }
    }
}