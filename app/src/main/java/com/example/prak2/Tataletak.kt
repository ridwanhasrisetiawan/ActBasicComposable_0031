package com.example.prak2

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
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun TataletakColumn(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier.padding(
            top = 20.dp,
            start = 20.dp,
            end = 20.dp
        )
    ) {
        Text(text = "Nama")
        Text(text = "Alamat")
        Text(text = "Email")
        Text(text = "No. Telepon")
    }
}
@Composable
fun TataletakRow(modifier: Modifier = Modifier) {
    Row(
        modifier = modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceEvenly
    ) {
        Text(text = "Home")
        Text(text = "Profile")
        Text(text = "Produk")
        Text(text = "Kontak")
    }
}
@Composable
fun TataletakBox(modifier: Modifier = Modifier) {
    Box(
        modifier = modifier
            .fillMaxHeight()
            .fillMaxWidth(),
        contentAlignment = Alignment.Center
    ) {
        Text(text = "Selamat Datang")
    }
}
@Composable
fun TataletakColumnRow(modifier: Modifier = Modifier) {
    Column {

        // Baris 1
        Row(
            modifier = modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            Text(text = "Produk")
            Text(text = "Harga")
            Text(text = "Stok")
        }

        // Baris 2
        Row(
            modifier = modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            Text(text = "Laptop")
            Text(text = "Rp10.000.000")
            Text(text = "10")
        }
    }
}
@Composable
fun TataletakRowColumn(modifier: Modifier = Modifier) {
    Row(
        modifier = modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceEvenly
    ) {

        Column {
            Text(text = "Nama")
            Text(text = "Ridwan")
            Text(text = "Mahasiswa")
        }

        Column {
            Text(text = "Kelas")
            Text(text = "A")
            Text(text = "UMY")
        }
    }
}
@Composable
fun TataletakBoxColumnRow(modifier: Modifier = Modifier) {

    val gambar = painterResource(
        id = R.drawable.ganteng
    )

    Column {

        Box(
            modifier = modifier
                .fillMaxWidth()
                .height(110.dp)
                .background(Color.Yellow),
            contentAlignment = Alignment.Center
        ) {

            Column {

                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceEvenly
                ) {
                    Text(text = "Nama")
                    Text(text = "Kelas")
                    Text(text = "NIM")
                }

                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceEvenly
                ) {
                    Text(text = "Ridwan")
                    Text(text = "A")
                    Text(text = "20240140031")
                }
            }
        }

        Spacer(
            modifier = Modifier.height(10.dp)
        )

        Box(
            modifier = modifier
                .fillMaxWidth()
                .height(300.dp)
                .background(Color.Cyan),
            contentAlignment = Alignment.Center
        ) {

            Image(
                painter = gambar,
                contentDescription = "Foto Profil",
                contentScale = ContentScale.Fit
            )

            Text(
                text = "Profil Saya",
                fontSize = 40.sp,
                color = Color.Red,
                fontWeight = FontWeight.Bold,
                fontFamily = FontFamily.Cursive,
                modifier = Modifier.align(Alignment.Center)
            )
        }
    }
}
@Composable
fun DetailMahasiswa() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(20.dp)
    ) {
        Text(text = "Nama Lengkap: Ridwan")
        Text(text = "NIM: 20240140031")
        Text(text = "Kelas: A")
    }
}
@Composable
fun DetailKampus() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(20.dp)
    ) {
        Text(text = "Universitas Muhammadiyah Yogyakarta")
        Text(text = "Program Studi Informatika")
        Text(text = "Fakultas Teknik")
    }
}
@Composable
fun DetailKontak() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(20.dp),
        horizontalArrangement = Arrangement.SpaceEvenly
    ) {
        Text(text = "Email")
        Text(text = "WhatsApp")
        Text(text = "Instagram")
    }
}
@Composable
fun DetailProduk() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(20.dp)
    ) {
        Text(text = "Nama Produk: Laptop")
        Text(text = "Harga: Rp10.000.000")
        Text(text = "Kategori: Elektronik")
    }
}
@Composable
fun DetailHarga() {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(100.dp)
            .background(Color.Green),
        contentAlignment = Alignment.Center
    ) {
        Text(
            text = "Harga Rp10.000.000",
            fontSize = 25.sp,
            fontWeight = FontWeight.Bold
        )
    }
}