package com.example.praktikum_2

import android.graphics.drawable.Drawable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun layout(modifier : Modifier) {
    Column(modifier = modifier) {
        Text(stringResource(id = R.string.title), fontSize = 20.sp, fontWeight = FontWeight.Bold)
        Text(stringResource(id = R.string.univ), modifier = Modifier.padding(bottom = 20.dp))

        Row(modifier = Modifier.fillMaxWidth().padding(start = 20.dp, end = 20.dp)) {

        }
    }
    }
