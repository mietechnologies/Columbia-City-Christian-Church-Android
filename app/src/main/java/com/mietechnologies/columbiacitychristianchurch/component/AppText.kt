package com.mietechnologies.columbiacitychristianchurch.component

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

@Composable fun AppText(
    text: String,
    softWrap: Boolean = true,
    fontWeight: FontWeight = FontWeight.Normal,
    color: Color = Color.Unspecified
) {
    Text(
        text = text,
        fontSize = 18.sp,
        fontWeight = fontWeight,
        softWrap = softWrap,
        color = color
    )
}