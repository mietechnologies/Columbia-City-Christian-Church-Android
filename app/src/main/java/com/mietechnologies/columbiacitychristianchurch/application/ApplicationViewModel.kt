package com.mietechnologies.columbiacitychristianchurch.application

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel

class ApplicationViewModel: ViewModel() {
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