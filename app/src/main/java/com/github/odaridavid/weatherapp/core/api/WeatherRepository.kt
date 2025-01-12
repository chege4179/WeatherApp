package com.github.odaridavid.weatherapp.core.api

import com.github.odaridavid.weatherapp.core.model.DefaultLocation
import com.github.odaridavid.weatherapp.core.model.Weather
import com.github.odaridavid.weatherapp.core.Result
import kotlinx.coroutines.flow.Flow

interface WeatherRepository {

    suspend fun fetchWeatherData(
        defaultLocation: DefaultLocation,
        language: String,
        units: String
    ) : Result<Weather>
}
