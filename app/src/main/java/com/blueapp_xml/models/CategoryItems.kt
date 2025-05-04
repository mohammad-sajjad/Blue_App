package com.blueapp_xml.models

import com.blueapp_xml.utils.CardConstants
import com.blueapp_xml.core.RecyclerViewListItem

data class CategoryItems(val categoryName: String, val categoryImage: Int): RecyclerViewListItem {
    override fun getViewType() = CardConstants.CATEGORY_ITEM

    override fun getUnique() = this
}