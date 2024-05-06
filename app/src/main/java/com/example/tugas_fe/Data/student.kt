package com.example.tugas_fe.Data

import android.app.DownloadManager.Query
import androidx.compose.ui.graphics.painter.Painter
import java.util.Date

data class student (
    val id : Int,
    val name : String,
    val pic : Int = 0,
    val desc : String,
    val birth  : String,
    val age : Int,
    val ipk : Double,
    val insta : String
){
    fun matchQuery(query: String): Boolean {
        val matchingCombinations = listOf(
            "$name",
            "$birth",
            "$age",
            "$insta",
            "$desc",
            "$ipk"
        )

        return matchingCombinations.any {it.contains(query, ignoreCase = true)}
    }
}

data class bandungFood(
    val id : Int,
    val name : String,
    val pic : Int = 0,
    val desc : String,
    val rate : Double
)

data class inkasaTrip(
    val id : Int,
    val name : String,
    val pic : Int = 0,
    val desc : String,
    val date : String,
)

data class about(
    val nim : Int,
    val name : String,
    val pic: Int = 0,
    val birth: String,
    val email : String,
    val univ : String,
    val jurusan : String,
    val hobi : String,
)
