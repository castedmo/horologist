/*
 * Copyright 2022 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.android.horologist.media.ui.components.controls

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Pause
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

@Preview(
    name = "Play - Enabled",
    backgroundColor = 0xff000000,
    showBackground = true
)
@Composable
fun MediaButtonPreviewPlayEnabled() {
    MediaButton(
        onClick = {},
        icon = Icons.Default.PlayArrow,
        "Play"
    )
}

@Preview(
    "Pause - Disabled",
    backgroundColor = 0xff000000,
    showBackground = true
)
@Composable
fun MediaButtonPreviewPauseDisabled() {
    MediaButton(
        onClick = {},
        icon = Icons.Default.Pause,
        "Pause",
        enabled = false
    )
}
