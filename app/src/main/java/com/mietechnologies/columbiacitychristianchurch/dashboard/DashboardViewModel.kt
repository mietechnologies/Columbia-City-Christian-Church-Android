package com.mietechnologies.columbiacitychristianchurch.dashboard

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel

class DashboardViewModel: ViewModel() {
    val introduction = mutableStateOf("We welcome you to worship Jesus with us as we gather in the presence of fellow believers. Service starts at 10 am or arrive early to enjoy coffee and donuts with us!")
    val locationName = mutableStateOf("Columbia City Christian Church")
    val locationStreet = mutableStateOf("270 Frontage Rd.")
    val locationCity = mutableStateOf("Columbia City")
    val locationState = mutableStateOf("IN")
    val locationZip = mutableStateOf("46725")
    val locationPhone = mutableStateOf("2602446709")
}