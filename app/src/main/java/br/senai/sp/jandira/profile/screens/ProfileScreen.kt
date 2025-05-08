package br.senai.sp.jandira.profile.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Group
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.StarBorder
import androidx.compose.material.icons.filled.Whatsapp
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.IconButtonColors
import androidx.compose.material3.IconButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.profile.R
import br.senai.sp.jandira.profile.components.ProfileSocial

@Composable
fun ProfileScreen(){
    Column(
        modifier = Modifier
            .padding(start = 10.dp)
            .fillMaxSize()
            .background(color = Color.White)
    ){
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(300.dp)
        ){
            Image(
                painter = painterResource(R.drawable.background),
                contentDescription = "",
                modifier = Modifier
                    .fillMaxSize(),
                contentScale = ContentScale.Crop
            )
            Column(
                modifier = Modifier
                    .fillMaxSize()
            ){
                Row(
                    modifier = Modifier
                        .padding(top = 10.dp)
                ){
                    IconButton(
                        onClick = {}
                    ){
                        Icon(
                            imageVector = Icons.Default.ArrowBack,
                            contentDescription = "",
                            tint = Color.White
                        )
                    }
                    Column(
                        modifier = Modifier
                            .padding(start = 70.dp),
                        horizontalAlignment = Alignment.CenterHorizontally
                    ){
                        Text(
                            text = "Details",
                            fontSize = 20.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color.White,
                            modifier = Modifier
                                .padding(bottom = 5.dp)
                        )
                        Image(
                            painter = painterResource(R.drawable.homem),
                            contentDescription = "",
                            modifier = Modifier
                                .size(100.dp)
                        )
                        Text(
                            text = "Jenny Wilson",
                            fontSize = 25.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color.White,
                            modifier = Modifier
                                .padding(top = 7.dp)
                        )
                        Text(
                            text = "Sr. UI/UX Designer",
                            fontSize = 16.sp,
                            color = Color.Gray,
                            modifier = Modifier
                                .padding(bottom = 5.dp)
                        )
                    }
                }
                Row(
                    modifier = Modifier
                        .padding(top = 12.dp)
                        .fillMaxWidth(),
                    horizontalArrangement = Arrangement.Center
                ){
                    ProfileSocial(
                        icone = Icons.Default.Email,
                        texto = "Email"
                    )
                    ProfileSocial(
                        icone = Icons.Default.Phone,
                        texto = "Call"
                    )
                    ProfileSocial(
                        icone = Icons.Default.Whatsapp,
                        texto = "Whatsapp"
                    )
                    ProfileSocial(
                        icone = Icons.Default.StarBorder,
                        texto = "Favorite"
                    )
                }
            }
        }
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 20.dp)
        ){
            Row(
                modifier = Modifier
                    .padding(start = 15.dp)
            ){
                Icon(
                    imageVector = Icons.Default.Email,
                    contentDescription = "",
                    tint = Color(0xFF790333),
                    modifier = Modifier
                        .size(30.dp)
                )
                Text(
                    text = "Email",
                    fontSize = 18.sp,
                    color = Color.Black,
                    modifier = Modifier
                        .padding(top = 3.dp, start = 6.dp)
                )
            }
            Column(
                modifier = Modifier
                    .padding(start = 52.dp)
            ){
                Text(
                    text = "Official",
                    fontSize = 15.sp,
                    color = Color.Gray,
                    modifier = Modifier
                        .padding(top = 6.dp)
                )
                Text(
                    text = "michael.mitc@example.com",
                    fontSize = 15.sp,
                    color = Color.Black,
                    modifier = Modifier
                        .padding(top = 2.dp)
                )
                Text(
                    text = "Personal",
                    fontSize = 15.sp,
                    color = Color.Gray,
                    modifier = Modifier
                        .padding(top = 13.dp)
                )
                Text(
                    text = "michael@example.com",
                    fontSize = 15.sp,
                    color = Color.Black,
                    modifier = Modifier
                        .padding(top = 2.dp)
                )
            }
        }
        HorizontalDivider(
            modifier = Modifier
                .padding(15.dp)
        )
        Column(
            modifier = Modifier
                .fillMaxWidth()
        ){
            Row(
                modifier = Modifier
                    .padding(start = 15.dp)
            ){
                Icon(
                    imageVector = Icons.Default.Phone,
                    contentDescription = "",
                    tint = Color(0xFF790333),
                    modifier = Modifier
                        .size(30.dp)
                )
                Text(
                    text = "Phone number",
                    fontSize = 18.sp,
                    color = Color.Black,
                    modifier = Modifier
                        .padding(top = 3.dp, start = 6.dp)
                )
            }
            Column(
                modifier = Modifier
                    .padding(start = 52.dp)
            ){
                Text(
                    text = "Mobile",
                    fontSize = 15.sp,
                    color = Color.Gray,
                    modifier = Modifier
                        .padding(top = 6.dp)
                )
                Text(
                    text = "(209) 555-0104",
                    fontSize = 15.sp,
                    color = Color.Black,
                    modifier = Modifier
                        .padding(top = 2.dp)
                )
            }
        }
        HorizontalDivider(
            modifier = Modifier
                .padding(15.dp)
        )
        Column(
            modifier = Modifier
                .fillMaxWidth()
        ){
            Row(
                modifier = Modifier
                    .padding(start = 15.dp)
            ){
                Icon(
                    imageVector = Icons.Default.Group,
                    contentDescription = "",
                    tint = Color(0xFF790333),
                    modifier = Modifier
                        .size(30.dp)
                )
                Text(
                    text = "Team",
                    fontSize = 18.sp,
                    color = Color.Black,
                    modifier = Modifier
                        .padding(top = 3.dp, start = 6.dp)
                )
            }
            Row {
                Column(
                    modifier = Modifier
                        .weight(2f)
                        .padding(start = 52.dp)
                ){
                    Text(
                        text = "Project Operation Team",
                        fontSize = 15.sp,
                        color = Color.Black,
                        modifier = Modifier
                            .padding(top = 2.dp)
                    )
                }
                Column(
                    modifier = Modifier
                        .weight(1f)
                        .background(color = Color.Cyan)
                ){
                    IconButton(
                        onClick = {},
                        colors = IconButtonDefaults.iconButtonColors(Color(0xFF790333))
                    ){
                        Icon(
                            imageVector = Icons.Default.ArrowForward,
                            contentDescription = "",
                            tint = Color.White
                        )
                    }
                }
            }
        }
        HorizontalDivider(
            modifier = Modifier
                .padding(15.dp)
        )
    }
}

@Preview
@Composable
private fun ProfileScreenPreview(){
    ProfileScreen()
}