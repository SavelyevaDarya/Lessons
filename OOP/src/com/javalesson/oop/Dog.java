package com.javalesson.oop;

import com.sun.org.glassfish.external.statistics.AverageRangeStatistic;

public class Dog {

    public static int dogsCount;
    public static final int PAWS = 4;
    public static final int TAIL = 1;
    private String name;
    private String breed;
    private Size size;

    public Dog() {
        dogsCount++;
        System.out.println("Dog's count is " + dogsCount);
    }

    public static int getDogsCount() {
        return dogsCount;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void bark() {
        switch (size) {
            case BIG:
            case VERY_BIG:
                System.out.println("Wof Wof");
                break;
            case AVERAGE:
                System.out.println("Raf Raf");
                break;
            case SMALL:
                System.out.println("tyaf tyaf");
                break;
            default:
                System.out.println("size undefined");
        }
    }


    public void bite() {
        if (dogsCount > 2) {
            System.out.println("They are biting you");
        } else bark();

    }


}
