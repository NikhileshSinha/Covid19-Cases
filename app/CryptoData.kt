
import com.google.gson.annotations.SerializedName

data class CryptoData(
    @SerializedName("coins")
    val coins: List<Coin>,
    @SerializedName("remaining")
    val remaining: Int
)