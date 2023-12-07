
//import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import navcontroller.rememberNavController
import screens.PermanentDrawerTest
import screens.Screen

@Composable
@Preview
fun App() {
    val navController by rememberNavController(Screen.HomeScreen.name)

    MaterialTheme {
        //ScaffoldTest()
//        NavigationRailTest(navController)
        PermanentDrawerTest(navController)

    }
}

fun main() = application {
    Window(onCloseRequest = ::exitApplication) {
        App()
    }
}
