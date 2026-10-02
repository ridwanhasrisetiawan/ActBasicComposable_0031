package com.example.prak2

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun TugasLogin() {

    Box(
        modifier = Modifier.fillMaxSize()
    ) {
        Image(
            painter = painterResource(
                id = R.drawable.background_login
            ),
            contentDescription = "Background Login",
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.Crop
        )
        Column(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Top
        ) {

            // Jarak dari atas
            Spacer(
                modifier = Modifier.height(45.dp)
            )
            Text(
                text = "Login",
                fontSize = 28.sp,
                color = Color.Blue,
                fontWeight = FontWeight.Bold
            )
            Text(
                text = "Ini adalah halaman login",
                fontSize = 14.sp,
                color = Color.White
            )
            // Jarak sebelum logo
            Spacer(
                modifier = Modifier.height(45.dp)
            )
            Image(
                painter = painterResource(
                    id = R.drawable.logo_login
                ),
                contentDescription = "Logo UMY",
                modifier = Modifier.size(120.dp),
                contentScale = ContentScale.Fit
            )

            // Jarak setelah logo
            Spacer(
                modifier = Modifier.height(35.dp)
            )
            Text(
                text = "Nama",
                fontSize = 14.sp,
                color = Color.Red,
                fontWeight = FontWeight.Bold
            )
            Text(
                text = "Ridwan Hasri Setiawan",
                fontSize = 16.sp,
                color = Color.Blue,
                fontWeight = FontWeight.Bold
            )

            // Jarak
            Spacer(
                modifier = Modifier.height(8.dp)
            )
            Text(
                text = "20240140031",
                fontSize = 20.sp,
                color = Color.Black,
                fontWeight = FontWeight.Bold
            )

            // Jarak sebelum foto
            Spacer(
                modifier = Modifier.height(20.dp)
            )
            Image(
                painter = painterResource(
                    id = R.drawable.foto_login
                ),
                contentDescription = "Foto Profil",
                modifier = Modifier
                    .size(290.dp)
                    .clip(CircleShape)
                    .border(
                        width = 3.dp,
                        color = Color.White,
                        shape = CircleShape
                    ),
                contentScale = ContentScale.Crop
            )
        }

    }
}