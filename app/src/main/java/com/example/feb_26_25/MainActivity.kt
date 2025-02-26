package com.example.feb_26_25

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.feb_26_25.ui.theme.Feb_26_25Theme
import com.example.feb_26_25.ui.theme.MainScreenNums

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Feb_26_25Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->

                    //MainScreenNums(modifier = Modifier.padding(innerPadding))

                    MainScreenSongs(modifier = Modifier.padding(innerPadding))

                }
            }
        }
    }
}

