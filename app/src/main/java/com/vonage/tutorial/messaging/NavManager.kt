package com.vonage.tutorial.messaging

import androidx.navigation.NavController
import androidx.navigation.NavDirections

object NavManager {
    private lateinit var navController: NavController

    fun init(navController: NavController) {
        NavManager.navController = navController
    }

    fun navigate(navDirections: NavDirections) {
        navController.navigate(navDirections)
    }
}
