package com.example.androiddevchallenge.ui.screen

import android.text.Spannable
import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.Orientation
import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Female
import androidx.compose.material.icons.filled.Male
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.androiddevchallenge.data.Gender
import com.example.androiddevchallenge.data.Puppy
import com.example.androiddevchallenge.data.puppies
import com.example.androiddevchallenge.ui.components.AdoptButton
import com.example.androiddevchallenge.ui.components.PuppyNetworkImage

@Composable
fun PuppyList() {

    val config = LocalConfiguration.current
    val screenWidth = config.screenWidthDp.dp
    val screenHeight = config.screenHeightDp.dp
    val itemWidth = screenWidth - 16.dp
    Scaffold(
        topBar = {
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
    ) {
        LazyRow(
            Modifier
                .fillMaxSize()
        ) {
            puppies.forEachIndexed { index, puppy ->
                item {
                    PuppyListItem(puppy = puppy, itemWidth)
                }
            }
        }
    }
}

@Composable
fun PuppyListItem(puppy: Puppy, width: Dp) {
    val shape = RoundedCornerShape(16.dp)
    Box(
        modifier = Modifier
            .width(width)
            .fillMaxHeight()
            .padding(8.dp)
            .clip(shape)
    ) {
        PuppyNetworkImage(
            imageUrl = puppy.imageUrl,
            modifier = Modifier
                .fillMaxSize(),
            contentScale = ContentScale.Crop
        )

        Column(
            Modifier
                .fillMaxSize()
                .wrapContentSize(Alignment.BottomCenter)
                .background(Color.Transparent)
        ) {
            PuppyInformation(puppy)
            AdoptButton(height = 64.dp, onClick = { }, text = "View Details")
        }
    }

}

@Composable
fun PuppyInformation(puppy: Puppy) {
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
            .fillMaxHeight(0.25f)
            .clip(shape)
            .background(Color(0xffB3ffffff))
            .padding(8.dp)
    ) {
        Column(
            Modifier
                .fillMaxSize()
        ) {

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
                    .padding(horizontal = 8.dp,vertical = 4.dp)
                    .fillMaxWidth(),
            )
        }

    }


}

@Preview
@Composable
fun PuppyListPreview() {
    PuppyList()
}