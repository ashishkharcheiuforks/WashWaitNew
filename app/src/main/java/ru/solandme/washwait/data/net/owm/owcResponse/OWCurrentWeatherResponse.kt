package ru.solandme.washwait.data.net.owm.owcResponse

data class OWCurrentWeatherResponse(
        val clouds: Clouds,
        val cod: Int,
        val coord: Coord,
        val dt: Int,
        val id: Int,
        val main: Main,
        val name: String,
        val sys: Sys,
        val weather: List<Weather>,
        val wind: Wind
)