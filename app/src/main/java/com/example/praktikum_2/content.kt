package com.example.praktikum_2

import android.graphics.drawable.Drawable
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun layout(modifier : Modifier) {
    Column(modifier = modifier) {
        Text(stringResource(id = R.string.title), fontSize = 20.sp, fontWeight = FontWeight.Bold)
        Text(stringResource(id = R.string.univ), modifier = Modifier.padding(bottom = 20.dp))

        Row(modifier = Modifier
            .fillMaxWidth()
            .padding(start = 20.dp, end = 20.dp)) {
            val image = painterResource(id = R.drawable.umy)

            Image(painter = image, contentDescription = "logo umy", modifier = Modifier
                .size(size = 100.dp)
                .padding(5.dp))
            Spacer(modifier = Modifier.width(30.dp))
            Column {
                Text(stringResource(id = R.string.name), fontSize = 30.sp, fontFamily = FontFamily.Cursive, color = Color.White, modifier = Modifier.padding(top = 15.dp))
                Text(stringResource(id = R.string.alamat), color = Color.Yellow, fontSize = 20.sp, modifier = Modifier.padding(top= 10.dp))
            }

        }
    }
    }
