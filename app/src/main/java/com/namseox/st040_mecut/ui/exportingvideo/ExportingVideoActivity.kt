package com.namseox.st040_mecut.ui.exportingvideo

import android.annotation.SuppressLint
import android.content.Intent
import android.graphics.Bitmap
import android.graphics.drawable.Drawable
import android.media.MediaScannerConnection
import android.os.Environment
import com.bumptech.glide.Glide
import com.bumptech.glide.request.target.CustomTarget
import com.bumptech.glide.request.transition.Transition
import com.namseox.st040_mecut.R
import com.namseox.st040_mecut.data.model.VideoModel
import com.namseox.st040_mecut.databinding.ActivityExportingVideoBinding
import com.namseox.st040_mecut.service.ServiceAnim
import com.namseox.st040_mecut.service.ServiceAnim.Companion.callbackExport
import com.namseox.st040_mecut.ui.savesuccessful.SaveSuccessfulActivity
import com.namseox.st040_mecut.utils.Const
import com.namseox.st040_mecut.utils.Constant.arrBitmap
import com.namseox.st040_mecut.utils.Constant.checkSuccess
import com.namseox.st040_mecut.utils.Constant.videoImages
import com.namseox.st040_mecut.utils.Constant.videoPathList
import com.namseox.st040_mecut.utils.createVideoFromImages
import com.namseox.st040_mecut.utils.cutVideo
import com.namseox.st040_mecut.utils.mergeVideos
import com.namseox.st040_mecut.utils.newIntent
import com.namseox.st040_mecut.utils.showToast
import com.namseox.st040_mecut.view.base.AbsBaseActivity
import java.io.File

class ExportingVideoActivity : AbsBaseActivity<ActivityExportingVideoBinding>(false) {
    var arrTime: ArrayList<Array<Long>> = arrayListOf()
    var arrSellect = arrayListOf<VideoModel>()
    var arrFloat = arrayListOf<Float>()
    var path = ""
    var list = arrayListOf<String>()
    var pos = 0
    var duration = 0f

    override fun getFragmentID(): Int = 0

    override fun getLayoutId(): Int = R.layout.activity_exporting_video

    override fun init() {
        var output = filesDir.absolutePath + "/output/"
        var file = File(output)
        file.mkdirs()
        val mergedOutput = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_MOVIES).absolutePath + "/" + System.currentTimeMillis() + ".mp4"
        if (intent.getStringExtra("type") == "editvideo") {
            duration = intent.getFloatExtra("arrFloat", 2f)
            path = intent.getStringExtra("path").toString()
            Glide.with(applicationContext).asBitmap().load(videoPathList[0]).into(object : CustomTarget<Bitmap>() {
                override fun onResourceReady(resource: Bitmap, transition: Transition<in Bitmap>?) {
                    binding.imv.setImageBitmap(resource)
                }

                override fun onLoadCleared(placeholder: Drawable?) {

                }
            })
            startService(Intent(applicationContext, ServiceAnim::class.java))

                callbackExport = object : ServiceAnim.Companion.ProcessImageCallback{
                    override fun onComplete() {

                        createVideoFromImages(
                            applicationContext,
                            duration,
                            path,
                            Const.musicPlay.path,
                            Const.musicPlay.startTime.toFloat(),
                            Const.musicPlay.endTime.toFloat()
                        ) { success ->
                            if (success) {
                                runOnUiThread {
                                    showToast(applicationContext, R.string.create_success)
                                    MediaScannerConnection.scanFile(
                                        applicationContext,
                                        arrayOf(path),
                                        null,
                                        null
                                    );
                                    startActivity(
                                        newIntent(
                                            applicationContext,
                                            SaveSuccessfulActivity::class.java
                                        ).putExtra("data", path)
                                    )
                                    finish()
                                }
                            } else {
                                runOnUiThread {
                                    showToast(applicationContext, R.string.create_failed)
                                    finish()
                                }
                            }
                        }
                    }
                }
        } else {
            arrSellect = intent.getSerializableExtra("data") as ArrayList<VideoModel>
            arrTime = intent.getSerializableExtra("time") as ArrayList<Array<Long>>
            Glide.with(applicationContext).load(arrSellect[0].path).into(binding.imv)
            var a = 0
            arrSellect.forEachIndexed { index, videoModel ->
                list.add("$output$index.mp4")
                cutVideo(
                    videoModel.path,
                    "$output$index.mp4",
                    (arrTime[index][0] / 1000000f).toString(),
                    (arrTime[index][1] / 1000000f).toString()
                ) { it ->
                    if (!it) {
                        list.forEach {
                            var file = File(it)
                            if (file.exists()) {
                                file.delete()
                            }
                        }
                        runOnUiThread {
                            showToast(applicationContext, R.string.merge_failed)
                            finish()
                        }

                    } else {
                        a++
                        if (a == arrSellect.size) {
                            mergeVideos(applicationContext, list, mergedOutput) { successMerge ->
                                if (!successMerge) {
                                    list.forEach {
                                        var file = File(it)
                                        if (file.exists()) {
                                            file.delete()
                                        }
                                    }
                                    runOnUiThread {
                                        showToast(applicationContext, R.string.merge_failed)
                                        finish()
                                    }

                                } else {
                                    list.forEach {
                                        var file = File(it)
                                        if (file.exists()) {
                                            file.delete()
                                        }
                                    }
                                    runOnUiThread {
                                        showToast(applicationContext, R.string.merge_successful)
                                        MediaScannerConnection.scanFile(
                                            applicationContext,
                                            arrayOf(mergedOutput),
                                            null,
                                            null
                                        );
                                        startActivity(
                                            newIntent(
                                                applicationContext,
                                                SaveSuccessfulActivity::class.java
                                            ).putExtra("data", mergedOutput)
                                        )
                                        finish()
                                    }
                                }

                            }
                        }
                    }
                }
            }
        }
    }

    @SuppressLint("MissingSuperCall")
    override fun onBackPressed() {

    }

    override fun onDestroy() {
        super.onDestroy()
        checkSuccess = false
    }
}