package com.example.examen

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import coil.compose.AsyncImage
import com.example.examen.ui.theme.ExamenTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ExamenTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Greeting("Android")
                    //LoadingImageFromInternet()
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Composable
fun LoadingImageFromInternet() {
    AsyncImage(
        model = "https://bestwallpapers.net/wp-content/uploads/2020/03/Android-Phone-Wallpapers-Most-Android-Phone-Wallpaper-Download-844x1500.jpeg",
        contentDescription = null
    )
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ExamenTheme {
        LoadingImageFromInternet()
        Modifier.fillMaxSize()

    }
}