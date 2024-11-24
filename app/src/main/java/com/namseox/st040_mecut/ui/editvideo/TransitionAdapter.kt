package com.namseox.st040_mecut.ui.editvideo

import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.namseox.st040_mecut.R
import com.namseox.st040_mecut.data.model.ImvModel
import com.namseox.st040_mecut.databinding.ItemFrameBinding
import com.namseox.st040_mecut.databinding.ItemTransitionBinding
import com.namseox.st040_mecut.view.base.AbsBaseAdapter
import com.namseox.st040_mecut.view.base.AbsBaseDiffCallBack

class TransitionAdapter: AbsBaseAdapter<ImvModel,ItemTransitionBinding>(R.layout.item_transition,TransitionDiff()) {
    var onClick: ((Int) -> Unit)? = null
    class TransitionDiff: AbsBaseDiffCallBack<ImvModel>(){
        override fun itemsTheSame(oldItem: ImvModel, newItem: ImvModel): Boolean {
            return oldItem.imv1 == newItem.imv1
        }

        override fun contentsTheSame(oldItem: ImvModel, newItem: ImvModel): Boolean {
            return oldItem.check != newItem.check
        }

    }

    override fun bind(binding: ItemTransitionBinding, position: Int, data: ImvModel,
                      holder: RecyclerView.ViewHolder) {
        Glide.with(binding.root).load(data.imv1).into(binding.imv)
        binding.tv.text = data.text
        if(data.check){
            binding.imv.setBackgroundResource(R.drawable.bg_card_border12)
        }else{
            binding.imv.setBackgroundResource(R.drawable.bg_null)
        }
        binding.imv.setOnClickListener {
            onClick?.invoke(position)
        }
    }
}