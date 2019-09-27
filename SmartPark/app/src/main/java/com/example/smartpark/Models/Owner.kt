package com.example.smartpark.Models

data class Owner (
    val id_owner : Int,
    val full_name: String,
    val cellphone:Long,
    val company_name: String,
    val email: String,
    val ruc : Long
){
}