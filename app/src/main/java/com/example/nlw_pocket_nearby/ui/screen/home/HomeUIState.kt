package com.example.nlw_pocket_nearby.ui.screen.home

import com.google.android.gms.maps.model.LatLng
import com.example.nlw_pocket_nearby.data.model.NearbyCategory
import com.example.nlw_pocket_nearby.data.model.Market

data class HomeUiState(
    val categories: List<NearbyCategory>? = null,
    val markets: List<Market>? = null,
    val marketLocations: List<LatLng>? = null
)