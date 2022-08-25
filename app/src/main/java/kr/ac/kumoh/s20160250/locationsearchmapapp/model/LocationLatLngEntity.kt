package kr.ac.kumoh.s20160250.locationsearchmapapp.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class LocationLatLngEntity(
     val latitude: Float,
     val longitude: Float
):Parcelable
