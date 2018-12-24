package com.example.sergi.clothesapp.Presenter;

import android.util.Log;

import com.example.sergi.clothesapp.Data.WeatherResponse;
import com.example.sergi.clothesapp.JSON.DataManager;
import com.example.sergi.clothesapp.View.IView;

import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.observers.DisposableObserver;
import io.reactivex.schedulers.Schedulers;


public class Presenter implements IBasePresenter {

    private DataManager mDataManager;
    private IView view;
    private Observable<WeatherResponse> responseObservable;

    public Presenter(DataManager dataManager, IView view) {
        this.mDataManager = dataManager;
        this.view = view;
    }

    @Override
    public void getWeatherForCity(String city) {

        showLoading();

        responseObservable = mDataManager.getWeatherData(city);
        responseObservable.subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(
                new DisposableObserver<WeatherResponse>() {
                    @Override
                    public void onNext(WeatherResponse weatherResponse) {
                        view.showWeatherData(weatherResponse);
                    }

                    @Override
                    public void onError(Throwable t) {
                        Log.d("onError", t.toString());
                        hideLoading();
                        failedToGetDataForCity();
                    }

                    @Override
                    public void onComplete() {
                        Log.d("TAG", "onComplete");
                        hideLoading();
                    }
                }
                );
    }

    @Override
    public void unsuscribe() {
        responseObservable.unsubscribeOn(Schedulers.io());
    }

    @Override
    public void showLoading() {
        view.showLoadingDialog();
    }

    @Override
    public void hideLoading() {
        view.hideLoadingDialog();
    }

    @Override
    public void failedToGetDataForCity() {
        view.errorLoadingdata();
    }
}
