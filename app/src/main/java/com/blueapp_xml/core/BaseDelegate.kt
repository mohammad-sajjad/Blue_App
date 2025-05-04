package com.blueapp_xml.core

abstract class BaseDelegate : DelegateInterface {

    override fun onBindViewHolder(holder: BaseViewHolder, item: RecyclerViewListItem) {
        holder.bindView(item)
    }
}