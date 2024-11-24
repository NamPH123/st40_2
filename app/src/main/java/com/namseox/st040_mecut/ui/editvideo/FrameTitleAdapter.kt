package com.namseox.st040_mecut.ui.editvideo

import androidx.recyclerview.widget.RecyclerView
import com.namseox.st040_mecut.R
import com.namseox.st040_mecut.data.model.FrameModel
import com.namseox.st040_mecut.databinding.ItemTitleFrameBinding
import com.namseox.st040_mecut.view.base.AbsBaseAdapter
import com.namseox.st040_mecut.view.base.AbsBaseDiffCallBack

class FrameTitleAdapter : AbsBaseAdapter<FrameModel, ItemTitleFrameBinding>(R.layout.item_title_frame, FrameTitleDiff()) {
    var onClick: ((Int) -> Unit)? = null
    class FrameTitleDiff : AbsBaseDiffCallBack<FrameModel>() {
        override fun itemsTheSame(oldItem: FrameModel, newItem: FrameModel): Boolean {
            return oldItem.text == newItem.text
        }

        override fun contentsTheSame(oldItem: FrameModel, newItem: FrameModel): Boolean {
            return oldItem.text != newItem.text
        }

    }

    override fun bind(binding: ItemTitleFrameBinding, position: Int, data: FrameModel,
                      holder: RecyclerView.ViewHolder) {
        if(data.check){
            binding.view.setBackgroundResource(R.drawable.bg_line)
        }else{
            binding.view.setBackgroundResource(R.drawable.bg_null)
        }
        binding.tv.setOnClickListener {
            onClick?.invoke(position)
        }
        binding.tv.text = binding.root.context.getString(data.text)
    }

}