package com.namseox.st040_mecut.utils

import android.content.ContentValues.TAG
import android.content.Context
import android.util.Log
import com.arthenica.ffmpegkit.FFmpegKit
import com.arthenica.ffmpegkit.ReturnCode
import com.namseox.st040_mecut.utils.Constant.videoImages
import java.io.File


fun cutVideo(inputPath: String, outputPath: String, startTime: String, endTime: String, callback: (Boolean) -> Unit) {

//    val ffmpegCommand = arrayOf(
//        "-ss", startTime,
//        "-to", endTime,
//        "-i", inputPath,
//        "-c", "copy",
//        outputPath
//    )
    val ffmpegCommand = "-ss $startTime -to $endTime -i $inputPath -c copy $outputPath"
    FFmpegKit.executeAsync(ffmpegCommand) { session ->
        val returnCode = session.returnCode
        if (ReturnCode.isSuccess(returnCode)) {
            callback(true)
        } else {
            callback(false)
        }
    }
}

fun createFileList(context: Context, videoPaths: List<String>): File {
    val listFile = File(context.filesDir.absolutePath, "filelist.txt")
    listFile.bufferedWriter().use { writer ->
        Log.d(TAG, "createFileList___: 1file$videoPaths"  + videoPaths.size)
        videoPaths.forEach { path ->
            Log.d(TAG, "createFileList___: file '$path'\n")
            writer.write("file '$path'\n")
        }
    }
    return listFile
}

fun mergeVideos(context: Context, videoPaths: List<String>, outputVideoPath: String, callback: (Boolean) -> Unit) {
    val listFile = createFileList(context, videoPaths)
//    val ffmpegCommand = arrayOf(
//        "-f", "concat", "-safe", "0", "-i", listFile.absolutePath,
//        "-vf", "transpose=1", "-metadata:s:v", "rotate=0", outputVideoPath
//    )
    val ffmpegCommand =
        "-f concat -safe 0 -i ${listFile.absolutePath} -vf transpose=1 -metadata:s:v rotate=0 $outputVideoPath"
    FFmpegKit.executeAsync(ffmpegCommand) { session ->
        val returnCode = session.returnCode
        if (ReturnCode.isSuccess(returnCode)) {
            callback(true)
            listFile.delete()
        } else {
            callback(false)
            listFile.delete()
        }
    }
}

fun createVideoFromImages(
    context: Context,
    durations: Float,
    outputFilePath: String,
    audioPath: String,
    audioStartTime: Float,
    audioEndTime: Float,
    callback: (Boolean) -> Unit
) {


//    val tempImageFiles = mutableListOf<String>()
//    bitmaps.forEachIndexed { index, bitmap ->
//        val imageFile = File(context.filesDir.absolutePath, "temp_image_$index.jpg")
//        if (imageFile.exists()) {
//            imageFile.delete()
//        }
//        FileOutputStream(imageFile).use { outputStream ->
//            bitmap?.compress(Bitmap.CompressFormat.JPEG, 100, outputStream)
//        }
//        tempImageFiles.add(imageFile.absolutePath)
//    }
//
    val ffmpegInputImages = buildString {
        videoImages.forEachIndexed { index, path ->
            append("file '$path'\n")
            if (index % 22 == 0) {
                append("duration ${durations}\n")
            } else {
                append("duration ${0.142857}\n")
            }
            if (index == videoImages.size - 1) {
                append("duration ${durations}\n")
            }
        }

    }
    val listFile = File(context.filesDir.absolutePath, "input_images.txt")
    if (listFile.exists()) {
        listFile.delete()
    }
    listFile.writeText(ffmpegInputImages)

    val ffmpegCommand = buildString {
        append("-f concat -safe 0 -i ${listFile.absolutePath} ")
        append("-vsync vfr ")
        if (audioPath != "") {
            append("-ss $audioStartTime ") // Thời gian bắt đầu
            append("-to $audioEndTime ") // Thời gian kết thúc
            append("-i $audioPath ")
        }
//        append("-filter_complex \"")
//        // Thêm fade effect cho từng ảnh
//        for (i in 0 until bitmaps.size) {
//            if (i == 0) {
//                append("[${i}:v][v$i];")
//            } else {
//                append("[${i}:v][v$i];")
//            }
//        }
//        val concatInputs = (0 until bitmaps.size).joinToString("") { "[v$it]" }
//        append("$concatInputs concat=n=${bitmaps.size}:v=1:a=0,format=yuv420p[v]\" ")
        append("  -acodec aac -r 30 -strict experimental -preset veryslow -crf 18 -shortest $outputFilePath")
    }
    Log.d(TAG, "createVideoFromImages: ${ffmpegCommand}")
    // Thực thi lệnh FFmpeg
    FFmpegKit.executeAsync(ffmpegCommand) { session ->
        val returnCode = session.returnCode
        if (ReturnCode.isSuccess(returnCode)) {
            callback(true)
        } else {
            callback(false)
        }
    }
}