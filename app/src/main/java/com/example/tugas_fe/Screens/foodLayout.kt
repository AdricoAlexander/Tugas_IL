package com.example.tugas_fe.Screens

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tugas_fe.Data.bandungFood
import com.example.tugas_fe.Data.foodData.food

@Composable
fun foodLayout(food : bandungFood,
               onItemClicked : (Int) -> Unit) {
    Box(
        modifier = Modifier
            .size(80.dp)
            .clickable { onItemClicked(food.id) },
        contentAlignment = Alignment.Center
    ) {
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Box(
                modifier = Modifier
                    .size(50.dp)
                    .background(Color(0xFFFF8A08), RoundedCornerShape(200.dp))
                    .border(BorderStroke(2.dp, Color(0xFFC40C0C)), RoundedCornerShape(200.dp)),
                contentAlignment = Alignment.Center
            ) {
                foodimage(fim = food)
            }
            Text(text = "${food.name}",
                fontSize = 11.sp)
        }
    }
}

@Composable
fun foodimage(fim : bandungFood) {
    Image(painter = painterResource(id = fim.pic),
        contentDescription = fim.name,
        modifier = Modifier
            .clip(CircleShape)
        )

}
