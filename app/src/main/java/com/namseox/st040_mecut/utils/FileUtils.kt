package com.namseox.st040_mecut.utils

import android.os.Build.VERSION
import android.os.Environment
import java.io.File

object FileUtils {
    var filepath1: String? = if (VERSION.SDK_INT >= 33) {
            "/data/user/0/" + "com.namseox.st040_mecut"
    } else if (VERSION.SDK_INT >= 30) {
            "/data/user/0/" + "com.namseox.st040_mecut"
    } else {
            Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS).absolutePath
    }
    var appName: String = "MeCut"
    var mSdCard: File = File(filepath1)
    var appDirectory: File = File(mSdCard, appName)
    val TEMP_DIRECTORY: File = File(appDirectory, ".temp")
    fun getImageDirectory(s: String?): File {
        val file: File = File(TEMP_DIRECTORY, s)
        if (!file.exists()) {
            file.mkdirs()
        }
        return file
    }
}