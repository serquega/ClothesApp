package com.example.sergi.clothesapp.Data;

/**
 * Created by sergi on 14/10/2017.
 */

/**
 * We create the person with his/her personality
 */
public class Person {

    private String sex;             //m or f depends on your sex
    private String name;
    private String surname;
    private String dni;
    private String email;
    private String password;
    private int height;
    private boolean likeScarfHot;
    private boolean likeScarfWarm;
    private boolean likeGloves;
    private boolean likeHat;
    private boolean likeTracksuit;
    private boolean likeAnorak;
    private boolean likeSuspenders;
    private boolean likeFlipFlops;
    private boolean likeSwimSuit;
    private boolean likeLeggins;
    private boolean likeSuit;
    private boolean likeBlack;
    private boolean likeWhite;
    private boolean likeYellow;
    private boolean likeRed;
    private boolean likeBlue;
    private boolean likeGreen;
    private boolean likeSoft_blue;
    private boolean likeGrey;
    private boolean likeBrown;
    private boolean likeSoft_brown;
    private boolean likeSoft_green;

    /**
     *Constructor of the class to inicialize the variables
     */
    public Person(String sex, String name, String surname, String dni, String email, String password, int height, boolean likeScarfHot,
                  boolean likeScarfWarm, boolean likeGloves, boolean likeHat, boolean likeTrackSuit, boolean likeAnorak, boolean likeSuspenders,
                  boolean likeFlipFlops, boolean likeSwimSuit, boolean likeLeggins, boolean likeSuit, boolean likeBlack, boolean likeWhite, boolean likeYellow,
                  boolean likeRed, boolean likeBlue, boolean likeGreen, boolean likeSoft_blue, boolean likeGrey, boolean likeBrown, boolean likeSoft_brown,
                  boolean likeSoft_green){
        this.sex=sex;
        this.name=name;
        this.surname=surname;
        this.dni=dni;
        this.email=email;
        this.password=password;
        this.height=height;
        this.likeScarfHot=likeScarfHot;
        this.likeScarfWarm=likeScarfWarm;
        this.likeGloves=likeGloves;
        this.likeHat=likeHat;
        this.likeTracksuit=likeTrackSuit;
        this.likeAnorak=likeAnorak;
        this.likeSuspenders=likeSuspenders;
        this.likeFlipFlops=likeFlipFlops;
        this.likeSwimSuit=likeSwimSuit;
        this.likeLeggins=likeLeggins;
        this.likeSuit=likeSuit;
        this.likeBlack=likeBlack;
        this.likeWhite=likeWhite;
        this.likeYellow=likeYellow;
        this.likeRed=likeRed;
        this.likeBlue=likeBlue;
        this.likeGreen=likeGreen;
        this.likeSoft_blue=likeSoft_blue;
        this.likeGrey=likeGrey;
        this.likeBrown=likeBrown;
        this.likeSoft_brown=likeSoft_brown;
        this.likeSoft_green=likeSoft_green;
    }

    //********************************GETTER'S AND SETTER'S*************************************************


    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public boolean isLikeScarfHot() {
        return likeScarfHot;
    }

    public void setLikeScarfHot(boolean likeScarfHot) {
        this.likeScarfHot = likeScarfHot;
    }

    public boolean isLikeScarfWarm() {
        return likeScarfWarm;
    }

    public void setLikeScarfWarm(boolean likeScarfWarm) {
        this.likeScarfWarm = likeScarfWarm;
    }

    public boolean isLikeGloves() {
        return likeGloves;
    }

    public void setLikeGloves(boolean likeGloves) {
        this.likeGloves = likeGloves;
    }

    public boolean isLikeHat() {
        return likeHat;
    }

    public void setLikeHat(boolean likeHat) {
        this.likeHat = likeHat;
    }

    public boolean isLikeTracksuit() {
        return likeTracksuit;
    }

    public void setLikeTracksuit(boolean likeTracksuit) {
        this.likeTracksuit = likeTracksuit;
    }

    public boolean isLikeAnorak() {
        return likeAnorak;
    }

    public void setLikeAnorak(boolean likeAnorak) {
        this.likeAnorak = likeAnorak;
    }

    public boolean isLikeSuspenders() {
        return likeSuspenders;
    }

    public void setLikeSuspenders(boolean likeSuspenders) {
        this.likeSuspenders = likeSuspenders;
    }

    public boolean isLikeFlipFlops() {
        return likeFlipFlops;
    }

    public void setLikeFlipFlops(boolean likeFlipFlops) {
        this.likeFlipFlops = likeFlipFlops;
    }

    public boolean isLikeSwimSuit() {
        return likeSwimSuit;
    }

    public void setLikeSwimSuit(boolean likeSwimSuit) {
        this.likeSwimSuit = likeSwimSuit;
    }

    public boolean isLikeLeggins() {
        return likeLeggins;
    }

    public void setLikeLeggins(boolean likeLeggins) {
        this.likeLeggins = likeLeggins;
    }

    public boolean isLikeSuit() {
        return likeSuit;
    }

    public void setLikeSuit(boolean likeSuit) {
        this.likeSuit = likeSuit;
    }

    public boolean isLikeBlack() {
        return likeBlack;
    }

    public void setLikeBlack(boolean likeBlack) {
        this.likeBlack = likeBlack;
    }

    public boolean isLikeWhite() {
        return likeWhite;
    }

    public void setLikeWhite(boolean likeWhite) {
        this.likeWhite = likeWhite;
    }

    public boolean isLikeYellow() {
        return likeYellow;
    }

    public void setLikeYellow(boolean likeYellow) {
        this.likeYellow = likeYellow;
    }

    public boolean isLikeRed() {
        return likeRed;
    }

    public void setLikeRed(boolean likeRed) {
        this.likeRed = likeRed;
    }

    public boolean isLikeBlue() {
        return likeBlue;
    }

    public void setLikeBlue(boolean likeBlue) {
        this.likeBlue = likeBlue;
    }

    public boolean isLikeGreen() {
        return likeGreen;
    }

    public void setLikeGreen(boolean likeGreen) {
        this.likeGreen = likeGreen;
    }

    public boolean isLikeSoft_blue() {
        return likeSoft_blue;
    }

    public void setLikeSoft_blue(boolean likeSoft_blue) {
        this.likeSoft_blue = likeSoft_blue;
    }

    public boolean isLikeGrey() {
        return likeGrey;
    }

    public void setLikeGrey(boolean likeGrey) {
        this.likeGrey = likeGrey;
    }

    public boolean isLikeBrown() {
        return likeBrown;
    }

    public void setLikeBrown(boolean likeBrown) {
        this.likeBrown = likeBrown;
    }

    public boolean isLikeSoft_brown() {
        return likeSoft_brown;
    }

    public void setLikeSoft_brown(boolean likeSoft_brown) {
        this.likeSoft_brown = likeSoft_brown;
    }

    public boolean isLikeSoft_green() {
        return likeSoft_green;
    }

    public void setLikeSoft_green(boolean likeSoft_green) {
        this.likeSoft_green = likeSoft_green;
    }
}
