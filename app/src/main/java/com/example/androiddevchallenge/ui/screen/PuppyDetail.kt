package com.example.androiddevchallenge.ui.screen

import android.text.Layout
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.shape.ZeroCornerSize
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.androiddevchallenge.ui.components.AdoptButton
import com.example.androiddevchallenge.ui.components.PuppyNetworkImage


@Composable
fun PuppyDetail() {
    val url =
        "https://images.unsplash.com/photo-1583511655826-05700d52f4d9?ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=634&q=80"

        Box(Modifier.fillMaxSize()) {
                ImageComponent(imageUrl = url)
                DetailContainer()

        }
    }


@Composable
private fun ImageComponent(imageUrl: String) {
    PuppyNetworkImage(
        imageUrl = imageUrl,
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight(0.50f),
        contentScale = ContentScale.Crop
    )
}

@Composable
private fun BoxScope.DetailContainer() {
    Box(
        Modifier
            .fillMaxWidth()
            .fillMaxHeight(0.60f)
            .clip(RoundedCornerShape(topStart = 16.dp, topEnd = 16.dp))
            .background(Color.White)
            .align(Alignment.BottomCenter)
    ) {
        Box(
            Modifier
                .fillMaxWidth()
                .align(Alignment.BottomCenter)
        ){
            AdoptButton(height = 48.dp, onClick = {  })
        }
        Column(modifier = Modifier.fillMaxSize().background(Color.Magenta).padding(8.dp)) {
            
        }
    }
}

@Preview
@Composable
fun DetailPreview() {
    PuppyDetail()
}