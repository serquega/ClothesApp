package com.example.sergi.clothesapp.Data;

/**
 * Created by sergi on 14/10/2017.
 */

public class Woman extends Person {

    private boolean likeSkirt;
    private boolean likeLongSocks;
    private boolean likeBoots;
    private boolean likeSwimSuit;

    public Woman(boolean likeSkirt, boolean likeLongSocks, boolean likeBoots, boolean likeSwimSuit){
        super();
        this.likeSkirt=likeSkirt;
        this.likeLongSocks=likeLongSocks;
        this.likeBoots=likeBoots;
        this.likeSwimSuit=likeSwimSuit;
    }
}
