package com.namseox.st040_mecut.dialog

import android.annotation.SuppressLint
import android.app.Activity
import android.view.MotionEvent
import com.namseox.st040_mecut.R
import com.namseox.st040_mecut.databinding.DialogCreatNameBinding
import com.namseox.st040_mecut.databinding.DialogDeleteBinding
import com.namseox.st040_mecut.view.base.BaseDialog

class DialogCreatName(context: Activity) : BaseDialog<DialogCreatNameBinding>(context, false) {
    private lateinit var onPress: OnPress
    fun init(onPress: OnPress?) {
        this.onPress = onPress!!
    }

    interface OnPress {
        fun cancel()
        fun save()
    }

    override fun getContentView(): Int = R.layout.dialog_creat_name

    @SuppressLint("ClickableViewAccessibility")
    override fun initView() {
        binding.edt.setOnTouchListener { _, event ->
            if (event.action == MotionEvent.ACTION_UP) {
                val drawableEnd = binding.edt.compoundDrawables[2] // Lấy drawableEnd (vị trí thứ 2 trong mảng)
                if (drawableEnd != null) {
                    // Kiểm tra xem người dùng có chạm vào vùng của drawableEnd không
                    val drawableEndStart = binding.edt.width - binding.edt.paddingEnd - drawableEnd.intrinsicWidth
                    if (event.rawX >= drawableEndStart) {
                        binding.edt.text?.clear()
                        return@setOnTouchListener true
                    }
                }
            }
            false
        }
        binding.tvCancel.setOnClickListener {
            onPress.cancel()
            dismiss()
        }
        binding.tvSave.setOnClickListener {
            onPress.save()
            dismiss()
        }
    }

    override fun bindView() {

    }
}