package com.example.smartpark.Models

data class Assessment (
    val id_assessment : Int,
    val rate: Int,
    val comments :String,
    val id_parking: Int,
    val id_driver : Int
){
}