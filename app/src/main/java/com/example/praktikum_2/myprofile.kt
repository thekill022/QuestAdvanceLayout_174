package com.example.praktikum_2

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun profile(modifier : Modifier) {

    Column(
        modifier = modifier,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        val image = painterResource(id = R.drawable.gibran)

        Box(modifier = Modifier.padding(top = 20.dp)) {
            Image(painter = image, contentDescription = "Gibran", modifier = Modifier
                .size(size = 200.dp)
                .clip(
                    CircleShape
                ), contentScale = ContentScale.Crop)
        }

        Row(modifier = Modifier.padding(top = 20.dp)) {
            val fb = painterResource(id = R.drawable.fb)
            val ig = painterResource(id = R.drawable.ig)
            val gmail = painterResource(id = R.drawable.gmail)
            val linkedin = painterResource(id = R.drawable.linkedin)

            Image(painter = fb, contentDescription = "fb", modifier = Modifier
                .size(size = 45.dp)
                .clip(
                    CircleShape
                ), contentScale = ContentScale.Crop)
            Spacer(modifier = Modifier.padding(end = 10.dp))
            Image(painter = ig, contentDescription = "ig", modifier = Modifier
                .size(size = 45.dp)
                .clip(
                    CircleShape
                ), contentScale = ContentScale.Crop)
            Spacer(modifier = Modifier.padding(end = 10.dp))
            Image(painter = gmail, contentDescription = "gmail", modifier = Modifier
                .size(size = 45.dp)
                .clip(
                    CircleShape
                ), contentScale = ContentScale.Crop)
            Spacer(modifier = Modifier.padding(end = 10.dp))
            Image(painter = linkedin, contentDescription = "linkedin", modifier = Modifier
                .size(size = 45.dp)
                .clip(
                    CircleShape
                ), contentScale = ContentScale.Crop)
        }
        
        Text(stringResource(id = R.string.name), modifier = Modifier.padding(top = 15.dp, bottom = 5.dp), fontSize = 40.sp, fontWeight = FontWeight.Bold, color = Color.White)
        Text(stringResource(id = R.string.username), color = Color.LightGray, fontSize = 20.sp)

    }

}