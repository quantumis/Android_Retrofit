package com.quanty.computers_firm.api

import com.quanty.kotlintest.model.components.Components
import retrofit2.Response
import retrofit2.http.GET

interface ApiService {

    @GET("api/Components")
    suspend fun getComponents():Response<Components>
}