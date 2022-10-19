package com.carlos.apprestaurante.data

import com.carlos.apprestaurante.model.Categorias
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Header

class Api {

    //URL COMPLETA
    //URL_BASE = https://mirestaurante.com/categorias
    //METODO = categorias


    //  1. CONFIGURAR LA URL BASE DE RETROFIT
    private val builder : Retrofit.Builder = Retrofit.Builder()
        .baseUrl("")
        .addConverterFactory(GsonConverterFactory.create())

    //  2. DEFINIR LOS METODOS DONDE SE VAN A CONECTAR

    interface ApiInterface{

        @GET("categorias")
        fun getCategorias(@Header("token") token:String) : Call<List<Categorias>>

    }

    //  3. DEVOLVER EL METODO PARA LA INTERFACE

    fun build() : ApiInterface{
        return builder.build().create(ApiInterface::class.java)
    }


}