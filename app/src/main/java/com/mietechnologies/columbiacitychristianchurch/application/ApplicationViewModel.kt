package com.mietechnologies.columbiacitychristianchurch.application

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class ApplicationViewModel: ViewModel() {
    // MARK: - Tabs
    val availableTabs: List<AppTab> = listOf(
        AppTab.DASHBOARD,
        AppTab.CHECK_IN,
        AppTab.TITHE,
        AppTab.SERMON_NOTES,
        AppTab.PRAYER_CHAIN,
        AppTab.EVENTS
    )

    var selectedTab = mutableStateOf(AppTab.DASHBOARD)
}