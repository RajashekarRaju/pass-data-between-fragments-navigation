package com.developersbreach.navigationcomponent

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView

class ColorAdapter(
    private val colorList: List<Color>,
    private val onClickListener: OnClickListener
) :
    ListAdapter<Color, ColorAdapter.ColorViewHolder>(
        DiffCallback
    ) {

    class ColorViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val colorNameTextView: TextView = itemView.findViewById(R.id.item_color_text_view)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ColorViewHolder {
        return ColorViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.item_color,
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: ColorViewHolder, position: Int) {
        val color: Color = colorList[position]
        holder.colorNameTextView.text = color.colorName

        holder.itemView.setOnClickListener{
            onClickListener.onClick(color)
        }
    }

    override fun getItemCount() = colorList.size

    class OnClickListener(val clickListener: (color: Color) -> Unit) {
        fun onClick(color: Color) = clickListener(color)
    }

    companion object DiffCallback : DiffUtil.ItemCallback<Color>() {
        override fun areItemsTheSame(oldItem: Color, newItem: Color): Boolean {
            return oldItem === newItem
        }

        override fun areContentsTheSame(oldItem: Color, newItem: Color): Boolean {
            return oldItem.colorName == newItem.colorName
        }
    }
}