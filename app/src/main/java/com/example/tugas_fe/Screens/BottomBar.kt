package com.example.tugas_fe.Screens

import NavItem
import Screen
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavBackStackEntry
import androidx.navigation.NavController
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.NavHost
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.tugas_fe.Data.aboutData.biodata
import com.example.tugas_fe.Data.student
import com.example.tugas_fe.MainViewModel
import com.example.tugas_fe.R


@Composable
fun bottomBar(
    modifier : Modifier = Modifier,
) {

    val navController : NavHostController = rememberNavController()
    val currentRoute = currentRoute(navController = navController)


    Scaffold(
        topBar = {
            topBar(navController = navController)},
        bottomBar = {
            if(currentRoute !in listOf(Screen.Detail.route + "/{studentId}", Screen.foodDetail.route + "/{foodId}", Screen.tripDetail.route + "/{pictureId}")){
                bottomBarComponents(navController = navController)
            }
        },

    ){contentPadding->
        NavHost(navController = navController,
            startDestination = Screen.Home.route,
            modifier.padding(contentPadding)
            ){
            composable(Screen.Home.route){
                lazycolumnrow(navController)
            }
            composable(Screen.Search.route){
                lazyGrid(navController)
            }
            composable(Screen.About.route){
                about(biodata)
            }
            composable(Screen.Detail.route + "/{studentId}",
                arguments = listOf(navArgument("studentId"){ type = NavType.IntType})
            ){
                navBackStackEntry ->
                detail(studentId = navBackStackEntry.arguments?.getInt("studentId")
                )
            }
            composable(Screen.foodDetail.route + "/{foodId}",
                arguments = listOf(navArgument("foodId"){ type = NavType.IntType})
            ){
                navBackStackEntry ->
                foodDetail(foodId = navBackStackEntry.arguments?.getInt("foodId"))
            }
            composable(Screen.tripDetail.route + "/{pictureId}",
                arguments = listOf(navArgument("pictureId"){type = NavType.IntType})
            ){
                navBackStackEntry ->
                picDetail(tripId = navBackStackEntry.arguments?.getInt("pictureId"))
            }
        }
    }
}





@Composable
fun bottomBarComponents(
    navController: NavHostController,
    modifier : Modifier = Modifier
){
    NavigationBar{
        val navBackStackEntry by navController.currentBackStackEntryAsState()
        val currentRoute = navBackStackEntry?.destination?.route
        val navigationItems = listOf(
            NavItem(
                tittle = "Lazy Row and Lazy Column",
                icon = painterResource(id = R.drawable.memberbtn_unclicked),
                selectedIcon = painterResource(id = R.drawable.memberbtn_clicked),
                screen = Screen.Home
            ),
            NavItem(
                tittle = "Lazy Grid",
                icon = painterResource(id = R.drawable.albumbtn_unclicked),
                selectedIcon = painterResource(id = R.drawable.memberbtn_clicked),
                screen = Screen.Search
            ),
            NavItem(
                tittle = "About",
                icon = painterResource(id = R.drawable.profilebtn_unclicked),
                selectedIcon = painterResource(id = R.drawable.profilebtn_clicked),
                screen = Screen.About
            )
        )
        navigationItems.forEach { item ->
            val selected = currentRoute == item.screen.route
            NavigationBarItem(
                selected = currentRoute == item.screen.route,
                onClick = {
                    navController.navigate(item.screen.route) {
                        popUpTo(navController.graph.findStartDestination().id) {
                            saveState = true
                        }
                        restoreState = true
                        launchSingleTop = true
                    }
                },
                icon = {
                    if (selected) {
                        Image(painter = item.selectedIcon,
                            contentDescription = item.tittle)
                    }else{
                        Image(painter = item.icon,
                            contentDescription = item.tittle)
                    }
                },
                label = {
                    if (selected){
                        Text(text = item.tittle, color = Color(0xFF162ADE), fontSize = 10.sp)
                    }
                }
            )
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun topBar(navController: NavHostController) {
    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val currentRoute = navBackStackEntry?.destination?.route
    val appBarTittle = when (currentRoute) {
        Screen.Home.route -> "Lazy Column and Lazy Row"
        Screen.Search.route -> "Lazy Grid"
        Screen.About.route -> "About"
        Screen.Detail.route + "/{studentId}" -> "Detail Screen"
        Screen.foodDetail.route + "/{foodId}" -> "Detail Screen"
        Screen.tripDetail.route + "/{pictureId}" -> "Detail Screen"
        else -> "Unknown"
    }

    TopAppBar(
        title = { Text(text = appBarTittle,
            color = Color(0xFFC40C0C),
            fontSize = 18.sp,
        )
                },
        navigationIcon = {
             if(currentRoute == Screen.Detail.route + "/{studentId}" || currentRoute == Screen.foodDetail.route + "/{foodId}" || currentRoute == Screen.tripDetail.route + "/{pictureId}" ){
                IconButton(onClick = { navController.popBackStack() }) {
                    Icon(Icons.Filled.ArrowBack, contentDescription = null)
                }
            }
        }
    )
}

@Composable
fun currentRoute(navController: NavHostController): String? {
    val navBackStackEntry by navController.currentBackStackEntryAsState()
    return navBackStackEntry?.destination?.route
}