package com.example.sergi.clothesapp.Presenter;

public interface IBasePresenter {

    void getWeatherForCity(String city);

    void unsuscribe();

    void showLoading();

    void hideLoading();

    void failedToGetDataForCity();
}
