package com.blueapp_xml.core


interface RecyclerViewListItem {
    fun getViewType(): Int
    fun getUnique(): Any
}