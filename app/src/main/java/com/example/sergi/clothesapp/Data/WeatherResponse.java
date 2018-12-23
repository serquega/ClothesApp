package com.example.sergi.clothesapp.Data;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class WeatherResponse {

    @SerializedName("coor")
    private Coordinate coordinate;
    @SerializedName("weather")
    private ArrayList weatherList;
    @SerializedName("main")
    private MainWeatherData mWeatherdata;

    public Coordinate getCoordinate() {
        return coordinate;
    }

    public void setCoordinate(Coordinate coordinate) {
        this.coordinate = coordinate;
    }

    public ArrayList getWeatherList() {
        return weatherList;
    }

    public void setWeatherList(ArrayList weatherList) {
        this.weatherList = weatherList;
    }

    public MainWeatherData getmWeatherdata() {
        return mWeatherdata;
    }

    public void setmWeatherdata(MainWeatherData mWeatherdata) {
        this.mWeatherdata = mWeatherdata;
    }
}
