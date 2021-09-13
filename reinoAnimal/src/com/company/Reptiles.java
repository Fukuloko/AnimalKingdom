package com.company;

public class Reptiles extends Animal{

    public Reptiles(String name, String gender, boolean mating) {
        super(name, gender, "reptile", mating);
    }

    @Override
    public void locomotion() {
        System.out.println("*Using paws or crawling* Resistentes contra a vida");
    }

    @Override
    public void noiseSound() {
        System.out.println("...");
    }

    @Override
    public void information() {
        System.out.println("Some reptiles can dodge a gun bullet");
        System.out.println("name: " + getName());
        System.out.println("Gender: " + getGender());
        System.out.println("Category: " + getCategory());
        locomotion();
        noiseSound();

        if(isMating()){
            System.out.println("*weird movements*");
        }else{
            System.out.println("Relaax");
        }
    }
}
