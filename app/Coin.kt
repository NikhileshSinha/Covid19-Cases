
import com.google.gson.annotations.SerializedName

data class Coin(
    @SerializedName("delta_1h")
    val delta1h: String,
    @SerializedName("delta_24h")
    val delta24h: String,
    @SerializedName("delta_30d")
    val delta30d: String,
    @SerializedName("delta_7d")
    val delta7d: String,
    @SerializedName("high_24h")
    val high24h: String,
    @SerializedName("last_updated_timestamp")
    val lastUpdatedTimestamp: Int,
    @SerializedName("low_24h")
    val low24h: String,
    @SerializedName("market_cap")
    val marketCap: String,
    @SerializedName("markets")
    val markets: List<Market>,
    @SerializedName("name")
    val name: String,
    @SerializedName("price")
    val price: String,
    @SerializedName("rank")
    val rank: Int,
    @SerializedName("show_symbol")
    val showSymbol: String,
    @SerializedName("symbol")
    val symbol: String,
    @SerializedName("total_volume_24h")
    val totalVolume24h: String
)