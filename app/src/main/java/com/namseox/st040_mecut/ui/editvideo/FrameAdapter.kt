package com.namseox.st040_mecut.ui.editvideo

import android.graphics.Bitmap
import android.graphics.drawable.Drawable
import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.target.CustomTarget
import com.bumptech.glide.request.transition.Transition
import com.namseox.st040_mecut.R
import com.namseox.st040_mecut.data.model.FuntionModel
import com.namseox.st040_mecut.databinding.ItemFrameBinding
import com.namseox.st040_mecut.view.base.AbsBaseAdapter
import com.namseox.st040_mecut.view.base.AbsBaseDiffCallBack

class FrameAdapter : AbsBaseAdapter<FuntionModel, ItemFrameBinding>(R.layout.item_frame,FrameDiff()) {
    var onClick:((Int,Bitmap)->Unit)? = null
    class FrameDiff : AbsBaseDiffCallBack<FuntionModel>() {
        override fun itemsTheSame(oldItem: FuntionModel, newItem: FuntionModel): Boolean {
            return oldItem.imv1 == newItem.imv1
        }

        override fun contentsTheSame(oldItem: FuntionModel, newItem: FuntionModel): Boolean {
            return oldItem.check != newItem.check
        }

    }

    override fun bind(binding: ItemFrameBinding, position: Int, data: FuntionModel,
                      holder: RecyclerView.ViewHolder) {
        var bitmap : Bitmap? = null
        if(data.check){
            binding.imvBG.visibility = View.VISIBLE
        }else{
            binding.imvBG.visibility = View.GONE
        }
        Glide.with(binding.root).asBitmap().load(data.imv2).into(object : CustomTarget<Bitmap>() {
            override fun onResourceReady(resource: Bitmap, transition: Transition<in Bitmap>?) {
                binding.imv.setImageBitmap(resource)
                bitmap = resource
            }

            override fun onLoadCleared(placeholder: Drawable?) {

            }
        })
        binding.imv.setOnClickListener {
            onClick?.invoke(position,bitmap!!)
        }
    }
}