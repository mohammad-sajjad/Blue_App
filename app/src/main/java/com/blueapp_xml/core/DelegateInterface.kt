package com.blueapp_xml.core

import android.view.ViewGroup


interface DelegateInterface {
        fun onCreateViewHolder(parent: ViewGroup): BaseViewHolder
        fun onBindViewHolder(holder: BaseViewHolder, item: RecyclerViewListItem)
}