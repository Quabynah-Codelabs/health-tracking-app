package io.hta

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

/** Base [Application] instance. Required by [HiltAndroidApp]*/
@HiltAndroidApp
class HTABaseApp : Application()