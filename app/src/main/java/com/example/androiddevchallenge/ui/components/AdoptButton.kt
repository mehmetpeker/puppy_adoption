package com.example.androiddevchallenge.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.androiddevchallenge.R
import java.util.*

@Composable
fun AdoptButton(text:String = "",height: Dp, onClick: () -> Unit) {
    val shape = RoundedCornerShape(topStart = 16.dp, topEnd = 16.dp)

    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(height)
            .clip(shape)
            .clickable { onClick() }
            .background(color = Color(0xff212121)), contentAlignment = Alignment.Center
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            IconButton(onClick = { }) {
                Image(
                    painter = painterResource(id = R.drawable.paw),
                    contentDescription = null, colorFilter = ColorFilter.tint(Color.White)
                )
            }
            Spacer(modifier = Modifier.width(8.dp))
            Text(
                text.toUpperCase(Locale.ROOT),
                fontWeight = FontWeight.Bold,
                fontSize = 22.sp,
                color = Color.White
            )
        }
    }
}

@Preview
@Composable
fun AdoptButtonPreview() {
    AdoptButton("Adopt",48.dp, {})
}