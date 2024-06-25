package com.mietechnologies.columbiacitychristianchurch.application

import androidx.compose.material.MaterialTheme
import androidx.compose.material.Typography
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.sp

@Composable fun AppTheme(content: @Composable () -> Unit) {
    MaterialTheme(
        typography = Typography(
            h1 = Typography().h1.copy(fontSize = (Typography().h1.fontSize.value + 10f).sp),
            h2 = Typography().h2.copy(fontSize = (Typography().h2.fontSize.value + 10f).sp),
            h3 = Typography().h3.copy(fontSize = (Typography().h3.fontSize.value + 10f).sp),
            h4 = Typography().h4.copy(fontSize = (Typography().h4.fontSize.value + 10f).sp),
            h5 = Typography().h5.copy(fontSize = (Typography().h5.fontSize.value + 10f).sp),
            h6 = Typography().h6.copy(fontSize = (Typography().h6.fontSize.value + 10f).sp),
            subtitle1 = Typography().subtitle1.copy(fontSize = (Typography().subtitle1.fontSize.value + 10f).sp),
            subtitle2 = Typography().subtitle2.copy(fontSize = (Typography().subtitle2.fontSize.value + 10f).sp),
            body1 = Typography().body1.copy(fontSize = (Typography().body1.fontSize.value + 10f).sp),
            body2 = Typography().body2.copy(fontSize = (Typography().body2.fontSize.value + 10f).sp),
            button = Typography().button.copy(fontSize = (Typography().button.fontSize.value + 10f).sp),
            caption = Typography().caption.copy(fontSize = (Typography().caption.fontSize.value + 10f).sp),
            overline = Typography().overline.copy(fontSize = (Typography().overline.fontSize.value + 10f).sp),
        ),
        content = content
    )
}