package com.mietechnologies.columbiacitychristianchurch.dashboard

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.width
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.material.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import com.mietechnologies.columbiacitychristianchurch.component.AppText

@Composable fun AddressInfo(name: String, street: String, city: String, state: String, zip: String, phone: String) {
    Column {
        Row {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(1f)
            ) {
                AppText(
                    name,
                    fontWeight = FontWeight.Bold
                )
                AppText(street)
                AppText("$city, $state $zip")
            }
        }

        Row (
            modifier = Modifier
                .clickable {
                    // TODO: This should initiate a phone call when clicked
                }
        ) {
            // TODO: Automatically format phone number
            AppText(
                phone,
                color = Color.Blue
            )
        }
    }
}

@Preview(showSystemUi = true)
@Composable fun AddressInfoPreview() {
    AddressInfo(
        name = "Columbia City Christian Church",
        street = "270 Frontage Rd.",
        city = "Columbia City",
        state = "IN",
        zip = "46725",
        phone = "2602446709"
    )
}