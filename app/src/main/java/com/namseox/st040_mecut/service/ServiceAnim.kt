package com.namseox.st040_mecut.service

import android.annotation.SuppressLint
import android.app.IntentService
import android.app.Notification
import android.app.NotificationManager
import android.content.Intent
import android.graphics.Bitmap
import android.os.AsyncTask
import android.util.DisplayMetrics
import com.namseox.st040_mecut.R
import com.namseox.st040_mecut.data.model.MaskBitmap3D
import com.namseox.st040_mecut.utils.Constant.VIDEO_HEIGHT
import com.namseox.st040_mecut.utils.Constant.VIDEO_WIDTH
import com.namseox.st040_mecut.utils.Constant.app
import com.namseox.st040_mecut.utils.Constant.checkSuccess
import com.namseox.st040_mecut.utils.Constant.videoImages
import com.namseox.st040_mecut.utils.Constant.videoPathList
import com.namseox.st040_mecut.utils.FileUtils
import com.namseox.st040_mecut.utils.ScalingUtilities
import com.namseox.st040_mecut.utils.SharedPreferenceUtils
import com.namseox.st040_mecut.utils.SystemUtils.defaultFontScale
import java.io.File
import java.io.FileNotFoundException
import java.io.FileOutputStream
import java.io.IOException


class ServiceAnim : IntentService(ServiceAnim::class.java.name) {
    companion object {
        const val EXTRA_SELECTED_THEME = "selected_theme"
        var isImageComplate = false
        var callbackExport: ProcessImageCallback? = null
        var callbackEdit: ProcessImageCallback? = null


        interface ProcessImageCallback {
            fun onComplete()
        }
    }

    var arrayList: ArrayList<String>? = null
    var mNotifyManager: NotificationManager? = null
    var mBuilder: Notification.Builder? = null
    var displayMetrics: DisplayMetrics? = null
    var check: Boolean = false


    override fun onCreate() {
        super.onCreate()
        displayMetrics = resources.displayMetrics
    }

    @SuppressLint("WrongThread")
    override fun onHandleIntent(intent: Intent?) {
        this.mNotifyManager = getSystemService(NOTIFICATION_SERVICE) as NotificationManager
        this.mBuilder = Notification.Builder(this)
        this.mBuilder!!.setContentTitle("Preparing Video").setContentText("Making in progress")
            .setSmallIcon(R.drawable.logo_app)
        arrayList = videoPathList
        isImageComplate = false
        ProcessImage1().execute()

    }

    private inner class ProcessImage1 : AsyncTask<Void?, Void?, Boolean?>() {

        override fun doInBackground(vararg params: Void?): Boolean? {
            createImages()
            return null
        }


        override fun onPreExecute() {
            //dosomething
        }


        override fun onPostExecute(result: Boolean?) {
            isImageComplate = true
            stopSelf()
            isSameTheme()

            if(checkSuccess){
                callbackExport!!.onComplete()
            }else{
                callbackEdit!!.onComplete()
            }
        }

    }

    fun createImages() {
        videoImages.clear()
        var newSecondBmp2: Bitmap? = null
        var i = 0
        var imgSize = 0
        while (i < arrayList!!.size - 1 && isSameTheme()) {
            var newFirstBmp: Bitmap
            val imgDir: File = FileUtils.getImageDirectory("data")
            var firstBitmap: Bitmap? = null
            var temp: Bitmap
            if (i == 0) {
                firstBitmap = ScalingUtilities.checkBitmap(arrayList!![i], application)
                temp = ScalingUtilities.scaleCenterCrop(firstBitmap!!, VIDEO_WIDTH, VIDEO_HEIGHT)
                newFirstBmp = ScalingUtilities.convetrSameSize(
                    firstBitmap,
                    temp,
                    VIDEO_WIDTH,
                    VIDEO_HEIGHT,
                    defaultFontScale,
                    0.0f
                )
                temp.recycle()
                firstBitmap.recycle()
                System.gc()
            } else {
                if (newSecondBmp2 == null || newSecondBmp2.isRecycled) {
                    firstBitmap = ScalingUtilities.checkBitmap(arrayList!![i], application)
                    temp =
                        ScalingUtilities.scaleCenterCrop(firstBitmap!!, VIDEO_WIDTH, VIDEO_HEIGHT)
                    newSecondBmp2 = ScalingUtilities.convetrSameSize(
                        firstBitmap,
                        temp,
                        VIDEO_WIDTH,
                        VIDEO_HEIGHT,
                        defaultFontScale,
                        0.0f
                    )
                    temp.recycle()
                    firstBitmap.recycle()
                    System.gc()
                }
                newFirstBmp = newSecondBmp2
            }
            val secondBitmap = ScalingUtilities.checkBitmap(arrayList!![i + 1], application)
            val temp2 = ScalingUtilities.scaleCenterCrop(secondBitmap!!, VIDEO_WIDTH, VIDEO_HEIGHT)
            newSecondBmp2 = ScalingUtilities.convetrSameSize(
                secondBitmap,
                temp2,
                VIDEO_WIDTH,
                VIDEO_HEIGHT,
                defaultFontScale,
                0.0f
            )
            temp2.recycle()
            secondBitmap.recycle()
            System.gc()
            MaskBitmap3D().reintRect()
            val effect: MaskBitmap3D.EFFECT = app.selectedTheme.getTheme()!!.get(i % app.selectedTheme.getTheme()!!.size)!!
            effect.initBitmaps(newFirstBmp, newSecondBmp2)
            var bitmap3: Bitmap? = null


//            if (i == 0) {
//
//                var f2 = File(imgDir, "first.jpg")
//                if (f2.exists()) {
//                    f2.delete()
//                }
//                FileOutputStream(f2).use { outputStream ->
//                    newFirstBmp.compress(Bitmap.CompressFormat.JPEG, 70, outputStream)
//                }
//                videoImages.add(f2.absolutePath)
//                videoImages.add(f2.absolutePath)
//                videoImages.add(f2.absolutePath)
//                videoImages.add(f2.absolutePath)
//                videoImages.add(f2.absolutePath)
//            }

/*
*
*
* */

            for (j in 0 until MaskBitmap3D.animatedFrame.toInt()) {
                if (!isSameTheme() || app.isBreak) break


                bitmap3 = effect.getMask(newFirstBmp, newSecondBmp2, j)

                if (isSameTheme()) {
                    val file = imgDir
                    val file2 = File(file, "img%05d.jpg".format(imgSize))
                    imgSize++

                    try {
                        if (file2.exists()) {
                            file2.delete()
                        }

                        FileOutputStream(file2).use { outputStream ->
                            bitmap3.compress(Bitmap.CompressFormat.JPEG, 70, outputStream)
                        }

                        System.gc()
                    } catch (e: FileNotFoundException) {
                        e.printStackTrace()
                    } catch (e: IOException) {
                        e.printStackTrace()
                    }

                    videoImages.add(file2.absolutePath)
//                    if (j.toFloat() == MaskBitmap3D.animatedFrame - defaultFontScale) {
//                        for (m in 0 until 8) {
//                            if (!isSameTheme() || app.isBreak) break
//                            videoImages.add(file2.absolutePath)
//                        }
//                    }
                    if (imgSize.toFloat() == MaskBitmap3D.animatedFrame) {
                        break
                    }
                }
            }
//            if(i == arrayList!!.size - 2){
//                var f3 = File(imgDir, "end.jpg")
//                if (f3.exists()) {
//                    f3.delete()
//                }
//                FileOutputStream(f3).use { outputStream ->
//                    newSecondBmp2.compress(Bitmap.CompressFormat.JPEG, 70, outputStream)
//                }
//                videoImages.add(f3.absolutePath)
//                videoImages.add(f3.absolutePath)
//                videoImages.add(f3.absolutePath)
//                videoImages.add(f3.absolutePath)
//                videoImages.add(f3.absolutePath)
//                videoImages.add(f3.absolutePath)
//                videoImages.add(f3.absolutePath)
//                videoImages.add(f3.absolutePath)
//            }
            i++
            this.check = true
        }

        stopSelf()
        isSameTheme()
    }

    private fun isSameTheme(): Boolean {
//        return selectedTheme == getCurrentTheme()
        return true
    }

    fun getCurrentTheme(): String? {
        return SharedPreferenceUtils.getInstance(applicationContext).getStringValue("current_theme")
    }
}