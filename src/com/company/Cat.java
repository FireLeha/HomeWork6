package com.company;

public class Cat extends Animal {

    public static int maxCatRunDistance;
    public static int maxCatSwimDistance;

    public Cat(String name, int setMaxRunDistance, int setMaxSwimDistance) {
        super(name);
        this.maxCatRunDistance = setMaxRunDistance;
        this.maxCatSwimDistance = setMaxSwimDistance;
    }

}
