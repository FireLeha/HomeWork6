package com.company;

public class Dog extends Animal{
    public static int maxDogRunDistance;
    public static int maxDogSwimDistance;

    public Dog(String name, int setMaxRunDistance, int setMaxSwimDistance) {
        super(name);
        this.maxDogRunDistance = setMaxRunDistance;
        this.maxDogSwimDistance = setMaxSwimDistance;
    }

}
