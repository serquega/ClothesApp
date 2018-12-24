package com.example.sergi.clothesapp.View;

import com.example.sergi.clothesapp.Data.WeatherResponse;

public interface IView {

    void showWeatherData(WeatherResponse response);

    void showLoadingDialog();

    void hideLoadingDialog();

    void errorLoadingdata();
}
