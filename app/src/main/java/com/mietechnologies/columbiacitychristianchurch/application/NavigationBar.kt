package com.mietechnologies.columbiacitychristianchurch.application

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.mietechnologies.columbiacitychristianchurch.R

@Composable fun NavigationBar(viewModel: ApplicationViewModel) {
    var selectedTab by remember { viewModel.selectedTab }

    Surface() {
        Row(
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .padding(8.dp)
                .height(30.dp)
                .fillMaxWidth()
        ) {
            // TODO: Icon
            Column(
                modifier = Modifier
                    .height(30.dp)
                    .clickable(
                        interactionSource = MutableInteractionSource(),
                        indication = null,
                        onClick = {
                            selectedTab = AppTab.DASHBOARD
                        }
                    )
            ) {
                Image(
                    painterResource(R.drawable.app_logo_large),
                    stringResource(R.string.app_logo_content_description)
                )
            }

            Text(
                text = "Columbia City Christian Church",
                fontWeight = FontWeight.Bold,
                fontSize = 16.sp
            )

            // TODO: Profile Image
            Column (
                modifier = Modifier
                    .height(30.dp)
                    .clip(CircleShape)
            ) {
                Image(
                    painterResource(R.drawable.test_profile_image),
                    stringResource(R.string.profile_image_content_description)
                )
            }
        }
    }
}

@Preview(showSystemUi = true)
@Composable fun NavigationBarPreview() {
    NavigationBar(ApplicationViewModel())
}