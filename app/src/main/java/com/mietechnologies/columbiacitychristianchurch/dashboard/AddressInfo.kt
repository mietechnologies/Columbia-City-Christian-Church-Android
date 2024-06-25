package com.mietechnologies.columbiacitychristianchurch.dashboard

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.mietechnologies.columbiacitychristianchurch.component.AppText

@Composable fun AddressInfo(
    header: String,
    street: String,
    city: String,
    state: String,
    zip: String,
    phone: String,
    textAlign: TextAlign = TextAlign.Unspecified,
    horizontalAlignment: Alignment.Horizontal = Alignment.Start
) {
    Column {
        Row(
            modifier = Modifier
                .fillMaxWidth()
        ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(1f),
                horizontalAlignment = horizontalAlignment
            ) {
                AppText(
                    text = header,
                    fontWeight = FontWeight.Bold,
                    textAlign = textAlign
                )
                AppText(
                    text = street,
                    textAlign = textAlign
                )
                AppText(
                    text = "$city, $state $zip",
                    textAlign = textAlign
                )
            }
        }

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .clickable {
                    // TODO: This should initiate a phone call when clicked
                },
            horizontalAlignment = horizontalAlignment
        ) {
            // TODO: Automatically format phone number
            AppText(
                phone,
                color = Color.Blue,
                textAlign = textAlign
            )
        }
    }
}

@Preview(showSystemUi = true)
@Composable fun AddressInfoPreview() {
    Column(
        verticalArrangement = Arrangement.spacedBy(20.dp)
    ) {
        AddressInfo(
            header = "Columbia City Christian Church",
            street = "270 Frontage Rd.",
            city = "Columbia City",
            state = "IN",
            zip = "46725",
            phone = "2602446709"
        )

        AddressInfo(
            header = "Columbia City Christian Church",
            street = "270 Frontage Rd.",
            city = "Columbia City",
            state = "IN",
            zip = "46725",
            phone = "2602446709",
            textAlign = TextAlign.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        )
    }
}