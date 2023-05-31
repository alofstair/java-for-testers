package com.serenitydojo;

import org.junit.Test;

public class WhenCreatingObjects {

    @Test
    public void creating_a_cat() {
        String name = "Felix";
        String favouriteFood = "Tuna";
        int age =4;

        Cat felix = new Cat("Felix", "Tuna", 4);

        System.out.println(felix.getName());
        System.out.println(felix.getFavouriteFood());
        System.out.println(felix.getAge());

        Cat spot = new Cat("Spot", "Tuna", 3);
        System.out.println(spot.getName());
        System.out.println(spot.getFavouriteFood());
        System.out.println("Spot's age is " + spot.getAge());
    }


    @Test
    public void cat_makes_noise() {
        Cat felix = new Cat("Felix", "Tuna", 4);
        Cat spot= new Cat("Spot", "Salmon", 3);

        felix.makesNoise();
        felix.feed("Tuna");
        spot.feed("Salmon");

        felix.groom();
    }
}
