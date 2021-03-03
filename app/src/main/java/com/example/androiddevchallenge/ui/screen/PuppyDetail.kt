package com.example.androiddevchallenge.ui.screen

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBackIos
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.androiddevchallenge.data.Puppy
import com.example.androiddevchallenge.data.puppies
import com.example.androiddevchallenge.ui.components.AdoptButton
import com.example.androiddevchallenge.ui.components.PuppyNetworkImage


@Composable
fun PuppyDetail(navController: NavController, id: Int?) {

    val puppy = if (id == null) puppies[0] else puppies[id]
    Scaffold(
        topBar = {
            PuppyDetailAppBar(navController, puppy.name)
        }
    ) {
        PuppyDetailContent(puppy)
    }
}

@Composable
fun PuppyDetailAppBar(navController: NavController, name: String) {
    TopAppBar(
        elevation = 8.dp,
        backgroundColor = Color.White,
        navigationIcon = {
            IconButton(onClick = { navController.navigateUp() }) {
                Icon(imageVector = Icons.Filled.ArrowBackIos, contentDescription = null)
            }
        },
        title = {
            Text(
                name,
                color = Color.Black,
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold
            )
        }
    )
}

@Composable
fun PuppyDetailContent(puppy: Puppy) {
    Column(Modifier.fillMaxSize()) {
        Column(
            Modifier
                .fillMaxSize()
                .weight(9f)
                .verticalScroll(rememberScrollState())
        ) {
            ImageComponent(imageUrl = puppy.imageUrl)
            Text(puppy.detail, fontSize = 18.sp, modifier = Modifier.padding(8.dp))

        }
        Box(
            Modifier
                .fillMaxSize()
                .weight(1f).wrapContentSize(Alignment.BottomCenter)) {

            AdoptButton(height = 48.dp, onClick = { }, text = "Adopt Me")

        }

    }

}

@Composable
private fun ImageComponent(imageUrl: String) {
    PuppyNetworkImage(
        imageUrl = imageUrl,
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight()
            .aspectRatio(1f),
        contentScale = ContentScale.Crop
    )
}
