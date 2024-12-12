package com.example.nlw_pocket_nearby.ui.screen.market_details_screen

import com.example.nlw_pocket_nearby.data.model.Rule

data class MarketDetailsUiState (
    val rules : List<Rule>?  = null,
    val coupon: String? = null
)