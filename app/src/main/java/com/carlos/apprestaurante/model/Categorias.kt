package com.carlos.apprestaurante.model

import com.google.gson.annotations.SerializedName

data class Categorias(

    @SerializedName("active")
    val active: Boolean,

    @SerializedName("_id")
    val _id: String,

    @SerializedName("name")
    val name: String,

    @SerializedName("description")
    val description: String
) {
}