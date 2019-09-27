package com.example.smartpark.Models

data class Space (
    val id_space: Int,
    val tag: String,
    val available: Boolean,
    val id_driver: Int
){
}