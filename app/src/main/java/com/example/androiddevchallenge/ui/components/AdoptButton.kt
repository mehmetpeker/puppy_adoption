/*
 * Copyright 2021 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.androiddevchallenge.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
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
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.androiddevchallenge.R

@Composable
fun AdoptButton(modifier: Modifier = Modifier, text: String = "", height: Dp, onClick: () -> Unit) {
    val shape = RoundedCornerShape(topStart = 16.dp, topEnd = 16.dp)

    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(height)
            .clip(shape)
            .clickable { onClick() }
            .background(color = Color(0xff212121))
            .then(modifier),
        contentAlignment = Alignment.Center
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
                text,
                fontWeight = FontWeight.Bold,
                fontSize = 22.sp,
                color = Color.White
            )
        }
    }
}
