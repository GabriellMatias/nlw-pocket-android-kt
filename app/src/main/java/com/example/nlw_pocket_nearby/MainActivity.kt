package com.example.nlw_pocket_nearby

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.toRoute
import com.example.nlw_pocket_nearby.data.model.Market
import com.example.nlw_pocket_nearby.ui.screen.home.HomeScreen
import com.example.nlw_pocket_nearby.ui.screen.market_details_screen.MarketDetailsScreen
import com.example.nlw_pocket_nearby.ui.screen.splash.SplashScreen
import com.example.nlw_pocket_nearby.ui.screen.welcome.WelcomeScreen
import com.example.nlw_pocket_nearby.ui.screen.routes.Home
import com.example.nlw_pocket_nearby.ui.screen.routes.Splash
import com.example.nlw_pocket_nearby.ui.screen.routes.Welcome
import com.example.nlw_pocket_nearby.ui.theme.NlwpocketnearbyTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            NlwpocketnearbyTheme {
                val navController = rememberNavController()
                NavHost(
                    navController = navController,
                    startDestination = Splash
                ) {
                    composable<Splash> {
                        SplashScreen(
                            onNavigateToWelcome = {
                                navController.navigate(Welcome)
                            }
                        )
                    }
                    composable<Welcome> {
                        WelcomeScreen(
                            onNavigateToHome = {
                                navController.navigate(Home)
                            }
                        )
                    }
                    composable<Home> {
                        HomeScreen(
                            onNavigateToMarketDetails = { selectedMarket ->
                                navController.navigate(selectedMarket)
                            }
                        )
                    }
                    composable<Market> {
                        val selectedMarket = it.toRoute<Market>()
                        MarketDetailsScreen(
                            market = selectedMarket,
                            onNavigateBack = {
                                navController.popBackStack()
                            }
                        )
                    }
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    NlwpocketnearbyTheme {}
}