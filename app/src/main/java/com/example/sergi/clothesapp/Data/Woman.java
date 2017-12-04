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
                 boolean likeSkirt, boolean likeLongSocks, boolean likeBoots, boolean likeDress){
        super(sex, name, surname, dni, email, password, height, likeScarfHot, likeScarfWarm, likeGloves, likeHat, likeTrackSuit,
                likeAnorak, likeSuspenders, likeFlipFlops, likeSwimSuit, likeLeggins, likeSuit);
        this.likeSkirt=likeSkirt;
        this.likeLongSocks=likeLongSocks;
        this.likeBoots=likeBoots;
        this.likeDress=likeDress;
    }
}
