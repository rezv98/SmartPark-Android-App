package com.example.smartpark.Models

data class Parkings (
    val id_parking: Int,
    val name: String,
    val nro_spaces:Int,
    val address: String,
    val description: String,
    val country: String,
    val cellphone: Long,
    val location: String,
    val park_type: String,
    val photo_reference: String,
    val id_owner: Int,
    val id_rate: Int
) {
}