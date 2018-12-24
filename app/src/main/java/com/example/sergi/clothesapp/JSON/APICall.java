package com.example.sergi.clothesapp.JSON;

import com.example.sergi.clothesapp.Data.WeatherResponse;

import retrofit2.http.GET;
import retrofit2.http.Query;


public interface APICall {

    @GET("weather?&units=metric")
    io.reactivex.Observable<WeatherResponse> getWeatherCall(@Query("q") String city, @Query("APPID") String api);
}
