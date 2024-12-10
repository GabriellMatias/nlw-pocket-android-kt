package com.example.nlw_pocket_nearby.data.model

import androidx.annotation.DrawableRes

class NearbyCategory(
    val id: String,
    val name: String
) {

    @get: DrawableRes
    val icon: Int?
        get() = NearbyCategoryFilterChipView.fromDescription(description = name)?.icon
}