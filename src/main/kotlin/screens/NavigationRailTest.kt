package screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Surface
import androidx.compose.material.rememberScaffoldState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import components.CustomNavigationHost
import kotlinx.coroutines.launch
import navcontroller.NavController
import screens.components.AppBar
import screens.components.NavRailComponent

@Composable
fun NavigationRailTest (
    navController: NavController
) {
    Surface(
        modifier = Modifier.background(color = MaterialTheme.colors.background)
    ) {

        val scaffoldState = rememberScaffoldState()
        val scope = rememberCoroutineScope()

        Row(
            modifier = Modifier.fillMaxSize()
        ) {
            NavRailComponent(navController)
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
            ) {
                Box(
                    modifier = Modifier.fillMaxHeight()
                ) {
                    CustomNavigationHost(navController = navController)
                }

            }

        }
    }
}