package com.techy.groot.nfctools.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.groot.geminiAi.navigation.Route
import com.techy.groot.nfctools.ui.module.BeamAndroidScreen

@Composable
fun NavHostController(navController: NavHostController) {
    NavHost(navController = navController, startDestination = Route.beamAndroidScreen) {

        composable(Route.beamAndroidScreen) {
            BeamAndroidScreen()
        }
    }
}