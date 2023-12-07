package screens

import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

@Composable
fun remenberWindowInfo(): WindowInfo {
    return WindowInfo(
        screenWidthInfo = WindowInfo.WindowType.Expanded,
        screenHeightInfo = WindowInfo.WindowType.Expanded,
        screenWidth = 100.dp,
        screenHeight = 100.dp
    )
}

data class WindowInfo (
        val screenWidthInfo: WindowType,
        val screenHeightInfo: WindowType,
        val screenWidth: Dp,
        val screenHeight: Dp
) {
    sealed class WindowType {
        object Compact: WindowType()
        object Medium: WindowType()
        object Expanded: WindowType()
    }
}