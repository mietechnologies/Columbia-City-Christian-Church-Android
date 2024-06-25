package com.mietechnologies.columbiacitychristianchurch.dashboard

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import com.mietechnologies.columbiacitychristianchurch.component.AppText

@Composable fun ServiceInfo() {
    Column {
        AppText("Sunday", fontWeight = FontWeight.Bold)
        Row {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(1f)
            ) {
                // TODO: Automatically format for system-like time
                AppText("10:00 AM")
            }
            Column {
                AppText("Worship Service")
            }
        }
    }
}

@Preview(showSystemUi = true)
@Composable fun ServiceInfoPreview() {
    ServiceInfo()
}