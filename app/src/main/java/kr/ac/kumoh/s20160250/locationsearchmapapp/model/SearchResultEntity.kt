package kr.ac.kumoh.s20160250.locationsearchmapapp.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class SearchResultEntity(
    val name: String,
    val fullAddress: String,
    val locationLatLng: LocationLatLngEntity
):Parcelable
