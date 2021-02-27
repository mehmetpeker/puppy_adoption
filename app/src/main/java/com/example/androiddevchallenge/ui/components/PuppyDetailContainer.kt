package com.example.androiddevchallenge.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun PuppyDetailContainer(modifier: Modifier) {
    Box(
        modifier = modifier,
    ){
        Column() {

        }
    }
}

@Preview
@Composable
fun PuppyContainerPreview(){
    PuppyDetailContainer(modifier = Modifier
        .size(300.dp)
        .background(color = Color.White))
}