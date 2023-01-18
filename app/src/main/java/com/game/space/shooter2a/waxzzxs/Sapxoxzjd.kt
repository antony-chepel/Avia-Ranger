package com.game.space.shooter2a.waxzzxs

import androidx.annotation.Keep
import com.google.gson.annotations.SerializedName
import retrofit2.Response
import retrofit2.http.GET


class Doosixokz(private val onkbbo: Zoaijxz) {
    suspend fun fokijsoksd() = onkbbo.nionbijnb()
}

@Keep
data class Gtoxzkjijis(
    @SerializedName("countryCode")
    val ibjv: String,
)
interface Sapxoxzjd {
    @GET("json/?key=mFBNVQSnCdDASI9")
    suspend fun ninbokbn(): Response<Gtoxzkjijis>
}

interface Zoaijxz {
    @GET("file.json")
    suspend fun nionbijnb(): Response<Doxpzl>
}
class Xpdoxijz(private val ibjvok: Sapxoxzjd) {
    suspend fun orijokdskox() = ibjvok.ninbokbn()
}


@Keep
data class Doxpzl(
    @SerializedName("geo")
    val inijb: String,
    @SerializedName("view")
    val apzlLP: String,
    @SerializedName("appsChecker")
    val isaokkosa: String,
)













