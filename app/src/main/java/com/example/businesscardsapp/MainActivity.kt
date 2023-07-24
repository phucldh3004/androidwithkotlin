package com.example.businesscardsapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.businesscardsapp.ui.theme.BusinessCardsAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BusinessCardsAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = Color(0xFFEADDFF)
                ) {


                    Greeting("Android Developer Extraordinaire", "Jennifer Doe")
                }
            }
        }
    }
}

@Composable
fun Greeting(title: String, name: String, modifier: Modifier = Modifier) {
    val image = painterResource(R.drawable.iconimage)
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Box(contentAlignment = Alignment.TopCenter) {
            Row() {
                Image(
                    painter = image,
                    contentDescription = null,
                    modifier = Modifier.padding(10.dp)
                )
            }
        }
        Box(contentAlignment = Alignment.TopCenter) {
            Row() {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(
                        text = name,
                        fontSize = 24.sp,
                        fontWeight = FontWeight.Bold,
                        textAlign = TextAlign.Center
                    )
                    Text(
                        text = title,
                        fontSize = 16.sp,
                        textAlign = TextAlign.Center,
                        color = Color.Gray
                    )
                }
            }
        }

    }

    Column(modifier = Modifier.fillMaxSize().padding(20.dp),
            verticalArrangement = Arrangement.Bottom,
        horizontalAlignment = Alignment.CenterHorizontally) {
        Row(modifier = modifier) {
            Text("+11(123444555666)", color = Color(0xFF3ddc84))
        }
        Row(modifier = modifier) {
            Text("@AndroidDev", color = Color(0xFF3ddc84))
        }
        Row(modifier = modifier) {
            Text("jen.doe@android.com", color = Color(0xFF3ddc84))
        }

    }

}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    BusinessCardsAppTheme {
        Greeting("Android Developer Extraordinaire", "Jennifer Doe")
    }
}