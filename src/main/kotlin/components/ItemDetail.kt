package screens.components

import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun ItemDetail(){
    val stateVertical = rememberScrollState(0)
    val stateHorizontal = rememberScrollState(0)
    Box(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(stateVertical)
            .padding(end = 12.dp, bottom = 12.dp)
            .horizontalScroll(stateHorizontal)
    ){
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
//         GatewayParameterWindow(int[] v)
            Text(text = "Details", style = MaterialTheme.typography.h3.copy(color = Color.Blue))
            ItemParameterRow()
            ItemParameterRow()
            ItemParameterRow()

        }
    }
}

@Composable
fun ItemParameterRow(){
    Row (horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically) {
        Text(text = "Label", style = MaterialTheme.typography.h6.copy(color = Color.Blue))
        Spacer(Modifier.size(30.dp))
        TextField(value = "10", onValueChange = {} , label = { Text("label") })
    }
}

/*
* Button(modifier = Modifier.align(Alignment.CenterHorizontally),
                onClick = {
                    var testint = IntArray(10)
                    try {
                        val test = SmartPL_NodeParameterWindow(testint)
                        test.values.forEach(::println)
                    } catch (e: Exception){

                    }
                }){
                Text("SMART-PL - NodeParameter")
            }
            Spacer(modifier = Modifier.size(30.dp))
            Button(modifier = Modifier.align(Alignment.CenterHorizontally),
                onClick = {
                    var testint = IntArray(10)
                    try {
                        val test = GatewayParameterWindow(testint)
                        println(test)
                    } catch (e: Exception){

                    }
                }){
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Text("SMART-PL - NodeParameter")
                    Icon(
                        imageVector = Icons.Rounded.Edit,
                        contentDescription = null
                    )
                }
            }*/
