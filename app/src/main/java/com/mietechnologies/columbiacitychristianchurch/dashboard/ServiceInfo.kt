package com.mietechnologies.columbiacitychristianchurch.dashboard

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview

@Composable fun ServiceInfo() {
    Column {
        Text("Sunday", fontWeight = FontWeight.Bold)
        Row {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(1f)
            ) {
                // TODO: Automatically format for system-like time
                Text("10:00 AM")
            }
            Column {
                Text("Worship Service")
            }
        }
    }
}

@Preview(showSystemUi = true)
@Composable fun ServiceInfoPreview() {
    ServiceInfo()
}