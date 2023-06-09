package com.serenitydojo;

public class Hamster extends Pet {

    private String favouriteGame;
    private int age;


    public Hamster(String name, int age) {
        super(name);
        this.age = age;
    }

    public String getFavouriteGame() {
        return favouriteGame;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String makesNoise() {
        return "Sqweak";
    }
}
