package com.example.feb_26_25.ui.theme

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.sp



@Composable
fun MainScreenNums(modifier: Modifier){

    var numList = remember{ mutableListOf(100,200,300) }

    LazyColumn(modifier) {

        items(numList){currentItem ->
            Text(currentItem.toString(), fontSize = 30.sp)
        }





    }   // End of Column
}   // End of MainScreen


