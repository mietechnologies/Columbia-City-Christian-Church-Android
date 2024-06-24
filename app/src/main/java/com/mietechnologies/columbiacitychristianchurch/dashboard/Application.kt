package com.mietechnologies.columbiacitychristianchurch.dashboard

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.input.pointer.PointerIcon.Companion.Text
import androidx.compose.ui.tooling.preview.Preview

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
            Text("")
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