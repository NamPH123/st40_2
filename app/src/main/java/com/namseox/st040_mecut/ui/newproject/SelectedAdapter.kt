package com.namseox.st040_mecut.ui.newproject

import android.view.MotionEvent
import android.view.View
import androidx.recyclerview.widget.ItemTouchHelper
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.namseox.st040_mecut.R
import com.namseox.st040_mecut.data.model.VideoModel
import com.namseox.st040_mecut.databinding.ItemSelectBinding
import com.namseox.st040_mecut.view.base.AbsBaseAdapter
import com.namseox.st040_mecut.view.base.AbsBaseDiffCallBack

class SelectedAdapter( var itemTouchHelper: ItemTouchHelper): AbsBaseAdapter<VideoModel, ItemSelectBinding>(R.layout.item_select, SelectedDiff()) {
    var onCLick: ((pos : Int) -> Unit)? = null
    class SelectedDiff : AbsBaseDiffCallBack<VideoModel>(){
        override fun itemsTheSame(oldItem: VideoModel, newItem: VideoModel): Boolean {
            return oldItem.path == newItem.path
        }

        override fun contentsTheSame(oldItem: VideoModel, newItem: VideoModel): Boolean {
            return oldItem.path != newItem.path || oldItem.check != newItem.check
        }

    }

    override fun bind(binding: ItemSelectBinding, position: Int, data: VideoModel, holder: RecyclerView.ViewHolder) {
        binding.imvDelete.setOnClickListener { onCLick?.invoke(position) }
//        binding.imvDelete.setOnTouchListener { v, event ->
//            if (event.action == MotionEvent.ACTION_DOWN) {
//                itemTouchHelper.startDrag(holder)
//            }
//            false
//        }
        if (data.duration != "") {
            binding.tvTime.visibility = View.VISIBLE
            binding.tvTime.text = data.duration
        } else {
            binding.tvTime.visibility = View.GONE
        }
        Glide.with(binding.root).load(data.path).into(binding.imv)
    }


}