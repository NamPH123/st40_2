package com.namseox.st040_mecut.ui.cutvideo

import android.content.ContentValues.TAG
import android.media.MediaMetadataRetriever
import android.net.Uri
import android.os.Handler
import android.os.Looper
import android.util.Log
import android.view.MotionEvent
import android.view.View
import androidx.media3.common.MediaItem
import androidx.media3.common.Player
import androidx.media3.common.util.UnstableApi
import androidx.media3.exoplayer.ExoPlayer
import androidx.media3.exoplayer.source.DefaultMediaSourceFactory
import com.namseox.st040_mecut.R
import com.namseox.st040_mecut.data.model.VideoModel
import com.namseox.st040_mecut.databinding.ActivityCutVideoBinding
import com.namseox.st040_mecut.ui.exportingvideo.ExportingVideoActivity
import com.namseox.st040_mecut.utils.dpToPx
import com.namseox.st040_mecut.utils.formatDuration
import com.namseox.st040_mecut.utils.newIntent
import com.namseox.st040_mecut.utils.showToast
import com.namseox.st040_mecut.view.base.AbsBaseActivity
import com.namseox.st040_mecut.view.customview.OptiMergeVideo
import com.namseox.st040_mecut.view.customview.customimage.OptiCutVideo

class CutVideoActivity : AbsBaseActivity<ActivityCutVideoBinding>(false) {
    var data = 0 //0-trim   1-cut
    lateinit var video: VideoModel
    lateinit var exo: ExoPlayer
    var handle = Handler(Looper.myLooper()!!)
    var left = 0L
    var right = 0L
    var leftCut = 0L
    var rightCut = 0L
    var length = 0L
    var lineCut = 0F
    lateinit var runable: Runnable
    override fun getFragmentID(): Int = 0

    override fun getLayoutId(): Int = R.layout.activity_cut_video

    @UnstableApi
    override fun init() {
        video = intent.getSerializableExtra("data") as VideoModel
        val retriever = MediaMetadataRetriever()
        retriever.setDataSource(video.path)
        val durationStr = retriever.extractMetadata(MediaMetadataRetriever.METADATA_KEY_DURATION)
        val durationMs = durationStr?.toLongOrNull() ?: 0L
        length = durationMs * 1000
        runable = Runnable {
            if (data == 0) {
                if (exo.currentPosition * 1000 < right + 100* 1000 && exo.currentPosition * 1000 > right - 100* 1000) {
                    binding.imvPlay.setImageResource(R.drawable.ic_pause)
                    exo.pause()
                    handle.removeCallbacks(runable)
                } else {
                    if(data==0){
                        binding.otltrim.changeLine(exo.currentPosition * ((binding.otlCut.measuredWidth) - dpToPx(20f, applicationContext)) / (length / 1000).toFloat())
                    }else{
                        binding.otlCut.changeLine(exo.currentPosition * ((binding.otlCut.measuredWidth) - dpToPx(20f, applicationContext)) / (length / 1000).toFloat())
                    }

                    handle.postDelayed(runable, 100)
                }
            } else {
                if (exo.currentPosition < exo.duration - 100) {
                    if (exo.currentPosition < binding.otlCut.leftHandle * length / ((binding.otlCut.measuredWidth- dpToPx(16f,applicationContext))*1000) + 100 && exo.currentPosition > binding.otlCut.leftHandle * length / ((binding.otlCut.measuredWidth- dpToPx(16f,applicationContext))*1000) - 20) {
                        exo.seekTo(((binding.otlCut.rightHandle- dpToPx(20f,applicationContext)) * length / ((binding.otlCut.measuredWidth- dpToPx(16f,applicationContext))*1000)).toLong())
                    }
//                    binding.otlCut.changeLine(
//                        exo.currentPosition * ((binding.otlCut.measuredWidth) - dpToPx(
//                            12f,
//                            applicationContext
//                        )) / (length / 1000).toFloat()
//                    )
                    binding.otlCut.changeLine(
                        exo.currentPosition * ((binding.otlCut.measuredWidth) - dpToPx(
                            16f,
                            applicationContext
                        )) / (length / 1000).toFloat()
                    )
                    handle.postDelayed(runable, 100)
                } else {
                    binding.imvPlay.setImageResource(R.drawable.ic_pause)
                    handle.removeCallbacks(runable)
                }
            }
        }
        exo = ExoPlayer.Builder(applicationContext).build()
        binding.epVideo.player = exo
        val mediaItem: MediaItem = MediaItem.fromUri(video.path)
        val mediaSource = DefaultMediaSourceFactory(this).createMediaSource(mediaItem)
        exo.setMediaSource(mediaSource)
        exo.prepare()

        exo.addListener(object : Player.Listener {
            override fun onPlaybackStateChanged(playbackState: Int) {
                when (playbackState) {
                    Player.STATE_ENDED -> {
                        exo.pause()
                        binding.imvPlay.setImageResource(R.drawable.ic_pause)
                        handle.removeCallbacks(runable)
                    }
                }
            }
        })
        binding.apply {
            binding.tvTime.text = "${formatDuration(durationMs)}"
            binding.otltrim.setVideo(Uri.parse(video.path))
            binding.otlCut.setVideo(Uri.parse(video.path))

            imvPlay.setOnClickListener {
                if (exo.isPlaying) {
                    exo.pause()
                    imvPlay.setImageResource(R.drawable.ic_pause)
                    handle.removeCallbacks(runable)
                } else {
                    right = (binding.otltrim.rightHandle - dpToPx(
                        1f,
                        applicationContext
                    ).toLong()) * length / binding.otltrim.measuredWidth
                    if (data == 0) {
//                        if(left==otltrim.leftLine){
//                            exo.seekTo(left / 1000)
//                        }
//                        right + 100* 1000
//                        if(exo.currentPosition * 1000 < right + 100* 1000 && exo.currentPosition * 1000 > right - 100* 1000){
                        if(otltrim.leftLine >= (otltrim.rightHandle - dpToPx(20f,applicationContext)).toLong() || otltrim.leftLine<= otltrim.leftHandle){
                            exo.seekTo(left / 1000)
                        }else{

                        }
                    } else {
                        if (exo.currentPosition > exo.duration - 200) {
//                            exo.seekTo((lineCut * length / 1000 / otlCut.measuredWidth).toLong())
                            exo.seekTo(0)
                        }
                    }
                    exo.play()
                    handle.post(runable)
                    imvPlay.setImageResource(R.drawable.ic_play)
                }
            }
            tvTrim.setOnClickListener {
                exo.pause()
                imvPlay.setImageResource(R.drawable.ic_pause)
                binding.imvTrue.setBackgroundResource(R.drawable.bg_card_border8)
                binding.imvFalse.setBackgroundResource(R.drawable.bg_card_border9)
                data = 0
                binding.otltrim.visibility = View.VISIBLE
                binding.otlCut.visibility = View.INVISIBLE
                left = otltrim.leftHandle * length / otltrim.measuredWidth
                right = (otltrim.rightHandle - dpToPx(
                    1f,
                    applicationContext
                ).toLong()) * length / otltrim.measuredWidth
                binding.tvTime.text = "${formatDuration((right - left) / 1000)}"
            }
            binding.tvCut.setOnClickListener {
                exo.pause()
                imvPlay.setImageResource(R.drawable.ic_pause)
                binding.imvTrue.setBackgroundResource(R.drawable.bg_card_border9)
                binding.imvFalse.setBackgroundResource(R.drawable.bg_card_border8)
                data = 1
                binding.otlCut.visibility = View.VISIBLE
                binding.otltrim.visibility = View.INVISIBLE
                leftCut = otlCut.leftHandle * length / otlCut.measuredWidth
                rightCut = (otlCut.rightHandle - dpToPx(
                    12f,
                    applicationContext
                ).toLong()) * length / otlCut.measuredWidth
                binding.tvTime.text =
                    "${formatDuration(exo.duration - (rightCut - leftCut) / 1000)}"
            }


            otltrim.setOnCustomTouchListener(object : OptiMergeVideo.OnCustomTouchListener {
                override fun onTouchEvent(event: MotionEvent?) {
//                    if(event?.action == MotionEvent.ACTION_MOVE){
                        exo.pause()

                        left = otltrim.leftHandle * length / otltrim.measuredWidth
                        right = (otltrim.rightHandle - dpToPx(
                            1f,
                            applicationContext
                        ).toLong()) * length / otltrim.measuredWidth
                        binding.tvTime.text = "${formatDuration((right - left) / 1000)}"
                        otltrim.changeLine(otltrim.leftHandle.toFloat())
//                    exo.seekTo((event!!.x * length / 1000 / otltrim.measuredWidth).toLong())
                        exo.seekTo((left/1000).toLong())
                        imvPlay.setImageResource(R.drawable.ic_pause)
//                    }
                }

                override fun onChangeLine(i: Float) {
                    exo.seekTo((i * length / 1000 / otltrim.measuredWidth).toLong())
                }

            })
            otlCut.setOnCustomTouchListener(object : OptiCutVideo.OnCustomTouchListener {
                override fun onTouchEvent(event: MotionEvent?) {
                    leftCut = otlCut.leftHandle * length / otlCut.measuredWidth
                    rightCut = (otlCut.rightHandle - dpToPx(
                        12f,
                        applicationContext
                    ).toLong()) * length / otlCut.measuredWidth
                    Log.d(
                        TAG,
                        "onTouchEvent___: ${exo.duration}_________${rightCut}_______${leftCut}"
                    )
                    binding.tvTime.text =
                        "${formatDuration(exo.duration - (rightCut - leftCut) / 1000)}"
                }

                override fun onChangeLine(i: Float) {
                    if (data != 0) {
                        lineCut = i
                    }
                    exo.seekTo((i * length / 1000 / otlCut.measuredWidth).toLong())
                }

            })
            otltrim.setOnTouchListener { v, event -> true }
            otlCut.setOnTouchListener { v, event -> true }
            binding.imvSave.setOnClickListener {
                if (data == 0) {
                    right = (binding.otltrim.rightHandle ) * length / binding.otltrim.measuredWidth
                    left = otltrim.leftHandle * length / otltrim.measuredWidth
                    startActivity(newIntent(applicationContext, ExportingVideoActivity::class.java)
                        .putExtra("data", arrayListOf(video))
                        .putExtra("time", arrayListOf(arrayOf(left, right, length)))
                    )
                } else {
                    if (leftCut == 0L && otlCut.rightHandle == otlCut.measuredWidth.toLong()){
                        showToast(applicationContext,R.string.you_have_not_cut_the_video)
                    }else{
                        startActivity(
                            newIntent(
                                applicationContext,
                                ExportingVideoActivity::class.java
                            ).putExtra("data", arrayListOf(video, video)).putExtra(
                                "time",
                                arrayListOf(
                                    arrayOf(
                                        0,
                                    otlCut.leftHandle * length / otlCut.measuredWidth,
//                                        leftCut,
                                        length
                                    ),
                                    arrayOf(
                                    (binding.otlCut.rightHandle) * length / binding.otlCut.measuredWidth,
//                                        rightCut,
                                        (otlCut.measuredWidth - dpToPx(
                                            20f,
                                            applicationContext
                                        ).toLong()) * length / otlCut.measuredWidth,
                                        length
                                    )
                                )
                            )
                        )
                    }

                }
            }
            binding.imvBack.setOnClickListener { finish() }
        }
    }

    var exoIsPlay = false
    override fun onStop() {
        super.onStop()
        if (exo.isPlaying) {
            exo.pause()
            exoIsPlay = true
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        exo.release()
        handle.removeCallbacks(runable)
    }

    override fun onRestart() {
        super.onRestart()
        if (exoIsPlay) {
            exo.play()
            exoIsPlay = false
        }
    }
}