package com.company;

public class Animal {
    static String name;
    //int distance = (int) (Math.random()* 200);

    public Animal(String name) {
        this.name = name;
    }


    public void run(int distance) {
        if (distance <= Dog.maxDogRunDistance) {
            System.out.println(name + " пробежал " + distance + " метров.");
        } else {
            System.out.println(Dog.name + " не может бежать больше " + Dog.maxDogRunDistance + " метров.");
        }
        if (distance <= Cat.maxCatRunDistance) {
            System.out.println(name + " пробежал " + distance + " метров.");
        } else {
            System.out.println(Cat.name + " не может бежать больше " + Cat.maxCatRunDistance + " метров.");
        }
    }


    public void swim(int distance) {
        if (distance <= Dog.maxDogSwimDistance) {
            System.out.println(name + " проплыл " + distance + " метров.");
        } else {
            System.out.println(Dog.name + " не может плыть больше " + Dog.maxDogSwimDistance + " метров.");
        }
        if (distance == Cat.maxCatSwimDistance)
            System.out.println("Правильно, " + name + " не умеет плавать!");
        else{
            System.out.println(Cat.name + " не умеет плавать!");
        }
    }
}
