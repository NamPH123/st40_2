package com.namseox.st040_mecut.ui.editvideo

import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import android.graphics.Bitmap
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.ColorMatrixColorFilter
import android.graphics.Paint
import android.graphics.drawable.BitmapDrawable
import android.graphics.drawable.Drawable
import android.media.MediaPlayer
import android.net.Uri
import android.os.Environment
import android.os.Handler
import android.os.Looper
import android.text.Editable
import android.text.TextWatcher
import android.util.Log
import android.view.MotionEvent
import android.view.View
import android.view.ViewGroup
import android.view.inputmethod.InputMethodManager
import android.widget.ScrollView
import android.widget.SeekBar
import android.widget.TextView
import androidx.appcompat.widget.AppCompatImageView
import androidx.appcompat.widget.AppCompatSeekBar
import androidx.appcompat.widget.AppCompatTextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.content.res.ResourcesCompat
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.bumptech.glide.request.target.CustomTarget
import com.bumptech.glide.request.target.SimpleTarget
import com.bumptech.glide.request.transition.Transition
import com.bumptech.glide.signature.MediaStoreSignature
import com.namseox.st040_mecut.R
import com.namseox.st040_mecut.data.model.FrameModel
import com.namseox.st040_mecut.data.model.FuntionModel
import com.namseox.st040_mecut.data.model.ImvModel
import com.namseox.st040_mecut.data.model.TextFontModel
import com.namseox.st040_mecut.data.model.VideoModel
import com.namseox.st040_mecut.databinding.ActivityEditVideoBinding
import com.namseox.st040_mecut.dialog.DialogCreatName
import com.namseox.st040_mecut.service.ServiceAnim
import com.namseox.st040_mecut.service.ServiceAnim.Companion.callbackEdit
import com.namseox.st040_mecut.service.ServiceAnim.Companion.isImageComplate
import com.namseox.st040_mecut.ui.exportingvideo.ExportingVideoActivity
import com.namseox.st040_mecut.ui.music.MusicActivity
import com.namseox.st040_mecut.utils.Const
import com.namseox.st040_mecut.utils.Const.checkMusic
import com.namseox.st040_mecut.utils.Constant.arrBitmap
import com.namseox.st040_mecut.utils.Constant.checkSuccess
import com.namseox.st040_mecut.utils.Constant.videoImages
import com.namseox.st040_mecut.utils.Constant.videoPathList
import com.namseox.st040_mecut.utils.dpToPx
import com.namseox.st040_mecut.utils.dpToSp
import com.namseox.st040_mecut.utils.fileToBytes
import com.namseox.st040_mecut.utils.formatDuration
import com.namseox.st040_mecut.utils.hideKeyboard
import com.namseox.st040_mecut.utils.newIntent
import com.namseox.st040_mecut.utils.overlayImageViewWithBitmap
import com.namseox.st040_mecut.utils.setWidthHeight
import com.namseox.st040_mecut.utils.showToast
import com.namseox.st040_mecut.view.base.AbsBaseActivity
import com.namseox.st040_mecut.view.customview.OptiTimeLineView
import com.namseox.st040_mecut.view.customview.customimage.DrawableSticker
import com.namseox.st040_mecut.view.customview.customimage.OnStickerListener
import com.namseox.st040_mecut.view.customview.customimage.Sticker
import com.namseox.st040_mecut.view.customview.customimage.StickerView
import ir.kotlin.kavehcolorpicker.KavehColorPicker
import java.io.File
import java.io.FileOutputStream

class EditVideoActivcity : AbsBaseActivity<ActivityEditVideoBinding>(false) {
    lateinit var mediaPlayer : MediaPlayer
    var isUnMute = true
    var isPlay = false
    var isUpdatePlay = true
    var adapterDuration = DurationAdapter()
    var adapterFunction = FuntionAdapter()
    var adapterTextFuntion = TextFuntionAdapter()
    var adapterFillter = FillterAdapter()
    var adapterTextSticker = StikerAdapter()
    var adapterStiker = StikerAdapter()
    var adapterTextFont = TextFontAdapter()
    var adapterTransition = TransitionAdapter()
    var adapterTitleFrame = FrameTitleAdapter()
    var adapterFrame = FrameAdapter()
    var arrSticker = arrayListOf<ImvModel>()
    var arrDuration = arrayListOf(
        "0.5s","1s","1.5s","2s",
        "2.5s","3s","3.5s","4s",
        "4.5s","5s","5.5s","6s",
        "6.5s","7s","7.5s","8s",)
    var arrPaint = arrayListOf<Paint?>()
    var arrOptiTimeLineViewLayout = arrayListOf<OptiTimeLineView>()
    var arrOptiTimeLineViewHome = arrayListOf<OptiTimeLineView>()
    var arrIntFiller = arrayListOf<Int>(0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
    var arrStikerView = arrayListOf<StickerView>()
    var positionHome = -1
    var arrImv = arrayListOf<AppCompatImageView>()
    var arrFrame = arrayListOf<AppCompatImageView>()
    var arr = arrayListOf<FuntionModel>()
    var arrHome = arrayListOf<FuntionModel>()
    var arrText = arrayListOf<FuntionModel>()
    var arrSellect = arrayListOf<VideoModel>()
    var arrFillter = arrayListOf<ImvModel>()
    var arrTextFont = arrayListOf<TextFontModel>()
    var arrTextStiker = arrayListOf<ImvModel>()
    var arrTitleFrame = arrayListOf<FrameModel>()
    var arrTransition = arrayListOf<ImvModel>()
    var arrFrameInt = arrayListOf<ArrayList<Int>>()
    var arrTransitionInt = arrayListOf<Int>()
    override fun getFragmentID(): Int = 0

    override fun getLayoutId(): Int = R.layout.activity_edit_video

    @SuppressLint("ClickableViewAccessibility")
    override fun init() {
        arrTransitionInt = arrayListOf(
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
            0,
        )
        arrFrameInt = arrayListOf(
            arrayListOf(-1, -1),
            arrayListOf(-1, -1),
            arrayListOf(-1, -1),
            arrayListOf(-1, -1),
            arrayListOf(-1, -1),
            arrayListOf(-1, -1),
            arrayListOf(-1, -1),
            arrayListOf(-1, -1),
            arrayListOf(-1, -1),
            arrayListOf(-1, -1),
        )
        arrTransition = arrayListOf(
            ImvModel(R.drawable.ic_transition_1, getString(R.string.none),true),
            ImvModel(R.drawable.ic_transition_2, getString(R.string.cut)),
            ImvModel(R.drawable.ic_transition_3, getString(R.string.fade)),
            ImvModel(R.drawable.ic_transition_4, getString(R.string.push)),
            ImvModel(R.drawable.ic_transition_5, getString(R.string.wipe)),
            ImvModel(R.drawable.ic_transition_6, getString(R.string.split)),
            ImvModel(R.drawable.ic_transition_7, getString(R.string.shape)),
            ImvModel(R.drawable.ic_transition_8, getString(R.string.cover)),
            ImvModel(R.drawable.ic_transition_9, getString(R.string.flash)),
            ImvModel(R.drawable.ic_transition_10, getString(R.string.clock)),
            ImvModel(R.drawable.ic_transition_11, getString(R.string.box)),
            ImvModel(R.drawable.ic_transition_12, getString(R.string.zoom)),
            ImvModel(R.drawable.ic_transition_13, getString(R.string.pan)),
            ImvModel(R.drawable.ic_transition_14, getString(R.string.rotate)),
            ImvModel(R.drawable.ic_transition_15, getString(R.string.window)),
            ImvModel(R.drawable.ic_transition_16, getString(R.string.honeycomb)),
            ImvModel(R.drawable.ic_transition_17, getString(R.string.gallery)),
            ImvModel(R.drawable.ic_transition_18, getString(R.string.checkerboard)),
            ImvModel(R.drawable.ic_transition_19, getString(R.string.comb)),
            ImvModel(R.drawable.ic_transition_20, getString(R.string.dissolve)),
        )
        arrTitleFrame = arrayListOf(
            FrameModel(
                R.string.android, arrayListOf(
                    FuntionModel(R.drawable.android_1, R.drawable.android_1_),
                    FuntionModel(R.drawable.android_2, R.drawable.android_2_),
                    FuntionModel(R.drawable.android_3, R.drawable.android_3_),
                    FuntionModel(R.drawable.android_4, R.drawable.android_4_),
                    FuntionModel(R.drawable.android_5, R.drawable.android_5_),
                    FuntionModel(R.drawable.android_6, R.drawable.android_6_),
                    FuntionModel(R.drawable.android_7, R.drawable.android_7_),
                    FuntionModel(R.drawable.android_8, R.drawable.android_8_),
                    FuntionModel(R.drawable.android_9, R.drawable.android_9_),
                    FuntionModel(R.drawable.android_10, R.drawable.android_10_)
                ), true
            ),
            FrameModel(
                R.string.color, arrayListOf(
                    FuntionModel(R.drawable.android_11, R.drawable.android_11_),
                    FuntionModel(R.drawable.android_12, R.drawable.android_12_),
                    FuntionModel(R.drawable.android_13, R.drawable.android_13_),
                    FuntionModel(R.drawable.android_14, R.drawable.android_14_),
                    FuntionModel(R.drawable.android_15, R.drawable.android_15_),
                    FuntionModel(R.drawable.android_16, R.drawable.android_16_),
                    FuntionModel(R.drawable.android_17, R.drawable.android_17_),
                    FuntionModel(R.drawable.android_18, R.drawable.android_18_),
                    FuntionModel(R.drawable.android_19, R.drawable.android_19_),
                    FuntionModel(R.drawable.android_20, R.drawable.android_20_)
                )
            ),
            FrameModel(
                R.string.cute,
                arrayListOf(
                    FuntionModel(R.drawable.android_21, R.drawable.android_21_),
                    FuntionModel(R.drawable.android_22, R.drawable.android_22_),
                    FuntionModel(R.drawable.android_23, R.drawable.android_23_),
                    FuntionModel(R.drawable.android_24, R.drawable.android_24_),
                    FuntionModel(R.drawable.android_25, R.drawable.android_25_),
                    FuntionModel(R.drawable.android_26, R.drawable.android_26_),
                    FuntionModel(R.drawable.android_27, R.drawable.android_27_),
                    FuntionModel(R.drawable.android_28, R.drawable.android_28_),
                    FuntionModel(R.drawable.android_29, R.drawable.android_29_),
                    FuntionModel(R.drawable.android_30, R.drawable.android_30_),
                    FuntionModel(R.drawable.android_31, R.drawable.android_31_)
                ),
            ),
        )
        arrTextFont = arrayListOf(
            TextFontModel(R.font.aclonica_regular),
            TextFontModel(R.font.blackopsone_regular),
            TextFontModel(R.font.bungeeshade_regular),
            TextFontModel(R.font.cherrybombone_regular),
            TextFontModel(R.font.chilanka_regular),
            TextFontModel(R.font.dynalight_regular),
            TextFontModel(R.font.elsieswashcaps_regular),
            TextFontModel(R.font.faster_one_regular),
            TextFontModel(R.font.harlowsl),
            TextFontModel(R.font.miltonian_regular),
            TextFontModel(R.font.pacifico_regular),
            TextFontModel(R.font.sunshiney_regular),
            TextFontModel(R.font.uvn_chuky),
            TextFontModel(R.font.yellowtail_regular),
            TextFontModel(R.font.roboto_regular),
        )
        arrPaint = arrayListOf(
            Paint(),
            Paint().apply {
                setColorFilter(
                    ColorMatrixColorFilter(
                        floatArrayOf(
                            -0.36f, 1.691f, -0.32f, 0f, 0f,
                            0.325f, 0.398f, 0.275f, 0f, 0f,
                            0.79f, 0.796f, -0.76f, 0f, 0f,
                            0f, 0f, 0f, 1f, 0f
                        )
                    )
                )
            },
            Paint().apply {
                setColorFilter(
                    ColorMatrixColorFilter(
                        floatArrayOf(
                            2f, 0f, 0f, 0f, -130f,
                            0f, 2f, 0f, 0f, -130f,
                            0f, 0f, 2f, 0f, -130f,
                            0f, 0f, 0f, 1f, 0f
                        )
                    )
                )
            },
            Paint().apply {
                setColorFilter(
                    ColorMatrixColorFilter(
                        floatArrayOf(
                            5f, 0f, 0f, 0f, -254f,
                            0f, 5f, 0f, 0f, -254f,
                            0f, 0f, 5f, 0f, -254f,
                            0f, 0f, 0f, 1f, 0f
                        )
                    )
                )
            },
            Paint().apply {
                setColorFilter(
                    ColorMatrixColorFilter(
                        floatArrayOf(
                            0.393f, 0.769f, 0.189f, 0.0f,
                            0.0f, 0.349f, 0.686f, 0.168f,
                            0.0f, 0.0f, 0.272f, 0.534f,
                            0.131f, 0.0f, 0.0f, 0.0f,
                            0.0f, 0.0f, 1.0f, 0.0f,
                            0.0f, 0.0f, 0.0f, 0.0f, 1.0f
                        )
                    )
                )
            },
            Paint().apply {
                setColorFilter(
                    ColorMatrixColorFilter(
                        floatArrayOf(
                            -0.36f, 1.691f, -0.32f, 0f, 0f,
                            0.325f, 0.398f, 0.275f, 0f, 0f,
                            0.79f, 0.796f, -0.76f, 0f, 0f,
                            0f, 0f, 0f, 1f, 0f
                        )
                    )
                )
            },
            Paint().apply {
                setColorFilter(
                    ColorMatrixColorFilter(
                        floatArrayOf(
                            0f, 1f, 0f, 0f, 0f,
                            0f, 1f, 0f, 0f, 0f,
                            0f, 1f, 0f, 0f, 0f,
                            0f, 1f, 0f, 1f, 0f
                        )
                    )
                )
            },
            Paint().apply {
                setColorFilter(
                    ColorMatrixColorFilter(
                        floatArrayOf(
                            0f, 1f, 0f, 0f, 0f,
                            0f, 1f, 0f, 0f, 0f,
                            0f, 0.6f, 1f, 0f, 0f,
                            0f, 0f, 0f, 1f, 0f
                        )
                    )
                )
            },
        )
        arrFillter = arrayListOf(
            ImvModel(R.drawable.ic_effect_none, getString(R.string.none), true),
            ImvModel(R.drawable.ic_effect_noir, getString(R.string.noir)),
            ImvModel(R.drawable.ic_effect_warm, getString(R.string.warm)),
            ImvModel(R.drawable.ic_effect_sepia, getString(R.string.sepia)),
            ImvModel(R.drawable.ic_effect_cold, getString(R.string.cold)),
            ImvModel(R.drawable.ic_effect_classic, getString(R.string.classic)),
            ImvModel(R.drawable.ic_effect_monochrome, getString(R.string.monochrome)),
            ImvModel(R.drawable.ic_effect_green, getString(R.string.green)),
        )
        arrSticker = arrayListOf(
            ImvModel(R.drawable.sticker_1),
            ImvModel(R.drawable.sticker_2),
            ImvModel(R.drawable.sticker_3),
            ImvModel(R.drawable.sticker_4),
            ImvModel(R.drawable.sticker_5),
            ImvModel(R.drawable.sticker_6),
            ImvModel(R.drawable.sticker_7),
            ImvModel(R.drawable.sticker_8),
            ImvModel(R.drawable.sticker_9),
            ImvModel(R.drawable.sticker_10),
            ImvModel(R.drawable.sticker_11),
            ImvModel(R.drawable.sticker_12),
            ImvModel(R.drawable.sticker_13),
            ImvModel(R.drawable.sticker_14),
            ImvModel(R.drawable.sticker_15),
            ImvModel(R.drawable.sticker_16),
            ImvModel(R.drawable.sticker_17),
            ImvModel(R.drawable.sticker_18),
            ImvModel(R.drawable.sticker_19),
            ImvModel(R.drawable.sticker_20),
            ImvModel(R.drawable.sticker_21),
            ImvModel(R.drawable.sticker_22),
            ImvModel(R.drawable.sticker_23),
            ImvModel(R.drawable.sticker_24),
            ImvModel(R.drawable.sticker_25),
            ImvModel(R.drawable.sticker_26),
            ImvModel(R.drawable.sticker_27),
            ImvModel(R.drawable.sticker_28),
            ImvModel(R.drawable.sticker_29),
            ImvModel(R.drawable.sticker_30),
            ImvModel(R.drawable.sticker_31),
            ImvModel(R.drawable.sticker_32),
            ImvModel(R.drawable.sticker_33),


            )
        arrTextStiker = arrayListOf(
            ImvModel(R.drawable.imv_text_stiker_1),
            ImvModel(R.drawable.imv_text_stiker_2),
            ImvModel(R.drawable.imv_text_stiker_3),
            ImvModel(R.drawable.imv_text_stiker_4),
            ImvModel(R.drawable.imv_text_stiker_5),
            ImvModel(R.drawable.imv_text_stiker_6),
            ImvModel(R.drawable.imv_text_stiker_7),
            ImvModel(R.drawable.imv_text_stiker_8),
            ImvModel(R.drawable.imv_text_stiker_9),
            ImvModel(R.drawable.imv_text_stiker_10),
        )
        arrTextStiker = arrayListOf(
            ImvModel(R.drawable.imv_text_stiker_1),
            ImvModel(R.drawable.imv_text_stiker_2),
            ImvModel(R.drawable.imv_text_stiker_3),
            ImvModel(R.drawable.imv_text_stiker_4),
            ImvModel(R.drawable.imv_text_stiker_5),
            ImvModel(R.drawable.imv_text_stiker_6),
            ImvModel(R.drawable.imv_text_stiker_7),
            ImvModel(R.drawable.imv_text_stiker_8),
            ImvModel(R.drawable.imv_text_stiker_9),
            ImvModel(R.drawable.imv_text_stiker_10),
        )
        arrImv = arrayListOf(
            binding.imv1,
            binding.imv2,
            binding.imv3,
            binding.imv4,
            binding.imv5,
            binding.imv6,
            binding.imv7,
            binding.imv8,
            binding.imv9,
            binding.imv10,
        )
        arrFrame = arrayListOf(
        binding.imvFrame1,
        binding.imvFrame2,
        binding.imvFrame3,
        binding.imvFrame4,
        binding.imvFrame5,
        binding.imvFrame6,
        binding.imvFrame7,
        binding.imvFrame8,
        binding.imvFrame9,
        binding.imvFrame10,
        )
        arrSellect = intent.getSerializableExtra("data") as ArrayList<VideoModel>
        arrHome = arrayListOf(
            FuntionModel(
                R.drawable.filter_false,
                R.drawable.filter_true,
                getString(R.string.filter)
            ),
            FuntionModel(
                R.drawable.duration_false,
                R.drawable.duration_true,
                getString(R.string.duration)
            ),
            FuntionModel(
                R.drawable.sticker_false,
                R.drawable.sticker_true,
                getString(R.string.sticker)
            ),
            FuntionModel(R.drawable.text_false, R.drawable.text_true, getString(R.string.text)),
            FuntionModel(R.drawable.music_false, R.drawable.music_false, getString(R.string.music)),
            FuntionModel(R.drawable.frame_false, R.drawable.frame_true, getString(R.string.frame)),
            FuntionModel(
                R.drawable.transition_false,
                R.drawable.transition_true,
                getString(R.string.transition)
            )
        )
        arrText = arrayListOf(
            FuntionModel(
                R.drawable.text_delete,
                R.drawable.text_delete,
                getString(R.string.filter)
            ),
            FuntionModel(
                R.drawable.text_text_false,
                R.drawable.text_text_true,
                getString(R.string.transition)
            ),
            FuntionModel(
                R.drawable.text_font_false,
                R.drawable.text_font_true,
                getString(R.string.replace)
            ),
            FuntionModel(
                R.drawable.text_style_false,
                R.drawable.text_style_true,
                getString(R.string.delete)
            ),
            FuntionModel(
                R.drawable.text_setting_false,
                R.drawable.text_setting_true,
                getString(R.string.delete)
            ),
            FuntionModel(
                R.drawable.text_gradient_false,
                R.drawable.text_gradient_true,
                getString(R.string.delete)
            ),
            FuntionModel(
                R.drawable.text_tick,
                R.drawable.text_tick,
                getString(R.string.delete)
            )
        )
        binding.tvDuration.text = formatDuration((arrSellect.size * 2000).toLong())
        time = arrSellect.size * 2

        arr.clear()
        arr.addAll(arrHome)
        adapterFunction = FuntionAdapter()
        binding.rcv.itemAnimator = null
        binding.rcv.layoutManager =
            GridLayoutManager(applicationContext, 7, GridLayoutManager.VERTICAL, false)
        binding.rcv.adapter = adapterFunction
        adapterFunction.submitList(arr)
        onClick()
        try {
            arrOptiTimeLineViewHome = arrayListOf(
                binding.timeLineView1,
                binding.timeLineView2,
                binding.timeLineView3,
                binding.timeLineView4,
                binding.timeLineView5,
                binding.timeLineView6,
                binding.timeLineView7,
                binding.timeLineView8,
                binding.timeLineView9,
                binding.timeLineView10,
            )
            arrSellect.forEachIndexed { index, videoModel ->
                arrOptiTimeLineViewHome[index].setVideo(Uri.parse(videoModel.path))
            }
        } catch (e: Exception) {

        }
        try {
            arrOptiTimeLineViewLayout = arrayListOf(
                binding.layoutSpeed.findViewById<OptiTimeLineView>(R.id.timeLineView1),
                binding.layoutSpeed.findViewById<OptiTimeLineView>(R.id.timeLineView2),
                binding.layoutSpeed.findViewById<OptiTimeLineView>(R.id.timeLineView3),
                binding.layoutSpeed.findViewById<OptiTimeLineView>(R.id.timeLineView4),
                binding.layoutSpeed.findViewById<OptiTimeLineView>(R.id.timeLineView5),
                binding.layoutSpeed.findViewById<OptiTimeLineView>(R.id.timeLineView6),
                binding.layoutSpeed.findViewById<OptiTimeLineView>(R.id.timeLineView7),
                binding.layoutSpeed.findViewById<OptiTimeLineView>(R.id.timeLineView8),
                binding.layoutSpeed.findViewById<OptiTimeLineView>(R.id.timeLineView9),
                binding.layoutSpeed.findViewById<OptiTimeLineView>(R.id.timeLineView10)


            )
            arrSellect.forEachIndexed { index, videoModel ->
                arrOptiTimeLineViewLayout[index].setVideo(Uri.parse(videoModel.path))
            }
        } catch (e: Exception) {

        }
        arrStikerView = arrayListOf(
            binding.pv1,
            binding.pv2,
            binding.pv3,
            binding.pv4,
            binding.pv5,
            binding.pv6,
            binding.pv7,
            binding.pv8,
            binding.pv9,
            binding.pv10,
        )

        binding.layoutSpeed.findViewById<RecyclerView>(R.id.rcvTransition).adapter =
            adapterTransition
        binding.layoutSpeed.findViewById<RecyclerView>(R.id.rcvTransition).layoutManager =
            GridLayoutManager(applicationContext, 4, GridLayoutManager.VERTICAL, false)
        binding.layoutSpeed.findViewById<RecyclerView>(R.id.rcvTransition).itemAnimator = null
        adapterTransition.submitList(arrTransition)

        binding.layoutSpeed.findViewById<RecyclerView>(R.id.rcv).adapter = adapterFillter
        binding.layoutSpeed.findViewById<RecyclerView>(R.id.rcv).layoutManager =
            GridLayoutManager(applicationContext, 1, GridLayoutManager.HORIZONTAL, false)
        binding.layoutSpeed.findViewById<RecyclerView>(R.id.rcv).itemAnimator = null
        adapterFillter.submitList(arrFillter)

        binding.layoutStiker.findViewById<RecyclerView>(R.id.rcv).adapter = adapterStiker
        binding.layoutStiker.findViewById<RecyclerView>(R.id.rcv).itemAnimator = null
        binding.layoutStiker.findViewById<RecyclerView>(R.id.rcv).layoutManager =
            GridLayoutManager(applicationContext, 4, GridLayoutManager.VERTICAL, false)
        adapterStiker.submitList(arrSticker)

        binding.layoutStiker.findViewById<RecyclerView>(R.id.rcvDuration).adapter = adapterDuration
        binding.layoutStiker.findViewById<RecyclerView>(R.id.rcvDuration).itemAnimator = null
        binding.layoutStiker.findViewById<RecyclerView>(R.id.rcvDuration).layoutManager =
            GridLayoutManager(applicationContext, 4, GridLayoutManager.VERTICAL, false)
        adapterDuration.submitList(arrDuration)




        binding.layoutText.findViewById<RecyclerView>(R.id.rcv).adapter = adapterTextFuntion
        binding.layoutText.findViewById<RecyclerView>(R.id.rcv).itemAnimator = null
        binding.layoutText.findViewById<RecyclerView>(R.id.rcv).layoutManager =
            GridLayoutManager(applicationContext, 7, GridLayoutManager.VERTICAL, false)
        adapterTextFuntion.submitList(arrText)

        binding.layoutText.findViewById<RecyclerView>(R.id.rcvFont).adapter = adapterTextFont
        binding.layoutText.findViewById<RecyclerView>(R.id.rcvFont).itemAnimator = null
        binding.layoutText.findViewById<RecyclerView>(R.id.rcvFont).layoutManager =
            GridLayoutManager(applicationContext, 1, GridLayoutManager.VERTICAL, false)
        adapterTextFont.submitList(arrTextFont)

        binding.layoutText.findViewById<RecyclerView>(R.id.rcvStiker).adapter = adapterTextSticker
        binding.layoutText.findViewById<RecyclerView>(R.id.rcvStiker).itemAnimator = null
        binding.layoutText.findViewById<RecyclerView>(R.id.rcvStiker).layoutManager = GridLayoutManager(applicationContext, 3, GridLayoutManager.VERTICAL, false)
        adapterTextSticker.submitList(arrTextStiker)

        binding.layoutFrame.findViewById<RecyclerView>(R.id.rcvTitle).adapter = adapterTitleFrame
        binding.layoutFrame.findViewById<RecyclerView>(R.id.rcvTitle).itemAnimator = null
        binding.layoutFrame.findViewById<RecyclerView>(R.id.rcvTitle).layoutManager =
            GridLayoutManager(applicationContext, 3, GridLayoutManager.VERTICAL, false)
        adapterTitleFrame.submitList(arrTitleFrame)

        binding.layoutFrame.findViewById<RecyclerView>(R.id.rcvFrame).adapter = adapterFrame
        binding.layoutFrame.findViewById<RecyclerView>(R.id.rcvFrame).itemAnimator = null
        binding.layoutFrame.findViewById<RecyclerView>(R.id.rcvFrame).layoutManager =
            GridLayoutManager(applicationContext, 3, GridLayoutManager.VERTICAL, false)
        adapterFrame.submitList(arrTitleFrame[0].arr)

        updateSelect(binding.timeLineView1)
        updateSelect2(binding.layoutSpeed.findViewById(R.id.timeLineView1))
        positionHome = 0
        showStiker(0)
        binding.imvCover.setOnClickListener {  }
        Handler(Looper.myLooper()!!).postDelayed({
/**?
 *ảnh chưa load xong đã call nên null
 *
 *
 *
 **/
            arrSellect.forEachIndexed { index, videoModel ->
                arrImv[index].setImageDrawable(
                    BitmapDrawable(resources, arrOptiTimeLineViewHome[index].bitmap)
                )
            }
            binding.imvCover.visibility = View.GONE
            binding.pb.visibility = View.GONE
//            binding.animationView.visibility = View.GONE
//            binding.tvZoom.visibility = View.GONE
        },3000)
        initStickerView()


    }

    private fun initStickerView() {
        arrStikerView.forEach {
            it.apply {
                setConstrained(true)
                setLocked(false)
                setOnStickerListener(object : OnStickerListener {
                    override fun onAdded(sticker: Sticker) {
                    }

                    override fun onClicked(sticker: Sticker) {
                        if (positionHome > -1 && arrStikerView[positionHome].getCurrentSticker() != null && arrStikerView[positionHome].getCurrentSticker()!!.checkText) {
                            binding.tvEdit.setText(arrStikerView[positionHome].getCurrentSticker()!!.character)
                            binding.layoutText.findViewById<AppCompatSeekBar>(R.id.sbTextSize).progress = arrStikerView[positionHome].getCurrentSticker()!!.textSize.toInt()
                            binding.layoutText.findViewById<AppCompatSeekBar>(R.id.sbApha).progress =
                                arrStikerView[positionHome].getCurrentSticker()!!.alpha.toInt()
                            binding.layoutText.findViewById<AppCompatSeekBar>(R.id.sbMargin).progress =
                                arrStikerView[positionHome].getCurrentSticker()!!.margin.toInt()
                            textColor =
                                arrStikerView[positionHome].getCurrentSticker()!!.textColorCustom
                            stokeColor =
                                arrStikerView[positionHome].getCurrentSticker()!!.stokeColor
                            textOpacity =
                                arrStikerView[positionHome].getCurrentSticker()!!.textOpacity
                            stokeOpacity =
                                arrStikerView[positionHome].getCurrentSticker()!!.stokeOpacity
                        } else {
                            textColor = Color.parseColor("#ffffff")
                            textOpacity = 1f
                            stokeColor = Color.parseColor("#ffffff")
                            stokeOpacity = 1f
                        }

                    }
                    override fun onDeleted(sticker: Sticker) {

                    }

                    override fun onDragFinished(sticker: Sticker) {}
                    override fun onTouchedDown(sticker: Sticker) {
                    }

                    override fun onZoomFinished(sticker: Sticker) {}
                    override fun onFlipped(sticker: Sticker) {}
                    override fun onDoubleTapped(sticker: Sticker) {}
                    override fun onHideOptionIcon() {}
                    override fun onUndoDelete(stickers: List<Sticker?>) {}
                    override fun onUndoUpdate(stickers: List<Sticker?>) {}
                    override fun onUndoDeleteAll() {}
                    override fun onRedoAll() {}
                    override fun onReplace(sticker: Sticker) {
                    }
                })
            }
        }
    }

    fun updateSelect2(view: OptiTimeLineView) {
        binding.layoutSpeed.findViewById<OptiTimeLineView>(R.id.timeLineView1)
            .updateWhenSelect(false)
        binding.layoutSpeed.findViewById<OptiTimeLineView>(R.id.timeLineView2)
            .updateWhenSelect(false)
        binding.layoutSpeed.findViewById<OptiTimeLineView>(R.id.timeLineView3)
            .updateWhenSelect(false)
        binding.layoutSpeed.findViewById<OptiTimeLineView>(R.id.timeLineView4)
            .updateWhenSelect(false)
        binding.layoutSpeed.findViewById<OptiTimeLineView>(R.id.timeLineView5)
            .updateWhenSelect(false)
        binding.layoutSpeed.findViewById<OptiTimeLineView>(R.id.timeLineView6)
            .updateWhenSelect(false)
        binding.layoutSpeed.findViewById<OptiTimeLineView>(R.id.timeLineView7)
            .updateWhenSelect(false)
        binding.layoutSpeed.findViewById<OptiTimeLineView>(R.id.timeLineView8)
            .updateWhenSelect(false)
        binding.layoutSpeed.findViewById<OptiTimeLineView>(R.id.timeLineView9)
            .updateWhenSelect(false)
        binding.layoutSpeed.findViewById<OptiTimeLineView>(R.id.timeLineView10)
            .updateWhenSelect(false)
        view.updateWhenSelect(true)
    }

    fun updateSelect(view: OptiTimeLineView) {
        binding.timeLineView1.updateWhenSelect(false)
        binding.timeLineView2.updateWhenSelect(false)
        binding.timeLineView3.updateWhenSelect(false)
        binding.timeLineView4.updateWhenSelect(false)
        binding.timeLineView5.updateWhenSelect(false)
        binding.timeLineView6.updateWhenSelect(false)

        binding.timeLineView7.updateWhenSelect(false)
        binding.timeLineView8.updateWhenSelect(false)
        binding.timeLineView9.updateWhenSelect(false)
        binding.timeLineView10.updateWhenSelect(false)
        view.updateWhenSelect(true)
    }

    lateinit var bitmap: Bitmap
    lateinit var canvas: Canvas
    var newX = 0
    var oldX = 0
    var margin = 0
    var handler = Handler(Looper.myLooper()!!)
    var posListVideoPlay = 0
    var duration = 0f
    var duration2 = 0f
    var durationDelay = 2000
    lateinit var runnable: Runnable
    @SuppressLint("CutPasteId", "ClickableViewAccessibility")
    private fun onClick() {
        binding.llMute.setOnClickListener {
            isUnMute = !isUnMute
            if(isUnMute){
                binding.imvMute.setImageResource(R.drawable.ic_unmute)
                binding.tvUnmute.text = getString(R.string.unmute)
            }else{
                binding.imvMute.setImageResource(R.drawable.ic_mute)
                binding.tvUnmute.text = getString(R.string.mute)
            }
        }
        adapterDuration.onClick = {
            isUpdatePlay = true
            durationDelay = (it+1) * 500
            binding.tvDuration.text = formatDuration((arrSellect.size * durationDelay).toLong())
        }
        runnable = kotlinx.coroutines.Runnable {
            if (posListVideoPlay < videoImages.size) {
                Glide.with(binding.root).load(videoImages[posListVideoPlay]).signature(
                    MediaStoreSignature("image/*", System.currentTimeMillis(), 0)
                ).diskCacheStrategy(DiskCacheStrategy.RESOURCE).into(object :
                    SimpleTarget<Drawable?>() {
                    override fun onResourceReady(
                        resource: Drawable,
                        transition: Transition<in Drawable?>?
                    ) {
                        binding.imvPlayVideo.setImageDrawable(resource)
                    }
                })


                duration += (27 * 1.5f)
                binding.tvTime.text = formatDuration(duration.toLong()) +"/"
                if(posListVideoPlay%22==0){
                  if(duration >duration2 && (duration-duration2)>durationDelay-300){
                      posListVideoPlay++
                  }
                }else{
                    if(posListVideoPlay==videoImages.size-1){
                        if(duration >duration2 && (duration-duration2)>durationDelay-300){
                            posListVideoPlay++
                        }
                    }else{
                        duration2 = duration
                        posListVideoPlay++
                    }

                }

//                if(posListVideoPlay)
                    handler.postDelayed(runnable, (27.0f * 1.5).toLong())

            } else {
                duration = 0f
                duration2 = 0f
                binding.imvPlay.setImageResource(R.drawable.ic_pause)
                posListVideoPlay = 0
                isPlay = false
                if(::mediaPlayer.isInitialized && isUnMute){
                    mediaPlayer.pause()
                }
                handler.removeCallbacks(runnable)
                binding.imvPlayVideo.visibility = View.GONE
                Glide.with(binding.root).load(videoImages[0]).signature(
                    MediaStoreSignature("image/*", System.currentTimeMillis(), 0)
                ).diskCacheStrategy(DiskCacheStrategy.RESOURCE).into(object :
                    SimpleTarget<Drawable?>() {
                    override fun onResourceReady(
                        resource: Drawable,
                        transition: Transition<in Drawable?>?
                    ) {
                        binding.imvPlayVideo.setImageDrawable(resource)
                    }
                })
            }
        }
        callbackEdit = object : ServiceAnim.Companion.ProcessImageCallback {
            override fun onComplete() {
                    if (isImageComplate) {
                        binding.imvCover.visibility = View.GONE
                        binding.pb.visibility = View.GONE
                        binding.imvPlayVideo.visibility = View.VISIBLE
//                    videoImages   data
                        isPlay = true
                        handler.post(runnable)
                        isImageComplate = false
                        binding.imvPlay.setImageResource(R.drawable.ic_play)
                        if(::mediaPlayer.isInitialized && isUnMute){
                            mediaPlayer.seekTo(Const.musicPlay.startTime*1000)
                            mediaPlayer.start()
                        }
                    }
            }
        }

        binding.imvPlay.setOnClickListener {
            if (isUpdatePlay) {
                duration = 0f
                duration2 = 0f
                posListVideoPlay = 0
                binding.imvCover.visibility = View.VISIBLE
                binding.pb.visibility = View.VISIBLE
                videoPathList.clear()
                arrSellect.forEachIndexed { index, videoModel ->
                    val imageFile = File(filesDir.absolutePath, "temp_image_$index.jpg")
                    if (imageFile.exists()) {
                        imageFile.delete()
                    }
                    FileOutputStream(imageFile).use { outputStream ->
                        overlayImageViewWithBitmap(arrImv[index], arrFrame[index] , arrStikerView[index].save(),applicationContext)!!.compress(Bitmap.CompressFormat.JPEG, 100, outputStream)
                    }
                    videoPathList.add(imageFile.absolutePath)
                }
                startService(Intent(applicationContext, ServiceAnim::class.java))
                isUpdatePlay = false
                isPlay = false
            } else {
                isPlay = !isPlay
                if (isPlay) {
                    //chay video
                    duration = 0f
                    duration2 = 0f
                    posListVideoPlay = 0
                    handler.post(runnable)
                    binding.imvPlay.setImageResource(R.drawable.ic_play)
                    binding.imvPlayVideo.visibility = View.VISIBLE
                    if(::mediaPlayer.isInitialized && isUnMute){
                        mediaPlayer.seekTo(Const.musicPlay.startTime*1000)
                        mediaPlayer.start()
                    }
                } else {
                    binding.imvPlayVideo.visibility = View.GONE
                    handler.removeCallbacks(runnable)
                    binding.imvPlay.setImageResource(R.drawable.ic_pause)
                    if(::mediaPlayer.isInitialized && isUnMute){
                        mediaPlayer.pause()
                    }
         //dung video
                }
            }
        }
        binding.imvSave.setOnClickListener {
//            var arrBitmap = arrayListOf<Bitmap?>()
//            var arrFloat = arrayListOf<Float>()
//            var path =
//                Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DCIM).absolutePath + "/${System.currentTimeMillis()}" + ".mp4"
//            arrSellect.forEachIndexed { index, videoModel ->
//                arrBitmap.add(
//                    overlayImageViewWithBitmap(
//                        arrImv[index],
//                        arrStikerView[index].save()
//                    )
//                )
//                arrFloat.add(
//                    (arrOptiTimeLineViewHome[index].width * 2 / dpToPx(
//                        60f,
//                        applicationContext
//                    ))
//                )
//            }
//
//            createVideoFromImages(applicationContext,arrBitmap,arrFloat,path,Const.musicPlay.path,Const.musicPlay.startTime.toFloat(),Const.musicPlay.endTime.toFloat()){success ->
//                if(success){
//                    showToast(applicationContext, R.string.create_success)
//                }else{
//                    showToast(applicationContext, R.string.create_failed)
//
//                }
//            }
            var dialogCreatName = DialogCreatName(this)
            dialogCreatName.init(object  : DialogCreatName.OnPress{
                override fun cancel() {

                }

                override fun save() {
//                    arrBitmap.clear()
//                    arrSellect.forEachIndexed { index, videoModel ->
//                        arrBitmap.add(overlayImageViewWithBitmap(arrImv[index],arrFrame[index],arrStikerView[index].save(),applicationContext))
//
//                    }
                    if(dialogCreatName.binding.edt.text.toString()==""){
                        showToast(applicationContext,R.string.please_enter_name)
                    }else{
                        var path = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DCIM).absolutePath + "/"+ dialogCreatName.binding.edt.text.toString() + ".mp4"
                        if(File(path).exists()){
                            showToast(applicationContext,R.string.file_already_exists)
                        }else{
                            videoPathList.clear()
                            arrSellect.forEachIndexed { index, videoModel ->
                                val imageFile = File(filesDir.absolutePath, "temp_image_$index.jpg")
                                if (imageFile.exists()) {
                                    imageFile.delete()
                                }
                                FileOutputStream(imageFile).use { outputStream ->
                                    overlayImageViewWithBitmap(arrImv[index], arrFrame[index] , arrStikerView[index].save(),applicationContext)!!.compress(Bitmap.CompressFormat.JPEG, 100, outputStream)
                                }
                                videoPathList.add(imageFile.absolutePath)
                            }
                            checkSuccess = true
                            startActivity(newIntent(applicationContext, ExportingVideoActivity::class.java)
                                .putExtra("type","editvideo")
                                .putExtra("arrFloat",durationDelay)
                                .putExtra("path",path)
                            )
                        }
                    }

                }

            })
            dialogCreatName.show()
        }
//        binding.imvVisualizer.setOnTouchListener { v, event ->
//            when (event.action) {
//                MotionEvent.ACTION_DOWN -> {
//                    binding.ctv.setScrollingEnabled(false)
//                    oldX = event.rawX.toInt()
//                }
//
//                MotionEvent.ACTION_UP -> {
//                    binding.ctv.setScrollingEnabled(true)
//                }
//
//                MotionEvent.ACTION_MOVE -> {
//                    newX = event.rawX.toInt()
//                    if (newX - oldX + margin > 0) {
//                        val layoutParams = v.layoutParams as ViewGroup.MarginLayoutParams
//                        margin += newX - oldX
//                        layoutParams.marginStart = margin
//                        v.layoutParams = layoutParams
//                        v.requestLayout()
//                        oldX = newX
//                    }
//                }
//            }
//            true
//        }
        adapterTransition.onClick = { it ->
//            arrTransitionInt
//            positionHome

            arrTransitionInt[positionHome] = it
            arrTransition.forEach { it.check = false }
            arrTransition[it].check = true
            adapterTransition.submitList(arrTransition)
            isUpdatePlay = true
        }
        var frame = 0
        adapterTitleFrame.onClick = { it ->
            arrTitleFrame.forEach { it.check = false }
            arrTitleFrame[it].check = true
            adapterTitleFrame.submitList(arrTitleFrame)
            adapterFrame.submitList(arrTitleFrame[it].arr)
            frame = it
        }

        adapterFrame.onClick = { it, drawable ->
            //**
            arrTitleFrame.forEach {
                it.arr.forEach {
                    it.check = false
                }
            }
            arrTitleFrame.forEachIndexed { index, item ->
                if (item.check) {
                    item.arr[it].check = true
                    arrFrameInt[index] = arrayListOf(index, it)
                }
            }
            adapterFrame.submitList(arrTitleFrame[frame].arr)
            arrFrame[positionHome].setImageBitmap(drawable)
            isUpdatePlay = true
        }
        binding.layoutText.findViewById<AppCompatSeekBar>(R.id.sbTextSize).setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener{
            override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {
                if (positionHome > -1 && arrStikerView[positionHome].getCurrentSticker() != null && arrStikerView[positionHome].getCurrentSticker()!!.checkText) {
                    addText()
                }
            }
            override fun onStartTrackingTouch(seekBar: SeekBar?) {

            }
            override fun onStopTrackingTouch(seekBar: SeekBar?) {

            }
        })
        binding.layoutText.findViewById<AppCompatSeekBar>(R.id.sbApha).setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener{
            override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {
                if (positionHome > -1 && arrStikerView[positionHome].getCurrentSticker() != null && arrStikerView[positionHome].getCurrentSticker()!!.checkText) {
                    addText()
                }
            }
            override fun onStartTrackingTouch(seekBar: SeekBar?) {

            }
            override fun onStopTrackingTouch(seekBar: SeekBar?) {

            }
        })
        binding.layoutText.findViewById<AppCompatSeekBar>(R.id.sbMargin).setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener{
            override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {
                binding.layoutText.findViewById<AppCompatTextView>(R.id.tvMargin).text = "${progress}"
                if (positionHome > -1 && arrStikerView[positionHome].getCurrentSticker() != null && arrStikerView[positionHome].getCurrentSticker()!!.checkText) {
                    addText()
                }
            }
            override fun onStartTrackingTouch(seekBar: SeekBar?) {

            }
            override fun onStopTrackingTouch(seekBar: SeekBar?) {

            }
        })
        adapterTextSticker.onClick = {pos->
            Glide.with(applicationContext).asDrawable().load(arrTextStiker[pos].imv1)
                .into(object : CustomTarget<Drawable>() {
                    override fun onResourceReady(
                        resource: Drawable,
                        transition: Transition<in Drawable>?
                    ) {
                        val drawableSticker = DrawableSticker(resource, "${111}.png")
                        arrStikerView[positionHome].addSticker(drawableSticker, checkBg = true)
                    }

                    override fun onLoadCleared(placeholder: Drawable?) {

                    }

                })
            isUpdatePlay = true
        }
        adapterTextFont.onClick = {
            if (positionHome > -1 && arrStikerView[positionHome].getCurrentSticker() != null && arrStikerView[positionHome].getCurrentSticker()!!.checkText) {
                arrTextFont.forEach {
                    it.check = false
                }
                arrTextFont[it].check = true
                adapterTextFont.submitList(arrTextFont)
                arrStikerView[positionHome].getCurrentSticker()!!.font = it
                addText()
            } else {
                showToast(applicationContext, R.string.you_have_not_selected_text)
            }
            isUpdatePlay = true
        }
        adapterTextFuntion.onClick = {
            arrText.forEach {
                it.check = false
            }
            arrText[it].check = true
            adapterTextFuntion.submitList(arrText)
            when (it) {
                0 -> {
                    checkTrue()
                }

                1 -> {
                    if (positionHome > -1 && arrStikerView[positionHome].getCurrentSticker() != null && arrStikerView[positionHome].getCurrentSticker()!!.checkText) {
                        binding.tvEdit.setText(arrStikerView[positionHome].getCurrentSticker()!!.character)
                    } else {
                        binding.tvEdit.setText("")
                    }
                    binding.tvEdit.requestFocus()
                    binding.tvEdit.setSelection(binding.tvEdit.text!!.length)
                    binding.tvEdit.post {
                        val imm =
                            getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
                        imm.showSoftInput(binding.tvEdit, InputMethodManager.SHOW_IMPLICIT)
                    }
                    binding.layoutText.findViewById<RecyclerView>(R.id.rcvFont).visibility = View.GONE
                    binding.layoutText.findViewById<ScrollView>(R.id.svTextSetting).visibility = View.GONE
                    binding.layoutText.findViewById<ConstraintLayout>(R.id.ctlGradient).visibility = View.GONE
                    binding.layoutText.findViewById<RecyclerView>(R.id.rcvStiker).visibility = View.GONE
                }

                2 -> {
                    binding.layoutText.findViewById<RecyclerView>(R.id.rcvFont).visibility = View.VISIBLE
                    binding.layoutText.findViewById<ScrollView>(R.id.svTextSetting).visibility = View.GONE
                    binding.layoutText.findViewById<ConstraintLayout>(R.id.ctlGradient).visibility = View.GONE
                    binding.layoutText.findViewById<RecyclerView>(R.id.rcvStiker).visibility = View.GONE

                }

                3 -> {
                    binding.layoutText.findViewById<RecyclerView>(R.id.rcvFont).visibility = View.GONE
                    binding.layoutText.findViewById<ScrollView>(R.id.svTextSetting).visibility = View.GONE
                    binding.layoutText.findViewById<ConstraintLayout>(R.id.ctlGradient).visibility = View.GONE
                    binding.layoutText.findViewById<RecyclerView>(R.id.rcvStiker).visibility = View.VISIBLE
                }
                4 -> {
                    binding.layoutText.findViewById<RecyclerView>(R.id.rcvFont).visibility = View.GONE
                    binding.layoutText.findViewById<ScrollView>(R.id.svTextSetting).visibility = View.VISIBLE
                    binding.layoutText.findViewById<ConstraintLayout>(R.id.ctlGradient).visibility = View.GONE
                    binding.layoutText.findViewById<RecyclerView>(R.id.rcvStiker).visibility = View.GONE
                }
                5 -> {
                    binding.layoutText.findViewById<RecyclerView>(R.id.rcvFont).visibility =
                        View.GONE
                    binding.layoutText.findViewById<ScrollView>(R.id.svTextSetting).visibility =
                        View.GONE
                    binding.layoutText.findViewById<ConstraintLayout>(R.id.ctlGradient).visibility =
                        View.VISIBLE
                    binding.layoutText.findViewById<RecyclerView>(R.id.rcvStiker).visibility =
                        View.GONE
                }

                6 -> {
                    checkTrue()
                    binding.imvPlay.visibility = View.VISIBLE
                }
            }
        }
        binding.root.setOnClickListener {
            hideKeyboard(binding.root)
        }
        var previousText  = ""
        binding.tvEdit.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
                if (positionHome > -1 && arrStikerView[positionHome].getCurrentSticker() != null && arrStikerView[positionHome].getCurrentSticker()!!.checkText) {
                    previousText = arrStikerView[positionHome].getCurrentSticker()!!.character
                }

            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {

            }

            override fun afterTextChanged(s: Editable?) {
                if (s.toString() != previousText){
                    addText()
                }
            }
        })
        adapterFillter.onClick = { pos ->
            arrFillter.forEach {
                it.check = false
            }
            arrFillter[pos].check = true
            adapterFillter.submitList(arrFillter)
            try {
                var check = false
                arrOptiTimeLineViewLayout.forEachIndexed { index, optiTimeLineView ->
                    if (optiTimeLineView.isSelected) {
                        optiTimeLineView.setPaint(arrPaint[pos])
                        arrOptiTimeLineViewHome[index].setPaint(arrPaint[pos])
                        arrIntFiller[index] = pos
                        arrImv[index].setImageBitmap(optiTimeLineView.bitmap)


                        check = true
                    }
                }
                if (!check) {
                    arrOptiTimeLineViewLayout.forEachIndexed { index, optiTimeLineView ->
                        optiTimeLineView.setPaint(arrPaint[pos])
                        arrOptiTimeLineViewHome[index].setPaint(arrPaint[pos])
                        arrIntFiller[index] = pos


//                        var bitmapTest = optiTimeLineView.bitmap
//                        val purplePaint = optiTimeLineView.purplePaint
//                        canvas.drawBitmap(bitmapTest, 0f, 0f, purplePaint)
//                        arrImv[index].setImageBitmap(bitmapTest)
                        arrImv[index].setImageBitmap(optiTimeLineView.bitmap)


                    }

                }
            } catch (e: Exception) {

            }
            isUpdatePlay = true
        }
        adapterFunction.onCLick = { it, pos ->
            arr.forEachIndexed { index, funtionModel ->
                if (it.imv1 != R.drawable.music_false) {
                    if (index != pos) {
                        funtionModel.check = false
                    } else {
                        funtionModel.check = !funtionModel.check
                    }
                }
            }
            adapterFunction.submitList(arr)
            when (it.imv1) {
                R.drawable.filter_false -> {
                    if (it.check) {
                        checkTrue()
                        binding.layoutSpeed.visibility = View.VISIBLE
                        binding.layoutSpeed.findViewById<RecyclerView>(R.id.rcv).visibility =
                            View.VISIBLE
                        binding.layoutSpeed.findViewById<ConstraintLayout>(R.id.speed).visibility =
                            View.GONE
                        binding.layoutSpeed.findViewById<RecyclerView>(R.id.rcvTransition).visibility =
                            View.GONE
                        binding.imvPlay.visibility = View.GONE
                    } else {
                        checkTrue()
                        binding.imvPlay.visibility = View.VISIBLE
                    }
                }

                R.drawable.speed_false -> {
                    if (it.check) {
                        checkTrue()
                        binding.layoutSpeed.visibility = View.VISIBLE
                        binding.layoutSpeed.findViewById<ConstraintLayout>(R.id.speed).visibility =
                            View.VISIBLE
                        binding.layoutSpeed.findViewById<RecyclerView>(R.id.rcv).visibility =
                            View.GONE
                        binding.layoutSpeed.findViewById<RecyclerView>(R.id.rcvTransition).visibility =
                            View.GONE
                        binding.imvPlay.visibility = View.GONE
                    } else {
                        checkTrue()
                        binding.imvPlay.visibility = View.VISIBLE
                    }
                }

                R.drawable.sticker_false -> {
                    if (it.check) {
                        checkTrue()
                        binding.layoutStiker.visibility = View.VISIBLE
                        binding.imvPlay.visibility = View.GONE
                        binding.layoutStiker.findViewById<RecyclerView>(R.id.rcv).visibility = View.VISIBLE
                        binding.layoutStiker.findViewById<RecyclerView>(R.id.rcvDuration).visibility = View.GONE
                    } else {
                        checkTrue()
                        binding.imvPlay.visibility = View.VISIBLE
                    }
                }

                R.drawable.text_false -> {
                    if (it.check) {
                        checkTrue()
                        if (positionHome > -1 && arrStikerView[positionHome].getCurrentSticker() != null && arrStikerView[positionHome].getCurrentSticker()!!.checkText) {
                            binding.tvEdit.setText(arrStikerView[positionHome].getCurrentSticker()!!.character)
                            arrTextFont.forEach {
                                it.check = false
                            }
                            arrTextFont[arrStikerView[positionHome].getCurrentSticker()!!.font].check = true
                            adapterTextFont.submitList(arrTextFont)
                        } else {
                            binding.tvEdit.setText("")
                        }
                        binding.tvEdit.requestFocus()
                        binding.tvEdit.setSelection(binding.tvEdit.text!!.length)
                        binding.tvEdit.post {
                            val imm =
                                getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
                            imm.showSoftInput(binding.tvEdit, InputMethodManager.SHOW_IMPLICIT)
                        }
                        binding.layoutText.visibility = View.VISIBLE
                        binding.imvPlay.visibility = View.GONE
                    } else {
                        checkTrue()
                        binding.imvPlay.visibility = View.VISIBLE
                    }
                }

                R.drawable.music_false -> {
//                    checkTrue()
                    startActivity(Intent(applicationContext, MusicActivity::class.java))
                }

                R.drawable.frame_false -> {
                    checkTrue()
                    if (it.check) {
                        binding.layoutFrame.visibility = View.VISIBLE
                        binding.imvPlay.visibility = View.GONE
                    } else {
                        binding.imvPlay.visibility = View.VISIBLE
                    }
                }

                R.drawable.transition_false -> {
                    checkTrue()
                    if (it.check) {
                        binding.layoutSpeed.visibility = View.VISIBLE
                        binding.imvPlay.visibility = View.GONE
                        binding.layoutSpeed.findViewById<ConstraintLayout>(R.id.speed).visibility =
                            View.GONE
                        binding.layoutSpeed.findViewById<RecyclerView>(R.id.rcv).visibility =
                            View.GONE
                        binding.layoutSpeed.findViewById<RecyclerView>(R.id.rcvTransition).visibility =
                            View.VISIBLE
                    } else {
                        binding.imvPlay.visibility = View.VISIBLE
                    }
                }
                R.drawable.replace_false -> {}
                R.drawable.delete_false -> {}
                R.drawable.duration_false -> {
                    checkTrue()
                    if (it.check) {
                        binding.layoutStiker.visibility = View.VISIBLE
                        binding.layoutStiker.findViewById<RecyclerView>(R.id.rcv).visibility = View.GONE
                        binding.layoutStiker.findViewById<RecyclerView>(R.id.rcvDuration).visibility = View.VISIBLE
                        binding.imvPlay.visibility = View.GONE
                    } else {
                        binding.imvPlay.visibility = View.VISIBLE
                    }
                }
            }
        }
        binding.imvBack.setOnClickListener {
            finish()
        }
        binding.apply {
            timeLineView1.setOnClickListener {
                arrTitleFrame.forEach {
                    it.arr.forEach {
                        it.check = false
                    }
                }
                if (arrFrameInt[0][0] > -1) {
                    arrTitleFrame[arrFrameInt[0][0]].arr[arrFrameInt[0][1]].check = true
                }
                adapterFrame.submitList(arrTitleFrame[frame].arr)

                updateSelect(timeLineView1)
                updateSelect2(layoutSpeed.findViewById(R.id.timeLineView1))
                binding.imv1.setImageDrawable(
                    BitmapDrawable(
                        resources,
                        binding.timeLineView1.bitmap
                    )
                )
                positionHome = 0
                updateViewTransition()
            }
            timeLineView2.setOnClickListener {
                arrTitleFrame.forEach {
                    it.arr.forEach {
                        it.check = false
                    }
                }
                if (arrFrameInt[1][0] > -1) {
                    arrTitleFrame[arrFrameInt[1][0]].arr[arrFrameInt[1][1]].check = true
                }
                adapterFrame.submitList(arrTitleFrame[frame].arr)

                updateSelect2(layoutSpeed.findViewById(R.id.timeLineView2))
                updateSelect(timeLineView2)
                positionHome = 1
                updateViewTransition()
                binding.imv2.setImageDrawable(
                    BitmapDrawable(
                        resources,
                        binding.timeLineView2.bitmap
                    )
                )
            }
            timeLineView3.setOnClickListener {
                arrTitleFrame.forEach {
                    it.arr.forEach {
                        it.check = false
                    }
                }
                if (arrFrameInt[2][0] > -1) {
                    arrTitleFrame[arrFrameInt[2][0]].arr[arrFrameInt[2][1]].check = true
                }
                adapterFrame.submitList(arrTitleFrame[frame].arr)

                updateSelect2(layoutSpeed.findViewById(R.id.timeLineView3))
                updateSelect(timeLineView3)
                positionHome = 2
                updateViewTransition()
                binding.imv3.setImageDrawable(
                    BitmapDrawable(
                        resources,
                        binding.timeLineView3.bitmap
                    )
                )
            }
            timeLineView4.setOnClickListener {
                arrTitleFrame.forEach {
                    it.arr.forEach {
                        it.check = false
                    }
                }
                if (arrFrameInt[3][0] > -1) {
                    arrTitleFrame[arrFrameInt[3][0]].arr[arrFrameInt[3][1]].check = true
                }
                adapterFrame.submitList(arrTitleFrame[frame].arr)

                updateSelect2(layoutSpeed.findViewById(R.id.timeLineView4))
                updateSelect(timeLineView4)
                positionHome = 3
                updateViewTransition()
                binding.imv4.setImageDrawable(
                    BitmapDrawable(
                        resources,
                        binding.timeLineView4.bitmap
                    )
                )
            }
            timeLineView5.setOnClickListener {
                arrTitleFrame.forEach {
                    it.arr.forEach {
                        it.check = false
                    }
                }
                if (arrFrameInt[4][0] > -1) {
                    arrTitleFrame[arrFrameInt[4][0]].arr[arrFrameInt[4][1]].check = true
                }
                adapterFrame.submitList(arrTitleFrame[frame].arr)

                updateSelect2(layoutSpeed.findViewById(R.id.timeLineView5))
                updateSelect(timeLineView5)
                positionHome = 4
                updateViewTransition()
                binding.imv5.setImageDrawable(
                    BitmapDrawable(
                        resources,
                        binding.timeLineView5.bitmap
                    )
                )
            }
            timeLineView6.setOnClickListener {
                arrTitleFrame.forEach {
                    it.arr.forEach {
                        it.check = false
                    }
                }
                if (arrFrameInt[5][0] > -1) {
                    arrTitleFrame[arrFrameInt[5][0]].arr[arrFrameInt[5][1]].check = true
                }
                adapterFrame.submitList(arrTitleFrame[frame].arr)

                updateSelect2(layoutSpeed.findViewById(R.id.timeLineView6))
                updateSelect(timeLineView6)
                positionHome = 5
                updateViewTransition()
                binding.imv6.setImageDrawable(
                    BitmapDrawable(
                        resources,
                        binding.timeLineView6.bitmap
                    )
                )
            }
            timeLineView7.setOnClickListener {
                arrTitleFrame.forEach {
                    it.arr.forEach {
                        it.check = false
                    }
                }
                if (arrFrameInt[6][0] > -1) {
                    arrTitleFrame[arrFrameInt[6][0]].arr[arrFrameInt[6][1]].check = true
                }
                adapterFrame.submitList(arrTitleFrame[frame].arr)

                updateSelect2(layoutSpeed.findViewById(R.id.timeLineView7))
                updateSelect(timeLineView7)
                positionHome = 6
                updateViewTransition()
                binding.imv7.setImageDrawable(
                    BitmapDrawable(
                        resources,
                        binding.timeLineView7.bitmap
                    )
                )
            }
            timeLineView8.setOnClickListener {
                arrTitleFrame.forEach {
                    it.arr.forEach {
                        it.check = false
                    }
                }
                if (arrFrameInt[7][0] > -1) {
                    arrTitleFrame[arrFrameInt[7][0]].arr[arrFrameInt[7][1]].check = true
                }
                adapterFrame.submitList(arrTitleFrame[frame].arr)

                updateSelect2(layoutSpeed.findViewById(R.id.timeLineView8))
                updateSelect(timeLineView8)
                positionHome = 7
                updateViewTransition()
                binding.imv8.setImageDrawable(
                    BitmapDrawable(
                        resources,
                        binding.timeLineView8.bitmap
                    )
                )
            }
            timeLineView9.setOnClickListener {
                arrTitleFrame.forEach {
                    it.arr.forEach {
                        it.check = false
                    }
                }
                if (arrFrameInt[8][0] > -1) {
                    arrTitleFrame[arrFrameInt[8][0]].arr[arrFrameInt[8][1]].check = true
                }
                adapterFrame.submitList(arrTitleFrame[frame].arr)

                updateSelect2(layoutSpeed.findViewById(R.id.timeLineView9))
                updateSelect(timeLineView9)
                positionHome = 8
                updateViewTransition()
                binding.imv9.setImageDrawable(
                    BitmapDrawable(
                        resources,
                        binding.timeLineView9.bitmap
                    )
                )
            }
            timeLineView10.setOnClickListener {
                arrTitleFrame.forEach {
                    it.arr.forEach {
                        it.check = false
                    }
                }
                if (arrFrameInt[9][0] > -1) {
                    arrTitleFrame[arrFrameInt[9][0]].arr[arrFrameInt[9][1]].check = true
                }
                adapterFrame.submitList(arrTitleFrame[frame].arr)

                updateSelect2(layoutSpeed.findViewById(R.id.timeLineView10))
                updateSelect(timeLineView10)
                positionHome = 9
                updateViewTransition()
                binding.imv10.setImageDrawable(
                    BitmapDrawable(
                        resources,
                        binding.timeLineView10.bitmap
                    )
                )
            }


            layoutSpeed.findViewById<OptiTimeLineView>(R.id.timeLineView1).setOnClickListener {
                updateSelect2(layoutSpeed.findViewById(R.id.timeLineView1))
                positionHome = 0
                updateSelect(timeLineView1)
                binding.imv1.setImageDrawable(
                    BitmapDrawable(
                        resources,
                        layoutSpeed.findViewById<OptiTimeLineView>(R.id.timeLineView1).bitmap
                    )
                )
                updateViewTransition()
            }
            layoutSpeed.findViewById<OptiTimeLineView>(R.id.timeLineView2).setOnClickListener {
                updateSelect2(layoutSpeed.findViewById(R.id.timeLineView2))
                positionHome = 1
                updateSelect(timeLineView2)
                updateViewTransition()
                binding.imv2.setImageDrawable(
                    BitmapDrawable(
                        resources,
                        layoutSpeed.findViewById<OptiTimeLineView>(R.id.timeLineView2).bitmap
                    )
                )
            }
            layoutSpeed.findViewById<OptiTimeLineView>(R.id.timeLineView3).setOnClickListener {
                updateSelect2(layoutSpeed.findViewById(R.id.timeLineView3))
                positionHome = 2
                updateSelect(timeLineView3)
                updateViewTransition()
                binding.imv3.setImageDrawable(
                    BitmapDrawable(
                        resources,
                        layoutSpeed.findViewById<OptiTimeLineView>(R.id.timeLineView3).bitmap
                    )
                )
            }
            layoutSpeed.findViewById<OptiTimeLineView>(R.id.timeLineView4).setOnClickListener {
                updateSelect2(layoutSpeed.findViewById(R.id.timeLineView4))
                positionHome = 3
                updateSelect(timeLineView4)
                updateViewTransition()
                binding.imv4.setImageDrawable(
                    BitmapDrawable(
                        resources,
                        layoutSpeed.findViewById<OptiTimeLineView>(R.id.timeLineView4).bitmap
                    )
                )
            }
            layoutSpeed.findViewById<OptiTimeLineView>(R.id.timeLineView5).setOnClickListener {
                updateSelect2(layoutSpeed.findViewById(R.id.timeLineView5))
                positionHome = 4
                updateSelect(timeLineView5)
                updateViewTransition()
                binding.imv5.setImageDrawable(
                    BitmapDrawable(
                        resources,
                        layoutSpeed.findViewById<OptiTimeLineView>(R.id.timeLineView5).bitmap
                    )
                )
            }
            layoutSpeed.findViewById<OptiTimeLineView>(R.id.timeLineView6).setOnClickListener {
                updateSelect2(layoutSpeed.findViewById(R.id.timeLineView6))
                positionHome = 5
                updateSelect(timeLineView6)
                updateViewTransition()
                binding.imv6.setImageDrawable(
                    BitmapDrawable(
                        resources,
                        layoutSpeed.findViewById<OptiTimeLineView>(R.id.timeLineView6).bitmap
                    )
                )
            }
            layoutSpeed.findViewById<OptiTimeLineView>(R.id.timeLineView7).setOnClickListener {
                updateSelect2(layoutSpeed.findViewById(R.id.timeLineView7))
                positionHome = 6
                updateSelect(timeLineView7)
                updateViewTransition()
                binding.imv7.setImageDrawable(
                    BitmapDrawable(
                        resources,
                        layoutSpeed.findViewById<OptiTimeLineView>(R.id.timeLineView7).bitmap
                    )
                )
            }
            layoutSpeed.findViewById<OptiTimeLineView>(R.id.timeLineView8).setOnClickListener {
                updateSelect2(layoutSpeed.findViewById(R.id.timeLineView8))
                positionHome = 7
                updateSelect(timeLineView8)
                updateViewTransition()
                binding.imv8.setImageDrawable(
                    BitmapDrawable(
                        resources,
                        layoutSpeed.findViewById<OptiTimeLineView>(R.id.timeLineView8).bitmap
                    )
                )
            }
            layoutSpeed.findViewById<OptiTimeLineView>(R.id.timeLineView9).setOnClickListener {
                updateSelect2(layoutSpeed.findViewById(R.id.timeLineView9))
                positionHome = 8
                updateSelect(timeLineView9)
                updateViewTransition()
                binding.imv9.setImageDrawable(
                    BitmapDrawable(
                        resources,
                        layoutSpeed.findViewById<OptiTimeLineView>(R.id.timeLineView9).bitmap
                    )
                )
            }
            layoutSpeed.findViewById<OptiTimeLineView>(R.id.timeLineView10).setOnClickListener {
                updateSelect2(layoutSpeed.findViewById(R.id.timeLineView10))
                positionHome = 9
                updateSelect(timeLineView10)
                updateViewTransition()
                binding.imv10.setImageDrawable(
                    BitmapDrawable(
                        resources,
                        layoutSpeed.findViewById<OptiTimeLineView>(R.id.timeLineView10).bitmap
                    )
                )
            }


//            ctv.setOnTouchListener { v, event ->
//                when(event.action){
//                    MotionEvent.ACTION_DOWN -> {
//                        timeLineView1.scaleGestureDetector.onTouchEvent(event)
//                    }
//                    MotionEvent.ACTION_MOVE -> {
//                        timeLineView1.scaleGestureDetector.onTouchEvent(event)}
//                }
//                true
//            }

            constraintLayout.setOnTouchListener { v, event ->
                when (event.pointerCount) {
                    2 -> {
                        ctv.setScrollingEnabled(false)
                        timeLineView1.scaleGestureDetector.onTouchEvent(event)
                        timeLineView2.scaleGestureDetector.onTouchEvent(event)
                        timeLineView3.scaleGestureDetector.onTouchEvent(event)
                        timeLineView4.scaleGestureDetector.onTouchEvent(event)
                        timeLineView5.scaleGestureDetector.onTouchEvent(event)
                        timeLineView6.scaleGestureDetector.onTouchEvent(event)
                        timeLineView7.scaleGestureDetector.onTouchEvent(event)
                        timeLineView8.scaleGestureDetector.onTouchEvent(event)
                        timeLineView9.scaleGestureDetector.onTouchEvent(event)
                        timeLineView10.scaleGestureDetector.onTouchEvent(event)
                    }

                    else -> {
                        ctv.setScrollingEnabled(true)
                    }
                }
                true
            }
        }
        adapterStiker.onClick = { pos ->
            Glide.with(applicationContext).asDrawable().load(arrSticker[pos].imv1)
                .into(object : CustomTarget<Drawable>() {
                    override fun onResourceReady(
                        resource: Drawable,
                        transition: Transition<in Drawable>?
                    ) {
                        val drawableSticker = DrawableSticker(resource, "${111}.png")
                        arrStikerView[positionHome].addSticker(drawableSticker,false)
                        isUpdatePlay = true
                    }

                    override fun onLoadCleared(placeholder: Drawable?) {

                    }

                })
        }
        binding.layoutText.findViewById<AppCompatTextView>(R.id.tv1).setOnClickListener {
            checkTextColor = true
            binding.layoutText.findViewById<View>(R.id.view1)
                .setBackgroundResource(R.drawable.bg_line)
            binding.layoutText.findViewById<View>(R.id.view2)
                .setBackgroundResource(R.drawable.bg_null)
        }
        binding.layoutText.findViewById<AppCompatTextView>(R.id.tv2).setOnClickListener {
            checkTextColor = false
            binding.layoutText.findViewById<View>(R.id.view1)
                .setBackgroundResource(R.drawable.bg_null)
            binding.layoutText.findViewById<View>(R.id.view2)
                .setBackgroundResource(R.drawable.bg_line)
        }
        binding.layoutText.findViewById<KavehColorPicker>(R.id.colorPickerView)
            .setOnColorChangedListener { it ->
                if (positionHome > -1 && arrStikerView[positionHome].getCurrentSticker() != null && arrStikerView[positionHome].getCurrentSticker()!!.checkText) {
                    if (checkTextColor) {
                        textColor = it
                    } else {
                        stokeColor = it
                    }
                    addText()
                }
            }
        binding.layoutText.findViewById<KavehColorPicker>(R.id.colorPickerView).alphaSliderView =
            binding.layoutText.findViewById(R.id.colorAlphaSlider)
        binding.layoutText.findViewById<KavehColorPicker>(R.id.colorPickerView).hueSliderView =
            binding.layoutText.findViewById(R.id.hueSlider)
    }

    private fun updateViewTransition() {
        showStiker(positionHome)
        arrTransition.forEach { it.check = false }
        arrTransition[arrTransitionInt[positionHome]].check = true
        adapterTransition.submitList(arrTransition)
    }

    var checkTextColor = true
    var textColor = Color.parseColor("#ffffff")
    var textOpacity = 1f
    var stokeColor = Color.parseColor("#ffffff")
    var stokeOpacity = 1f
    private fun addText() {
        val textView = TextView(applicationContext).apply {
            this.text = binding.tvEdit.text.toString() + " "
            this.textSize = binding.layoutText.findViewById<AppCompatSeekBar>(R.id.sbTextSize).progress.toFloat()
            this.letterSpacing = binding.layoutText.findViewById<AppCompatSeekBar>(R.id.sbMargin).progress.toFloat()/100
            this.typeface = binding.tvEdit.typeface
//            colorWithOpacity = Color.argb(
//                (textOpacity * 255).toInt(),
//                Color.red(textColor),
//                Color.green(textColor),
//                Color.blue(textColor)
//            )
//            colorWithOpacityShadow = Color.argb(
//                (stokeOpacity * 255).toInt(),
//                Color.red(stokeColor),
//                Color.green(stokeColor),
//                Color.blue(stokeColor)
//            )
            this.setTextColor(textColor)
            if (positionHome > -1 && arrStikerView[positionHome].getCurrentSticker() != null && arrStikerView[positionHome].getCurrentSticker()!!.checkText) {
                this.textSize = dpToSp(
                    arrStikerView[positionHome].getCurrentSticker()!!.textSize,
                    applicationContext
                )
                this.typeface = ResourcesCompat.getFont(
                    applicationContext,
                    arrTextFont[arrStikerView[positionHome].getCurrentSticker()!!.font].font
                )
            }
            this.setShadowLayer(
                20f, // Shadow radius
                binding.layoutText.findViewById<AppCompatSeekBar>(R.id.sbApha).progress.toFloat(), // X offset
                binding.layoutText.findViewById<AppCompatSeekBar>(R.id.sbApha).progress.toFloat(), // Y offset
                stokeColor // Shadow color
            )
            measure(
                View.MeasureSpec.makeMeasureSpec(0, View.MeasureSpec.UNSPECIFIED),
                View.MeasureSpec.makeMeasureSpec(0, View.MeasureSpec.UNSPECIFIED)
            )
            layout(0, 0, measuredWidth, measuredHeight)
        }
        bitmap = Bitmap.createBitmap(
            if (textView.measuredWidth == 0) {
                100
            } else {
                textView.measuredWidth
            },
            if (textView.measuredHeight == 0) {
                100
            } else {
                textView.measuredHeight + dpToSp(10f, applicationContext).toInt()
            },
            Bitmap.Config.ARGB_8888
        )
        canvas = Canvas(bitmap)
        textView.draw(canvas)
        val drawableSticker = DrawableSticker(BitmapDrawable(resources, bitmap), "${111}.png")
        if (positionHome > -1 && arrStikerView[positionHome].getCurrentSticker() != null && arrStikerView[positionHome].getCurrentSticker()!!.checkText) {
            arrStikerView[positionHome].remove(arrStikerView[positionHome].getCurrentSticker())
        }
        arrStikerView[positionHome].addSticker(
            drawableSticker,
            true,
            binding.tvEdit.text.toString(),
            binding.layoutText.findViewById<AppCompatSeekBar>(R.id.sbTextSize).progress.toFloat(),
            binding.layoutText.findViewById<AppCompatSeekBar>(R.id.sbApha).progress.toFloat(),
            binding.layoutText.findViewById<AppCompatSeekBar>(R.id.sbMargin).progress.toFloat(),
            textColor,
            textOpacity,
            stokeColor,
            stokeOpacity
        )
        isUpdatePlay = true
    }
    fun checkTrue() {
        binding.layoutStiker.visibility = View.GONE
        binding.layoutSpeed.visibility = View.GONE
        binding.layoutText.visibility = View.GONE
        binding.layoutFrame.visibility = View.GONE
    }

    var time = 0

    override fun onRestart() {
        super.onRestart()
        if (Const.musicPlay.path == "") {
            binding.imvVisualizer.visibility = View.GONE
            binding.tvMusic.visibility = View.GONE
        } else {
            Log.d(
                "TAG",
                "onRestart______:${(Const.musicPlay.endTime - Const.musicPlay.startTime)} "
            )
            setWidthHeight(
                binding.imvVisualizer,
                dpToPx(
                    60f,
                    applicationContext
                ).toInt() * (Const.musicPlay.endTime - Const.musicPlay.startTime) / 2,
                0
            )
            binding.imvVisualizer.visibility = View.VISIBLE
            binding.tvMusic.visibility = View.VISIBLE
            if (checkMusic) {
                checkMusic = false
                binding.imvVisualizer.updateVisualizer(fileToBytes(File(Const.musicPlay.path)))
            }
            if(::mediaPlayer.isInitialized){
                mediaPlayer.release()
            }
            mediaPlayer = MediaPlayer.create(applicationContext, Uri.parse(Const.musicPlay.path))
//            mediaPlayer.prepare()
            //posListVideoPlay

        }
    }
    fun showStiker(pos: Int) {
        arrStikerView.forEach {
            it.visibility = View.GONE
        }
        arrStikerView[pos].visibility = View.VISIBLE

    }

    override fun onStop() {
        super.onStop()
        handler.removeCallbacks(runnable)
        binding.imvPlay.setImageResource(R.drawable.ic_pause)
        if(::mediaPlayer.isInitialized && isUnMute){
            mediaPlayer.pause()
        }
    }
    override fun onDestroy() {
        super.onDestroy()
        handler.removeCallbacks(runnable)
    }
}