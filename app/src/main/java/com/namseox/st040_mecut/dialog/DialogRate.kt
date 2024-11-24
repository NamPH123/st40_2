package com.namseox.st040_mecut.dialog

import android.app.Activity
import android.widget.Toast
import com.namseox.st040_mecut.R
import com.namseox.st040_mecut.databinding.DialogRateBinding
import com.namseox.st040_mecut.utils.RATE
import com.namseox.st040_mecut.utils.SharedPreferenceUtils
import com.namseox.st040_mecut.view.base.BaseDialog


class DialogRate(context: Activity) : BaseDialog<DialogRateBinding>(context, false) {
    var i = 0
    private lateinit var onPress: OnPress
    override fun getContentView(): Int = R.layout.dialog_rate
    interface OnPress {
        fun send(rate: Float)
        fun rating()
        fun cancel()
        fun later()
    }

    override fun initView() {
    }

    fun init(onPress: OnPress?) {
        this.onPress = onPress!!
    }

    override fun bindView() {
        setView(R.string.zero_star_title, R.string.zero_star, R.drawable.ic_rate_rero)
        binding.btnCancal.setOnClickListener {
            dismiss()
            onPress.cancel()
        }
        binding.btnVote.setOnClickListener {
            when (i) {
                0 -> {
                    Toast.makeText(
                        context,
                        context.getText(R.string.rate_us_0),
                        Toast.LENGTH_SHORT
                    ).show()
                }

                1, 2, 3 -> {
                    SharedPreferenceUtils.getInstance(context).putBooleanValue(RATE, true)
                    dismiss()
                    onPress.cancel()
                }

                else -> {
                    SharedPreferenceUtils.getInstance(context).putBooleanValue(RATE, true)
                    onPress.rating()
                }
            }
        }
        binding.ll1.setOnRatingChangeListener { ratingBar, rating, fromUser ->
            i = rating.toInt()
            when (i) {
                0 -> {
                    setView(R.string.zero_star_title, R.string.zero_star, R.drawable.ic_rate_rero)
                }

                1 -> {
                    setView(R.string.one_start_title, R.string.one_start, R.drawable.ic_rate_one)
                }

                2 -> {
                    setView(R.string.one_start_title, R.string.one_start, R.drawable.ic_rate_two)
                }

                3 -> {
                    setView(R.string.one_start_title, R.string.one_start, R.drawable.ic_rate_three)
                }

                4 -> {
                    setView(R.string.four_start_title, R.string.four_start, R.drawable.ic_rate_four)
                }

                5 -> {
                    setView(R.string.four_start_title, R.string.four_start, R.drawable.ic_rate_five)
                }
            }
        }
    }

    fun setView(tv1: Int, tv2: Int, img: Int) {
        binding.tv1.text = (context.resources.getString(tv1))
        binding.tv2.text = (context.resources.getString(tv2))
        binding.imvAvtRate.setImageResource(img)
    }
}