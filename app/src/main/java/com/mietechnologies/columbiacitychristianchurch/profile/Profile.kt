package com.mietechnologies.columbiacitychristianchurch.profile

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonColors
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Surface
import androidx.compose.material.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.mietechnologies.columbiacitychristianchurch.application.AppDefaultButtonColors
import com.mietechnologies.columbiacitychristianchurch.application.AppDestructiveButtonColors
import com.mietechnologies.columbiacitychristianchurch.component.AppText
import com.mietechnologies.columbiacitychristianchurch.dashboard.AddressInfo

@Composable fun Profile() {
    val viewModel = ProfileViewModel()
    val firstName by remember { viewModel.first }
    val lastName by remember { viewModel.last }
    val joinedDate by remember { viewModel.joinedDate }
    val birthDate by remember { viewModel.birthdate }
    val phone by remember { viewModel.phone }
    val locationStreet by remember { viewModel.locationStreet }
    val locationCity by remember { viewModel.locationCity }
    val locationState by remember { viewModel.locationState }
    val locationZip by remember { viewModel.locationZip }

    Surface(Modifier.padding(8.dp)) {
        Column(
            modifier = Modifier.fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            Row {
                Image(
                    painter = painterResource(id = viewModel.image.value),
                    contentDescription = null,
                    modifier = Modifier
                        .width(200.dp)
                        .height(200.dp)
                        .clip(CircleShape)
                )
            }

            UserDescriptionView(
                firstName,
                lastName,
                joinedDate,
                birthDate
            )

            AddressInfo(
                header = "Address:",
                street = locationStreet,
                city = locationCity,
                state = locationState,
                zip = locationZip,
                phone = phone,
                horizontalAlignment = Alignment.CenterHorizontally
            )

            Button(
                colors = AppDefaultButtonColors(),
                onClick = { /*TODO*/ }
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(4.dp),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    AppText("Check In History")
                }
            }

            Button(
                colors = AppDefaultButtonColors(),
                onClick = { /*TODO*/ }
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(4.dp),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    AppText("Tithe History")
                }
            }

            Button(
                colors = AppDestructiveButtonColors(),
                onClick = { /*TODO*/ }
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(4.dp),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    AppText("Delete Account")
                }
            }
        }
    }
}

@Preview(showSystemUi = true)
@Composable fun ProfilePreview() {
    Profile()
}