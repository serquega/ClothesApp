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


    /**
     *Constructor of the class to inicialize the variables
     */
    public Person(String sex, String name, String surname, String dni, String email, String password, int height, boolean likeScarfHot,
                  boolean likeScarfWarm, boolean likeGloves, boolean likeHat, boolean likeTrackSuit, boolean likeAnorak, boolean likeSuspenders,
                  boolean likeFlipFlops, boolean likeSwimSuit, boolean likeLeggins, boolean likeSuit){
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
}
