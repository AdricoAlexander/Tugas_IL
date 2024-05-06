package com.example.tugas_fe.Screens

import android.widget.Space
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tugas_fe.Data.inkasaaData
import com.example.tugas_fe.Data.inkasaaData.inkasa
import com.example.tugas_fe.Data.student

@Composable
fun detailScreen(
    newStudentList : List<student>
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
        ){
            newStudentList.forEach {student ->
                memberFaceDetail(ink = student)
                Spacer(modifier = Modifier.height(10.dp)
                )
                Text(text = "Nama : ${student.name}",
                    fontSize = 16.sp,
                )
                Spacer(modifier = Modifier.height(10.dp)
                )
                Text(text = "${student.desc}")
                Spacer(modifier = Modifier.height(10.dp)
                )
                Row (
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceAround,
                    modifier = Modifier
                        .fillMaxWidth()
                ){
                    Text(text = "Tanggal Lahir : ${student.birth}")
                    Text(text = "Umur :  ${student.age}")
                    Text(text = "IPK : ${student.ipk}")
                }
            }
        }
    }
}

@Composable
fun detail(
    studentId : Int?
){
    val newStudentList = inkasaaData.inkasaList.filter { student ->
        student.id == studentId
    }
    Column {
        if(studentId != null && newStudentList.isNotEmpty()){
            detailScreen(newStudentList = newStudentList)
    }else{
        Text(text = "Mahasiswa tidak Ditemukan")
        }

    }
}

@Preview(showSystemUi = true)
@Composable
private fun view() {
    detail(studentId = inkasa.id)
}

@Composable
fun memberFaceDetail(ink : student) {
    Image(painter = painterResource(id = ink.pic),
        contentDescription = ink.name,
        modifier = Modifier
            .size(250.dp)
    )
}