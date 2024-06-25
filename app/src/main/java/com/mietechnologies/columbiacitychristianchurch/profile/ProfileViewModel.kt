package com.mietechnologies.columbiacitychristianchurch.profile

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import com.mietechnologies.columbiacitychristianchurch.R
import java.util.Date

class ProfileViewModel: ViewModel() {
    var image = mutableStateOf(R.drawable.test_profile_image)
    var first = mutableStateOf("Brett")
    var last = mutableStateOf("Chapin")
    var joinedDate = mutableStateOf(Date())
    var birthdate = mutableStateOf(Date())
    var phone = mutableStateOf("2605555555")
    var locationStreet = mutableStateOf("123 Somewhere Ave.")
    var locationCity = mutableStateOf("Randomville")
    var locationState = mutableStateOf("UT")
    var locationZip = mutableStateOf("12345")


}