package br.senai.sp.jandira.profile.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Image
import androidx.compose.material.icons.filled.Php
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun ProfileSocial(
    icone: ImageVector = Icons.Default.Image,
    texto: String = "Texto",
    background: Color = Color.Transparent
){
    Card(
        modifier = Modifier
            .padding(end = 10.dp)
            .width(70.dp)
            .height(60.dp),
        colors = CardDefaults.cardColors(background),
        border = BorderStroke(1.dp, color = Color.Gray),
        shape = RoundedCornerShape(6.dp),

    ){
        Column(
            modifier = Modifier
                .fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally
        ){
            Icon(
                imageVector = icone,
                contentDescription = "",
                tint = Color.Gray,
                modifier = Modifier
                    .size(40.dp)
            )
            Text(
                text = texto,
                fontSize = 16.sp,
                color = Color.Gray
            )
        }
    }
}

@Preview
@Composable
private fun ProfileSocialPreview(){
    ProfileSocial()
}