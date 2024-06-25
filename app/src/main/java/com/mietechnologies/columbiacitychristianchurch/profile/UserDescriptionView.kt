package com.mietechnologies.columbiacitychristianchurch.profile

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.mietechnologies.columbiacitychristianchurch.component.AppText
import java.util.Date

@Composable fun UserDescriptionView(firstName: String, lastName: String, joinedDate: Date, birthDate: Date) {
    Column(
        modifier = Modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        AppText(
            text = "$firstName $lastName",
            fontSize = 32.sp
        )
        // TODO: Format these dates appropriately
        AppText(
            text = "Joined: $joinedDate | Birthday: $birthDate",
            fontSize = 14.sp,
            fontStyle = FontStyle.Italic,
            textAlign = TextAlign.Center
        )
    }
}

@Preview(showSystemUi = true)
@Composable fun UserDescriptionViewPreview() {
    UserDescriptionView(
        firstName = "Brett",
        lastName = "Chapin",
        joinedDate = Date(),
        birthDate = Date()
    )
}