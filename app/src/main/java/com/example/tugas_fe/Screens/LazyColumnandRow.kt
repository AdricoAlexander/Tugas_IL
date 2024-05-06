package com.example.tugas_fe.Screens
import Screen
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.tugas_fe.Data.bandungFood
import com.example.tugas_fe.Data.foodData
import com.example.tugas_fe.Data.inkasaaData
import com.example.tugas_fe.Data.student
import com.example.tugas_fe.MainViewModel

@Composable
fun lazycolumnrow(navController: NavHostController) {

    val students = remember { inkasaaData.inkasaList }
    val foods = remember { foodData.foodlist }
    val viewmodel = viewModel<MainViewModel>()
    val searchText by viewmodel.searchText.collectAsState()
    val person by viewmodel.person.collectAsState()
    val isSearching by viewmodel.isSearching.collectAsState()
    Box(
        Modifier
            .fillMaxSize()
            .background(Color(0xFFFF8A08))
    ) {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(20.dp)

        ) {
            Column(
                modifier = Modifier
                    .fillMaxSize()
            ){
                LazyRow(
                ) {
                    items(
                        items = foods, key = {it.id},
                        itemContent = {
                            foodLayout(food = it){foodId ->
                                navController.navigate(Screen.foodDetail.route + "/$foodId")
                            }
                        }
                    )
                }
                Spacer(modifier = Modifier.height(10.dp))
                OutlinedTextField(value = searchText,
                    onValueChange = viewmodel::onSearchTextChange,
                    modifier = Modifier.fillMaxWidth(),
                    placeholder = { Text(text = "Cari...")}
                )
                Spacer(modifier = Modifier.height(10.dp))
                LazyColumn(
                ) {
                    items(
                        items = person, key = {it.id},
                        itemContent = {
                            memberLayout(inkasa = it){studentId ->
                                navController.navigate(Screen.Detail.route + "/$studentId")
                            }
                        }
                    )
                }
            }
        }
    }
}


