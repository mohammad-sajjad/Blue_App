package com.blueapp_xml.core

import android.view.View
import androidx.recyclerview.widget.RecyclerView


abstract class BaseViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    abstract fun bindView(item: RecyclerViewListItem)
}