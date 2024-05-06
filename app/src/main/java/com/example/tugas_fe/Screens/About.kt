package com.example.tugas_fe.Screens

import android.widget.Space
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tugas_fe.Data.about
import com.example.tugas_fe.Data.aboutData
import com.example.tugas_fe.Data.aboutData.biodata
import com.example.tugas_fe.R

@Composable
fun about(
    adrico : about
) {

  Box(
      contentAlignment = Alignment.Center,
      modifier = Modifier
          .fillMaxSize()
          .background(Color(0xFFFF8A08))
  ){
      Column(
          horizontalAlignment = Alignment.CenterHorizontally,
          modifier = Modifier
              .fillMaxSize()
              .padding(20.dp)
      ){
          Box(
              contentAlignment = Alignment.Center,
              modifier = Modifier
                  .size(100.dp, 120.dp)
                  .border(4.dp, Color(0xFFC40C0C), RoundedCornerShape(20.dp),)
                  .shadow(20.dp, RoundedCornerShape(20.dp))
          ){
              Image(painter = painterResource(id = adrico.pic),
                  contentDescription = "Adrico Alexander P",
                  modifier = Modifier
                      .size(100.dp, 120.dp)
                  )
          }
          Box(
              contentAlignment = Alignment.Center,
              modifier = Modifier
                  .fillMaxWidth()
                  .height(250.dp)
                  .padding(20.dp)
                  .background(
                      brush = Brush.horizontalGradient(
                          colors = listOf(Color(0xFFFFC100), Color(0xFFFF6500), Color(0xFFC40C0C))
                      ), shape = RoundedCornerShape(20.dp)
                  )
                  .border(2.dp, Color(0xFF0d0d0d), shape = RoundedCornerShape(20.dp))

          ){
              Column(
                  horizontalAlignment = Alignment.CenterHorizontally,
                  modifier = Modifier
                      .fillMaxSize()
                      .padding(10.dp)
              ){
                  Text(text = "Nama : ${adrico.name} (Alex) ", color = Color(0xFF162ADE), fontWeight = FontWeight.Bold)
                  Spacer(modifier = Modifier.height(5.dp))
                  Text(text = "Tanggal Lahir : ${adrico.birth}", color = Color(0xFF162ADE), fontWeight = FontWeight.Bold)
                  Spacer(modifier = Modifier.height(5.dp))
                  Text(text = "Email : ${adrico.email}", color = Color(0xFF162ADE), fontWeight = FontWeight.Bold)
                  Spacer(modifier = Modifier.height(5.dp))
                  Text(text = "Universitas: ${adrico.univ}", color = Color(0xFF162ADE), fontWeight = FontWeight.Bold)
                  Spacer(modifier = Modifier.height(5.dp))
                  Text(text = "Jurusan : ${adrico.jurusan}", color = Color(0xFF162ADE), fontWeight = FontWeight.Bold)
                  Spacer(modifier = Modifier.height(5.dp))
                  Text(text = "Hobi : ${adrico.hobi}", color = Color(0xFF162ADE), fontWeight = FontWeight.Bold)

              }
          }
      }
  }
}

@Preview (showBackground = true)
@Composable
private fun view() {
    about(biodata)
}