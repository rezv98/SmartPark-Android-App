package com.example.smartpark.Models

data class Driver (
    val id_driver : Int,
    val full_name: String,
    val cellphone:Long,
    val email: String,
    val dni : Long
){
}