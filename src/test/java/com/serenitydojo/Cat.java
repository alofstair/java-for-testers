package com.serenitydojo;

public class Cat {
    private String name;
    private String favouriteFood;
    private int age;

    public Cat(String name, String favouriteFood, int age)  {
        this.name = name;
        this.favouriteFood = favouriteFood;
        this.age = age;
    }


    public String getName(){
        return name;
    }

    public void setFavouriteFood(String favouriteFood) {
        this.favouriteFood = favouriteFood;
    }

    public String getFavouriteFood() {
        return favouriteFood;
    }

    public int getAge(){
        return age;
    }

    public void makesNoise() {
        System.out.println("Meow");
    }

    public void feed(String food) {
        System.out.println(name + " easts some " + food);
    }

    public void groom() {
        lickPaws();
        cleanFur();
    }

    private void cleanFur() {
        System.out.println(name + " cleans his fur");
    }

    private void lickPaws() {
        System.out.println(name + " licks his paws");
    }
}
