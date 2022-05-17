
import com.google.gson.annotations.SerializedName

data class Market(
    @SerializedName("exchanges")
    val exchanges: List<Exchange>,
    @SerializedName("price")
    val price: String,
    @SerializedName("symbol")
    val symbol: String,
    @SerializedName("volume_24h")
    val volume24h: String
)