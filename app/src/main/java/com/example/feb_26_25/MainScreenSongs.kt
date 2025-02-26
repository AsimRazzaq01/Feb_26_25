package com.example.feb_26_25

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.sp



@Composable
fun MainScreenSongs(modifier: Modifier = Modifier){
//    var song1 = Song("Thank You","Ariana Grande")
//    var song2 = Song("Thank You next","Ariana Grande")

//    var SongList = remember{ mutableStateListOf(Song("Thank You, next","Ariana Grande"),
//        Song("Without me","Halsy"), Song("High Hopes","Panic! at the Disco")) }

    var SongList: MutableList<Song> = remember { mutableStateListOf() }

    SongList.add(Song("Thank You, next","Ariana Grande"))
    SongList.add(Song("Without me","Halsy"))
    SongList.add(Song("High Hopes","Panic! at the Disco"))



    LazyColumn(modifier) {

        items(SongList){CurrentItem ->
            Text(text = CurrentItem.name.toString(), color = Color.Blue , fontSize = 24.sp)
            Text(text = CurrentItem.artist.toString(), color = Color.Gray , fontSize = 18.sp)
        }


    }   // End of LazyColumn
}   // End of MainScreenSongs



