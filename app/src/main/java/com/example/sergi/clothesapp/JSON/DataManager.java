package com.example.sergi.clothesapp.JSON;

import com.example.sergi.clothesapp.Data.WeatherResponse;
import rx.Observable;

public class DataManager {

    private final String API_KEY = "c2767964e5bf6a348411a15c90f4f9c9";

    public Observable<WeatherResponse> getWeatherData(String cityName) {
        WeatherAPI weatherApi = new WeatherAPI();
        return weatherApi.getService().getWeatherCall(cityName, API_KEY);
    }
}
