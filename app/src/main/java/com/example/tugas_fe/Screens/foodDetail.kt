package com.example.tugas_fe.Screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tugas_fe.Data.bandungFood
import com.example.tugas_fe.Data.foodData
import com.example.tugas_fe.Data.foodData.food

@Composable
fun foodDetail(
    foodId : Int?
) {
    val newFoodList = foodData.foodlist.filter { bandung ->
        bandung.id == foodId
    }
    Column {
        if (foodId != null && newFoodList.isNotEmpty()){
            foodDetailScreen(newFoodList = newFoodList)
        }else{
            Text(text = "Makanan Tidak Ditemukan")
        }
    }
}

@Composable
fun foodDetailScreen(
    newFoodList : List<bandungFood>
) {
    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFFF8A08))
    ){
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(20.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ){
            newFoodList.forEach {bandung ->
                foodim(food = bandung)
                Spacer(modifier = Modifier.height(10.dp)
                )
                Text(text = "Nama : ${bandung.name}",
                    fontSize = 16.sp
                )
                Spacer(modifier = Modifier.height(10.dp)
                )
                Text(text = "${bandung.desc}")
                Spacer(modifier = Modifier.height(10.dp)
                )
                Row (
                    horizontalArrangement = Arrangement.End,
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(20.dp)
                ){
                    Text(text = "Rating :${bandung.rate} ")
                }
            }
        }
    }
}

@Composable
fun foodim(
    food : bandungFood
) {
    Image(painter = painterResource(id = food.pic) ,
        contentDescription = food.name,
        modifier = Modifier
            .size(250.dp)
    )
}



@Preview(showSystemUi = true)
@Composable
private fun view() {
    foodDetail(foodId = food.id)
}