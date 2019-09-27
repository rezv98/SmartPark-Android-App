package com.example.smartpark.Models

data class Booking (
    val id_booking : Int,
    val arriving_time: String,
    val status :Int,
    val id_vehicle: Int,
    val id_space : Int
) {
}