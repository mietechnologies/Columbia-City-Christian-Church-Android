package com.mietechnologies.columbiacitychristianchurch.dashboard

class ApplicationViewModel {
    val availableTabs: List<AppTab> = listOf(
        AppTab.DASHBOARD,
        AppTab.CHECK_IN,
        AppTab.TITHE,
        AppTab.SERMON_NOTES,
        AppTab.PRAYER_CHAIN,
        AppTab.EVENTS
    )
    var selectedTab: AppTab = AppTab.DASHBOARD
}