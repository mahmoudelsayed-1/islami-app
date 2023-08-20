package com.example.islami_app.home.quran

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.islami_app.databinding.ItemChapterNameBinding

class QuranRecyclerAdapter(private val names: List<String>) :
    RecyclerView.Adapter<QuranRecyclerAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val viewBinding =
            ItemChapterNameBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(viewBinding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.viewBinding.title.text = names[position].toString()
        if (OnItem != null) {
            holder.viewBinding.root.setOnClickListener {
                OnItem?.onClick(position, names[position])
            }

        }
    }

    override fun getItemCount(): Int {
        return names.size
    }

    var OnItem: OnItemClick? = null


    fun interface OnItemClick {
        fun onClick(position: Int, name: String)
    }

    class ViewHolder(val viewBinding: ItemChapterNameBinding) :
        RecyclerView.ViewHolder(viewBinding.root) {


    }

}