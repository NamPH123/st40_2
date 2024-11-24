package com.namseox.st040_mecut.ui.mergevideo

import android.view.MotionEvent
import androidx.recyclerview.widget.ItemTouchHelper
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.namseox.st040_mecut.R
import com.namseox.st040_mecut.data.model.VideoModel
import com.namseox.st040_mecut.databinding.ItemMergeVideoBinding
import com.namseox.st040_mecut.utils.getVideoDuration
import com.namseox.st040_mecut.view.base.AbsBaseAdapter
import com.namseox.st040_mecut.view.base.AbsBaseDiffCallBack

class MergeAdapter(var itemTouchHelper: ItemTouchHelper): AbsBaseAdapter<VideoModel,ItemMergeVideoBinding>(R.layout.item_merge_video,MergeDiff()) {
    var onItemClick: ((Int,String) -> Unit)? =null
    class MergeDiff : AbsBaseDiffCallBack<VideoModel>(){
        override fun itemsTheSame(oldItem: VideoModel, newItem: VideoModel): Boolean {
            return oldItem.path == newItem.path
        }

        override fun contentsTheSame(oldItem: VideoModel, newItem: VideoModel): Boolean {
            return oldItem.path != newItem.path
        }
    }

    override fun bind(binding: ItemMergeVideoBinding, position: Int, data: VideoModel,
                      holder: RecyclerView.ViewHolder) {
        Glide.with(binding.root).load(data.path).into(binding.imv)
        binding.tvTime.text = getVideoDuration(data.path)
        binding.root.setOnClickListener {
            onItemClick?.invoke(position,"edit")
        }
        binding.imvClose.setOnClickListener {
            onItemClick?.invoke(position,"delete")
        }
        binding.imvSwap.setOnTouchListener { v, event ->
            if (event.action == MotionEvent.ACTION_DOWN) {
                itemTouchHelper.startDrag(holder)
            }
            false
        }
    }
}