package com.mietechnologies.columbiacitychristianchurch.dashboard

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable fun ScrollingNavigationBar(viewModel: ApplicationViewModel) {
    val availableTabs = remember { AppTab.values().map { it }}
    val selectedTab: AppTab = remember { viewModel.selectedTab }

    Row(
        modifier = Modifier
            .horizontalScroll(rememberScrollState())
    ) {
        availableTabs.forEach { tab ->
            Column (
                modifier = Modifier
                    .width(IntrinsicSize.Max)
                    .padding(8.dp)
                    .clickable {
                        viewModel.selectedTab = tab
                        // TODO: Completion so page can be updated
                    }
            ) {
                Text(
                    text = tab.title,
                    softWrap = false
                )
                Box(
                    modifier = Modifier
                        .height(2.dp)
                        .fillMaxWidth()
                        .background(if (selectedTab == tab) Color.Black else Color.Transparent)
                )
            }
        }
    }
}

@Preview (
    showBackground = true,
    showSystemUi = true
)
@Composable
fun ScrollingNavigationBarPreview() {
    Column {
        ScrollingNavigationBar(ApplicationViewModel())
    }
}
