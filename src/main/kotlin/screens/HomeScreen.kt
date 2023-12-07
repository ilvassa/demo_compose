package screens

import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import navcontroller.NavController
import screens.components.ItemDetail
import screens.components.LazyListColumn
import screens.components.ScrollableListBox


@Composable
fun HomeScreen(
    navController: NavController
) {
    Row (
        modifier = Modifier.fillMaxWidth()
    ){
        Column (
            modifier = Modifier
                .fillMaxSize()
                .padding(start = 12.dp, end = 12.dp, bottom = 12.dp)
                .weight(1f)
        ){
            LazyListColumn()
        }
        Column (
            modifier = Modifier
                .fillMaxSize()
                .padding(end = 12.dp, bottom = 12.dp)
                .weight(1f)
        ){
            ScrollableListBox()
        }
        Column (
            modifier = Modifier
                .fillMaxSize()
                .padding(end = 12.dp, bottom = 12.dp)
                .weight(2f)
        ){
            ItemDetail()
        }


    }
}