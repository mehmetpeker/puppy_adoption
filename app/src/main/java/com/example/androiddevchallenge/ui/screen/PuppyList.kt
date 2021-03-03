package com.example.androiddevchallenge.ui.screen

import androidx.compose.animation.core.animateDpAsState
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.navigate
import com.example.androiddevchallenge.data.Gender
import com.example.androiddevchallenge.data.Puppy
import com.example.androiddevchallenge.data.puppies
import com.example.androiddevchallenge.ui.components.AdoptButton
import com.example.androiddevchallenge.ui.components.Pager
import com.example.androiddevchallenge.ui.components.PagerState
import dev.chrisbanes.accompanist.glide.GlideImage

@Composable
fun PuppyListScreen(navController: NavController) {
    Scaffold(
        topBar = { PuppyAppBar() },
        content = {
            val pagerState = remember { PagerState() }
            pagerState.maxPage = (puppies.size - 1).coerceAtLeast(0)

            Pager(state = pagerState, modifier = Modifier.height(645.dp)) {
                val puppy = puppies[page]
                val isSelected = pagerState.currentPage == page

                PuppyCarouselItem(
                    puppy,
                    isSelected
                ) { navController.navigate("puppyDetail/${puppy.id}") }
            }
        }
    )
}

@Composable
fun PuppyAppBar() {
    TopAppBar(
        elevation = 8.dp,
        backgroundColor = Color.White,
        title = {
            Text(
                "Discover",
                modifier = Modifier.fillMaxWidth(),
                textAlign = TextAlign.Center,
                color = Color.Black,
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold
            )
        }
    )
}

@Composable
fun PuppyCarouselItem(puppy: Puppy, isSelected: Boolean, onClick: () -> Unit) {

    val animateHeight = animateDpAsState(if (isSelected) 645.dp else 360.dp).value
    val animateWidth = animateDpAsState(if (isSelected) 340.dp else 320.dp).value
    val animateElevation = if (isSelected) 12.dp else 2.dp

    Card(
        elevation = animateDpAsState(animateElevation).value,
        modifier = Modifier
            .width(animateWidth)
            .height(animateHeight)
            .padding(24.dp)
            .clickable { },
        shape = RoundedCornerShape(16.dp),
        backgroundColor = MaterialTheme.colors.background,
        contentColor = MaterialTheme.colors.onBackground
    ) {
        Column {
            GlideImage(
                data = puppy.imageUrl,
                contentScale = ContentScale.Crop,
                contentDescription = null,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(360.dp)
            )
            PuppyInformation(puppy,true) { onClick() }
        }
    }
}

@Composable
fun PuppyInformation(puppy: Puppy, isDetail: Boolean = false, onClick: () -> Unit) {
    val genderString = when (puppy.gender) {
        Gender.MALE -> "Male"
        else -> "Female"
    }
    val annotatedColorString = buildAnnotatedString {
        append("${puppy.name}, ${puppy.age} years old")
        addStyle(
            style = SpanStyle(
                color = Color.Black,
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold
            ), start = 0, end = puppy.name.length
        )
        addStyle(
            style = SpanStyle(
                color = Color.Black,
                fontSize = 18.sp,
                fontWeight = FontWeight.Normal
            ), start = puppy.name.length + 1, end = this.length
        )
    }
    val shape = RoundedCornerShape(topStart = 16.dp, topEnd = 16.dp)
    Box(
        Modifier
            .fillMaxWidth()
            .clip(shape)
    ) {
        Column(
            Modifier
                .fillMaxSize(), verticalArrangement = Arrangement.SpaceBetween, content = {
                Box {
                    Column {

                        Text(
                            modifier = Modifier
                                .padding(8.dp)
                                .fillMaxWidth(),
                            text = annotatedColorString
                        )

                        Text(
                            "$genderString,${puppy.dogBreed} ",
                            fontSize = 18.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color.DarkGray,
                            modifier = Modifier
                                .padding(horizontal = 8.dp, vertical = 4.dp)
                                .fillMaxWidth(),
                        )
                    }
                }
                AdoptButton(
                    height = 64.dp,
                    onClick = { onClick() },
                    text = if (isDetail) "VIEW DETAILS" else "Adopt Me"
                )


            }
        )

    }


}
