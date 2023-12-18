package com.example.introduction

import android.graphics.drawable.Icon
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box

import androidx.compose.foundation.layout.Column

import androidx.compose.foundation.layout.Row

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.introduction.ui.theme.IntroductionTheme
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material3.Icon

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            IntroductionTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Introduction()
                }
            }
        }
    }
}
@Composable
fun Introduction() {
    DescriptionElement(
        imagePainter = painterResource(id = R.drawable.android_logo),
        full_name = stringResource(id = R.string.full_name),
        gmail = stringResource(id = R.string.gmail),
        description_info = stringResource(id = R.string.title),
        number_phone = stringResource(id = R.string.number_phone),
        contact = stringResource(id = R.string.contact)
    )
}

@Composable
private fun DescriptionElement(
    imagePainter: Painter,
    full_name: String,
    gmail: String,
    description_info: String,
    number_phone: String,
    contact: String,    
) {

    Column(
            modifier = Modifier
                .fillMaxSize()
                .fillMaxHeight()
                .fillMaxWidth(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,

    ) {
        Image(
            painter = imagePainter, contentDescription = null,
            modifier = Modifier
                .padding(30.dp)
                .size(100.dp)
                .background(Color.Black)
        );
        Text(
            text = full_name,
            color = Color(0xFF073042),
            fontSize = 40.sp,
            modifier = Modifier

        );
        Text(
            text = description_info,
            color = Color(0xFF3ddc84),
            modifier = Modifier
        );
    }
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(100.dp),
        verticalArrangement = Arrangement.Bottom,
    ) {
        Row {
        androidx.compose.material3.Icon(imageVector = Icons.Default.Phone, contentDescription = "Phone", tint = Color.Green);
        Spacer(Modifier.width(10.dp));
        Text(text = number_phone);
        }
        Row {
        Icon(imageVector = Icons.Default.Email, contentDescription = "Email", tint = Color.Green);
        Spacer(Modifier.width(10.dp))
        Text(text = gmail);
        }
        Row {
        Icon(imageVector = Icons.Default.Info, contentDescription = "Infor", tint = Color.Green);
        Spacer(Modifier.width(10.dp))
        Text(text = contact);
        }
    }

}

