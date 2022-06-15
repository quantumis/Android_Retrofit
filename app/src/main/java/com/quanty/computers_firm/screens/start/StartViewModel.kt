package com.quanty.computers_firm.screens.start

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.quanty.computers_firm.repository.Repository
import com.quanty.kotlintest.model.components.Components
import kotlinx.coroutines.launch
import retrofit2.Response

class StartViewModel:ViewModel() {

    var repo = Repository()
    val myComponentsList: MutableLiveData<Response<Components>> = MutableLiveData()

    fun getComponents(){
        viewModelScope.launch{

        myComponentsList.value = repo.getCompon()

        }
    }

}