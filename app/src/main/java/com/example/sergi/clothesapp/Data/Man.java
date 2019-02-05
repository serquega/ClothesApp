package com.example.sergi.clothesapp.Data;

/**
 * Created by sergi on 14/10/2017.
 */

public class Man extends Person{

    private boolean likeThermalTshirt;

    public Man(String sex, String name, String surname, String dni, String email, String password, int height, boolean likeScarfHot,
               boolean likeScarfWarm, boolean likeGloves, boolean likeHat, boolean likeTrackSuit, boolean likeAnorak,
               boolean likeSuspenders, boolean likeFlipFlops, boolean likeSwimSuit, boolean likeLeggins, boolean likeSuit,
               boolean likeThermalTshirt, boolean likeBlack, boolean likeWhite, boolean likeYellow, boolean likeRed, boolean likeBlue, boolean likeGreen,
               boolean likeSoft_blue, boolean likeGrey, boolean likeBrown, boolean likeSoft_brown, boolean likeSoft_green){
        super(sex, name, surname, dni, email, password, height, likeScarfHot, likeScarfWarm, likeGloves, likeHat, likeTrackSuit,
                likeAnorak, likeSuspenders, likeFlipFlops, likeSwimSuit, likeLeggins, likeSuit, likeBlack, likeWhite, likeYellow, likeRed, likeBlue, likeGreen,
                likeSoft_blue, likeGrey, likeBrown, likeSoft_brown, likeSoft_green);
        this.likeThermalTshirt=likeThermalTshirt;
    }

    public boolean isLikeThermalTshirt() {
        return likeThermalTshirt;
    }

    public void setLikeThermalTshirt(boolean likeThermalTshirt) {
        this.likeThermalTshirt = likeThermalTshirt;
    }
}
