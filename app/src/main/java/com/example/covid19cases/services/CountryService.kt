package com.example.covid19cases.services

import com.example.covid19cases.models.MyCountry
import retrofit2.Call
import retrofit2.http.GET

interface CountryService {

    @GET("countries")
    fun getAffectedCountryList () : Call<List<MyCountry>>
}
