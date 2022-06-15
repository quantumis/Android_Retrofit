package com.quanty.computers_firm.repository

import com.quanty.computers_firm.api.RetrofitInstance
import com.quanty.kotlintest.model.components.Components
import retrofit2.Response

class Repository {
    suspend fun getCompon(): Response<Components>{
        return RetrofitInstance.api.getComponents()
    }
}