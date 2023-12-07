package screens.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import navcontroller.NavController
import screens.Screen

@Composable
fun NavRailComponent(navController: NavController) {
    val screens = Screen.values().toList()
    val currentScreen by remember { navController.currentScreen }

    NavigationRail(
        header = {
            IconButton(onClick = { /*TODO*/ }) {
                Icon(
                    imageVector = Icons.Default.Menu, contentDescription = "Menu"
                )
            }

        },
        modifier = Modifier.fillMaxHeight()
            .background(MaterialTheme.colors.background)
//            .offset(x = (-1).dp),
//        backgroundColor = MaterialTheme.colors.primary,
//        contentColor = MaterialTheme.colors.onPrimary,
    ) {
        screens.forEach {
            NavigationRailItem(
                selected = currentScreen == it.name,
                icon = {
                    Icon(
                        imageVector = it.icon,
                        contentDescription = it.label
                    )
                },
                label = {
                    Text(it.label)
                },
                alwaysShowLabel = true,
                onClick = {
                    navController.navigate(it.name)
                }
            )
        }
    }
}