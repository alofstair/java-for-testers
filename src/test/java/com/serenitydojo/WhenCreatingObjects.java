package com.serenitydojo;

import org.junit.Assert;
import org.junit.Test;
import static com.serenitydojo.Cat.usualFood;

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
    public void creating_a_hamster() {
        Hamster harry = new Hamster("Harry",1);

        Assert.assertEquals(harry.getName(), "Harry");
        Assert.assertEquals(harry.getAge(),1);

    }

    @Test
    public void cat_makes_noise() {
        Cat felix = new Cat("Felix", 4);
        Cat spot= new Cat("Spot", "Salmon", 3);

        System.out.println("Felix goes " + felix.makesNoise());


        felix.feed("Tuna");
        spot.feed("Salmon");

        System.out.println("Felix's favourite food = " + usualFood());

        spot.makesNoise();

        felix.groom();
    }

    @Test
    public void hamster_makes_noise() {
        Hamster fluffy = new Hamster("fluffy", 2);

        System.out.println("fluffy goes " + fluffy.makesNoise());
    }

    @Test
    public void pets_make_noise() {
        Pet felix = new Cat("Felix", 4);
        Pet bubbles = new Hamster("Bubbles",  2);

        System.out.println("Felix goes " + felix.makesNoise());
        System.out.println("Bubbles goes " + bubbles.makesNoise());
    }
}
