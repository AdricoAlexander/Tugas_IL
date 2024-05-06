package com.example.tugas_fe.Screens

import Screen
import android.content.Intent
import android.graphics.drawable.shapes.Shape
import android.net.Uri
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardColors
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.tugas_fe.Data.inkasaaData.inkasa
import com.example.tugas_fe.Data.student
import com.example.tugas_fe.R

@Composable
fun memberLayout(
    inkasa : student,
    onItemClicked: (Int) -> Unit
){
    val context = LocalContext.current
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .height(170.dp)
            .padding(20.dp)
            .clickable {
                       onItemClicked(inkasa.id)
            }
            ,
        colors = CardDefaults.cardColors(
            containerColor = Color(0xFFFFC100)
        )
    )
    {
        Box (
            modifier = Modifier
                .fillMaxSize()
                .padding(7.dp),
        ){
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Start,
                modifier = Modifier
                    .fillMaxSize()
            ){
                memberFace(ink = inkasa)
                Column(
                    Modifier
                        .fillMaxSize()
                        .padding(7.dp),
                    verticalArrangement = Arrangement.SpaceAround,
                    horizontalAlignment = Alignment.Start
                ){
                    Text(text = "Nama : ${inkasa.name}",
                        fontSize = 12.sp
                        )
                    Text(text = "Umur : ${inkasa.age}",
                        fontSize = 12.sp
                    )
                    Text(text = "Tanggal Lahir : ${inkasa.birth}",
                        fontSize = 12.sp
                    )
                    Text(text = "IPK : ${inkasa.ipk}",
                        fontSize = 12.sp
                    )
                    Image(painter = painterResource(id = R.drawable.instagram),
                        contentDescription = "Instagram",
                        modifier = Modifier
                            .size(20.dp)
                            .clickable {
                                val intent = Intent(Intent.ACTION_VIEW, Uri.parse(inkasa.insta))
                                intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK
                                context.startActivity(intent)
                            }
                        )
                }
            }
        }
    }
}

@Composable
fun memberFace(ink : student) {
    Card(
        modifier = Modifier
            .border(0.5.dp, Color(0xFFC40C0C), RoundedCornerShape(8.dp)),
        shape = RoundedCornerShape(8.dp)
    ){
        Image(painter = painterResource(id = ink.pic), contentDescription = ink.name,
        )
    }
}
