package com.example.tugas_fe.Screens

import Screen
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid
import androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridCells
import androidx.compose.foundation.lazy.staggeredgrid.items
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import com.example.tugas_fe.Data.inkasaTrip
import com.example.tugas_fe.Data.inkasaaData
import com.example.tugas_fe.Data.tripData
import com.example.tugas_fe.R

@Composable
fun lazyGrid(
    navController: NavHostController
) {
    val picture = remember { tripData.tripList }

    LazyVerticalStaggeredGrid(columns = StaggeredGridCells.Fixed(2),
        verticalItemSpacing = 4.dp,
        horizontalArrangement = Arrangement.spacedBy(4.dp),
        modifier = Modifier.fillMaxSize().background(Color(0xFFFF8A08))
    ) {
        items(picture, key = {it.id},
            itemContent = {
                photo(pic = it){pictureId ->
                    navController.navigate(Screen.tripDetail.route + "/$pictureId")
                }
            }
        )
    }
    }

@Composable
fun photo(
    pic: inkasaTrip,
    onItemClicked : (Int) -> Unit
) {
    Image(painter = painterResource(id = pic.pic),
        contentDescription = pic.name,
        contentScale = ContentScale.Crop,
        modifier = Modifier
            .fillMaxWidth()
            .wrapContentHeight()
            .clickable {
                onItemClicked(pic.id)
            }
    )
}

