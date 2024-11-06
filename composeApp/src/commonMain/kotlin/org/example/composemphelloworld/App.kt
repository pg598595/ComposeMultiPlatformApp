package org.example.composemphelloworld

import BatteryManager
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.ui.tooling.preview.Preview

import composemphelloworld.composeapp.generated.resources.Res
import composemphelloworld.composeapp.generated.resources.compose_multiplatform
import composemphelloworld.composeapp.generated.resources.hello_world
import composemphelloworld.composeapp.generated.resources.logo
import org.jetbrains.compose.resources.stringResource

@Composable
@Preview
fun App(
    batteryManager: BatteryManager
) {
    MaterialTheme {
        Box(
            modifier = Modifier
                .fillMaxSize(),
            contentAlignment = Alignment.Center,
        ){
            Column(Modifier.fillMaxWidth(), horizontalAlignment = Alignment.CenterHorizontally){
                Image(painterResource(Res.drawable.logo),null)
                Text(text = "The current battery level is ${batteryManager.getBatteryLevel()}")
                Text(text = stringResource(Res.string.hello_world))
            }
        }
    }
}