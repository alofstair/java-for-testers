package com.serenitydojo;

public class Hamster extends Pet {

    private String favouriteGame;


    public Hamster(String name, String game) {
        super(name);
        this.favouriteGame = favouriteGame();
    }

    public String favouriteGame () {return favouriteGame;}

}
