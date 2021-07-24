package com.developersbreach.navigationcomponent

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Color(
    val colorName: String
) : Parcelable {

    companion object {

        val colorList = listOf(
            Color("Red"), Color("Green"), Color("Blue"),
            Color("Yellow"), Color("Black"), Color("White"),
            Color("Brown"), Color("Orange"), Color("Grey"),
            Color("Purple"), Color("Green"), Color("Pink"),
            Color("Amber"), Color("Cyan"), Color("Teal")
        )
    }
}