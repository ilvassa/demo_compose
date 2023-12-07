package components

import androidx.compose.runtime.Composable
import navcontroller.NavController
import navcontroller.NavigationHost
import navcontroller.composable
import screens.*

@Composable
fun CustomNavigationHost( navController: NavController) {
    NavigationHost(navController) {
        composable(Screen.HomeScreen.name) {
            HomeScreen(navController)
        }

        composable(Screen.NotificationsScreen.name) {
            NotificationScreen(navController)
        }

        composable(Screen.SettingsScreen.name) {
            SettingScreen(navController)
        }

        composable(Screen.ProfileScreens.name) {
            ProfileScreen(navController)
        }

    }.build()
}