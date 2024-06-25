package com.mietechnologies.columbiacitychristianchurch.dashboard

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.mapbox.geojson.Point
import com.mapbox.maps.extension.compose.MapboxMap
import com.mapbox.maps.extension.compose.animation.viewport.MapViewportState

@Composable fun MapView(modifier: Modifier = Modifier) {
    Surface(modifier = modifier.fillMaxSize()) {
        MapboxMap(
            modifier = modifier.fillMaxSize(),
            mapViewportState = MapViewportState().apply {
                setCameraOptions {
                    this.zoom(16.0)
                    // 41.170451537819794, -85.49108881611338
                    this.center(Point.fromLngLat(-85.49108881611338, 41.170451537819794))
                    this.pitch(0.0)
                    this.bearing(0.0)
                }
            }
        ) {

        }
    }
}

@Preview(showSystemUi = true)
@Composable fun MapViewPreview() {
    MapView()
}