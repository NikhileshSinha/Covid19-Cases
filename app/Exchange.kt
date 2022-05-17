
import com.google.gson.annotations.SerializedName

data class Exchange(
    @SerializedName("name")
    val name: String,
    @SerializedName("price")
    val price: String,
    @SerializedName("volume_24h")
    val volume24h: String
)