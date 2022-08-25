package kr.ac.kumoh.s20160250.locationsearchmapapp.response.search

data class SearchPoiInfo(
    val totalCount: String,
    val count: String,
    val page: String,
    val pois: Pois
)
