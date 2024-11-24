package com.namseox.st040_mecut

import android.app.Application
import com.namseox.st040_mecut.data.model.AllTheme
import com.namseox.st040_mecut.utils.Constant.app
import dagger.hilt.android.HiltAndroidApp


@HiltAndroidApp
class App: Application() {
    var minPos: Int = Int.MAX_VALUE
    var isEditEnable: Boolean = false
    var selectedTheme: AllTheme = AllTheme.Null
    var isBreak: Boolean = false

    override fun onCreate() {
        super.onCreate()
        app = this
    }
}