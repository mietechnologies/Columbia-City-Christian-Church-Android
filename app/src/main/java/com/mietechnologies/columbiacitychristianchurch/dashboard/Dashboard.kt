package com.mietechnologies.columbiacitychristianchurch.dashboard

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Divider
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.mietechnologies.columbiacitychristianchurch.component.AppText

@Composable fun Dashboard() {
    val viewModel = DashboardViewModel()
    val introduction by remember { viewModel.introduction }
    val locationName by remember { viewModel.locationName }
    val locationStreet by remember { viewModel.locationStreet }
    val locationCity by remember { viewModel.locationCity }
    val locationState by remember { viewModel.locationState }
    val locationZip by remember { viewModel.locationZip }
    val locationPhone by remember { viewModel.locationPhone }

    Surface(
        modifier = Modifier
            .padding(8.dp)
    ) {
        Column(
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            AppText(introduction)
            ServiceInfo()
            Divider()
            AddressInfo(
                locationName,
                locationStreet,
                locationCity,
                locationState,
                locationZip,
                locationPhone
            )
            MapView(
                viewModel = viewModel,
                modifier = Modifier
                    .height(300.dp)
            )
        }
    }
}

@Preview(showSystemUi = true)
@Composable
fun DashboardPreview() {
    Dashboard()
}