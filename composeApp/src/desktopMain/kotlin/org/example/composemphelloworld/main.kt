package org.example.composemphelloworld

import BatteryManager
import androidx.compose.runtime.remember
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "ComposeMPHelloWorld",
    ) {
        App(batteryManager = remember { BatteryManager() })
    }
}