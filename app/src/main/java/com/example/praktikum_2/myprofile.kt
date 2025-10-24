package com.example.praktikum_2

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp


@Composable
fun profile(modifier : Modifier) {

    Column(
        modifier = modifier,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        val image = painterResource(id = R.drawable.gibran)

        Image(painter = image, contentDescription = "Gibran", modifier = Modifier
            .size(size = 200.dp)
            .clip(
                CircleShape
            )
            .padding(bottom = 20.dp), contentScale = ContentScale.Crop)

        Row {
            val fb = painterResource(id = R.drawable.fb)
            val ig = painterResource(id = R.drawable.ig)
            val gmail = painterResource(id = R.drawable.gmail)
            val linkedin = painterResource(id = R.drawable.linkedin)

        }

    }

}