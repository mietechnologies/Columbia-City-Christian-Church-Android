package com.mietechnologies.columbiacitychristianchurch.component

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.sp

@Composable fun AppText(
    text: String,
    softWrap: Boolean = true,
    fontWeight: FontWeight = FontWeight.Normal,
    fontSize: TextUnit = 18.sp,
    fontStyle: FontStyle = FontStyle.Normal,
    textAlign: TextAlign = TextAlign.Unspecified,
    color: Color = Color.Unspecified
) {
    Text(
        text = text,
        fontSize = fontSize,
        fontWeight = fontWeight,
        fontStyle = fontStyle,
        softWrap = softWrap,
        textAlign = textAlign,
        color = color
    )
}