package com.namseox.st040_mecut.ui.editvideo

import androidx.recyclerview.widget.RecyclerView
import com.namseox.st040_mecut.R
import com.namseox.st040_mecut.databinding.ItemDurationBinding
import com.namseox.st040_mecut.view.base.AbsBaseAdapter
import com.namseox.st040_mecut.view.base.AbsBaseDiffCallBack

class DurationAdapter : AbsBaseAdapter<String,ItemDurationBinding>(R.layout.item_duration,DiffDuration()) {
    var onClick:((pos : Int)->Unit)? = null
    var posTime = 4
    class DiffDuration : AbsBaseDiffCallBack<String>(){
        override fun itemsTheSame(oldItem: String, newItem: String): Boolean {
            return oldItem == newItem
        }

        override fun contentsTheSame(oldItem: String, newItem: String): Boolean {
            return oldItem != newItem
        }

    }

    override fun bind( binding: ItemDurationBinding,
                       position: Int,
                       data: String,
                       holder: RecyclerView.ViewHolder) {
        binding.tv.text = data
        if(position == posTime){
            binding.item.setBackgroundResource(R.drawable.bg_card_border7)
        }else{
            binding.item.setBackgroundResource(R.drawable.bg_card_border5)
        }
        binding.root.setOnClickListener {
            onClick!!.invoke(position)
        }
    }

}