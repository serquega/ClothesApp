package com.example.sergi.clothesapp.Data;
import com.google.gson.annotations.SerializedName;

public class Coordinate {

    @SerializedName("long")
    private double longitud;
    @SerializedName("lat")
    private double langitude;

    public double getLongitud() {
        return longitud;
    }

    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }

    public double getLangitude() {
        return langitude;
    }

    public void setLangitude(double langitude) {
        this.langitude = langitude;
    }
}
