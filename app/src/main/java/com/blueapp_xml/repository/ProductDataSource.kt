package com.blueapp_xml.repository

import android.content.Context
import javax.inject.Inject


class ProductDataSource @Inject constructor(private val context: Context) {
    fun getJsonFromAsset(): String {
        return context.assets.open("products.json").bufferedReader().use { it.readText() }
    }
}