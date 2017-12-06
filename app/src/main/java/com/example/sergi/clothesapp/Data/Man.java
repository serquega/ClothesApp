package com.example.sergi.clothesapp.Data;

/**
 * Created by sergi on 14/10/2017.
 */

public class Man extends Person{

    private boolean likeThermalTshirt;

    public Man(String sex, String name, String surname, String dni, String email, String password, int height, boolean likeScarfHot,
               boolean likeScarfWarm, boolean likeGloves, boolean likeHat, boolean likeTrackSuit, boolean likeAnorak,
               boolean likeSuspenders, boolean likeFlipFlops, boolean likeSwimSuit, boolean likeLeggins, boolean likeSuit,
               boolean likeThermalTshirt){
        super(sex, name, surname, dni, email, password, height, likeScarfHot, likeScarfWarm, likeGloves, likeHat, likeTrackSuit,
                likeAnorak, likeSuspenders, likeFlipFlops, likeSwimSuit, likeLeggins, likeSuit);
        this.likeThermalTshirt=likeThermalTshirt;
    }

    public boolean isLikeThermalTshirt() {
        return likeThermalTshirt;
    }

    public void setLikeThermalTshirt(boolean likeThermalTshirt) {
        this.likeThermalTshirt = likeThermalTshirt;
    }
}
