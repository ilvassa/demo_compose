package screens

import androidx.compose.material.Scaffold
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.rememberScaffoldState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import components.CustomNavigationHost
import components.DrawerBody
import components.DrawerHeader
import components.MenuItem
import kotlinx.coroutines.launch
import navcontroller.NavController
import screens.components.AppBar

@Composable
fun ScaffoldTest(navController: NavController) {
    val scaffoldState = rememberScaffoldState()
    val scope = rememberCoroutineScope()
    Scaffold (
        scaffoldState= scaffoldState,
        topBar = {
            AppBar(
                onNavigationIconClick = {
                    scope.launch {
                        scaffoldState.drawerState.open()
                    }
                }
            )
        },
        drawerGesturesEnabled = scaffoldState.drawerState.isOpen,
        drawerContent = {
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
//                        when(it.id){
//                            "settings" -> navigateToSettings
//                        }
                }
            )
        },
        content = {
            CustomNavigationHost(navController = navController)
        }
    )
}