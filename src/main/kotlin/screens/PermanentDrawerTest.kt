package screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.PermanentDrawerSheet
import androidx.compose.material3.PermanentNavigationDrawer
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import components.CustomNavigationHost
import components.DrawerBody
import components.DrawerHeader
import components.MenuItem
import navcontroller.NavController

@Composable
fun PermanentDrawerTest(
    navController: NavController
) {
    Surface(
        modifier = Modifier.background(color = MaterialTheme.colors.background)
    ) {
        val screens = Screen.values().toList()
        val currentScreen by remember { navController.currentScreen }

        PermanentNavigationDrawer(
            drawerContent = {
                PermanentDrawerSheet {
                    DrawerHeader()
                    DrawerBody(
                        itms = listOf(
                            MenuItem(
                                id = "home",
                                title = "Home",
                                contentDesc = "go to homescreen",
                                icon = Icons.Default.Home
                            ),
                            MenuItem(
                                id = "settings",
                                title = "Settings",
                                contentDesc = "go to settings",
                                icon = Icons.Default.Settings
                            ),
                            MenuItem(
                                id = "notification",
                                title = "Notification",
                                contentDesc = "go to notification-screen",
                                icon = Icons.Default.Notifications
                            ),
                            MenuItem(
                                id = "help",
                                title = "Help",
                                contentDesc = "get Help",
                                icon = Icons.Default.Info
                            ),
                        ),
                        onItemClick = {
                            println("Clicked on ${it.title}")
                            navController.navigate(it.id)
//                        when(it.id){
//                            "settings" -> navigateToSettings
//                        }
                        }
                    )
                }
            },
            modifier = Modifier.fillMaxSize(),//width(250.dp),
            content = {
                Box(
                    modifier = Modifier.fillMaxHeight()
                ) {
                    CustomNavigationHost(navController = navController)
                }
            },
        )
    }
}