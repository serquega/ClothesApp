package com.example.sergi.clothesapp.Data;

/**
 * Created by sergi on 14/10/2017.
 */

public class Woman extends Person {

    private boolean likeSkirt;
    private boolean likeLongSocks;
    private boolean likeBoots;
    private boolean likeDress;

    public Woman(String sex, String name, String surname, String dni, String email, String password, int height, boolean likeScarfHot,
                 boolean likeScarfWarm, boolean likeGloves, boolean likeHat, boolean likeTrackSuit, boolean likeAnorak,
                 boolean likeSuspenders, boolean likeFlipFlops, boolean likeSwimSuit, boolean likeLeggins, boolean likeSuit,
                 boolean likeSkirt, boolean likeLongSocks, boolean likeBoots, boolean likeDress, boolean likeBlack, boolean likeWhite, boolean likeYellow,
                 boolean likeRed, boolean likeBlue, boolean likeGreen, boolean likeSoft_blue, boolean likeGrey, boolean likeBrown, boolean likeSoft_brown,
                 boolean likeSoft_green){
        super(sex, name, surname, dni, email, password, height, likeScarfHot, likeScarfWarm, likeGloves, likeHat, likeTrackSuit, likeAnorak, likeSuspenders,
                likeFlipFlops, likeSwimSuit, likeLeggins, likeSuit, likeBlack, likeWhite, likeYellow, likeRed, likeBlue, likeGreen, likeSoft_blue, likeGrey,
                likeBrown, likeSoft_brown, likeSoft_green);
        this.likeSkirt=likeSkirt;
        this.likeLongSocks=likeLongSocks;
        this.likeBoots=likeBoots;
        this.likeDress=likeDress;
    }

    public boolean isLikeSkirt() {
        return likeSkirt;
    }

    public void setLikeSkirt(boolean likeSkirt) {
        this.likeSkirt = likeSkirt;
    }

    public boolean isLikeLongSocks() {
        return likeLongSocks;
    }

    public void setLikeLongSocks(boolean likeLongSocks) {
        this.likeLongSocks = likeLongSocks;
    }

    public boolean isLikeBoots() {
        return likeBoots;
    }

    public void setLikeBoots(boolean likeBoots) {
        this.likeBoots = likeBoots;
    }

    public boolean isLikeDress() {
        return likeDress;
    }

    public void setLikeDress(boolean likeDress) {
        this.likeDress = likeDress;
    }
}
