package ru.devsoland.meteowashkotlin

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class WeatherFragment: Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? =
            inflater.inflate(R.layout.weather_fragment, container, false)

    companion object {
        fun newInstance(): WeatherFragment = WeatherFragment()
    }
}