package com.example.spacefriends

import android.os.Bundle
import android.os.Message
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.spacefriends.ui.theme.SpaceFriendsTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            SpaceFriendsTheme {
                Surface ( modifier = Modifier.fillMaxSize() )
                {
//
                    SpaceImage(stringResource(R.string.hello), stringResource(R.string.from))
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String,from:String, modifier: Modifier = Modifier) {
     Column (verticalArrangement = Arrangement.Center,
             modifier = modifier

     ){
         Text(
             text = "$name!",
             modifier = modifier.padding(all = 5.dp),
             fontSize = 115.sp,
             lineHeight = 116.sp
         )
             Text(
                 text = "from $from",
                 modifier = modifier
                     .padding(16.dp)
                     .align(Alignment.End),
                 lineHeight = 100.sp,
                 fontSize = 60.sp)
     }
}

@Composable
fun SpaceImage(message: String,from: String, modifier: Modifier = Modifier)
{
    val  image = painterResource(R.drawable.androidparty)
    Box(modifier) {
        Image(
            painter = image,
            contentDescription = null,
            contentScale = ContentScale.Crop,
            alpha =  0.5F
        )
        Greeting(name = message, from = from, modifier = Modifier)
    }
}

//@Preview(showBackground = true)
//@Composable
//fun GreetingPreview() {
//    SpaceFriendsTheme {
//        Greeting("Space", from = "Pilots")
//    }
//}