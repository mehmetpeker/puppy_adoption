package com.example.androiddevchallenge.ui.components

import androidx.compose.runtime.Composable
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.Modifier
import dev.chrisbanes.accompanist.glide.GlideImage

@Composable
fun PuppyNetworkImage(imageUrl:String,modifier: Modifier,contentScale: ContentScale){
    GlideImage(
        data =imageUrl,
        modifier=modifier,
        contentDescription = null,
        fadeIn = true,
        contentScale = contentScale
    )
}