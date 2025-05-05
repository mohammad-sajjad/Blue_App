package com.blueapp_xml.utils

import android.content.Context
import com.blueapp_compose.utils.StringResourceProvider
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Inject


class AndroidStringResourceProvider @Inject constructor(@ApplicationContext private val context: Context ) :
    StringResourceProvider {
    override fun getString(resId: Int): String {
        return context.getString(resId)
    }
}