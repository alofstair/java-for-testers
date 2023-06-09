package com.serenitydojo;

public class Cat extends Pet{
    private String favouriteFood;
    private int age;

    public static final String CAT_NOISE = "Meow";

    public static String usualFood() {
        return "Tuna";
    }

    public Cat(String name, int age) {
        super(name);
        this.age = age;
        this.favouriteFood = Cat.usualFood();
    }

    public Cat(String name, String favouriteFood, int age)  {
        super(name);
        this.favouriteFood = favouriteFood;
        this.age = age;
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

    @Override
    public String makesNoise() {
        return CAT_NOISE;
    }

    public void feed(String food) {
        System.out.println(getName() + " easts some " + food);
    }

    public void groom() {
        lickPaws();
        cleanFur();
    }

    private void cleanFur() {
        System.out.println(getName() + " cleans his fur");
    }

    private void lickPaws() {
        System.out.println(getName() + " licks his paws");
    }
}
