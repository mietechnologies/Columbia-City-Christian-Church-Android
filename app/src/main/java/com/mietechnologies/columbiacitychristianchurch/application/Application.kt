package com.mietechnologies.columbiacitychristianchurch.application

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.mietechnologies.columbiacitychristianchurch.dashboard.Dashboard

@Composable fun Application() {
    val viewModel = ApplicationViewModel()

    Surface(
        modifier = Modifier
            .verticalScroll(rememberScrollState())
    ) {
        Column(
            modifier = Modifier
        ) {
            ScrollingNavigationBar(viewModel)

            when (viewModel.selectedTab.value) {
                AppTab.DASHBOARD -> Dashboard()
                else -> {
                    Column(modifier = Modifier.align(Alignment.CenterHorizontally)) {
                        Row {
                            Text(viewModel.selectedTab.value.title)
                        }
                    }
                }
            }
        }
    }
}

@Preview (
    showSystemUi = true,
    showBackground = true
)
@Composable fun ApplicationPreview() {
    Application()
}