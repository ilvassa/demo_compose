package screens.components

import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Build
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp


@Composable
fun ScrollableListBox(){
    Box(
        modifier = Modifier
            .fillMaxSize()
            .padding(10.dp)
    ) {
        val stateVertical = rememberScrollState(0)
        val stateHorizontal = rememberScrollState(0)
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(end = 12.dp, bottom = 12.dp)
                .verticalScroll(stateVertical)
                .horizontalScroll(stateHorizontal)
        ) {
            Column {
                for (item in 0..50) {
                    ItemBox("Item #$item")
                    Spacer(modifier = Modifier.height(5.dp))
                }
            }
        }
        VerticalScrollbar(
            modifier = Modifier.align(Alignment.CenterEnd)
                .fillMaxHeight(),
            adapter = rememberScrollbarAdapter(stateVertical)
        )
        HorizontalScrollbar(
            modifier = Modifier.align(Alignment.BottomStart)
                .fillMaxWidth()
                .padding(end = 12.dp),
            adapter = rememberScrollbarAdapter(stateHorizontal)
        )
    }
}

@Composable
fun SimpleListBox(){
    Column (
        modifier = Modifier
            .fillMaxSize()
            .padding(end = 12.dp, bottom = 12.dp)
    ){
        for (item in 0..50) {
            ItemBox("Item #$item")
            Spacer(modifier = Modifier.height(5.dp))
        }
    }
}

@Composable
fun ItemBox(text: String = "Item") {
    Box(
        modifier = Modifier.height(40.dp)
            .width(300.dp)
            .background(color = Color.Gray)
            .padding(start = 10.dp)
            .clickable { ShowPar() },
        contentAlignment = Alignment.CenterStart
    ) {
        // Text(text = text)
        Row(verticalAlignment = Alignment.CenterVertically) {
            Icon(
                imageVector = Icons.Rounded.Build,
                text
            )
            Column {
                Text(text)
                Text("subtitle")
            }
        }
    }
}

@Composable
fun LazyListColumn() {
    LazyColumn {
        items(50){
                index ->  ItemBox("Item: $index")
            Spacer(modifier = Modifier.height(5.dp))
        }
    }
}

fun ShowPar(){
    var testint = IntArray(10)
    try {

    } catch (e: Exception){

    }
}
