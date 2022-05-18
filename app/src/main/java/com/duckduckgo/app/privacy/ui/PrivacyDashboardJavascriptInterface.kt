/*
 * Copyright (c) 2022 DuckDuckGo
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.duckduckgo.app.privacy.ui

import android.webkit.JavascriptInterface
import timber.log.Timber

class PrivacyDashboardJavascriptInterface {
    @JavascriptInterface
    fun toggleWhitelist(message: String) {
        Timber.i("PDHy: JavascriptInterface toggleWhitelist $message")
    }

    @JavascriptInterface
    fun updatePermission(message: String) {
        Timber.i("PDHy: JavascriptInterface updatePermission $message")
    }

    @JavascriptInterface
    fun firePixel(message: String) {
        Timber.i("PDHy: JavascriptInterface firePixel $message")
    }

    companion object {
        // Interface name used inside js layer
        const val JAVASCRIPT_INTERFACE_NAME = "PrivacyDashboard"
    }
}