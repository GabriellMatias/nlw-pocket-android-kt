package com.example.nlw_pocket_nearby.data.model

import kotlinx.serialization.Serializable

@Serializable
data class Rule(
    val id: String,
    val description: String,
    val marketId: String
)