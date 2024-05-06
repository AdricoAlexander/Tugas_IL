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
import com.example.tugas_fe.Data.inkasaTrip
import com.example.tugas_fe.Data.tripData
import com.example.tugas_fe.Data.tripData.trippin


@Composable
fun picDetail(
    tripId : Int?
){
    val newTripList = tripData.tripList.filter { jalan ->
        jalan.id == tripId
    }
    Column {
        if (tripId != null && newTripList.isNotEmpty()){
            DetailScreen(newTripList = newTripList)
        }else{
            Text(text = "Foto Tidak Ditemukan")
        }
    }
}

@Composable
fun DetailScreen(
    newTripList : List<inkasaTrip>
){
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
        ) {
            newTripList.forEach { tripkeun ->
                trippic(trip = tripkeun)
                Spacer(
                    modifier = Modifier.height(10.dp)
                )
                Text(
                    text = "${tripkeun.name}",
                    fontSize = 16.sp
                )
                Spacer(
                    modifier = Modifier.height(10.dp)
                )
                Text(
                    text = "${tripkeun.desc}"
                )
                Spacer(
                    modifier = Modifier.height(10.dp)
                )
                Row(
                    horizontalArrangement = Arrangement.End,
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(20.dp)
                ) {
                    Text(text = "Tanggal :${tripkeun.date}")
                }
            }
        }
    }
}

@Preview
@Composable
private fun view() {
    picDetail(tripId = trippin.id)
}

@Composable
fun trippic(
    trip : inkasaTrip
){
    Image(painter = painterResource(id = trip.pic),
        contentDescription = trip.name,
        modifier = Modifier
            .size(250.dp)
    )
}