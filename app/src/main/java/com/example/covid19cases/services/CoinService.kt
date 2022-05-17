package com.example.covid19cases.services

import com.example.covid19cases.models.CoinData
import com.example.covid19cases.models.MyCountry
import retrofit2.Call
import retrofit2.http.GET

interface CoinService {
    @GET("coins")
    fun getAffectedCountryList () : Call<List<CoinData>>
}