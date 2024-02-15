package com.groot.geminiAi.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost

@Composable
fun NavHostController(navController: NavHostController) {
    NavHost(navController = navController, startDestination = Route.menuScreen) {


    }
}